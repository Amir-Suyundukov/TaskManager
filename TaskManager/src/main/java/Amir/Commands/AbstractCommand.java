package Amir.Commands;
/**
 * абстрактные команды
 */

public abstract class AbstractCommand {
    protected abstract String getName();

    protected abstract String getDescription();

    protected abstract boolean isNeedAuthorization();
}