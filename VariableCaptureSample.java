import java.util.function.Function;

public class VariableCaptureSample {

  static String x = "Hello";
  String str = "New String";

  public VariableCaptureSample(){

    //String x = "New Hello";
    Function<String,String> func1 = y -> { return y + " "+ x + " " + str;};
        System.out.println(func1.apply("java2s.com"));
        //x="new";
        //StaticVariableCaptureSample staticVariableCaptureSample = new StaticVariableCaptureSample();

  }

  public static void main(String[] argv) {


    VariableCaptureSample variableCaptureSample = new VariableCaptureSample();

  }

}