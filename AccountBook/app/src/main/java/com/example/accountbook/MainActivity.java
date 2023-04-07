import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

class DBHelper2 extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "gageboo.db";

    private static final int DATABASE_VERSION = 3;

    public DBHelper2(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db2) {
        db2.execSQL("CREATE TABLE contacts ( _id INTEGER PRIMARY KEY" +
                " AUTOINCREMENT, name TEXT, tel TEXT, hapasn TEXT);");
    }

    public void onUpgrade(SQLiteDatabase db2, int oldVersion, int newVersion) {
        db2.execSQL("DROP TABLE IF EXISTS contacts");
        onCreate(db2);
    }
}

public class MainActivity extends AppCompatActivity {
    DBHelper2 helper;
    SQLiteDatabase db2;
    EditText edit_name, edit_tel;
    TextView edit_result, hapsan_result;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helper = new DBHelper2(this);
        try {
            db2 = helper.getWritableDatabase();
        } catch (SQLiteException ex) {
            db2 = helper.getReadableDatabase();
        }
        hapsan_result = (TextView) findViewById(R.id.textView7);
        edit_name = (EditText) findViewById(R.id.name);
        edit_tel = (EditText) findViewById(R.id.money);
        edit_result = (TextView) findViewById(R.id.textView);
        Button b = (Button)findViewById(R.id.button3);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                hapsan_result.setText("100000");
            }
        });
    }

    public void insert(View target) {
        String name = edit_name.getText().toString();
        String tel = edit_tel.getText().toString();
        db2.execSQL("INSERT INTO contacts VALUES (null, '" + name + "', '" + tel
                + "');");
        Toast.makeText(getApplicationContext(), "성공적으로 추가되었음",
                Toast.LENGTH_SHORT).show();
        edit_name.setText("");
        edit_tel.setText("");
    }

    public void search(View target) {
        String name = edit_name.getText().toString();
        Cursor cursor;
        cursor = db2.rawQuery("SELECT name, tel FROM contacts WHERE name='"
                + name + "';", null);

        Toast.makeText(getApplicationContext(), ""+cursor.getCount() ,
                Toast.LENGTH_SHORT).show();

        while (cursor.moveToNext()) {
            String tel = cursor.getString(1);
            edit_tel.setText(tel);
        }
    }
    public void select_all(View target) {
        Cursor cursor;
        cursor = db2.rawQuery("SELECT * FROM contacts", null);

        String s="Id   Name   Money \r\n";
        while (cursor.moveToNext()) {
            s += cursor.getString(0) + "    ";
            s += cursor.getString(1) + "    ";
            s += cursor.getString(2) + "    \r\n";
        }
        edit_result.setText(s);


    }
    public void hapsan(View target) {
        Cursor cursor;
        cursor = db2.rawQuery("SELECT * FROM contacts", null);
        String s="Id   Name   Money \r\n";
        while (cursor.moveToNext()) {
            s += cursor.getString(0) + "    ";
            s += cursor.getString(1) + "    ";
            s += cursor.getString(2) + "    \r\n";
        }
        edit_result.setText(s);


    }
}
