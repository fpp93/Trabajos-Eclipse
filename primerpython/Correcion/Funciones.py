from Correcion.Producto  import producto

def transformar_compras(lista):
        list_dic = []
        for i_venta, producto, cantidad, ciudad, importe, nombre, precio, preciocoste in lista:
            d={'cantidadtotal': cantidad, 'ciudad': ciudad, 'importe': importe, 'producto': producto(nombre, precio, preciocoste)}
            list_dic.append(d)
        return list_dic

def calcular_compras(compras):
    for v in compras:
        v['importe'] = v['cantidad']*v['producto'].precio

def cantidadtotal(cantidad):
    for v in cantidad:
        v['importe'] = v['cantidadtotal']*v['preciototal']