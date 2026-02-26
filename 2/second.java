import java.util.Scanner;
class matrix {
public static void main(String[]args) {
Scanner sc = new Scanner (System.in);
System.out.print("enter numbers of rows");
int rows=sc.nextInt();
System.out.print("enter number of columns");
int  cols=sc.nextInt();
int[][]matrix1=new int [rows][cols];
int[][]matrix2=new int [rows][cols];
int[][]sum=new int [rows][cols];
System.out.println("enter first matrix");
for (int i=0;i<rows;i++){
for (int j=0;j<cols;j++){
matrix1[i][j] = sc.nextInt();
}}System.out.println("enter second matrix");
for (int i=0;i<rows;i++){
for (int j=0;j<cols;j++){
matrix2[i][j] = sc.nextInt();
}}
for (int i=0;i<rows;i++){
for (int j=0;j<cols;j++){
sum[i][j] = matrix1 [i][j] + matrix2 [i][j] ;
}}
System.out.println("sum o f matrix");
for (int i=0;i<rows;i++){
for (int j=0;j<cols;j++){
System.out.print(sum[i][j]+ " ");
}
System.out.println();
}
}}

