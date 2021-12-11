import org.jun.Lambda.Lambda;
import org.jun.algorithms.Trie;
import org.jun.algorithms.array.Matrix;
import org.jun.algorithms.array.QuickSort;
import org.jun.algorithms.dp.Edist;
import org.jun.algorithms.dp.GFG;
import org.jun.algorithms.dp.LongestCommonSubsequence;
import org.jun.algorithms.queue.MyCircularQueue;
import org.jun.algorithms.queue.MyQueue;
import org.jun.algorithms.sort.InversionNumber;
import org.jun.algorithms.string.EqualArea;
import org.jun.collections.Collection;
import org.jun.designpattern.decorator.StarbuzzCoffee;
import org.jun.designpattern.observer.CurrentConditionsDisplay;
import org.jun.designpattern.observer.WeatherData;
import org.jun.generics.GenericsOperator;
import org.jun.jdbc.MysqlOperator;
import org.jun.reflect.ReflectOperator;
import org.jun.algorithms.array.QuickSort;
import org.jun.thread.ShowStopThread;

public class Application {

    public static void main(String[] args){
//        Collection col = new Collection();
//        col.runCollectionDemo();
//
//        QuickSort sort = new QuickSort();
//        int[] numbers = new int[]{4,6,8,1,0,7,9};
//        sort.sortArray(numbers);
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }
//
//        LongestCommonSubsequence lcs = new LongestCommonSubsequence();
//        String s1 = "abcdd";
//        String s2 = "ace";
//        char[] x = s1.toCharArray();
//        char[] y = s2.toCharArray();
//        int m = x.length;
//        int n = y.length;
//        System.out.println("Length of LCS is " + lcs.lcs(x, y, m, n));
//
//        Edist edist = new Edist();
//        String str1 = "sunday";
//        String str2 = "saturday";
//        int minEditDistance = edist.editEdist(str1, str2, str1.length(), str2.length());
//        System.out.println("Min edit distance: " + minEditDistance);
//
//        GFG gfg = new GFG();
//        int[] arr = {3, 1, 4, 2, 2, 1};
//        System.out.println("The minimum difference between two sets is " + gfg.findMin(arr, arr.length));
//
//        Trie trie = new Trie();
//        trie.insert("luojun");
//        System.out.println("Search luojun: " + trie.search("luojun"));
//        System.out.println("Search luo: " + trie.search("luo"));
//        System.out.println("Start with luo: " + trie.startsWith("luo"));

//        InversionNumber inversionNumber = new InversionNumber();
//        int[] arrayForInversionNumber = new int[]{7,9,2,6,14,12};
//        int totalInversionNumber = inversionNumber.getInversionNumber(arrayForInversionNumber, 0, arrayForInversionNumber.length);
//        System.out.println("The inversion number of array " + inversionNumber.toString() + " is: " + totalInversionNumber);

//        EqualArea equalArea = new EqualArea();
//        String a = "abc#d";
//        String b = "abd";
//        boolean result = equalArea.AreaEqual(a, b);
//        System.out.println("Is equal area: " + result);

//        ShowStopThread sst = new ShowStopThread();
//        sst.run();;
//        sst.stop();




//        GenericsOperator go = new GenericsOperator();
//        go.run();

//          ReflectOperator ref = new ReflectOperator();
//          ref.run();
//        Lambda lb = new Lambda();
//        lb.run();
//        MysqlOperator sqlO = new MysqlOperator();
//        sqlO.run();
//        System.out.println("Design Pattern:");
//        System.out.println("Observer Pattern");
//        WeatherData weatherData = new WeatherData();
//        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
//        weatherData.setMeasurements(80, 65, 30.4f);
//
//        System.out.println("Decorator Pattern");
//        StarbuzzCoffee.order();


        int[][] matrix = {
                { 1, 2, 3},
                {10, 11, 12},
                {20, 21, 22}
        };
        Matrix matrix1 = new Matrix();
        int target = 30;
        int[] position = matrix1.findElementInMatrix(matrix, target);
        if(position != null){
            System.out.println("Target: " + target + " is in Row: " + position[0] + ", Column: " + position[1]);
        } else {
            System.out.println("Target " + target + " doesn't exist in this matrix.");
        }

        // Queue
        MyQueue myQueue = new MyQueue();
        myQueue.enQueue(1);
        myQueue.enQueue(2);
        myQueue.deQueue();
        myQueue.deQueue();
        System.out.println("The front element in my queue is " + myQueue.getFront());

        MyCircularQueue myCircularQueue = new MyCircularQueue(5);
        myCircularQueue.enQueue(2);
        myCircularQueue.enQueue(3);
        myCircularQueue.enQueue(4);
        myCircularQueue.deQueue();
        int front = myCircularQueue.Front();
        System.out.println(front);
        //        MyCircularQueue obj = new MyCircularQueue(k);
//         boolean param_1 = obj.enQueue(value);
//         boolean param_2 = obj.deQueue();
//         int param_3 = obj.Front();
//         int param_4 = obj.Rear();
//         boolean param_5 = obj.isEmpty();
//         boolean param_6 = obj.isFull();
    }
}
