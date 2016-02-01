package ru.savochkindv.patterns.command;

/**
 * Интерфейс, описывающий отменяемые команды
 * Created by savochkindv on 01.02.2016.
 */
public interface IUndoableCommand extends ICommand {

    /**
     * Выполнить команду отмены
     */
    void undo();

    /**
     * Выполнить команду повтора
     */
    void redo();
}
