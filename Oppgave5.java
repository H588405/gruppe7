package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave5 {

	public static void main(String[] args) {

		// final int ANT = 10 ;
		// for (int studentnr = 1; studentnr <= ANT; studentnr++) {
		int i = 0;
		while (i <= 9) {

			int karakter = parseInt(showInputDialog("F�r inn poengsummen din her."));

			if (karakter < 0 || karakter > 100) {
				showMessageDialog(null, "du har f�rt et ugyldig tall, pr�v igjen.");
				i--;
			} else if (karakter >= 0 && karakter <= 39) {
				showMessageDialog(null, "Du har f�tt karakteren F! \n �v mer :]");
			} else if (karakter >= 40 && karakter <= 49) {
				showMessageDialog(null, "Du har f�tt karakteren E! \n Bedre enn F :]");
			} else if (karakter >= 50 && karakter <= 59) {
				showMessageDialog(null, "Du har f�tt karakteren D! \n Over 50% riktig! :]");
			} else if (karakter >= 60 && karakter <= 79) {
				showMessageDialog(null, "Du har f�tt karakteren C! \n du begynner � bli god n� :]");
			} else if (karakter >= 80 && karakter <= 89) {
				showMessageDialog(null, "Du har f�tt karakteren B! \n N� er du nesten p� topp :]");
			} else if (karakter >= 90 && karakter <= 100) {
				showMessageDialog(null, "Du har f�tt karakteren A! \n Utrolig bra! Dette m� feires :]");
			}
			i++;
		}
	}

}
//}
