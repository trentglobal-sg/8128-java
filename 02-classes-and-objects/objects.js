let car = {
    "name":"Telsa",
    "cost": 109000,
    "getName": function() {
        return this.name;
    }
}
console.log(car.name);
console.log(car.getName());