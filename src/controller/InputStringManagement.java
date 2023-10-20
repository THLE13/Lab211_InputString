package controller;

import common.Library;
import common.AlgorithmString;
import java.util.Scanner;
import view.Menu;

public class InputStringManagement extends Menu<String> {

    static String[] mc = {"Display GUI, Input Data And Perform function", "Exit"};

    protected Library library;
    protected AlgorithmString algorithm;

    public InputStringManagement() {
        super("====== Analysis String program ======", mc);
        library = new Library();
        algorithm = new AlgorithmString();

    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                System.out.println("Input String: ");
                Scanner sc = new Scanner(System.in);
                String s = sc.nextLine();
                algorithm.getNumber(s);
                algorithm.getCharacter(s);
                break;
            case 2:
                System.exit(0);
                break;
            default:
                System.out.println("Your choice invalid! Pls input another choice");
        }
    }
}
