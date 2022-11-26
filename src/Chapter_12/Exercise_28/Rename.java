package Chapter_12.Exercise_28;

import java.io.File;
import java.util.ArrayList;

public class Rename {
    public static void main(String[] args) throws Exception {

        if (args.length != 1) {
            System.out.println("must be 1");
            System.exit(0);
        }

        ArrayList<File> files = getFiles(args);


        for (int i = 0; i < files.size(); i++) {
            pad(files.get(i));
        }
    }

    private static void pad(File file) {
        StringBuilder str = new StringBuilder(file.getName());
        str.insert(8, '0');
        file.renameTo(new File(str.toString()));

    }

    private static ArrayList<File> getFiles(String[] args) {
        ArrayList<File> list = new ArrayList<>();

        for (int i = 0; i < args.length; i++) {
            File f = new File(args[i]);
            if (f.isFile() && f.getName().matches("Exercise\\d_\\d")) {
                list.add(f);
            }

        }
        return list;

    }


}
