import java.util.function.Consumer;
import java.util.Arrays;
import java.util.List;

public class ThisVariableCaptureSample{

  	static int a = 1;
  	private int b = 2;
  	public ThisVariableCaptureSample(){

  		List<Integer> integers = Arrays.asList(1,2,3,4,5);
  		int i = 10;
  		integers.forEach( x -> {
  		    System.out.println( (x * i) + a + this.b );
  		});

  	}

  	public static void main(String[] args){

  	    StaticVariableCaptureSample sample = new StaticVariableCaptureSample();

  	}

}