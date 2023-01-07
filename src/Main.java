public class Main {

public static void main(String[] args) {
        int temperature =  5;
        int numberOfStudents = 15;
        boolean isSnowy = false;

        if(temperature > 0 && numberOfStudents > 10){//&& - логический оператор И (AND)
            System.out.println("Go to picnic");
        }
        if (isSnowy && temperature < 5){
            System.out.println("Go to cinema");
        }

        if (temperature < 15 || numberOfStudents < 7 ){// || - логический оператор ИЛИ (OR)
            System.out.println("Go to Cafe");
        }

        if (isSnowy || temperature < 10 && numberOfStudents > 10 ){
            // false || true && true => 0 + 1 * 1 => 0 + 1 => 1 (TRUE)
            System.out.println("Go to school");
        }

    if (isSnowy || temperature < 10 && numberOfStudents > 10 ){
        // (false || true) && true => (0 + 1) * 1 => 0 + 1 => 1 (TRUE)
        System.out.println("Play basketball");
      }
     if (isSnowy){
         System.out.println("Play snowballs");
     }
     if (!isSnowy){// ! - логический оператор отрицания НЕ (NOT)
         System.out.println("Play football");
     }
     if (numberOfStudents != 10){
         System.out.println("Something");
     }

    if (temperature < 25 && numberOfStudents > 12) {
        System.out.println("Можно идти гулять");
    }
    if (temperature < 20 && numberOfStudents > 14) {
        System.out.println("We go hike ");
    }
    if (temperature > 4 && numberOfStudents > 13) {
        System.out.println("Go to cinema");
    }
    if (temperature > 2 && numberOfStudents > 12) {
        System.out.println("Go to Cafe");
    }
    if (temperature > 4 && numberOfStudents > 10) {
        System.out.println("Оставайтесь дома");
    }
    }

    }
