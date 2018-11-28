package bdd.simple;

import bdd.BDD;

public class BDDZero extends BDDImpl {

    public BDDZero(DDManager dd, int id) {
        super(dd, id, null, null, null);
    }

    public BDD not() {
        return dd.getOne();
    }

    public BDD and(BDD bdd) {
        return this;
    }

    public BDD or(BDD bdd) {
        return bdd;
    }

    public BDD xor(BDD bdd) {
        return null;
    }

    public BDD restrict(BDD var, BDD bdd) {
        return null;
    }

    public BDD compose(BDD var, BDD bdd) {
        return null;
    }

    public BDD exists(BDD vars) {
        return null;
    }

    public BDD forall(BDD vars) {
        return null;
    }

    public BDD relprod(BDD vars, BDD bdd) {
        return null;
    }

    public boolean equals(BDD bdd) {
        return false;
    }

    public boolean eval(BDD assign) {
        return false;
    }

    public BDD satOne() {
        return null;
    }

    public Iterable<BDD> satAll() {
        return null;
    }

    public void free() {
        
    }

}
