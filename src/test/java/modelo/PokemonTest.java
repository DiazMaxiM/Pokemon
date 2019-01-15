package modelo;

import org.junit.Assert;
import org.junit.Test;

public class PokemonTest {

	@Test
	public void SiCreoUnPokemonYLeAsignoComoNombreMaxiYPosteriormenteLePreguntoSuNombreDevuelveMaxitest() {
		Pokemon maxiPokemon = new Pokemon();
		maxiPokemon.setName("maxi");
		Assert.assertEquals("maxi", maxiPokemon.getName());
	}

	@Test
	public void PreguntoElTipo() {
		Pokemon maxiPokemon = new Pokemon();
		maxiPokemon.setTipo("gato");
		Assert.assertEquals("gato", maxiPokemon.getTipo());
	}
	
	@Test
	public void ArrancamosDeNivelCero() {
		Pokemon maxiPokemon = new Pokemon();
		Assert.assertEquals(new Integer(0), maxiPokemon.getNivel());
	}
	
	@Test
	public void SubirNivel() {
		Pokemon maxiPokemon = new Pokemon();
		maxiPokemon.SubirNivel();
		Assert.assertEquals(new Integer(1), maxiPokemon.getNivel());
	}
}
