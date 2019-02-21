import java.io.FileNotFoundException;

import javax.xml.bind.JAXBException;

import scuola.Scuola;
import scuola.TipoStudente;
import utility.XMLunmarshaller;

public class MainClass 
{

	public static void main(String[] args) throws FileNotFoundException, JAXBException 
	{
		Scuola miaScuola;
		miaScuola=(Scuola) XMLunmarshaller.unmarshal("scuola.xml", "scuola");
		System.out.println(miaScuola.toString());
		
		//Aggiungo uno studente alla classe 1BAFM
		TipoStudente s1=new TipoStudente("11991","Valzelli","Rododendro");
		
		int numeroClassi=miaScuola.getNumeroElementi();
		//cerco classe 1BAFM
		int posizioneClasse = 0;
		
		for (int i = 0; i < numeroClassi-1; i++) 
		{
			if (miaScuola.getSingolaClasse(i).getAnno()==1 && miaScuola.getSingolaClasse(i).getSezione().compareTo("B")==0
					&& miaScuola.getSingolaClasse(i).getCorso().compareTo("AFM")==0)
			{
				posizioneClasse=i;
				break;
			}						
		}
		
		miaScuola.getSingolaClasse(posizioneClasse).addStudente(s1);
		
		System.out.println(miaScuola.toString());
		
	}

}
