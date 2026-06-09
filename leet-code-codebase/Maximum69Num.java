import java.util.Scanner;
import java.util.ArrayList;
public class Maximum69Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp =num;
        ArrayList<Integer> lis = new ArrayList<>();
        while(temp>0){
            int digit = temp%10;
            // System.out.println(digit);
            if(9%digit==3){
                lis.add(0,1);
            }
            else{
                lis.add(0,0);
            }
            temp=temp/10;
        }
        System.out.println(lis);
        if(!lis.contains(1)){
            System.out.println(num);
        }
        else{
        int add=3;
        int pos = lis.indexOf(1);
        for(int i=pos+1;i<lis.size();i++){
            add=add*10;
            System.out.println(add);
        }
        System.out.println(num+add);
    }
        // String str = Integer.toString(num);
        // char[] arr = str.toCharArray();
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]=='6'){
        //         arr[i]='9';
        //         break;
        //     }
        // }
        // String new_str = new String(arr);
        // int new_num = Integer.parseInt(new_str);
        // System.out.println(new_num);
        sc.close();
    }
}
