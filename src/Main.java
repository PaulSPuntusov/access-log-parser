import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        while (true) {
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();
            System.out.println(fileExists);
            System.out.println(isDirectory);
            if (fileExists == false) {
                System.out.println("Ошибочно введен путь, или файл не существует");
                continue;
            }
            if ((fileExists == true) && (isDirectory == true)) {
                System.out.println("Это директория");
                continue;
            }
            if ((fileExists == true) && (isDirectory == false)) {
                count +=1;
                System.out.println("Путь указан верно, это файл номер "+ count);
            }
        }

    }
}
