//Method Overloading---------------

class Over{
   void add(){
    int a=10,b=20,c;
    c=a+b;
    System.out.println(c);
   }

   void add(int x,int y){
        int c;
        c=x+y;
    System.out.println(c);
   }

   void add(int x,double y){
    double c;
        c=x+y;
    System.out.println(c);
   }


   public static void main(String[] args){
    Over s = new Over();
    s.add();
    s.add(100,200);
    //s.add(2000,40000);
   }
}