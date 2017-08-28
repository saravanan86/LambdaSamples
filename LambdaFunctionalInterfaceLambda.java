import java.util.Arrays;
import java.util.List;

public class LambdaFunctionalInterfaceLambda{

    public LambdaFunctionalInterfaceLambda(){

        List<String> list = Arrays.asList("one","two","three");

        list.forEach((s) -> System.out.println("======From LambdaFunctionalInterfaceLamba - ACCEPTED String: "+s) );

    }

}