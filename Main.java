import java.util.Vector;

class Main {
  public static void main(String[] args) {
    //initialise vector a, vector b
    Vector a = new Vector();
    Vector b = new Vector();
    Vector c = new Vector(); 

    //Vector a values
    for(int i = 0; i < 10; i++){
      a.add(i); //add value 
    }

    //Vector b values
    for(int i = 0; i < 20; i++){
      b.add(i+2); //add value 
    }

    c = union(a, b); //call function

    //print union values
    System.out.println("Vector A Elements are: "+ a); 
    System.out.println("Vector B Elements are: "+ b); 
    System.out.println("Vector C Union Elements are: "+ c); 

    //Test functions
    test_duplicates_in_vector(c);
    test_null_vectors(a, b);
  }

  //vector function
  public static Vector union(Vector a, Vector b){

    Vector result = new Vector();

    //union
    result.addAll(a);
    result.addAll(b);

    return result; //return vector 

  }//end of function

  //test cases 
  public static void test_duplicates_in_vector(Vector vector){
    
    System.out.println("Testing for duplicate values...");

    for(int a = 0; a < vector.size(); a++){

      Object to = vector.elementAt(a);

      for(int b = a + 1; b < vector.size(); b++){

        Object from = vector.elementAt(b);

         if(to.equals(from)){
          System.out.println("Duplicate detected => Duplicate value: " + to);
        }

      }//end of for loop

    } //end of for loop

  }//end of test 

  public static void test_null_vectors(Vector a, Vector b){
    System.out.println("Testing for null vectors...");

    if(a == null){
      System.out.println("Null vector detected => First vector");
    }
    else if(b == null){
      System.out.println("Null vector detected => Second vector");
    }
    else {
      System.out.println("No null vector detected...");
    } //end of if conditions

  } //end of test

} //end of main