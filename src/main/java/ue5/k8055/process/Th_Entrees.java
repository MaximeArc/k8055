package ue5.k8055.process;

public class Th_Entrees extends Thread{
	
	private
	
	// Gestion de la fin du thread
	boolean Term = true;
	// Temps de Cycle de lecture des entrées (en ms) 
	int CycleEntrees = 10;
	// Référence sur l'objet Lancement
	Lancement m_L;

	public Th_Entrees(Lancement L)
	{
		m_L = L;
	}
	
	public void Finish()
	{
		Term = false;
	}
	
	public void setCycleEntrees(int Val)
	{
		CycleEntrees = Val;

	}
	
	public void run() {
		
        System.out.println("Demarrage du Thread Entrees");
        
        while (Term)
        {    
        	
					// Lecture synchronisé des entrées physiques de la carte USB
					// Mise à jour de l'état des données membres de l'objet m_L.STE
					//.
					//.
					//.
    		
	    	        	
	        try {
				Thread.sleep(CycleEntrees);
				
			} catch (InterruptedException e) {
	
				e.printStackTrace();
			}
        }
        System.out.println("Fin du thread Entrees!");
    }
}
