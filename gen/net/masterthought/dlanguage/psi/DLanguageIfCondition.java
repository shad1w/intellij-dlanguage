// This is a generated file. Not intended for manual editing.
package net.masterthought.dlanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLanguageIfCondition extends PsiElement {

  @Nullable
  DLanguageBasicType getBasicType();

  @NotNull
  DLanguageCommaExpression getCommaExpression();

  @Nullable
  DLanguageDeclarator getDeclarator();

  @Nullable
  DLanguageIdentifier getIdentifier();

  @Nullable
  DLanguageTypeCtors getTypeCtors();

  @Nullable
  PsiElement getKwAuto();

  @Nullable
  PsiElement getOpEq();

}
