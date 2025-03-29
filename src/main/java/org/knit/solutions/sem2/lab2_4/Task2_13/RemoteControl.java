package org.knit.solutions.sem2.lab2_4.Task2_13;

public class RemoteControl {
    private Command lastCommand;

    public void setCommand(Command command){
        this.lastCommand = command;
        command.execute();
    }

    public void undoLastCommand(){
        if (lastCommand != null){
            lastCommand.undo();
        } else {
            System.out.println("Нет команды для отмены");
        }
    }
}
