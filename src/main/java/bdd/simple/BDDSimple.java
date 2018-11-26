package bdd.simple;

import bdd.BDD;

public class BDDSimple implements BDD {
    
    public BDDSimple(int varNum, int numNodes, int numCache) {
        
    }

    public BDD var() {
        return null;
    }

    public BDD ithVar(int i) {
        // TODO Auto-generated method stub
        return null;
    }

    public int varNum() {
        // TODO Auto-generated method stub
        return 0;
    }

    public BDD getOne() {
        // TODO Auto-generated method stub
        return null;
    }

    public BDD getZero() {
        // TODO Auto-generated method stub
        return null;
    }

    public BDD not() {
        // TODO Auto-generated method stub
        return null;
    }

    public BDD and(BDD bdd) {
        // TODO Auto-generated method stub
        return null;
    }

    public BDD or(BDD bdd) {
        // TODO Auto-generated method stub
        return null;
    }

    public BDD xor(BDD bdd) {
        // TODO Auto-generated method stub
        return null;
    }

    public BDD restrict(BDD var, BDD bdd) {
        // TODO Auto-generated method stub
        return null;
    }

    public BDD compose(BDD var, BDD bdd) {
        // TODO Auto-generated method stub
        return null;
    }

    public BDD exists(BDD vars) {
        // TODO Auto-generated method stub
        return null;
    }

    public BDD forall(BDD vars) {
        // TODO Auto-generated method stub
        return null;
    }

    public BDD relprod(BDD vars, BDD bdd) {
        // TODO Auto-generated method stub
        return null;
    }

    public boolean equals(BDD bdd) {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean eval(BDD assign) {
        // TODO Auto-generated method stub
        return false;
    }

    public BDD satOne() {
        // TODO Auto-generated method stub
        return null;
    }

    public Iterable<BDD> satAll() {
        // TODO Auto-generated method stub
        return null;
    }

    public void free() {
        // TODO Auto-generated method stub
        
    }

}
