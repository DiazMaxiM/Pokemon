package modelo;

public class Pokemon {
	private String name;
	private String tipo;
	private String defensa;
	private Integer ataque=0;
	private Integer nivel=0;
	
	public void SubirNivel() {
		MandaleMecha();
	}
	
	private void MandaleMecha() {
		this.nivel = this.nivel+1;
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
	
	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}

	public Integer getNivel() {
		return nivel;
	}
}
