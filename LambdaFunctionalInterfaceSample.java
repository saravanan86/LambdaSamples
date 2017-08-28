import java.util.function.Consumer;
import java.util.Arrays;
import java.util.List;

public class LambdaFunctionalInterfaceSample{

    public LambdaFunctionalInterfaceSample (){

        List<String> list = Arrays.asList("one","two","three");
        Consumer consumer = new ConsumerImpl();
        list.forEach(consumer);

    }

    class ConsumerImpl implements Consumer<String>{

        @Override
        public void accept( String str ){

            System.out.println("======From LambdaFunctionalInterfaceSample - ACCEPTED String: "+str);

        }

    }

}