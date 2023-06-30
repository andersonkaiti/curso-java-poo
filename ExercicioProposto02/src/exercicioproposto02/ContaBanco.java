package exercicioproposto02;
public class ContaBanco {
    public int numConta;
    protected String tipo; // CC: Conta Corrente, CP: Conta Poupança.
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco() {
        this.setSaldo(0f);
        this.setStatus(false);
    }
    
    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);
        if (tipo == "CC") {
            //saldo += 50f;
            this.setSaldo(50);
        } else if (tipo == "CP") {
            //saldo += 150f;
            this.setSaldo(150f);
        }
    }
    
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro.");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta em débito!");
        } else {
            this.setStatus(false);
        }
    }
    
    public void depositar(float valor) {
        if (getStatus()) {
            //this.saldo += saldo;
            this.setSaldo(this.getSaldo() + valor);
        } else {
            System.out.println("Impossível depositar.");
        }
    }
    
    public void sacar(float valor) {
        if (getStatus()) {
            if (getSaldo() > valor) {
                //this.saldo -= valor;
                this.setSaldo(this.getSaldo() - valor);
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Impossível sacar.");
        }
    }
    
    public void pagarMensal(String tipo) {
        float v = 0;
        if (getTipo() == "CC") {
            v = 12f;
        } else if (getTipo() == "CP") {
            v = 20f;
        }
        if (getStatus()) {
            if (this.getSaldo() > v) {
                this.setSaldo(this.getSaldo() - v);
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Impossível pagar.");
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
