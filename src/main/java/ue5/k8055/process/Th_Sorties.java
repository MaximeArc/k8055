package ue5.k8055.process;

public class Th_Sorties extends Thread{
	
	private
	
	// Gestion de la fin du thread
	boolean Term = true;
	// Temps de Cycle d'écriture des sorties (en ms) 
	int CycleSorties = 10;
	// Référence sur l'objet Lancement
	Lancement m_L;

	public Th_Sorties(Lancement L)
	{
		m_L = L;
	}
	
	public void Finish()
	{
		Term = false;
	}
	
	public void setCycleSorties(int Val)
	{
		CycleSorties = Val;
	}
	
	public void run() {
		
        System.out.println("Demarrage du Thread Sorties");
        
        while (Term)
        {
			
					// Mise à jour synchronisé des sorties physiques de la carte USB
					// en fonction de l'état des données membres de l'objet m_L.STS
					//.
					//.
					//.
    			        	
	        try {
				Thread.sleep(CycleSorties);
				
			} catch (InterruptedException e) {
	
				e.printStackTrace();
			}
        }
        System.out.println("Fin du thread Sorties!");
    }
}
