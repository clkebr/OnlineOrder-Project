document.getElementById('loginForm').addEventListener('submit', function(event) {
    event.preventDefault();

    // Simulated user data for demonstration purposes
    const users = [
        { email: 'admin@example.com', password: 'admin123', role: 'ADMIN' },
        { email: 'user@example.com', password: 'user123', role: 'USER' }
    ];

    const email = document.getElementById('email').value;
    const password = document.getElementById('password').value;

    const user = users.find(user => user.email === email && user.password === password);

    if (user) {
        if (user.role === 'ADMIN') {
            window.location.href = '/admin_dashboard';
        } else {
            window.location.href = '/user_dashboard';
        }
    } else {
        alert('Invalid credentials');
    }
});

// Function to add products to the cart (simulation)
function addToCart(productId) {
    // Simulate adding the product to the cart
    let cart = JSON.parse(localStorage.getItem('cart')) || [];
    cart.push(productId);
    localStorage.setItem('cart', JSON.stringify(cart));
    alert('Product added to cart!');
}

// Function to display cart items
function displayCart() {
    let cart = JSON.parse(localStorage.getItem('cart')) || [];
    let cartItems = cart.map(id => `Product ${id}`).join('<br>');
    document.getElementById('cartItems').innerHTML = cartItems;
}

// Function to display checkout items
function displayCheckout() {
    let cart = JSON.parse(localStorage.getItem('cart')) || [];
    let checkoutItems = cart.map(id => `Product ${id}`).join('<br>');
    document.getElementById('checkoutItems').innerHTML = checkoutItems;
}

// Function to handle order submission
function submitOrder() {
    // Here you would typically send the order data to the server
    alert('Order has been submitted!');
    // Clear the cart
    localStorage.removeItem('cart');
    // Redirect to orders page
    window.location.href = '/orders';
}
