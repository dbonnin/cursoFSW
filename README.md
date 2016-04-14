# cursoFSW
Lectura y procesamiento de archivos en Fuse Service Works. Normalización de entradas.

El objetivo del ejemplo es mostrar como leer archivos, además expondremos un WS REST que espera XML, finalmente se hará un filtro que va a normalizar las entradas para ser enviadas al servicio de SMS del Banco, el cual espera o el nro. de tel. a enviar o el nro. y tipo de doc.

Para la lectura de archivos se deben crear estos directorios (o cambiar los bindings al directorio que quieran)

C:\cursoFSW\entrada\formatoUno
C:\cursoFSW\entrada\formatoDos

Los formatos a ser procesados son los siguientes:

formatoUno: Separado por pipes

CI|99999999|Diego Bonnin|Texto del mensaje 3
CI|99999999|Diego Bonnin|Texto del mensaje 4
CI|99999999|Diego Bonnin|Texto del mensaje 2
CI|99999999|Diego Bonnin|Texto del mensaje 1

formatoDos: Longitud de campos fija

90009999999-9Texto del mensaje
1000009999999Texto del mensaje

del 0 al 1: Código de tipo de documento
del 2 al 13: Nro. de documento
del 14 en adelante: El mensaje a enviar

Formato del XML:

<sms_message>
<nt>0999999999</nt>
<msg>Texto del mensaje</msg>
</sms_message>


