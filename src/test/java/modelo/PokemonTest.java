package modelo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PokemonTest {

	@Test
	public void SiCreoUnPokemonYLeAsignoComoNombreMaxiYPosteriormenteLePreguntoSuNombreDevuelveMaxitest() {
		Pokemon maxiPokemon = new Pokemon();
		maxiPokemon.setName("maxi");
		assertEquals("maxi", maxiPokemon.getName());
	}

}
