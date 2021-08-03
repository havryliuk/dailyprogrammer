from security_db import SecurityDB
from credentials import Credentials


class SecurityService:

    @staticmethod
    def correct_credentials(credentials: Credentials):
        return SecurityDB.correct_credentials(credentials)

    @staticmethod
    def save_new_credentials(new_credentials: Credentials):
        SecurityDB.save_credentials(new_credentials)
