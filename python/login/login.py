from security_service import SecurityService
from ui import Interface as UI


def do_login():
    logged_in = False
    attempts = 0
    max_attempts = 3
    while attempts < max_attempts:
        credentials = UI.get_login_and_password()
        if SecurityService.correct_credentials(credentials):
            UI.successful_login(credentials.username)
            logged_in = True
            break
        else:
            attempts_left = max_attempts - attempts - 1
            if attempts_left != 1:
                UI.unsuccessful_login(attempts_left)
        attempts += 1
    if not logged_in:
        UI.exceeded_attempts(max_attempts)


def do_register():
    new_credentials = UI.get_login_and_password()
    SecurityService.save_new_credentials(new_credentials)
    UI.registered(new_credentials.username)


def main():
    login_or_register = UI.login_or_register()
    if login_or_register == 1:
        do_login()
    if login_or_register == 2:
        do_register()


if __name__ == "__main__":
    main()
