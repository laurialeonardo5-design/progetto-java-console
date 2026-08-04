import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.sql.*;

public class Libro {

    private String isbn;
    private String titolo;
    private String autore;
    private int annoPubblicazione;
    private boolean disponibile;

    public Libro(String isbn, String titolo, String autore, int annoPubblicazione, boolean disponibile){
        this.isbn = isbn;
        this.titolo = titolo;
        this.autore = autore;
        this.annoPubblicazione = annoPubblicazione;
        this.disponibile = disponibile;

        //DriverManager.getConnection("");
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public boolean isDisponibile() {
        return disponibile;
    }

    public void setDisponibile(boolean disponibile) {
        this.disponibile = disponibile;
    }
}
class Prestito{

    private Libro libro;
    private String nomeUtente;
    private LocalDate dataPrestito = LocalDate.now();
    private LocalDate dataRestituzione = LocalDate.now();
    private Integer idUtente;
    public Prestito (Libro libro,String nomeUtente, LocalDate dataPrestito , LocalDate dataRestituzione,Integer idUtente){
        this.libro = libro;
        this.nomeUtente = nomeUtente;
        this.dataPrestito = dataPrestito;
        this.dataRestituzione = dataRestituzione;
        this.idUtente = idUtente;
    }

}
class LibroNonDisponibile extends Prestito{

    public LibroNonDisponibile(Libro libro, int annoPubblicazione, String nomeUtente, LocalDate dataPrestito, LocalDate dataRestituzione,Integer idUtente) {
        super(libro, nomeUtente, dataPrestito, dataRestituzione, idUtente);

        trovaLibro(libro, nomeUtente, dataPrestito, dataRestituzione);
    }

    void trovaLibro(Libro libro,String nomeUtente,LocalDate dataPrestito,LocalDate dataRestituzione){
        if (libro.isDisponibile()){
            System.out.printf(nomeUtente,dataPrestito,dataRestituzione);
        }else{
            System.out.println("il libro è gia stato prestato");
        }
    }
}
class Biblioteca {

    public final Map<String, Libro> catalogo = null;
    public final List<Prestito> storico = new ArrayList<>();

    void aggiungiLibro (Libro libro){
        Libro nuovolibro = libro;
    }
    void presta(Libro libro,String nomeUtente, LocalDate dataPrestito, LocalDate dataRestituzione ,Integer idUtente){
        Prestito prestito = new Prestito(libro ,nomeUtente, dataPrestito, dataRestituzione, idUtente);
        libro.setDisponibile(false);
    }
    List<Libro> cercaAutore(String autore){



        return null;
    }
    List<Libro> inRitardo(int giorniMax){

        LocalDate soglia = LocalDate.now().minusDays(giorniMax);

        //DA FARE.
        // 1. usare soglia su storico
        // 2. json e mysql
        // 3. classi singole nei file con il loro nome classe.java

        return null;
    }
}

