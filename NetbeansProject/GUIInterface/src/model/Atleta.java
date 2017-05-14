package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Atleta implements IAtleta, INuotatore, IAtletaUniversale, ICrud, Serializable{
	
	//attributi
	
	private String nominativo;
	private String club;
	private String disciplina;
	
	public Atleta() {
		super();
	}
	public Atleta(String nominativo, String club) {
		super();
		this.nominativo = nominativo;
		this.club = club;
	}
	
	public Atleta(String nominativo, String club, String disciplina) {
		super();
		this.nominativo = nominativo;
		this.club = club;
		this.disciplina = disciplina;
	}
	public String getNominativo() {
		return nominativo;
	}
	public void setNominativo(String nominativo) {
		this.nominativo = nominativo;
	}
	public String getClub() {
		return club;
	}
	public void setClub(String club) {
		this.club = club;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	@Override
	public String corro() {
		return "Sto Correndo....";
	}
	@Override
	public String salto() {
		return "Sto salntando...";
	
	}
		@Override
	public String nuoto() {
		return "Sto nuotando...";
	
		
	}
	@Override
		public String mangio() {
		return "Sto mangiando...";
		}
	
	@Override
	public String bevo() {
		return "Sto bevendo...";
		}
		
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((club == null) ? 0 : club.hashCode());
		result = prime * result + ((disciplina == null) ? 0 : disciplina.hashCode());
		result = prime * result + ((nominativo == null) ? 0 : nominativo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Atleta other = (Atleta) obj;
		if (club == null) {
			if (other.club != null)
				return false;
		} else if (!club.equals(other.club))
			return false;
		if (disciplina == null) {
			if (other.disciplina != null)
				return false;
		} else if (!disciplina.equals(other.disciplina))
			return false;
		if (nominativo == null) {
			if (other.nominativo != null)
				return false;
		} else if (!nominativo.equals(other.nominativo))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Atleta [" 
				+ (nominativo != null ? "nominativo=" + nominativo + ", " : "")
				+ (club != null ? "club=" + club + ", " : "")
				+ (disciplina != null ? "disciplina=" + disciplina + ", " : "")
				+ (corro() != null ? corro() + ", " : "") 
				+ (salto() != null ? salto() : ", ")
				+ (nuoto() != null ? nuoto() : ", ")
				+ (mangio() != null ? mangio() : ", ")
				+ (bevo() != null ? bevo() : "")
				+ "]";
	}

    @Override
    public void createDat(String newFileName) {
        
        FileOutputStream fos;
        ObjectOutputStream oos;
        
        
            try {
                fos = new FileOutputStream(newFileName);
                oos = new ObjectOutputStream(fos);
                
                 oos.writeObject(this);            
                oos.flush();
                fos.close();
                oos.close();

            } catch (FileNotFoundException ex) {
                Logger.getLogger(Atleta.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Atleta.class.getName()).log(Level.SEVERE, null, ex);
            }
    
    }

    @Override
    public void createTxt(String newFileName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object readDat(String fileName) {
        
        Object obj = new Object();
        
        FileInputStream fis = null;
        ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(fileName);
			ois = new ObjectInputStream(fis);
			
			
                        obj = ois.readObject();
			
			
						
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
                    if(fis!=null){
                        fis=null;
                    }
                    if(ois!=null){
                        ois=null;
                    }
                }
        
        return obj;
    }

    @Override
    public void addDat(String currentFileName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void search(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
	
	
	
	
	
	

}
