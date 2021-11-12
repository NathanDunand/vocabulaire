import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Controller {

	public static void main(String[]args) throws IOException {

		Boolean play=true;
		while(play){

			Liste liste=new Liste();
			Scanner sc = new Scanner(System.in);

			try {

				File f = new File(args[0]);

				BufferedReader b = new BufferedReader(new FileReader(f));

				String readLine = "";

				while ((readLine = b.readLine()) != null){
					Mots mots=new Mots();
					mots.setFrancais(b.readLine());
					mots.setAnglais(b.readLine());

					liste.ajouter(mots);
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
			liste.melanger();

			int points=0;

			System.out.println("___PETIT JEU___");
			System.out.println("Know your english, translate the french word in english.\n\n\n");


			int nombreMots=liste.getNombreDeMots();
			for(int i=0;i<nombreMots;i++){
				System.out.println(liste.getMots(i).getFrancais());

				System.out.println("English word ?\n");
				String s = sc.nextLine();
				if(s.equals(liste.getMots(i).getAnglais())){
					System.out.println("Correct\n");
					points++;
				}
				else{
					System.out.println("Wrong -- >"+liste.getMots(i).getAnglais()+"\n");
				}
			}

			System.out.println("Your score : "+points+"/"+liste.getNombreDeMots());

			System.out.println("Do you want to retry ? O/N\n");
			String t = sc.nextLine();
			if(t.equals("O")||t.equals("o")){
				play=true;
			}
			else{
				play=false;
			}
		}
	}

}
