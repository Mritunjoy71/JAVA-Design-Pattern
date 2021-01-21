class Main
{
public static void main(String[] args)
{
ConcreteMediator m = new ConcreteMediator();
 
Friend1 F1= new Friend1(m,"f1");
Friend2 F2 = new Friend2(m,"f2");
Colleague C1= new Colleague1(m,"c1");
Colleague C2 = new Colleague2(m,"c2");

 
m.setFriend1(F1);
m.setFriend2(F2);

m.setColleague1(C1);
m.setColleague2(C2);
 
F1.Send("[F1 here]Good Morrning. Can we discuss the mediator pattern?",'A');
F2.Send("[F2 here]Good Morning.Yes, we can discuss now.",'F');

((Colleague1) C1).Send("[F1 here]Good Morrning. Can we discuss the mediator pattern?",'A');
((Colleague1) C2).Send("[F2 here]Good Morning.Yes, we can discuss now.",'F');

}
}