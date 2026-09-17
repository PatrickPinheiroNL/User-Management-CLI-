import java.util.*;

public class Main {
    public static void main(String[] args){
        int counting = 0;
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 10; i++){
            System.out.println("Digite um numero: ");
            int numberChosen = input.nextInt();
            listOfNumbers.add(numberChosen);
        }

        List<Integer> twoBiggerNumbers = listOfNumbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .limit(2)
                .toList();

        System.out.println(twoBiggerNumbers);

    }
}