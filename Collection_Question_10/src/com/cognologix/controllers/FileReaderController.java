package com.cognologix.controllers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.stream.Stream;

public class FileReaderController {

	public Object readFileInputType() throws Exception {
		Object dataType = null;
		File file = new File(
				"/home/manjula/eclipse-workspace/Collection_Question_10/src/com/cognologix/model/inputData.txt");
		BufferedReader bufferReader = new BufferedReader(new FileReader(file));
		String str = null;
		str = bufferReader.readLine();
		if (str.matches("\\d+")) {
			dataType = 0;
		} else if (str.matches("\\d*[.]\\d+")) {
			dataType = 0.0;
		} else {
			dataType = "String";
		}
		return dataType;
	}

	public DoublyLinkedListEx<? extends Object> readFileInputData() throws Exception {
		DoublyLinkedListEx<? extends Object> dll = new DoublyLinkedListEx<>();

		FileReaderController frc = new FileReaderController();

		Object dataType = frc.readFileInputType();
		if (dataType.equals("Integer")) {
			dll = new DoublyLinkedListEx<Integer>();
		} else if (dataType.equals("Double")) {
			dll = new DoublyLinkedListEx<Double>();
		} else {
			dll = new DoublyLinkedListEx<String>();
		}
		
		File file = new File(
				"/home/manjula/eclipse-workspace/Collection_Question_10/src/com/cognologix/model/inputData.txt");
		BufferedReader bufferReader = new BufferedReader(new FileReader(file));
		
		Stream<Object> stream = Stream.of(dataType.getClass().getSimpleName());
		
		
		return dll;
	}
}
