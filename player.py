def show_menu():
    print("\nMenu:")
    print("1. Say Hello")
    print("2. Add Two Numbers")
    print("3. Quit")
    print("4. Break the Loop")

def say_hello():
    print("Hello, Player!")

def add_numbers():
    try:
        num1 = float(input("Enter the first number: "))
        num2 = float(input("Enter the second number: "))
        print(f"The sum is: {num1 + num2}")
    except ValueError:
        print("Invalid input. Please enter numbers only.")

def main():
    while True:
        show_menu()
        choice = input("Choose an option: ")
        
        if choice == '1':
            say_hello()
        elif choice == '2':
            add_numbers()
        elif choice == '3':
            print("Goodbye!")
            break
        elif choice == '4':
            print("Breaking the loop!")
            break
        else:
            print("Invalid choice. Please choose a valid option.")

if __name__ == "__main__":
    main()
