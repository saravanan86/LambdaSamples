import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Consumer;

public class MethodReferenceInstanceSample{

    public MethodReferenceInstanceSample(){

        List<String> list = Arrays.asList("one","two","three");

        list.stream()
            .map( new Function<String,String>(){

                @Override
                public String apply(String str){

                    return str.toUpperCase();

                }

            } )
            .forEach( new Consumer<String>(){

                @Override
                public void accept(String str){

                    decorateStringAndPrint(str);

                }

            } );

        list.stream()
            .map( s -> s.toUpperCase() )
            .forEach( s -> decorateStringAndPrint(s) );

        list.stream()
            .map( String::toUpperCase )
            .forEach( this::decorateStringAndPrint );

    }

    public void decorateStringAndPrint( String str ){

        str = "################################"+str+"################################";
        System.out.println(str);

    }

    public static void main(String[] args){

        MethodReferenceInstanceSample sample = new MethodReferenceInstanceSample();

    }

}