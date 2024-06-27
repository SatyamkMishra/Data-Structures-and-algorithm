import java.util.*;
class Two_D_ArrayList{

    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);

        mainList.add(l1);


        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(3);
        l2.add(4);

        mainList.add(l2);

        ArrayList<Integer> l3 = new ArrayList<>();
        l3.add(4);
        l3.add(5);
        l3.add(6);

        mainList.add(l3);


        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer> newL = mainList.get(i);
            for(int j=0;j<newL.size();j++){
                System.out.print(newL.get(j) + " ");
            }
            System.out.println();
        }

        System.out.println(mainList);
    }
}