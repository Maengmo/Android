package kr.co.company.explicitintent;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MemoListAdapter extends RecyclerView.Adapter<MemoListAdapter.ViewHolder> {
    private Context context;
    private int resource;
    private ArrayList<MemoItem> itemList;

    // MemoListAdapter 생성자
    public MemoListAdapter(Context context, int resource, ArrayList<MemoItem> itemList) {
        this.context = context;
        this.resource = resource;
        this.itemList = itemList;
    }

    // 어댑터의 itemList에 인자로 넘어온 아이템리스트를 추가하고,
    // notifyDataSetChanged() 메소드를 호출해서 추가된 아이템을 리사이클러뷰에 반영
    public void addItem(MemoItem item) {
        this.itemList.add(0, item);
        notifyDataSetChanged();
    }

    // 어댑터의 itemList로 넘어온 아이템 리스트를 추가하고
    // notifyDataSetChanged() 메소드를 호출해서 추가된 아이템을 리사이클러뷰에 반영함
    // notifyDataSetChanged() 메소드 호출 안하면 추가된 아이템이 사용자에게 보여지지 않게 됨
    public void addItemList(ArrayList<MemoItem> itemList) {
        this.itemList.addAll(itemList);
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount(){
        return this.itemList.size();
    }

    // 뷰홀더 생성자
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(resource, parent, false);
        return new ViewHolder(v);
    }

    // 데이터(아이템)과 뷰홀더를 매칭시키는 메소드
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final MemoItem item = itemList.get(position);

        holder.categoryText.setText(item.category);
        holder.memoText.setText(item.memo);
        holder.dateText.setText(item.regDate);


        holder.itemView.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, item.memo, Toast.LENGTH_SHORT).show();
            }
        });
    }

    // 뷰 홀더 클래스를 정의하는 코드
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView categoryText;
        TextView memoText;
        TextView dateText;

        public ViewHolder(View itemView) {
            super(itemView);

            categoryText = itemView.findViewById(R.id.category);
            memoText = itemView.findViewById(R.id.memo);
            dateText = itemView.findViewById(R.id.regdate);
        }
    }

}
