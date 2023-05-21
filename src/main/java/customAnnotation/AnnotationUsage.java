package customAnnotation;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

@Author(name = "Avinash")
public class AnnotationUsage {

	public void print() {
		System.out.println("Printing Custom Annotation Attribute Value");
		
	}
	
	public static void main(String[] args) {
		
		AnnotationUsage obj = new AnnotationUsage();
		
		obj.getClass();
	}

}
