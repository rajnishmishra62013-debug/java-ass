// //sort a ascending order ..
// public  class Assignment{
//     public static void ascendingorder(int arr[]){
//         for(int turn=0 ;turn<arr.length-1;turn++){
//             for(int j=0;j<arr.length-1-turn;j++){
//                 if(arr[j]>arr[j+1]){
//                     //using swaping method...
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                 }
//             }
//         }
        
//     }
//     public static void printarr(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");

//         }
//         System.out.println();
//     }
//     public static void main(String args[]){
//         int arr[]={6,3,4,2,1,5};
//         ascendingorder(arr);
//         printarr(arr);
//     }
// }
//printa sum of a two matrix...
// import java.util.*;
// public class Assignment{
//     public static void sumofmatrix(int a[][],int b[][]){
//         int sum[][]= new int[2][2];
//         System.out.print("sum of two matrix : ");
//         for(int i=0;i<2;i++){
//             for(int j=0;j<2;j++){
//                 sum[i][j]=a[i][j]+b[i][j];
//                 System.out.print(sum[i][j]+" ");
//             }
//             System.out.println();
//         }

//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner (System.in);
//         int a[][]=new int[2][2];
//         int b[][]=new int[2][2];
//         System.out.print("the element of first matrix is : ");
//         for(int i=0;i<2;i++){
//             for(int j=0;j<2;j++){
//                 a[i][j]=sc.nextInt();
//             }
//         }
//         System.out.print("enter the second elenment of a matrix : ");
//         for(int i=0;i<2;i++){
//             for(int j=0;j<2;j++){
//                 b[i][j]=sc.nextInt();
//             }
//         }
//         sumofmatrix(a,b);
//         sc.close();
//     }
// }
//richest customer wealth...................
// public class Assignment{
//     public static int maximumwealth(int account[][]){
//         int maxwealth=0;
//         for(int i=0;i<account.length;i++){
//             int sum=0;
//             for(int j=0;j<account[i].length;j++){
//                 sum=sum+account[i][j];
                
//             }
//             if(sum>maxwealth){
//                 maxwealth=sum;
//             }
//         }
//         return maxwealth;
        
//     }
//     public static void main(String args[]){
//         int account[][]={{1,2,3,4},
//                         {3,4,5,6},
//                         {6,5,4,3},
//                         {6,8,9,4}
//         };
//         System.out.print(maximumwealth(account));
//     }
    

// }
//transpose matrix...
// public class Assignment{
//     public static int[][] transpose(int matrix[][]){
//         int n=matrix.length;
//         int m=matrix[0].length;
//         int result[][]=new int [m][n];
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 result[j][i]=matrix[i][j];
//             }
//         }
//         return result;
//     }
//     public static void main(String args[]){
//         int matrix[][]={{1,2,3},
//                         {3,4,5},
//                         {4,5,6}
//         };
//         int ans[][]=transpose(matrix);
//         for(int i=0;i<ans.length;i++){
//             for(int j=0;j<ans[0].length;j++){
//                 System.out.print(ans[i][j]+" ");
                
//             }
//             System.out.println();
//         }
//     }
// }
// //diagonal sum.....
// public class JavaBasics{
//     public static int diagonalsum(int matrix[][]){
//         int sum=0;
//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 if(i==j){
//                     sum=sum+matrix[i][j];
//                 }
//                 else if(i+j==matrix.length-1){
//                     sum=sum+matrix[i][j];
//                 }
//             }
            
//         }
//         return sum;
//     }
//     public static void main(String args[]){
//         int matrix[][]={{1,2,3,4},
//                         {5,6,7,8},
//                         {2,3,4,5},
//                         {5,6,7,8}
//         };
//         System.out.print(diagonalsum(matrix));
//     }
// }
//remove duplicate in string...........
// public class Assignment{
//     public static String removeduplicate(String str){
//         String result=" ";
//         for(int i=0;i<str.length();i++){
//             char ch=str.charAt(i);
//             if(result.indexOf(ch)==-1){
//                 result=result+ch;
//             }
//         }
//         return result;
        
//     }
//     public static void main(String args[]){
//         String input="programming";
//         System.out.println(removeduplicate(input));
//     }
// }
//who is taller ....
// import java.util.*;
// public class Assignment{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int t=sc.nextInt();
//         while(t-->0){
//             int x=sc.nextInt();
//             int y=sc.nextInt();
//             if(x>y){
//                 System.out.println("the taller is x ="+ x);
//             }
//             else{
//                 System.out.println(" the taller is y is = "+y);
//             }
//         }
//     }
// }
//print a reveres number ......
// import java.util.*;
// public class Assignment{
//     public static int reversenum(int n){
//         int reverse=0;
//         while(n>0){
//             int digit=n%10;
//             reverse=reverse*10+digit;
//             n=n/10;
//         }
//         return reverse;
        
//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("the value of n is =");
//         int n=sc.nextInt();
        
//         int result=reversenum(n);
//         System.out.print("the reverse number is =");
//         System.out.print(result);
//     }
// }
//find a maximum  part of a submatrix........
//  import java.util.*;

