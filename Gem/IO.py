#
#   Copyright (c) 2017 Amit Green.  All rights reserved.
#
@gem('Gem.IO')
def gem():
    export(
        #
        #   Insanely enough, the python 2.0 'input' function actually evaluated the input!
        #   We use the python 3.0 meaning of 'input' -- don't evaluate the input
        #
        'input',        (PythonCore.raw_input   if is_python_2 else   PythonCore.input),
    )
