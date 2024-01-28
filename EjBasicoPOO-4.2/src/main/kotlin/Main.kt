fun main() {
    val personas = listOf(
        Persona(55.6, 1.80),
        Persona(70.0, 1.67, "Amancio"),
        Persona(98.4, 1.89, "Juan"),
        Persona(100.00, 1.50),
        Persona(58.45, 1.8, "Maria"),
        Persona(65.0, 1.75, "Laura"),
        Persona(80.5, 1.72, "Carlos")
    )

    // Recorre la lista de objetos creados para ejecutar sus metodos saludar() y mostrarDesc()
    for (persona in personas){
        persona.saludar()
        persona.mostrarDesc()
    }
}