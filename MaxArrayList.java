import java.util.ArrayList;

public class MaxArrayList {
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
        int max=list.get(0);
        for(int i=1;i<list.size();i++)
        {
            if(list.get(i)>max)
            {
                max=list.get(i);
            }
        }
        System.out.println("The Maximum number from the list is = "+max);
    }
}
