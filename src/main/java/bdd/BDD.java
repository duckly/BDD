package bdd;

public interface BDD {
    
    // base functions

    BDD var();
    
    BDD ithVar(int i);
    
    int varNum();
    
    BDD getOne();
    
    BDD getZero();
    
    BDD high();
    
    BDD low();
    
    // algebraic operations
    BDD not();
    
    BDD and(BDD bdd);
    
    BDD or(BDD bdd);
    
    BDD xor(BDD bdd);
    
    // nonalgebraic operations
    BDD restrict(BDD var, BDD bdd);
    
    BDD compose(BDD var, BDD bdd);
    
    BDD exists(BDD vars);
    
    BDD forall(BDD vars);
    
    BDD relprod(BDD vars, BDD bdd);
    
    // examining functions
    boolean equals(BDD bdd);
    
    boolean eval(BDD assign);
    
    BDD satOne();
    
    Iterable<BDD> satAll();
    
    // free this BDD
    void free();
    
}
