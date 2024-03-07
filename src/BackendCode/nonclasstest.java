// Creating an object without a class
var person = {
  firstName: "John",
  lastName: "Doe",
  age: 30,
  sayHello: function() {
    console.log("Hello, my name is " + this.firstName + " " + this.lastName + " and I'm " + this.age + " years old.");
  }
};

// Accessing properties and calling a method
console.log(person.firstName); // Output: John
console.log(person.lastName);  // Output: Doe
person.sayHello();              // Output: Hello, my name is John Doe and I'm 30 years old.
