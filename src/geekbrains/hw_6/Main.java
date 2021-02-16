package geekbrains.hw_6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(concatFiles("files/libra.txt", "files/leo.txt"));
        System.out.println(isWordInFile("files/libra.txt", "year1576gy"));
        System.out.println(isWordInFolder("files", "year"));
    }

    public static String concatFiles(String fileName1, String fileName2) {
        return readFile(fileName1) + "\n" + readFile(fileName2);
    }

    public static String readFile(String fileName) {
        String content = "";
        try {
            File myObj = new File(fileName);

            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                content += "\n" + data;
            }
            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            content = "Error";
        }

        return content;
    }

    private static boolean isWordInFile(String fileName, String word) {
        String content = readFile(fileName);
        return content.contains(word);
    }

    private static boolean isWordInFolder(String folderName, String word) {
        File folder = new File(folderName);
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            if (isWordInFile(listOfFiles[i].getAbsolutePath(), word)) {
                return true;
            }
        }

        return false;
    }
}