import csv
from credentials import Credentials


class SecurityDB:

    username = 'username'
    password = 'password'

    @staticmethod
    def correct_credentials(credentials: Credentials, username=username, password=password):
        with open('security_db.csv', 'r') as csv_file:
            csv_reader = csv.DictReader(csv_file)
            for row in csv_reader:
                if row.__getitem__(username) == credentials.username and row.__getitem__(password) == credentials.password:
                    return True
            return False

    @staticmethod
    def save_credentials(credentials: Credentials, username=username, password=password):
        with open('security_db.csv', 'a', newline='') as csv_file:
            csv_writer = csv.DictWriter(csv_file, [username, password])
            csv_writer.writerow({username: f'{credentials.username}', password: f'{credentials.password}'})
