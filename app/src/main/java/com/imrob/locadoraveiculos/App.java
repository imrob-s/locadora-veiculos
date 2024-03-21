 /*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.imrob.locadoraveiculos;
import com.imrob.locadoraveiculos.services.FabricanteService;
import com.imrob.locadoraveiculos.config.DatabaseConfig;
import com.imrob.locadoraveiculos.gui.TelaPrincipal;
import com.imrob.locadoraveiculos.repositories.FabricanteRepository;
import com.imrob.locadoraveiculos.repositories.ModeloRepository;
import com.imrob.locadoraveiculos.services.ModeloService;
import javax.swing.UIManager;
import mdlaf.MaterialLookAndFeel;
import mdlaf.themes.JMarsDarkTheme;
import mdlaf.themes.MaterialLiteTheme;
import mdlaf.themes.MaterialOceanicTheme;

public class App {

    public static void main(String[] args) {
        setLookAndFeel();

        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
    }

    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(new MaterialLookAndFeel());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
    }
}
