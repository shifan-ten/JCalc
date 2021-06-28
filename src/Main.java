import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String str_input = input.nextLine();
        String[] arr_in = str_input.split(" ");

        boolean isRoman = true;
        int left = Rome.getInt(arr_in[0]);
        int right = Rome.getInt(arr_in[2]);

        if (left == -1 && right == -1) {
            left = Integer.parseInt(arr_in[0]);
            right = Integer.parseInt(arr_in[2]);
            isRoman = false;
        } else if ((left == -1 && right != -1) || (left != -1 && right == -1)) {
            throw new Exception("Неверный ввод!");
        }

        if (left > 10 || left < 1 || right > 10 || right < 1) throw new Exception("Неверный ввод!");

        int res;
        switch (arr_in[1]) {
            case "+":
                res = left + right;
                break;
            case "-":
                res = left - right;
                break;
            case "*":
                res = left * right;
                break;
            case "/":
                res = left / right;
                break;
            default:
                throw new Exception("Неверный ввод!");
        }

        System.out.println(isRoman ? Rome.getRome(res) : res);
    }
}
