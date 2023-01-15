import java.util.Scanner;

public class JavaStart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Имя: ");
        String name = scanner.nextLine();
        name = name.trim();

        //System.out.print("Возраст: ");
        //String ageString = scanner.nextLine();
        //ageString = ageString.trim();
        //int age = Integer.parseInt(ageString);

        System.out.println("Добро пожаловать, " + name + "!");

        System.out.print("Придумайте пароль из 6 символов: ");
        String password = scanner.nextLine();
        password = password.trim();
        boolean passTrue;

        int rightPassword = validation(password);
        if (rightPassword == 1) {
            System.out.println("Верный пароль");
            System.out.println("Вы успешно вошли в систему!");
            passTrue = true;
        } else {
            System.out.println("Неверный пароль");
            passTrue = false;
        }
        int coffeeAmt = 0;
        int coffeePrice = 0;
        int coffeeSum;

        for (int i = 0; i <= 3; i++) {
            if (passTrue) {
                System.out.print("Какой кофе Вы любите? (1 - латте, 2 - фраппучино, 3 - никакой): ");
                String coffeeString = scanner.nextLine();
                coffeeString = coffeeString.trim();
                int coffee = Integer.parseInt(coffeeString);
                if (coffee == 1 || coffee == 2) {
                    System.out.print("Сколько раз Вы покупаете кофе в неделю? ");
                    coffeeAmt = Integer.parseInt(scanner.nextLine());

                    System.out.print("За какую сумму вы покупаете кофе? ");
                    coffeePrice = Integer.parseInt(scanner.nextLine());
                } else if (coffee == 3) {
                    System.out.print("Вы покинули группу кофеманов :(");
                    break;
                } else {
                    System.out.println("Неверно введены данные, попробуйте снова");
                    continue;
                }
                break;
            }
        }
        coffeeSum = ((coffeeAmt * coffeePrice) * 52);
        System.out.println("В год на кофе вы тратите около: " + coffeeSum + " рублей!");
    }


        private static int validation (String password){
            if (password.matches(".*[0-9]{1,}.*") && password.matches(".*[!@#$%^&*()_?/]{1,}.*")
                    && password.length() == 6) {     //    1!5Do%
                return 1;
            } else {
                return -1;
            }
        }
    }