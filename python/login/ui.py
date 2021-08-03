from credentials import Credentials


class Interface:

    @staticmethod
    def login_or_register():
        while True:
            user_input = input('Do you want to log in (1) or register (2) ?\n')
            try:
                result = int(user_input)
                if result == 1 or result == 2:
                    return result
                else: raise ValueError()
            except ValueError:
                print('Your input must be 1 or 2')

    @staticmethod
    def get_login_and_password() -> Credentials:
        username = str(input('Enter username: '))
        password = str(input('Enter password: '))
        return Credentials(username, password)

    @staticmethod
    def successful_login(username: str):
        print(f"User '{username}', you are logged in!")

    @staticmethod
    def unsuccessful_login(attempts_left: int):
        print(f'Incorrect username or password. {attempts_left} attempts left')

    @staticmethod
    def registered(username: str):
        print(f"Username '{username}' registered!")

    @staticmethod
    def exceeded_attempts(max_attempts: int):
        print(f'Maximum number of attempts ({max_attempts}) exceeded. Try again later...')
