package com.lib.estante;

import com.lib.item.Item;
import com.lib.itemBiblioteca.ItemBiblioteca;

public class Cd extends Item implements ItemBiblioteca {

    //TODO: fazer metodo de emprestar

    @Override
    public void usar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'emprestar'");
    }

    @Override
    public void devolver() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'devolver'");
    }

    @Override
    public boolean isEmprestavel() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmprestavel'");
    }

}
