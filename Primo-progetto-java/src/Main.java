//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public String qta1;

void main() {

    Scanner scan = new Scanner(System.in);
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));

    System.out.print("Hello Word\n");

    System.out.println("Inserisci la qta: ");
    String strQta = scan.nextLine();

    System.out.println("Inserisci il prezzo (esempio 49.99): ");
    String strPrezzo = scan.nextLine();

    int qta = Integer.parseInt(strQta);
    double prezzo = Double.parseDouble(strPrezzo);

    double totale3 = prezzo * qta;

    /*IO.println("qta: " + qta);
    IO.println("prezzo: " + prezzo);
    IO.println("totale: " + totale3);*/

    System.out.print("la qta è: {qta} \n");
    System.out.printf("il prezzo è: %.2f € \n", prezzo);
    System.out.printf("il totale è: %.2f € \n", totale3);

    //int qta = 4;                //numeri interi positivi e negativi
    //double prezzo = 49.99;      //double => intero + decimale    stringa + str(intero) | intero + int(stringa_int)

    String indirizzo = "via mario rossi 10/3, 41100 modena " + qta;
    Boolean ePieno = false;
    String dataOggi = "14/07/2026";
    LocalDate dataOggi2 = LocalDate.of(2006, 7, 14);
    LocalDate dataOggiDin = LocalDate.now();

    if(qta != 5){

    }
    else if(qta < 4 && prezzo > 40){

    }
    else{

    }

    String quattro = "4";

    int totale = qta + Integer.parseInt(quattro);   //(int)
    double totale2 = Double.parseDouble(quattro) + prezzo;

    for (int i = 1; i <= 5; i++) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        IO.println("i = " + i);
    }

    qta1 = prova(qta, indirizzo, ePieno);

}

String prova(int valore, String pippo, Boolean ePieno){



    return "0";
}
