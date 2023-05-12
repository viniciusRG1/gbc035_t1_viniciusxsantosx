public abstract class ContaCorrente {
    protected float saldo;
    protected int estado;
    protected int numConta;
    protected int senha;
    protected float limite;
    protected int tipo;

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public void conferirTipo(){
        if(this.autenticar() == 1){
            if(this.getLimite() > 0){
                System.out.println("É uma conta ESPECIAL");
            }else{
                this.setTipo(0);
                System.out.println("É uma conta COMUM");
            }
        }
    }
    protected int getTipo() {
        return tipo;
    }

    public int autenticar(){
        return this.getTipo();
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public ContaCorrente (float val, int num, int pwd){
        numConta = num;
        senha = pwd;
        saldo = val;
        estado = 1;
    }

    public void debitaValor(float val, int pwd){
        if(pwd != senha){
            return;
        }
        if(estado != 1){
            return;
        }
        if(val <= 0){
            return;
        }
        if(val > saldo){
            return;
        }
        saldo -= val;
        if(saldo == 0){
            estado = 2;
        }
        return;
    }
    public float getSaldo(int pwd){
        if(senha == pwd){
            return saldo;
        }else{
            return -1;
        }
    }

    public void creditaValor(int pwd, float val){
        if(senha == pwd){
            saldo += val;
        }
    }

    protected int getEstado(int pwd){
        if(senha == pwd){
            return estado;
        }else{
            return -1;
        }
    }

    protected void setEstado(int pwd, int e){
        if(senha == pwd){
            estado = e;
        }
    }

    protected boolean isSenha(int pwd){
        if(senha == pwd){
            return true;
        }else{
            return false;
        }
    }
}
