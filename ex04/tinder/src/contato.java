public class contato extends  imprimirContato{

        private String email;
        private String apelido;
        private String nome;
        private String aniversario;

        public contato(String email, String nome, String apelido, String aniversario){
            this.setAniversario(aniversario);
            this.setApelido(apelido);
            this.setEmail(email);
            this.setNome(nome);
        }


        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getApelido() {
            return apelido;
        }

        public void setApelido(String apelido) {
            this.apelido = apelido;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getAniversario() {
            return aniversario;
        }

        public void setAniversario(String aniversario) {
            this.aniversario = aniversario;
        }
    }


