import java.util.*;

public class SwapInArrLst {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(50);
        list.add(24);
        list.add(35);
        list.add(45);
        list.add(78);
        list.add(52);
        list.add(14);
        list.add(69);
        list.add(95);
        System.out.print("List Before Swaping = ");
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        int temp =list.get(0);
        list.set(0, list.get(4));
        list.set(4, temp);
        System.out.print("List After Swaping = ");
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println() ;
        System.out.print("List After Sorting = ");
        Collections.sort(list);
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
    }
}
