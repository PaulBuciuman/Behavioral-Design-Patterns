package designPatterns.behavioraldesignpatterns;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import chairofresponsibility.*;
import command.*;
import command.Switch;
import iterator.*;
import mediator.*;
import memento.*;
import observer.*;
import state.*;
import strategy.*;

import template.*;
import visitor.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//       
//    	Director ghisa = new Director();
//    	VP ezu = new VP();
//    	CEO buciuman = new CEO();
//    	
//    	ghisa.setSuccessor(ezu);
//    	ezu.setSuccessor(buciuman);
//    	
//    	Request request = new Request(RequestType.CONFERENCE,500);
//    	ghisa.handleRequest(request);
//    	
//    	request = new Request(RequestType.PURCHASE,1000);
//    	ghisa.handleRequest(request);
//    	
//    	request = new Request(RequestType.PURCHASE,11500);
//    	ghisa.handleRequest(request);
    	
    	//-----------------------------------------------
    	
    	Light light1 = new Light("light1");
    	Light light2 = new Light("light2");
    	Light light3 = new Light("light3");
    	
//    	Switch lightSwitch = new Switch();
//    	
//    	Command toggleCommand = new Toggle(light1);
//    	
//    	lightSwitch.storeAndExecute(toggleCommand);
//    	//lightSwitch.storeAndExecute(onCommand);
//    	//lightSwitch.storeAndExecute(onCommand);
//    	
//    	List<Light> lights = new ArrayList<Light>();
//    	lights.add(light1);
//    	lights.add(light2);
//    	lights.add(light3);
//    	
//    	Command allLightsCommand = new AllLightsCommand(lights);
//    	
//    	lightSwitch.storeAndExecute(allLightsCommand);
//    	
    	//-------------------------------------
//    	
//    	String input = "Lions, and tigers, and bears! oh, my!";
//    	
//    	Pattern p = Pattern.compile("(Lion|cat|dog|wolf|bear|human|tiger|liger)");
//    	Matcher m =p.matcher(input);
//    	
//    	
//    	while(m.find()) {
//    		
//    		System.out.println("Found a "+m.group()+".");
//    	}
    	
    	
    	//------------------------------------------
//    	
//    	BikeRepository repo = new BikeRepository();
//    	
//    	repo.addBike("bita");
//    	repo.addBike("istoria");
//    	repo.addBike("togla");
//    	
//    	Iterator<String> bikeIterator = repo.iterator();
//    	
//    	
//    	while(bikeIterator.hasNext()) {
//    		System.out.println(bikeIterator.next());
//    	}
    	
    //-----------------------------------------------------
    	
    
//    	Mediator mediator = new Mediator();
//    	
//    	mediator.registerLight(light1);
//    	mediator.registerLight(light2);
//    	
//    	Command turnOnAllLightsCommand = new TurnOnAllLights(mediator);
//    	
//    	turnOnAllLightsCommand.execute();
//    	
//    	
   
    	//-----------------------------------------
    	
//    	CareTaker caretaker = new CareTaker();
//    	Emplyee emp = new Emplyee();
//    	
//    	emp.setAddress("qwerq");
//    	emp.setName("name");
//    	emp.setPhone("2341");
//    	
//    	System.out.println("before save: "+emp.getPhone());
//    	caretaker.save(emp);
//    	
//    	emp.setPhone("0987");
//    	caretaker.save(emp);
//    	
//    	System.out.println("after save: "+emp.getPhone());
//    	emp.setPhone("676767");
//    	
//    	caretaker.revert(emp);
//    	System.out.println("after revert: "+emp.getPhone());
//    
//    	caretaker.revert(emp);
//    	System.out.println("last revert: "+emp.getPhone());
//    	
    	
    	//--------------------------------
//    	Subject subject = new MessageStream();
//    	
//    	PhoneClient phoneClient = new PhoneClient(subject);
//    	TabletClient tablet = new TabletClient(subject);
//    	
//    	tablet.addMessage("inca un mesaj bulan");
//    	phoneClient.addMessage("New message bulan!");
//    	
    
    	//---------------------------
    	
//    	Fan fan = new Fan();
//    	
//    	System.out.println(fan);
//    	
//    	fan.pullChain();
//    	
//    	System.out.println(fan);
//fan.pullChain();
//    	
//    	System.out.println(fan);
//fan.pullChain();
//    	
//    	System.out.println(fan);
//fan.pullChain();
//    	
//    	System.out.println(fan);
    	
    	//------------------------------------------------------------
   
//    	CreditCard amexCard = new CreditCard(new AmexStrategy());
//    	
//    	amexCard.setNumber("123412341234123");
//    	amexCard.setDate("04/2020");
//    	amexCard.setCvv("123");
//    	
//    	
//    	System.out.println("Is amex valid: "+amexCard.isValid());
    	//---------------------------------------------------------
    	
//    	System.out.println("Web order: ");
//    	
//    	OrderTemplate webOrder = new StoreOrder();
//    	webOrder.processOrder();
    	
    //-----------------------------------------
    	
    	PartsOrder order = new PartsOrder();
    	
    	order.addPart(new Wheel());
    	order.addPart(new Fender());
    	order.addPart(new Oil());
    	
    	//System.out.println(order.calculateShipping());
    	
    	order.accept(new AtvPartsShippingVisitor());
    	order.accept(new AtvPartsDisplayVisitor());
    	
    }
}
