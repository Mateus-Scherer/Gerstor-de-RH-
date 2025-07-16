import static spark.Spark.*;
import com.google.gson.*;
import java.util.*;

public class Main {
    static class Funcionario {
        String nome;
        double salario;

        Funcionario(String nome, double salario) {
            this.nome = nome;
            this.salario = salario;
        }
    }

    static List<Funcionario> funcionarios = new ArrayList<>();
    static Gson gson = new Gson();

    public static void main(String[] args) {
        port(4567);
        staticFiles.externalLocation("frontend");

        post("/cadastrar", (req, res) -> {
            Funcionario f = gson.fromJson(req.body(), Funcionario.class);
            funcionarios.add(f);
            return gson.toJson(f);
        });

        get("/listar", (req, res) -> gson.toJson(funcionarios));

        post("/reajustar", (req, res) -> {
            String nome = req.queryParams("nome");
            double percentual = Double.parseDouble(req.queryParams("percentual"));
            for (Funcionario f : funcionarios) {
                if (f.nome.equalsIgnoreCase(nome)) {
                    f.salario += f.salario * (percentual / 100);
                }
            }
            return gson.toJson(funcionarios);
        });

        delete("/excluir", (req, res) -> {
            String nome = req.queryParams("nome");
            funcionarios.removeIf(f -> f.nome.equalsIgnoreCase(nome));
            return gson.toJson(funcionarios);
        });
    }
}
