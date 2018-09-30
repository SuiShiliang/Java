import java.util.ArrayList;
import java.util.List;

public class 求n的阶乘 {


    public static void mulit(int num, List<Integer> list){
        int muilte = 0;
        list.forEach(i -> {
            muilte = list * num / 10000000;
        });
    }

    public static  void  jc(int n, List<Integer> list){
       for(int i = 1;i <= n; i++){

       }
    }
    public static void main(String[] args) {
        List<Integer> listArray  = new ArrayList<>();
        listArray.add(1);
        jc(20,listArray);
//        listArray.add(2);
        listArray.forEach(i -> {
            System.out.println(i);
        });
    }
}
