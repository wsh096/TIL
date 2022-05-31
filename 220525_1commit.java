import java.util.ArrayList;
    import java.util.Array

    public class Main {
    public static void main(String[] args){

    int[] myArray = new int[6];
    myArray[1] = 100;
    //myArray[7] = 10;// ArraysOutOfBoundException

    //Declaration of ArrayList.Add and Remove of a elements is easy
     ArrayList<Integer> myArrayList = new ArrayList<>();
     myArrayList.add(1);
     myArrayList.add(2);
     myArrayList.add(3);
     myArrayList.add(4);
     myArrayList.add(5);
     myArrayList.remove(0);

     for(int i = 0; i < myArrayList.size(); i++){
        System.out.println("Element: " + myArrayList.get(i));
     }

     System.out.println(Arrays.toString(myArray));

     //Multi-dimensional Array
     int[][] multiArray = new int [3][3];

     multiArray[0][0]=1;
     multiArray[0][1]=2;
     multiArray[0][2]=3;

     multiArray[1][0]=4;
     multiArray[1][1]=5;
     multiArray[1][2]=6;

     multiArray[2][0]=7;
     multiArray[2][1]=8;
     multiArray[2][2]=9;

     System.out.println(Arrays.deepToString(multiArray).replaceAll("],","]," +System.getProperty("line.separator")));

     }
 }