//  public class Assignment {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int T = sc.nextInt();

//         while (T-- > 0) {
//             int N = sc.nextInt();

//             int[][] A = new int[N][N];

//             for (int i = 0; i < N; i++) {
//                 for (int j = 0; j < N; j++) {
//                     A[i][j] = sc.nextInt();
//                 }
//             }

//             int ans = Integer.MIN_VALUE;

//             // Diagonals starting from first row
//             for (int col = 0; col < N; col++) {
//                 int i = 0;
//                 int j = col;

//                 int cur = 0;
//                 int best = Integer.MIN_VALUE;

//                 while (i < N && j < N) {
//                     cur = Math.max(A[i][j], cur + A[i][j]);
//                     best = Math.max(best, cur);

//                     i++;
//                     j++;
//                 }

//                 ans = Math.max(ans, best);
//             }

//             // Diagonals starting from first column
//             // Skip (0,0) because already processed
//             for (int row = 1; row < N; row++) {
//                 int i = row;
//                 int j = 0;

//                 int cur = 0;
//                 int best = Integer.MIN_VALUE;

//                 while (i < N && j < N) {
//                     cur = Math.max(A[i][j], cur + A[i][j]);
//                     best = Math.max(best, cur);

//                     i++;
//                     j++;
//                 }

//                 ans = Math.max(ans, best);
//             }

//             System.out.println(ans);
//         }

//         sc.close();
//     }
// }
// Find the index of the row having maximum number of 1s...

// public class Assignment {

//     static int rowWithMax1s(int[][] mat) {
//         int rows = mat.length;
//         int cols = mat[0].length;

//         int maxRowIndex = -1;
//         int maxCount = 0;

//         for (int i = 0; i < rows; i++) {
//             int count = 0;

//             for (int j = 0; j < cols; j++) {
//                 if (mat[i][j] == 1) {
//                     count++;
//                 }
//             }

//             if (count > maxCount) {
//                 maxCount = count;
//                 maxRowIndex = i;
//             }
//         }

//         return maxRowIndex;
//     }

//     public static void main(String[] args) {

//         int[][] mat = {
//             {0, 1, 1, 1},
//             {1, 1, 1, 1},
//             {0, 0, 1, 1},
//             {1, 1, 0, 0}
//         };

//         int ans = rowWithMax1s(mat);

//         System.out.println("Row with maximum 1s: " + ans);
//     }
// }
//write a program of a febonacci number
// import java.util.*;

// public class Assignment{
//     public static void main(String[] args) {

//         int n = 10; // number of terms

//         int a = 0, b = 1;

//         System.out.print("Fibonacci Series: ");

//         for (int i = 1; i <= n; i++) {
//             System.out.print(a + " ");

//             int next = a + b;
//             a = b;
//             b = next;
//         }
//     }
// }
//print number mirror......
//public class JavaBasics{
  //  public static int mirrorimage(int n){
    //    return n;
//    }
  //  public static void main(String args[]){
    //    int n=121;
      //  System.out.print(mirrorimage(n));
//    }
//}
////who is taller .....
//import java.util.*;

//public class JavaBasics {

    
//     static void taller(int x, int y) {

//        if (x > y) {
//             System.out.println("taller " + x);
//         } else {
//            System.out.println("taller " + y);
//        }
//     }

//    public static void main(String args[]) {

//        Scanner sc = new Scanner(System.in);

//         int t = sc.nextInt();

//         while (t != 0) {

//             int x = sc.nextInt();
//             int y = sc.nextInt();

//           taller(x, y);

//          t--;
//        }
//    }
// }
// //code of reverse intiger.......
// import java.util.*;
// public class JavaBasics{
//     public static int reversenum(int n){
//         int reverse=0;
//         while(n>0){
//            int digit=n%10;
//            reverse=reverse*10+digit;
//            n=n/10;
            
//        }
//         return reverse;
//     }
//     public static void main(String arsg[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter the value of n =");
//         int n=sc.nextInt();
//         int result=reversenum(n);
//         System.out.print("the value of n ="+result);
//     }
// }
// //print the power of x,n........
// class Solution {

//     public double myPow(double x, int n) {

//         long power = n; // handle negative values safely
//         double result = 1.0;

        
//         if (power < 0) {
//             x = 1 / x;
//             power = -power;
//         }

        
//         while (power > 0) {

//             result = result * x;
//             power--;
//         }

//         return result;
//     }
// }
//wordle problem in a codechef..............
// import java.util.*;
// public class Assignment{
//   public static void main(String args[]){
//     Scanner sc=new Scanner(System.in);
//     int testcase=sc.nextInt();
//     while(testcase-->0){
//       StringBuilder ans=new StringBuilder();
//       String s=sc.next();
//       String t=sc.next();
//       for(int i=0;i<s.length();i++){
//         if(s.charAt(i)==t.charAt(i)){
//           ans.append('G');
//         }
//         else{
//           ans.append('B');
//         }
//       }

//     }

//   }
// }




