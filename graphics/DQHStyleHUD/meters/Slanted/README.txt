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

Only images like “SLAMFRN” actually exist. Individual pieces like “SLAMFRND” are configured in the TEXTURES file.

These images should all be grayscale with no alpha. They are used as an alpha channel for a solid color fill, to produce the correctly colored output.

With this, only three generic images are needed to draw any meter in this style, regardless of colors.
