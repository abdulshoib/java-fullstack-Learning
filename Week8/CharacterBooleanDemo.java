
public class CharacterBooleanDemo {

    public static void main(String[] args) {

        Character grade = Character.valueOf('A');
        Boolean passed = Boolean.valueOf(true);

        System.out.println("Grade : " + grade);
        System.out.println("Passed : " + passed);

        System.out.println("Is Letter : " + Character.isLetter(grade));
        System.out.println("Is Uppercase : " + Character.isUpperCase(grade));
    }
}
