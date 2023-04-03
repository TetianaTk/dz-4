public class Main {

  public static void main(String[] args) {
    ReturnInt returnInt = new ReturnInt();
    int myInt = returnInt.getMyInt();
    System.out.printf("~~~ %d \"~~~", myInt);
  }

}
