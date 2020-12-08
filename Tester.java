public class Tester {
  public static void main(String[] args) {
    // IntegerSequence r = new Range(10,15);
    // while(r.hasNext()){
    //   System.out.print(r.next());
    //   if( r.hasNext() ){
    //      System.out.print( ", " );
    //   }
    // }
    // System.out.println();
    int[]nums = {1,3,5,0,-1,3,9};
    IntegerSequence test = new ArraySequence(nums);
  }
}
