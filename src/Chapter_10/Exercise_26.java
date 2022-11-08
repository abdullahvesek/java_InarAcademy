package Chapter_10;

public class Exercise_26 {
    public static void main(String[] args) {
        String vesek=args[0].replaceAll(" ","");
        vesek=vesek.replaceAll("[+]","%+%");
        vesek=vesek.replaceAll("[-]","%-%");
        vesek= vesek.replaceAll("[*]","%*%");
        vesek = vesek.replaceAll("[/]","%/%");
        args = vesek.split("%");



        if (args.length!=3) {
            System.out.println("wrong usage ");
            System.exit(0);
        }

        int result = 0;


        switch (args[1].charAt(0)) {
            case '+' : result = Integer.parseInt(args[0]) +
                    Integer.parseInt(args[2]);
                break;
            case '-' : result = Integer.parseInt(args[0]) -
                    Integer.parseInt(args[2]);
                break;
            case '*' : result = Integer.parseInt(args[0]) *
                    Integer.parseInt(args[2]);
                break;
            case '/' : result = Integer.parseInt(args[0]) /
                    Integer.parseInt(args[2]);
                break;
        }


        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
                + " = " + result);


    }
}
