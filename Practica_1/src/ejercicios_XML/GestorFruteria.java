package ejercicios_XML;

import java.io.*;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class GestorFruteria {

	private File archivo_xml;
	
	public GestorFruteria(File archivo_xml) {
		
		this.archivo_xml = archivo_xml;
	}
	
	
	
	
	public void modificarPrecio(String articulo, float nuevoPrecio) {
		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			  DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			  Document doc = dBuilder.parse(archivo_xml);
			  
			  NodeList nod = doc.getElementsByTagName("articulo");
			  
			  for(int i = 0; i < nod.getLength(); i++) {
				  
				  Node nNode = nod.item(i);

				  if(nNode.getNodeType() == Node.ELEMENT_NODE) {
				    Element eElement = (Element) nNode;
				    
				    if( eElement.getElementsByTagName("nombre").item(0).getTextContent().equalsIgnoreCase(articulo)) {
				    	eElement.getElementsByTagName("precio").item(0).setTextContent(String.valueOf(nuevoPrecio));
				    	System.out.println("Nombre cambiado correctamente");
				    }
				    
				  }
				}
			  Transformer transf = TransformerFactory.newInstance().newTransformer();
				DOMSource origen = new DOMSource(doc);
				StreamResult destino = new StreamResult(archivo_xml);
				transf.transform(origen,destino);
			  
		}catch(Exception e) {
			  e.printStackTrace();
			}
		
	}
	
	public void fueraDeStock (String articulo) {
		try {
			String nombre = null ;
			String precio = null;

	           Document doc = (Document) DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(archivo_xml);
	         
	           NodeList items = doc.getElementsByTagName("articulo");
	           
	           
	            for (int i = 0; i < items.getLength(); i++) {
	                Element element = (Element) items.item(i);
	                // compruebo al recorrer que ese nombre coincida al que paso por parametro
	                
	                if (element.getElementsByTagName("nombre").item(0).getTextContent().equalsIgnoreCase(articulo)) {
	                    // guardo en las variables los nodos nombre y precio y los borro
	                    nombre=element.getElementsByTagName("nombre").item(0).getTextContent();
	                    precio=element.getElementsByTagName("precio").item(0).getTextContent();
	                    element.getParentNode().removeChild(element);
	                }
	            }
	            
	            //creo el elemento que guardare en fuera de stock
	            Element elementoPadre = doc.createElement("articulo");
	            elementoPadre.appendChild(doc.createElement("nombre"));
	            elementoPadre.appendChild(doc.createElement("precio"));
	            elementoPadre.getChildNodes().item(0).appendChild(doc.createTextNode(nombre));
	            
	            elementoPadre.getChildNodes().item(1).appendChild(doc.createTextNode(String.valueOf(precio)));
	            //lo añado a fuera de stock
	            doc.getElementsByTagName("fuera-stock").item(0).appendChild(elementoPadre);

	            Transformer transf = TransformerFactory.newInstance().newTransformer();
	            DOMSource origen = new DOMSource(doc);
	            StreamResult destino = new StreamResult(archivo_xml);
	            transf.transform(origen, destino);
	            
	            
		}catch(Exception e) {
			e.printStackTrace();
		}
           
        }
	
	public void mostrarArticulos() {
		
		try {
			  DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			  DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			  Document doc = dBuilder.parse(archivo_xml);
			  
			  
			  
			  
			  
			  NodeList dentro = doc.getElementsByTagName("articulo");
			  NodeList fuera=doc.getElementsByTagName("fuera-stock");
			 
			  System.out.println("Elementos en stock\n");
			  
			  for(int i = 0; i < dentro.getLength(); i++) {
				  Node nNode = dentro.item(i);

				  if(nNode.getNodeType() == Node.ELEMENT_NODE) {
				    Element eElement = (Element) nNode;
				    
				    if(eElement.getParentNode()==fuera.item(0)) 
	                {
	                    System.out.println("\nElementos fuera de stock\n");
	                }
				    		 System.out.println("articulo: ");
						                
							    System.out.println("nombre: "
							                + eElement.getElementsByTagName("nombre").item(0).getTextContent());
							    System.out.println("precio: "
							                + eElement.getElementsByTagName("precio").item(0).getTextContent());
				  }
				}
			  
			} catch(Exception e) {
			  e.printStackTrace();
			}
		
		
	}
	
	
	

}
