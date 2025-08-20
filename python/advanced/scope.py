x = 100

def function_with_local_x():
    x = 200
    print(f"Inside function_with_scope: x = {x}")
    return x

def function_with_global_x():
    global x
    print(f"Before changing global x: x = {x}")
    x = 300
    print(f"After changing global x: x = {x}")
    return x