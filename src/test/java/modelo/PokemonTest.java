package modelo;

import org.junit.Assert;
import org.junit.Test;

public class PokemonTest {

	@Test
	public void SiCreoUnPokemonYLeAsignoComoNombreMaxiYPosteriormenteLePreguntoSuNombreDevuelveMaxitest() {
		Pokemon maxiPokemon = new Pokemon(0,0,0);
		maxiPokemon.setName("maxi");
		Assert.assertEquals("maxi", maxiPokemon.getName());
	}

	@Test
	public void PreguntoElTipo() {
		Pokemon maxiPokemon = new Pokemon(0,0,0);
		maxiPokemon.setTipo("gato");
		Assert.assertEquals("gato", maxiPokemon.getTipo());
	}
	
	@Test
	public void ArrancamosDeNivelCero() {
		Pokemon maxiPokemon = new Pokemon(0,0,0);
		Assert.assertEquals(new Integer(0), maxiPokemon.getNivel());
	}
	
	@Test
	public void SubirNivel() {
		Pokemon maxiPokemon = new Pokemon(0,0,0);
		maxiPokemon.SubirNivel();
		Assert.assertEquals(new Integer(1), maxiPokemon.getNivel());
	}
	
	@Test
	public void ArrancamosPsCero() {
		Pokemon maxiPokemon = new Pokemon(0,0,0);
		Assert.assertEquals(new Integer(0), maxiPokemon.getPs());
	}
	
	@Test
	public void ArrancamosPsdeUsuario() {
		Pokemon maxiPokemon = new Pokemon(25,0,0);
		Assert.assertEquals(new Integer(25), maxiPokemon.getPs());
	}
	
	@Test
	public void Pelea() {
		Pokemon maxiPokemon = new Pokemon(25,55,45);
		Pokemon panchoPokemon = new Pokemon(25,65,30);
		maxiPokemon.atacar(panchoPokemon);
		Assert.assertEquals(new Integer(0),panchoPokemon.getPs());
	}
	
}
