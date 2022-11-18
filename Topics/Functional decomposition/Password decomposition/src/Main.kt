fun passwordLessThan5(): String {
    // write here
    var password = "1234"
    if (password.length < 5) {
        println("Your password should be longer than five characters, please write a new password")
        val newPassword = "123456"
        return newPassword
    }
    return password

}

fun passwordLongerThan5(password: String) {
    // write here
    println("Your password is correct, please enter your name")
    val name = "John"
    println("Congratulations! Password for $name is $password")
}

