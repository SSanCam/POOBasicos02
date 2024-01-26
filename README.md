Ejercicio 4.2¶
1.-Crear una clase Persona que tenga nombre, peso (en kg con decimales), altura (en metros con decimales) y su imc.

2.-Crear un constructor primario con todos los atributos, excepto nombre e imc. 
Este último atributo se calcula en función del peso y la altura. 
Por tanto no se debe poder modificar, pero si consultar.

3.-Crear un constructor secundario que también incluya el nombre de la persona cómo parámetro.

4.-Implementa el método toString, representación del objeto en forma de String: override fun toString() = "". (Pulsa Ctrl+o)

5.-En el main() a) crear 3 personas diferentes (la primera sin nombre) utilizando el constructor primario y secundario y 
                b) mostrarlas por consola. A continuación, realizar lo siguiente:

Sobre la persona 1: a) modificar su nombre y para ello debes solicitarlo al usuario por consola. No puede ser nulo o vacio. 
                    b) Mostrar por consola sólo el nombre, peso y altura.

Sobre la persona 3: a) Mostrar el peso, altura y imc. 
                    b) Modificar la altura, por ejemplo a 1.80 
                    c) Mostrar el peso, altura y imc.

Sobre la persona 2; a) Modificar la altura para que tenga el mismo valor que la persona 3. 
                    b) Mostrar la persona 2 y persona 3. 
                    c) Comparar si las dos personas son iguales, y mostrar el resultado. 
                    d) Implementa el método equals():boolean (Pulsa Ctrl+o). 
                    e) Ejecutar la comparación.
