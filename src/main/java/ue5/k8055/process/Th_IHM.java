package ue5.k8055.process;

public class Th_IHM extends Thread{
	
	private
	
	// Gestion de la fin du thread
	boolean Term= true;
	// Temps de Cycle du thread Process (en ms) 
	int CycleIHM = 10;
	// Référence sur l'objet Lancement
	Lancement m_L;
	
	// Copie de l'objet m_L.STE
	StrucEntrees m_STE; 
	// Copie de l'objet m_L.STS
	StrucSorties m_STS;
	// Copie de l'objet m_L.STP
	StrucProcess m_STP;
	
	public void Finish()
	{
		Term = false;
	}
	
	public Th_IHM(Lancement L)
	{
		m_L = L;
	}
	
	public void run() {
		
        System.out.println("Demarrage du Thread IHM");
		
        while (Term)
        {
			
        	// Copie synchonisée des objets  m_L.STE, m_L.STS m_STP dans m_STE m_STS et m_STP
        	synchronized(...)
    		{
        		//.
				//.
				//.
    		}
        	
        	try {
				Thread.sleep(CycleIHM);
				
			} catch (InterruptedException e) {
	
				e.printStackTrace();
			}
        }
        System.out.println("Fin du thread IHM!");
    }
}
