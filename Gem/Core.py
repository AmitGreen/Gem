#
#   Copyright (c) 2017 Amit Green.  All rights reserved.
#
@gem('Gem.Core')
def gem():
    #
    #   line
    #
    flush_standard_output = PythonSystem.stdout.flush
    write_standard_output = PythonSystem.stdout.write


    @built_in
    def line(format = none, *arguments):
        if format is none:
            assert length(arguments) is 0

            write_standard_output('\n')
        else:
            write_standard_output((format % arguments   if arguments else   format) + '\n')

        flush_standard_output()


    built_in(
        #
        #   Functions
        #
        'globals',          PythonCore.globals,
        'introspection',    PythonCore.dir,
        'iterate',          PythonCore.iter,
        'property',         PythonCore.property,
        'type',             PythonCore.type,


        #
        #   Types
        #
        'FrozenSet',        PythonCore.frozenset,
        'Object',           PythonCore.object,
    )
