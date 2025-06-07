package Botanica.src;
// CÓDIGO FEITO POR VITOR PAIVA NUNES DE PAULA - 2°DS MTEC
// GRUPO: PEDRO ISAÍAS GOMES DE JESUS - PYETRO FABRÍCIO PETERLINI

import Botanica.src.models.Planta;
import java.util.ArrayList;

// Classe principal de botânica
public class MainBotanica {
    public static ArrayList<Planta> mainBotanica(ArrayList<Planta> plantas) {
        Menu menu = new Menu();
        menu.menu(plantas);
        return plantas;
    }
}
