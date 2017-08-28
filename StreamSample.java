import java.util.stream.Stream;
import java.util.Arrays;
import java.util.List;

public class StreamSample{

    public StreamSample(){

        List<String> list = Arrays.asList("one","two","three");

        for( String item:list ){

            System.out.println("======"+item);

        }

        list.parallelStream().forEach( (item) -> System.out.println("====STREAM===="+item));

    }

    public static void main(String[] args){

        StreamSample sample = new StreamSample();

    }

}