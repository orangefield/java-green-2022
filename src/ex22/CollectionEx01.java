package ex22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionEx01 {
    public static void main(String[] args) {

        // ArrayList는 데이터가 중복되어도 되는 데이터 모임
        // 여러개의 데이터가 저장되는 제네릭 박스
        ArrayList<String> datas = new ArrayList<String>();
        // List<String> dddd = new Vector<String>(); //ArrayList가 List를 implement 하고 있어서
        // List<String>로 사용가능하다. Vector는 지금 안다룸
        datas.add("데이터1");
        datas.add("데이터2");
        datas.add("데이터3");
        datas.add("데이터4");

        datas.set(1, "data2");
        datas.remove(3);

        System.out.println(datas.get(0));
        System.out.println(datas.get(1));
        System.out.println(datas.get(2));
        // System.out.println(datas.get(3));

    }
}
