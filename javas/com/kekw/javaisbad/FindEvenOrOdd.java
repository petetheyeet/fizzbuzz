package fizzbuzz.javas.com.kekw.javaisbad;

import java.math.BigDecimal;
import javax.swing.JOptionPane;

public class FindEvenOrOdd {

    static class ForcedClosedMessage extends Thread {
        public void run() {
                System.out.print("Odd oWo");
        }
    }

    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(new ForcedClosedMessage());
        int integer = getNumberFromUser();
        BigDecimal aDouble;
        aDouble = BigDecimal.valueOf(integer);
        boolean kek = true;
        BigDecimal two = BigDecimal.valueOf(2);
        BigDecimal zero = BigDecimal.valueOf(0);
        while(kek) {
            try {
                if(aDouble.remainder(two) == zero) {
                    kek = false;
                    JOptionPane.showMessageDialog(null, "Your number is EVEN (✿◠‿◠)",
                    "└(^o^ )Ｘ( ^o^)┘", JOptionPane.INFORMATION_MESSAGE);
                }
                else {
                    aDouble = aDouble.remainder(two);
                }
            }
            catch(Exception e) {
                JOptionPane.showMessageDialog(null, "Your number is FALSE! ლ(ಠ益ಠ)ლ",
                    "ლ(ಠ益ಠ)ლ", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    

    public static int getNumberFromUser() {
        Object iShouldBeAValidInteger;
        int integer;
        boolean didYouFudgeItUp = true;
        do {
            try {
                iShouldBeAValidInteger = JOptionPane.showInputDialog("Enter a number and I'll tell you if it's odd or even owo");
                integer = Integer.parseInt((String) iShouldBeAValidInteger);
                return integer;
            }
            catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "THAT'S NOT A NUMBER NUMBSKULL!", 
                "òwó", JOptionPane.ERROR_MESSAGE);
            }
            catch(Exception e) {
                JOptionPane.showMessageDialog(null, "WTF HOW DID YOU BREAK MY PROGRAMMMMMmmmMMmmmmMmm" + e.getStackTrace().toString(), 
                "(ง’̀-‘́)ง", JOptionPane.ERROR_MESSAGE);
            }
        }while(didYouFudgeItUp);
        return 5;
    }

}