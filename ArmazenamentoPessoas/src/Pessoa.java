
public class Pessoa {
    private String nome;
    private String telefoneEmergencia;
    private String tipoSanguineo;
    private String email;
    private String alergias;
    private String problemasSaude;

    // Construtor da classe Pessoa
    public Pessoa(String nome, String telefoneEmergencia, String tipoSanguineo, String email, String alergias, String problemasSaude) {
        this.nome = nome;
        this.telefoneEmergencia = telefoneEmergencia;
        this.tipoSanguineo = tipoSanguineo;
        this.email = email;
        this.alergias = alergias;
        this.problemasSaude = problemasSaude;
    }

    // Métodos de acesso aos atributos (getters)
    public String getNome() {
        return nome;
    }

    public String getTelefoneEmergencia() {
        return telefoneEmergencia;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public String getEmail() {
        return email;
    }

    public String getAlergias() {
        return alergias;
    }

    public String getProblemasSaude() {
        return problemasSaude;
    }

    // Método toString para representação textual da pessoa
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", telefoneEmergencia='" + telefoneEmergencia + '\'' +
                ", tipoSanguineo='" + tipoSanguineo + '\'' +
                ", email='" + email + '\'' +
                ", alergias='" + alergias + '\'' +
                ", problemasSaude='" + problemasSaude + '\'' +
                '}';
    }
}

