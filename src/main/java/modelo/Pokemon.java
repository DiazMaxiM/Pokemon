package modelo;

public class Pokemon {
	private String name;
	private String tipo;
	private Integer defensa=0;
	private Integer ataque=0;
	private Integer nivel=0;
	private Integer ps=0;
	
	public Pokemon(Integer ps, Integer ataque, Integer defensa) {
		this.ps = ps;
		this.ataque = ataque;
		this.defensa = defensa;
	}
	
	public void atacar(Pokemon pokemon) {
		pokemon.ps = pokemon.ps - this.ataque + pokemon.defensa;
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

	public void setDefensa(Integer defensa) {
		this.defensa = defensa;
	}

	public Integer getDefensa() {
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
