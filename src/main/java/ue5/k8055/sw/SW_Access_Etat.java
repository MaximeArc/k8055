package ue5.k8055.sw;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import ue5.k8055.process.StrucEntrees;
import ue5.k8055.process.StrucSorties;
import ue5.k8055.process.StrucProcess;


@Path("/k8055_Etat")
public class SW_Access_Etat {
	
	
	public SW_Access_Etat()
	{
		
	}
	
	// lecture des entr�es (Version navigateur)
	@GET
	@Path("/Entrees")
	@Produces(MediaType.TEXT_PLAIN)
	public String LireEntrees() {
		String Str="E";
		Str = "E1 : " + SW_Access_Action.Lanceur.STE.DE1 + " - " + "E2 : " + SW_Access_Action.Lanceur.STE.DE2 + " - " +
			  "E3 : " + SW_Access_Action.Lanceur.STE.DE3 + " - " + "E4 : " + SW_Access_Action.Lanceur.STE.DE4 + " - " +
			  "E5 : " + SW_Access_Action.Lanceur.STE.DE5; 
		return Str;	
	}
	
	// lecture de l'objet StrucEntrees
	//.
	//.
	//.
	
	// lecture des sorties (Version navigateur)
	//.
	//.
	//.
	
	// lecture de l'objet StrucSorties
	//.
	//.
	//.
	
	// lecture du Process (Version navigateur)
	//.
	//.
	//.	
	
	// lecture de l'objet StrucProcess
	//.
	//.
	//.
	
}

