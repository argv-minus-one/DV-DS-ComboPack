This folder contains generic assets for the horizontal slanted meter.

The naming schema is as follows:

SLAMFRND
└┬┘│├┘││
 │ ││ │└ Position of this piece in the 9-cell grid. Cells are designated
 │ ││ │  A through I, arranged as follows:
 │ ││ │  ┌─┬─┬─┐
 │ ││ │  │A│B│C│
 │ ││ │  ├─┼─┼─┤
 │ ││ │  │D│E│F│
 │ ││ │  ├─┼─┼─┤
 │ ││ │  │G│H│I│
 │ ││ │  └─┴─┴─┘
 │ ││ │
 │ ││ └ Meter state:
 │ ││   N = Normal state
 │ ││   C = Critical state
 │ ││
 │ │└ Which layer this image belongs to:
 │ │  FR = Frame layer
 │ │  BG = Background glass layer
 │ │
 │ └ “Meter”
 └ “Slanted”

So, “SLAMFRND” means slanted meter, frame layer, normal state, center-left position.

Note that the piece in the F position is not here. The engine generates the F piece by rotating the D piece 180°. This is configured in the TEXTURES file.

These images should all be plain white colored. This color is then blended with the intended color by the engine to produce the correctly colored output. This is also configured in the TEXTURES file.
