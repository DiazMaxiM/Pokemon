package modelo;

import org.junit.Assert;
import org.junit.Test;

public class PokemonTest {

	@Test
	public void SiCreoUnPokemonYLeAsignoComoNombreMaxiYPosteriormenteLePreguntoSuNombreDevuelveMaxitest() {
		Pokemon maxiPokemon = new Pokemon();
		maxiPokemon.setName("maxi");
		Assert.assertEquals("maxi", maxiPokemon.getName());
		maxiPokemon.setTipo("gato");
		maxiPokemon.getTipo();
	}

}
