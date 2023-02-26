package kr.co.company.explicitintent;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MemoItem {
    public String category;
    public String memo;
    public String regDate;

    public MemoItem(String category, String memo) {

        // 날짜를 표시하기 위한 포멧터를 생성. 년-월-일 시:분:초를 표시하는 포맷을 작성한다.
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.KOREA);

        // 현재 날짜정보를 가진 Date객체를 생성한다.
        Date date = new Date();

        this.category = category;
        this.memo = memo;

        // 생성한 포맷터를 통해 현재 날짜 객체를 지정해서 새로운 포맷에 맞는 날짜정보를 regDate에 저장한다.
        this.regDate = formatter.format(date);

    }
}


