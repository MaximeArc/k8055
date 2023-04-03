package ue5.k8055.process;

public class Th_Process extends Thread{
	
	private
	
	// Gestion de la fin du thread
	boolean Term = true;
	// Temps de Cycle du thread Process (en ms) 
	int CycleProcess = 10;
	// Référence sur l'objet Lancement
	Lancement m_L;
	
	// Copie de l'objet m_L.STE
	StrucEntrees m_STE; 
	// Copie de l'objet m_L.STS
	StrucSorties m_STS;
	
	public Th_Process(Lancement L)
	{
		m_L = L;
	}
	
	public void Finish()
	{
		Term = false;
	}
	
	public void run() {
	
        System.out.println("Demarrage du Thread Process");
           
        while (Term)
        {
            	
			// Copie synchonisée des objets  m_L.STE et m_L.STS dans m_STE et m_STS
        	//.
			//.
			//.
        		  	
			// Test Défaut
        	if (...)
			{
				//.
				//.
				//.
			}
        		     	
						
			// Gestion des étapes du process
	        switch (m_L.STP.Etape)
	        {
		        case 0 :
		        	m_STS.DS1 = false;
		        	m_STS.DS2 = false;
		        	m_STS.DS3 = false;
		        	m_STS.DS4 = false;
		        	m_STS.DS5 = false;
		        	m_STS.DS6 = false;
		        	m_STS.DS7 = false;
		        	m_STS.DS8 = false;
		        	if (m_STE.DE1)
		        	{			        	
		        		m_STS.DS1 = true;
		        		m_L.STP.Etape = 1;
		        		System.out.println("Machine en marche !");
		        	}
		        	break;
		        	
		        case 1 :  
					//.
					//.
					//.
		        	break;
		        	
		        case 2 :
					//.
					//.
					//.
		        	break;
		        	
		        case 3:
					//.
					//.
					//.
					break;
		        	
		        case 4:
		        	//.
					//.
					//.
					break;
		     
		        case 5:
		        	//.
					//.
					//.
		        	break;
		        	
		        case 6:
		        	//.
					//.
					//.
		        	break;
				
				case 7:
		        	//.
					//.
					//.
		        	break;
					
				case 8:
		        	//.
					//.
					//.
		        	break;
					
				case 9:
		        	//.
					//.
					//.
		        	break;
					
				case 10:
		        	//.
					//.
					//.
		        	break;
		        	
		        case 11:
		        	//.
					//.
					//.
		        	break;
					
				case 100 :
					// Traitement des défauts
					//.
					//.
					//.
					
				default :

					break;
		        	
	        }
	        
			// Mise à jour synchonisée de l'objet m_L.STS à partir de m_STS
        	//.
			//.
			//.
        	
	        try {
				Thread.sleep(CycleProcess);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }
        System.out.println("Fin du thread Process!");
    }


}
