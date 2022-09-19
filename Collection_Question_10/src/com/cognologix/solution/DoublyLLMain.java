package com.cognologix.solution;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.cognologix.controllers.DoublyLinkedListEx;
import com.cognologix.controllers.FileReaderController;
import com.cognologix.entity.Node;

public class DoublyLLMain {
//	Object doublyLL = null;

	public static void main(String[] args) throws Exception {

//		DoublyLLMain dllMain = new DoublyLLMain();
		DoublyLinkedListEx<Integer> doublyLinkedList = new DoublyLinkedListEx<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		
		System.out.println("Pushing elements at the end of doubly linked list");
		doublyLinkedList.push(10);
		doublyLinkedList.push(20);
		
		doublyLinkedList.printDLL();
		
		System.out.println("Pushing elements at the front of doubly linked list");
		doublyLinkedList.shift(30);
		doublyLinkedList.shift(40);
		
		doublyLinkedList.printDLL();
		
		System.out.println("Delete front node");
		Node<Integer> deletedFrontNode = doublyLinkedList.unshift();
		System.out.println(deletedFrontNode);
		
		doublyLinkedList.printDLL();
		
		System.out.println("Delete last node");
		Node<Integer> deletedLastNode = doublyLinkedList.pop();
		System.out.println(deletedLastNode);
		
		doublyLinkedList.printDLL();
		

		// check data type of data stored in file
//		FileReaderController frc = new FileReaderController();
//
//		Object dataType = frc.readFileInputType();
//		if (dataType.equals(0)) {
//			dllMain.doublyLL = new DoublyLinkedListEx<Integer>();
//		} else if (dataType.equals(0.0)) {
//			dllMain.doublyLL = new DoublyLinkedListEx<Double>();
//		} else {
//			dllMain.doublyLL = new DoublyLinkedListEx<String>();
//		}
//		
//		// read file data
//		dllMain.doublyLL = frc.readFileInputType();
	}

}
