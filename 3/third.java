class complex {
int real;
int img;
complex (int r ,int i){
real =r;
img =i;
}
public static void main(String[]args){
complex c1=new complex(3,4);
complex c2=new complex(5,6);
int realsum = c1.real + c2.real;
int imgsum = c1.img + c2.img;
System.out.println("first complex number is:" +c1.real+ "+" + c1.img+"i");
System.out.println("second complex number is:" +c2.real+ "+" + c2.img+"i");
System.out.println("sum complex number is:" +realsum+"+"+imgsum+"i");
}}

