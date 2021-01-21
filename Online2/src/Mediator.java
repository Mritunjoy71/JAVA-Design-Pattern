abstract class Mediator
{
    public abstract void Send(Friend frd, String msg,char first);
    public abstract void Send(Colleague frd, String msg,char first);
}