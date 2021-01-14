export class Products {
    id: number;
    category: string;
    description: string;
    image: string;
    name: string;
    price: number;
    quantity: number;
    reference: string;

    constructor(id: number, category: string, description: string, image: string, name: string, price: number, quantity: number, reference: string,) {
        this.id = id;
        this.category = category;
        this.description = description;
        this.image = image;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.reference = reference;
    }
}