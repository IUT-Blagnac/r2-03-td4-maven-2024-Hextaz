public class Pile {
	private int[] elements ;
	private int indiceSommet = -1 ;
	
	public Pile(){
		this.elements = new int[100];
	}
	
	public Pile(int pfTaille){
		this.elements = new int[pfTaille] ;
	}

	public boolean est_Vide () {
		return(this.indiceSommet == -1);
	}
	
	public boolean est_Plein () {
		return(this.indiceSommet >= (this.elements.length - 1));
	}

	public void empiler(int pfElement) throws Exception {
	    if (est_Plein()) {
	        throw new Exception("Erreur: Pile pleine");
	    }
	    
	    this.indiceSommet = this.indiceSommet + 1 ;
	    this.elements[this.indiceSommet] = pfElement ;
	}


	public int depiler() throws Exception {
		int elt;
		
		if (est_Vide()) {
			throw new Exception("Erreur: Pile vide");
		}
		
		elt = this.elements[this.indiceSommet];
		this.indiceSommet = this.indiceSommet - 1;
		
		return elt;
	}
	
	public int sommet() throws Exception {
		int elt;
		
		if (est_Vide()) {
			throw new Exception("Erreur: Pile vide");
		}
		
		elt = this.elements[this.indiceSommet];
		
		return elt;
	}
	
	public void vider() throws Exception {
        for (int i = 0; i <= this.indiceSommet; i++) {
            this.elements[i] = 0;
        }

        this.indiceSommet = -1;
    }
}
