package Entity

import android.graphics.Bitmap

// Clase para almacenar los datos de un artículo de Nancy's Place
class Product {
    private var id: String = ""
    private var name: String = "" // Nombre del artículo (e.g., "Crema Ponds Rostro")
    private var description: String = "" // Descripción del artículo
    private var price: Double = 0.0 // Precio de venta
    private var stock: Int = 0 // Cantidad en inventario
    private var photo: Bitmap? = null // Imagen representativa

    // Constructor sin argumentos (similar al modelo Person.kt)
    constructor()

    // Propiedades (Getters y Setters)
    var ID: String
        get() = this.id
        set(value) {this.id=value}

    var Name: String
        get() = this.name
        set(value) {this.name=value}

    var Description: String
        get() = this.description
        set(value) {this.description=value}

    var Price: Double
        get() = this.price
        set(value) {this.price=value}

    var Stock: Int
        get() = this.stock
        set(value) {this.stock=value}

    var Photo: Bitmap?
        get() = this.photo
        set(value) {this.photo=value}
}

