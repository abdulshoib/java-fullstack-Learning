
import java.util.function.Function;

class TextUtility {

    public String convertToUpperCase(String text) {
        return text.toUpperCase();
    }
}

public class InstanceMethodReferenceDemo {

    public static void main(String[] args) {

        TextUtility textUtility = new TextUtility();

        // Using lambda expression
        Function<String, String> upperUsingLambda = text -> textUtility.convertToUpperCase(text);

        System.out.println("Using lambda: " + upperUsingLambda.apply("java method reference"));

        // Using instance method reference
        Function<String, String> upperUsingMethodReference = textUtility::convertToUpperCase;

        System.out.println("Using method reference: " + upperUsingMethodReference.apply("java 8 features"));
    }
}
