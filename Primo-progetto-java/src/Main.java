//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public String qta1;

void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));

    System.out.println("Hello Word");

    int qta = 4;                //numeri interi positivi e negativi
    double prezzo = 49.99;      //double => intero + decimale    stringa + str(intero) | intero + int(stringa_int)
    String indirizzo = "via mario rossi 10/3, 41100 modena " + qta;

    String quattro = "4";

    int totale = qta + Integer.parseInt(quattro);   //(int)
    double totale2 = Double.parseDouble(quattro) + prezzo;

    for (int i = 1; i <= 5; i++) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        IO.println("i = " + i);
    }

    qta1 = prova(qta, indirizzo);

}

String prova(int valore, String pippo){



    return "0";
}
