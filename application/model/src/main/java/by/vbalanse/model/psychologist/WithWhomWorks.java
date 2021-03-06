package by.vbalanse.model.psychologist;

import by.vbalanse.model.common.AbstractManagedEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

/**
 * writeme: Should be the description of the class
 *
 * @author <a href="v.terehova@itision.com">Vasilina Terehova</a>
 */
@Entity(name = WithWhomWorks.TABLE_NAME)
public class WithWhomWorks extends AbstractManagedEntity {

  public static final String TABLE_NAME = "psy_personal_threrapy_name";

  private static final String COLUMN_TITLE = "title_";
  private static final String COLUMN_CODE = "code_";

  @NotNull
  @Column(name = COLUMN_TITLE)
  private String title;

  @NotNull
  @Column(name = COLUMN_CODE)
  private String code;

  public WithWhomWorks() {
  }

  public WithWhomWorks(String title, String code) {
    this.title = title;
    this.code = code;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }
}
