package modelo;

public class Pokemon {
	private String name;
	private String tipo;
	private String defensa;
	private Integer ataque=0;
	private Integer nivel=0;
	private Integer ps=0;
	
	public Pokemon(Integer ps) {
		this.ps = ps;
	}
	
	public void SubirNivel() {
		this.setNivel(this.getNivel()+1);
	}
		
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setDefensa(String defensa) {
		this.defensa = defensa;
	}

	public String getDefensa() {
		return defensa;
	}
	
	public void setAtaque(Integer ataque) {
		this.ataque = ataque+1;
	}

	public Integer getAtaque() {
		return ataque;
	}
	
	private void setNivel(Integer nivel) {
		this.nivel = nivel;
	}

	public Integer getNivel() {
		return nivel;
	}
	
	public void setPs(Integer ps) {
		this.ps = ps;
	}

	public Integer getPs() {
		return ps;
	}
}
