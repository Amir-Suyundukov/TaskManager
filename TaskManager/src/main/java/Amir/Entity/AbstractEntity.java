package Amir.Entity;
/**
 * абстрактные ентину
 */

import java.time.LocalDateTime;

public abstract class AbstractEntity {
    protected abstract String getName();
    protected  abstract String getDescription();
    protected abstract LocalDateTime getCreateDate();
    protected abstract Integer getId();

}
