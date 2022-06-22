import java.io.*;

public class Main {

    public static void main(String[] args) {
        checkLog();
        mkDir("D://Games/src");
        mkDir("D://Games/res");
        mkDir("D://Games/savegames");
        mkDir("D://Games/src/main");
        mkDir("D://Games/src/test");
        mkDir("D://Games/res/drawables");
        mkDir("D://Games/res/vectors");
        mkDir("D://Games/res/icons");
        mkFile("D://Games/src/main/Main.java");
        mkFile("D://Games/src/main/Utils.java");
        mkFile("D://Games/temp/temp.txt");
    }

    public static void mkDir(String dirName) {
        StringBuilder sb = new StringBuilder();
        File dir = new File(dirName);
        try (FileWriter log = new FileWriter("D://Games/temp/temp.txt", true)) {
        if (dir.mkdir())
            sb.append("Каталог " + dirName + " создан" + '\n');
            log.write(sb.toString());
        } catch(IOException ex){
            System.out.println(ex.getMessage() + '\n');
        }
    }

    public static void mkFile(String fileName) {
        StringBuilder sb = new StringBuilder();
        File file = new File(fileName);
        try (FileWriter log = new FileWriter("D://Games/temp/temp.txt", true)) {
            if (file.createNewFile())
                sb.append("Файл " + fileName + " создан" + '\n');
            log.write(sb.toString());
        } catch (IOException ex) {
            System.out.println(ex.getMessage() + '\n');
        }
    }

        public static void checkLog() {
            File checkFile = new File("D://Games/temp/temp.txt");
            if(checkFile.exists() && !checkFile.isDirectory()){
                return;
            }else{
                File checkDir = new File("D://Games/temp");
                if (checkDir.exists()) {
                    File fileLog = new File("D://Games/temp/temp.txt");
                    try {
                        if (fileLog.createNewFile())
                            System.out.println();
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                } else {
                    File dir = new File("D://Games/temp");
                    if (dir.mkdir())
                        System.out.println();
                }
            }
        }
}
