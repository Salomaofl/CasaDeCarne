/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.sp.senac.d160.casadecarne;

/**
 * Estruturação do nosso projeto
 * @author filipe.rsantos4
 * 
 */
public class CasaDeCarne {

    public static void main(String[] args) {
        TelaCliente tela = new TelaCliente();
        tela.setVisible(true);
        
    }
    public class Cliente {
       private String nome;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEndereco() {
            return endereco;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public String getCPF() {
            return CPF;
        }

        public void setCPF(String CPF) {
            this.CPF = CPF;
        }

        public String getCEP() {
            return CEP;
        }

        public void setCEP(String CEP) {
            this.CEP = CEP;
        }

        public String getEmail() {
            return Email;
        }

        public void setEmail(String Email) {
            this.Email = Email;
        }

        public int getNumEndereco() {
            return numEndereco;
        }

        public void setNumEndereco(int numEndereco) {
            this.numEndereco = numEndereco;
        }
       private String endereco;
       private String CPF;
       private String CEP;
       private String Email;
       private int numEndereco;
       
    }
}
