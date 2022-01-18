package Homework3.TolikPattern.StrategyApp;


import java.util.Arrays;

public class StrategyApp {
    public static void main(String[] args) {

        StrategyClient c = new StrategyClient();

        int[] arr0 = {1, 3, 2, 1};
        c.setStrategy(new SelectionSort());
        c.executeStrategy(arr0); //исполнитель

        int[] arr1 = {11, 4, 2, 7, 8, 54};
        c.setStrategy(new InsertingSort());
        c.executeStrategy(arr1);

        int[] arr2 = {3, -8, 2, 0, 33, 1, 3, 2};
        c.setStrategy(new BubbleSort());
        c.executeStrategy(arr2);
    }
}
//Context
class StrategyClient{
    Sorting strategy;
    public void setStrategy (Sorting strategy){
        this.strategy=strategy;
    }
    public void executeStrategy(int [] arr){
        strategy.sort(arr);
    }
}
//Strategy
interface Sorting{
    void sort(int []arr);
}
class BubbleSort implements Sorting{
    public void sort(int [] arr){
        System.out.println("Сортировка пузырьком");
        System.out.println("До " + Arrays.toString(arr));

        boolean sorted =false;
        int temp;
        while (!sorted){
            sorted=true;
            for(int i=0; i<arr.length-1;i++){
                if(arr[i+1]<arr[i]){
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    sorted=false;
                }
            }
        }
        System.out.println("После "+ Arrays.toString(arr));
    }
}
class InsertingSort implements Sorting{
    public void sort(int [] arr){
        System.out.println("Сортировка вставками");
        System.out.println("До " + Arrays.toString(arr));

        for(int i=1;i<arr.length;i++){
            int current =arr[i];
            int j= i-1;
            while (j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        System.out.println("После "+ Arrays.toString(arr));
    }
}
class SelectionSort implements Sorting{
    public void sort(int [] arr){
        System.out.println("Сортировка выбором");
        System.out.println("До " + Arrays.toString(arr));

        for (int i=0; i<arr.length;i++){
            int min=arr[i];
            int pos = i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[j]<min){
                    min=arr[j];
                    pos = j;
                }
            }
            arr[pos]=arr[i];
            arr[i] = min;
        }
        System.out.println("После "+ Arrays.toString(arr));
    }
}