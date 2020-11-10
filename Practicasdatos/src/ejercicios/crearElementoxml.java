package ejercicios;

import java.io.IOException;

import java.io.*;

public class crearElementoxml {
	
public void crearElemento(String nombre,long precio) throws SAXException, IOException, ParserConfigurationException, TransformerException {
		
		Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(archivo_xml);
		Element elementoPadre = doc.createElement("articulo");
		elementoPadre.appendChild(doc.createElement("nombre"));
		elementoPadre.appendChild(doc.createElement("precio"));
		elementoPadre.getChildNodes().item(0).appendChild(doc.createTextNode(nombre));
																				//convertir el precio a string
		elementoPadre.getChildNodes().item(1).appendChild(doc.createTextNode(String.valueOf(precio)));
		doc.getElementsByTagName("en-stock").item(0).appendChild(elementoPadre);
		
		Transformer transf = TransformerFactory.newInstance().newTransformer();
		DOMSource origen = new DOMSource(doc);
		StreamResult destino = new StreamResult(archivo_xml);
		transf.transform(origen,destino);
	}

}
