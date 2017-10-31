This folder contains generic assets for the horizontal slanted meter.

The naming schema is as follows:

SLAMFRMD
└┬┘│└┬┘│
 │ │ │ └ Position of this piece in the 9-cell grid. Cells are designated
 │ │ │   A through I, arranged as follows:
 │ │ │   ┌─┬─┬─┐
 │ │ │   │A│B│C│
 │ │ │   ├─┼─┼─┤
 │ │ │   │D│E│F│
 │ │ │   ├─┼─┼─┤
 │ │ │   │G│H│I│
 │ │ │   └─┴─┴─┘
 │ │ │
 │ │ └ Which layer this image belongs to:
 │ │   FRM = Frame layer
 │ │   FRG = Frame glow layer
 │ │   BKG = Background glass layer
 │ │
 │ └ “Meter”
 └ “Slanted”

So, “SLAMFRMD” means slanted meter, frame layer, center-left position.

Only images like “SLAMFRM” actually exist. Individual pieces like “SLAMFRMD” are configured in the TEXTURES file.

These images should all be grayscale with no alpha. They are used as an alpha channel for a solid color fill, to produce the correctly colored output.

With this, only three generic images are needed to draw any meter in this style, regardless of colors.
