import javax.print.DocFlavor.STRING;

public class MinhaClasse {
    public static void main (String [] args){
        String primNom = "Aline";
        String segNom = "Coutinho";
        String nomeCompleto = nomComp (primNom, segNom);

        System.out.println(nomeCompleto);
    }

    public static String nomComp (String primNom, String segNom){
        return "Resultado "+ primNom.concat(" ").concat(segNom);
    }

}