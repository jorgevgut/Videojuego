package com.pollovolador;

import com.badlogic.gdx.Game;

public class JuegoPrincipal extends Game{

	@Override
	public void create() {
		
		this.setScreen(new PantallaMenu());
	}

}
