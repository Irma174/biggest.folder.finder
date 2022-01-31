import java.io.File;

public class Main {
    public static void main(String[] args) {
        String folderPath = "C:/Users/user/Desktop/файлы";
        File file = new File(folderPath);

        System.out.println(getFolderSize(file));


    }

    //рекурсивная функция
    public static long getFolderSize(File folder) {
        //Проверяем. является folder файлом
        if (folder.isFile()) {
            return folder.length(); //если является - возвращаем размер этого файла
        }
        long sum = 0;

        File[] files = folder.listFiles();  //получаем список файлов в этой папке
        for (File file : files) {
            sum += getFolderSize(file);
        }
        return sum;
    }

}

