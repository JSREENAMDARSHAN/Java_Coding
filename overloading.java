class overloading{

  public int add(int a,int b){
    return a+b;
  }
  public int add(int a,int b,int c){
    return a+b+c;
  }
    public static void main(String[] args){
        overloading obj = new overloading();
        System.out.println(obj.add(1,2));
        System.out.println(obj.add(1,2,3));
    }
}