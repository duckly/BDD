package bdd.simple;

import bdd.BDD;

public class BDDImpl implements BDD {
    
    protected final int id;
    protected final BDD var;
    protected final BDD high;
    protected final BDD low;
    protected final DDManager dd;
    
    public BDDImpl(DDManager dd, int id, BDD var, BDD high, BDD low) {
        this.dd = dd;
        this.id = id;
        this.var = var;
        this.high = high;
        this.low = low;
    }

    public BDD var() {
        return var;
    }

    public BDD ithVar(int i) {
        return dd.ithVar(i);
    }

    public int varNum() {
        return dd.varNum();
    }

    public BDD high() {
        return high;
    }

    public BDD low() {
        return low;
    }

    public BDD getOne() {
        return dd.getOne();
    }

    public BDD getZero() {
        return dd.getZero();
    }

    public BDD not() {
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
        
    }


}
