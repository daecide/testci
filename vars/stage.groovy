def call(String name, Closure closure) {
    echo "HELLO"
    try {
        stage(name, closure)
    } finally {
        echo "WORLD"
    }
}