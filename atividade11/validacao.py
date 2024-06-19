import re

# Expressões regulares
login_pattern = re.compile(r'^(?=.*[A-Za-z])(?=.*\d)(?=.*[^\w\s]).{5,30}$')
password_pattern = re.compile(r'^(?=.*[A-Z])(?=.*\d)(?=.*[^\w\s]).{8,12}$')

# Funções de validação
def validate_login(login):
    return bool(login_pattern.match(login))

def validate_password(password):
    return bool(password_pattern.match(password))

# Testes
logins = [
    "user1!",  # válido
    "us3r",    # inválido: muito curto
    "us!er123456789012345678901234567890",  # inválido: muito longo
    "user@",   # inválido: sem número
]

passwords = [
    "Password1!",  # válido
    "password1!",  # inválido: sem letra maiúscula
    "Password!",   # inválido: sem número
    "Pass1!",      # inválido: muito curto
    "Password123456!",  # inválido: muito longo
]

# Verificação dos logins
for login in logins:
    print(f"Login: {login}, Válido: {validate_login(login)}")

# Verificação das senhas
for password in passwords:
    print(f"Senha: {password}, Válido: {validate_password(password)}")

