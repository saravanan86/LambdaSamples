import java.util.function.Consumer;
import java.util.Arrays;
import java.util.List;


public class LambdaFunctionalInterfaceAnonymous{

    public LambdaFunctionalInterfaceAnonymous(){

        List<String> list = Arrays.asList("one","two","three");

        list.forEach(new Consumer<String>(){

            @Override
            public void accept( String str ){

                System.out.println("======From LambdaFunctionalInterfaceAnonymous - ACCEPTED String: "+str);

            }

        });

    }

}