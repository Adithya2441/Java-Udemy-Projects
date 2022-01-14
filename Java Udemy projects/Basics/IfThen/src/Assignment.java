public class Assignment {
    public static void main(String[] args) {
       double a=20.00d;
       double b=80.00d;
       double c;
       c = (a+b)*100.00d;
        System.out.println("Totat = "+c);
       double d;
       d=c%40.00d;
        System.out.println("Remainder =" + d);
       boolean i = (d==0) ? true : false;
        System.out.println("Remainder check = " + i);
       if(!i)
       {
           System.out.println("Got some remainder");
       }
    }
}
