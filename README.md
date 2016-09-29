# Lector

Este es un lector creado en Java implementando el lector de java IO.

una vez que se tiene esta clase instalada, se pueden realizar lecturas de tipos específicos.

- Leer.Entero()
- Leer.Short() 
- Leer.Long()
- Leer.Double()
- Leer.Float()
- Leer.Texto()
- Leer.EnteroInfinito()*1
- Leer.DecimalInfinito()*1
- Leer.Boolean()
- Leer.obtenerUltimaLectura()*2

*1- Estas llamadas devuelven valores de tipo BigInteger y BigDecimal, por lo que debe importarse la librería java.math.BigInteger y java.math.BigDecimal y deben ser recibidas en variables de tipo BigInteger y BigDecimal.

*2- Esta llamada devuelve un String que indica cual fue la última lectura que se realizó y cual fue el tipo de dato que se leyó.

El mismo hace comprobación de que los valores sean válidos, utilizando el bloque de código Try/Catch, encerrando la lectura en un ciclo del cual se sale únicamente cuando la lectura es válida.

Cuando se hace un a lectura de boolean se realiza una lectura que solo permite seleccion de 1 para leer "True" y un 2 para leer un "False"
