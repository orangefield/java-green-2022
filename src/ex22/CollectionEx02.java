package ex22;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionEx02 {

    class MyInteger {
        int num;
    }

    public static void main(String[] args) {
        // 제네릭에는 기본자료형을 담을 수 없다. Wrapper 클래스 필요!
        Set<Integer> datas = new HashSet<>(); // Integer 대신 MyInteger를 넣는다면?
        datas.add(10);
        datas.add(20);
        datas.add(20);
        datas.add(30);
        datas.add(40);

        datas.remove(10);

        System.out.println(datas.size()); // 3말고 2가 나와야 정상, 동일한 데이터가 나왔으니까
        System.out.println(datas);

        Iterator<Integer> its = datas.iterator();
        while (its.hasNext()) {
            System.out.println(its.next());
        }

    }
}
