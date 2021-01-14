export class Products {
    id: number;
    category: string;
    description: string;
    image: string;
    brand: string;
    price: number;
    quantity: number;
    reference: string;

    constructor(id: number, category: string, description: string, image: string, brand: string, price: number, quantity: number, reference: string,) {
        this.id = id;
        this.category = category;
        this.description = description;
        this.image = image;
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
        this.reference = reference;
    }
}