import java.math.BigDecimal;

public class Main {
    //Scrivi un programma Java dove imposti 2 BigDecimal e 1 operazione aritmetica
    //(Addizione, sottrazione, moltiplicazione e divisione, min e max) definita in un enum,
    //crei un metodo per calcolare l'operazione richiesta e ritorni il risultato.
    //Il tipo di operazione, i due dati in input e il risultato dovranno essere stampati a schermo
    public static void main(String[] args) {
        BigDecimal num1 = BigDecimal.valueOf(3);
        BigDecimal num2 = BigDecimal.valueOf(4);
        System.out.println(operazione(num1, num2, Operazione.DIVISIONE));

    }
    public static BigDecimal operazione(BigDecimal val1, BigDecimal val2, Operazione operazione){
        BigDecimal totale = BigDecimal.valueOf(0);
        if(operazione.equals(Operazione.ADDIZIONE)){
            totale = val1.add(val2);
        } else if (operazione.equals(Operazione.DIVISIONE)) {
            totale = val1.divide(val2);
        } else if (operazione.equals(Operazione.SOTTRAZIONE)) {
            totale = val1.subtract(val2);
        } else if (operazione.equals(Operazione.MOLTIPLICAZIONE)) {
            totale = val1.multiply(val2);
        } else if (operazione.equals(Operazione.MAX)) {
            totale = val1.max(val2);
        } else if (operazione.equals(Operazione.MIN)) {
            totale = val1.min(val2);
        }
        return totale;
    };

//    public static BigDecimal operazione(BigDecimal val1, BigDecimal val2, Operazione operazione){
//      BigDecimal totale = switch (operazione) {
//            case ADDIZIONE -> val1.add(val2);
//            case DIVISIONE -> val1.divide(val2);
//            case SOTTRAZIONE -> val1.subtract(val2);
//            case MOLTIPLICAZIONE -> val1.multiply(val2);
//            case MAX -> val1.max(val2);
//            case MIN -> val1.min(val2);
//        };
//        return totale;
//    };
}