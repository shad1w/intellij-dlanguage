package net.masterthought.dlanguage.psi.interfaces.containers;

import net.masterthought.dlanguage.psi.DLanguageAutoDeclarationY;
import net.masterthought.dlanguage.psi.DLanguageDeclaratorInitializer;
import net.masterthought.dlanguage.psi.interfaces.VariableDeclaration;

/**
 * Created by francis on 2/28/2017.
 */
public interface GlobalVariableContainer extends Container {
    Class globalVarClass = VariableDeclaration.class;

    Class autoDeclarationClass = DLanguageAutoDeclarationY.class;

    Class declaratorInitializer = DLanguageDeclaratorInitializer.class;

}
