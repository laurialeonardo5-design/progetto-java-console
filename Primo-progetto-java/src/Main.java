//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public String qta1;

public Scanner scan;

void main() {
    scan = new Scanner(System.in);
 //   esercizio1();
 //   esercizio2();
    // esercizio3();
    esercizio4();
//  esempi1();

    //array
    //1a definizione
    int[] numeri = new int[3];
    numeri[0] = 9;
    numeri[1] = 4;
    numeri[2] = 2;

    //2a definizione

    Integer[] num = {1,2,3};

    System.out.printf("il secondo numero e' %d \n", num[1]);

    IO.println("num = " + num[1]);

    for (int n = 0; n < numeri.length; n++) {
        IO.println("numeri = " + numeri[n]);
    }

    for (int y = 0; y < num.length; y++) {
        IO.println("num= " + num[y]);
    }

    String[] nomi = {"Fabio", "Marco", "Simone"};

    //foreach in java come scrivere $nomi as $nome
    for(String nome : nomi){
        IO.println("Nome: " + nome);
    }
    int y = 0;
    while (y < num.length){


        y++;
    }

    do{
        //fai qualcosa che 1a volta sempre
        y++;
    } while(y < num.length);

    //arraylist
    ArrayList<String> spesa = new ArrayList<>();
    spesa.add("Pane");
    spesa.add("Burro");
    spesa.add("Latte");
    //add => aggiungi
    //remove => rimuovi spesa.remove()
    /*spesa.remove("Latte");
    spesa.set(1, "Marmellata");
    spesa.clear();*/
    spesa.forEach(item -> System.out.println("Comprare: " + item));

    List<String> persone = new ArrayList<>();

    List<String> frutti = new List<String>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<String> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean add(String s) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends String> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, Collection<? extends String> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public String get(int index) {
            return "";
        }

        @Override
        public String set(int index, String element) {
            return "";
        }

        @Override
        public void add(int index, String element) {

        }

        @Override
        public String remove(int index) {
            return "";
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<String> listIterator() {
            return null;
        }

        @Override
        public ListIterator<String> listIterator(int index) {
            return null;
        }

        @Override
        public List<String> subList(int fromIndex, int toIndex) {
            return List.of();
        }
    };
}

String prova(int valore, String pippo, Boolean ePieno){



    return "0";
}


void esercizio3(){
    System.out.println("inserisci un  prezzo di listino: ");
    double prezzoListino = scan.nextDouble() ;
    System.out.println("inserisci uno sconto: ");
    int percentualeSconto = scan.nextInt();
    double prezzoScontato = calcolaPrezzoScontato(prezzoListino, percentualeSconto);
    System.out.println( prezzoScontato);
}

String getVersioneApp(){
    return Runtime.version().toString();
}

double calcolaPrezzoScontato(double prezzoListino, int percentualeSconto){
    if (percentualeSconto <50){

        return prezzoListino - (prezzoListino *(percentualeSconto/100.0));
    }else {
        System.out.println("Attenzione: Sconto promozionale elevato applicato!");
        return prezzoListino - (prezzoListino *(percentualeSconto/100.0));
    }
}

void esercizio1(){
    String nomeProdotto = "Laptop Pro 15";
    double prezzo = 1299.99;
    int quantitaDisponibile = 8;
    boolean inOfferta = true;

String verificaVideo = "[Prodotto] " + nomeProdotto +" | prezzo : "+prezzo + " | quantità diponibile : "+quantitaDisponibile +" | In offerta : " +inOfferta;
System.out.printf(verificaVideo + "\n");
        }
        void esercizio2(){
            System.out.println("-----------------------");
            System.out.println("| Benvenuto in Java! |");
            System.out.println("-----------------------");
            getVersioneApp();
            System.out.println("V"+ getVersioneApp());
        }


//void esempi1(){
//
//
////    TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
////     to see how IntelliJ IDEA suggests fixing it.
//    IO.println(String.format("Hello and welcome!"));
//
//    System.out.print("Hello Word\n");
//
//    System.out.println("Inserisci la qta: ");
//    String strQta = scan.nextLine();
//
//    System.out.println("Inserisci il prezzo (esempio 49.99): ");
//    String strPrezzo = scan.nextLine();
//
//    int qta = Integer.parseInt(strQta);
//    double prezzo = Double.parseDouble(strPrezzo);
//
//    double totale3 = prezzo * qta;
//
//    /*IO.println("qta: " + qta);
//    IO.println("prezzo: " + prezzo);
//    IO.println("totale: " + totale3);*/
//
//    System.out.print("la qta è: {qta} \n");
//    System.out.printf("il prezzo è: %.2f € \n", prezzo);
//    System.out.printf("il totale è: %.2f € \n", totale3);
//
//    //int qta = 4;                //numeri interi positivi e negativi
//    //double prezzo = 49.99;      //double => intero + decimale    stringa + str(intero) | intero + int(stringa_int)
//
//    String indirizzo = "via mario rossi 10/3, 41100 modena " + qta;
//    Boolean ePieno = false;
//    String dataOggi = "14/07/2026";
//    LocalDate dataOggi2 = LocalDate.of(2006, 7, 14);
//    LocalDate dataOggiDin = LocalDate.now();
//
//    if(qta != 5){
//
//    }
//    else if(qta < 4 && prezzo > 40){
//
//    }
//    else{
//
//    }
//
//    String quattro = "4";
//
//    int totale = qta + Integer.parseInt(quattro);   //(int)
//    double totale2 = Double.parseDouble(quattro) + prezzo;
//
//    for (int i = 1; i <= 5; i++) {
//        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//        IO.println("i = " + i);
//    }
//
//    qta1 = prova(qta, indirizzo, ePieno);
//
//}
 void esercizio4(){
     System.out.println("inserisci la tua età");
     int età = scan.nextInt();
     boolean vip = true ;
     boolean biglietto = true;

        if (vip ||(età >= 18 && biglietto )){
            System.out.println("accesso permesso");
        }else{
            System.out.println("accesso negato");
        }


 }