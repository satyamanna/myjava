package com.satya.experiment;






import java.io.File;

import javax.lang.model.element.Modifier;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import com.squareup.javapoet.*;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.MethodSpec.Builder;

public class GenerateJavaFile {

	public static void main(String[] args) throws Exception {
	
		MethodSpec method=MethodSpec.methodBuilder("name")
				.addModifiers(Modifier.PUBLIC, Modifier.STATIC)
				.addStatement("$T.out.println($S)", System.class, "Hello, JavaPoet!")
				.build();
		
		TypeSpec classBuilder=TypeSpec.classBuilder("FirstOne")
				.addModifiers(Modifier.PUBLIC)
				.addMethod(method)
				.build(); 
		
		JavaFile jFile=JavaFile.builder("com.satya.experiment", classBuilder).build();
		
		
		final File f = new File(GenerateJavaFile.class.getProtectionDomain().getCodeSource().getLocation().getPath()); // geeting classPath
		String filePath="src";
		//File file=new File(f);
		jFile.writeTo(filePath);
		
		

		
		
	}
	
	
	
	
}
