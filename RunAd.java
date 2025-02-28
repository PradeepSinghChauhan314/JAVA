 class Add {
    int a,b,c;
    public void Add ()//Method
    {
        c=a+b;
        System.out.println("Sum="+c);

    }
}
     class RunAd {
        public static void main(String[] args) {
            Add A1  =new Add();
            Add A2 = new Add();
            A1.a=10;
            A1.b=20;

            A2.a=30;
            A2.b=40;

            A1.Add();
            A2.Add();
        }
    
        
    }

