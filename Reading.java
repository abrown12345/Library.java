
public class Reading {
	String Title=null;
	Boolean borrowed=false;
	
	public String getPropertyofString() {
		return Title;
	}
	 public void borrowed() {
	        borrowed = true;
	    }
	public Boolean thisBorrowed() {
        if(borrowed == true) {
        	return true;
        }
    	return false;
    }
	public Reading(String title) {
		this.Title=title;
	}
	
	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		
	}
	public void returned() {
		// TODO Auto-generated method stub
		borrowed=false;
	}

}
