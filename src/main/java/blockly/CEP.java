package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class CEP {

public static final int TIMEOUT = 300;

/**
 *
 * @author Rafael Juan Cardoso Martins
 * @since 13/08/2024, 15:36:12
 *
 */
public static Var ConsultarCep() throws Exception {
 return new Callable<Var>() {

   private Var JsonCep = Var.VAR_NULL;

   public Var call() throws Exception {
    JsonCep =
    cronapi.json.Operations.toJson(
    cronapi.util.Operations.getURLFromOthers(
    Var.valueOf("GET"),
    Var.valueOf("application/x-www-form-urlencoded"),
    Var.valueOf(
    Var.valueOf("https://viacep.com.br/ws/").getObjectAsString() +
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("Endereco.active.CEP")).getObjectAsString() +
    Var.valueOf("/json/").getObjectAsString()), Var.VAR_NULL, Var.VAR_NULL, Var.VAR_NULL,
    Var.valueOf(""),
    Var.valueOf("BODY")));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
    Var.valueOf("Endereco.active.Bairro"),
    cronapi.json.Operations.getJsonOrMapField(JsonCep,
    Var.valueOf("bairro")));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
    Var.valueOf("Endereco.active.Logradouro"),
    cronapi.json.Operations.getJsonOrMapField(JsonCep,
    Var.valueOf("logradouro")));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
    Var.valueOf("Endereco.active.UF"),
    cronapi.json.Operations.getJsonOrMapField(JsonCep,
    Var.valueOf("uf")));
    return Var.VAR_NULL;
   }
 }.call();
}

}

