import java.util.*;

public class FindingTheNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int _t=0;_t<t;_t++){
            int n=scan.nextInt();
            n = (2*n)+2;
            int[] d = new int[n];
            Map<Integer,Integer> map= new HashMap<>();
            for(int i=0;i<n;i++){
                int a = scan.nextInt();
                if(map.containsKey(a)){
                    map.put(a,map.get(a)+1);
                }
                else{
                    map.put(a,1);
                }
            }
            int[] arr = new int[2];
            int k=0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet())
            {
                if(entry.getValue()==1 || isOdd(entry.getValue())){
                    arr[k] = entry.getKey();
                    k++;
                }
            }
            Arrays.sort(arr);
            System.out.println(arr[0] + " "+arr[1]);
        }
    }

    public static boolean isOdd(int num){
        if(num%2==0)
            return false;
        return true;
    }
}
