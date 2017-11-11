// Scala script that generates some of the constant tables used in sceptre.zc. It outputs them on stdout, which can be redirected into a file.

def generateConstantTable(
	constants: Seq[Any],
	perLine: Int,
	typeAndName: String,
	comment: String = ""
): String = {
	val stringsWithCommas = (for {
		v <- constants dropRight 1
		s = s"$v,"
	} yield s) :+ constants.last.toString
	
	val lines = for {
		lineItems <- stringsWithCommas grouped perLine
		lineText = lineItems mkString ("\n\t", " ", "")
	} yield lineText
	
	val commentText = {
		if (comment.isEmpty)
			""
		else
			s"// ${comment}\n"
	}
	
	s"${commentText}static const ${typeAndName}[] =\n{${lines.mkString}\n};\n"
}

// Generate SceptrePuff.HitThingSounds
print(generateConstantTable(
	for {
		lv <- 0 to 16
		soundIndex = lv >> 3
		literal = s""""SceptreHitThing${soundIndex}""""
	} yield literal,
	4,
	"Sound HitThingSounds",
	"for SceptrePuff"
))

// Generate SceptrePuff.HitWallSounds
print('\n' + generateConstantTable(
	for {
		lv <- 0 to 16
		soundIndex = lv >> 3
		literal = s""""SceptreEmpyrea/HitWall${if (soundIndex == 0) "" else soundIndex.toString}""""
	} yield literal,
	3,
	"Sound HitWallSounds"
))

// Generate SceptrePuff.QuakeBaseIntensity
print('\n' + generateConstantTable(
	for {
		lv <- 0 to 16
		intensity = 1 + (lv >> 3)
	} yield intensity.toString,
	6,
	"int QuakeBaseIntensity"
))

// You get the point
print('\n' + generateConstantTable(
	for {
		lv <- 0 to 16
		dur = 8 + (lv >> 1)
	} yield dur.toString,
	6,
	"int QuakeBaseDuration"
))

print('\n' + generateConstantTable(
	for {
		lv <- 0 to 16
		tr = 512 + (lv * 32)
	} yield tr.toString,
	6,
	"int QuakeBaseRadius"
))

print('\n' + generateConstantTable(
	for {
		lv <- 0 to 16
		tr = 0.375f + (lv * (0.875f - 0.375f) / 16f)
	} yield tr.toString,
	6,
	"float Scales"
))

print('\n' + generateConstantTable(
	for {
		lv <- 0 to 16
		tr = 0.5f + (lv * (0.833333f - 0.5f) / 16f)
	} yield tr.toString,
	6,
	"float Opacities"
))

// SceptreShockwave constants
print('\n' + generateConstantTable(
	for {
		lv <- 0 to 16
		tr = (0.375f + (lv * (0.875f - 0.375f) / 16f)) * 3f
	} yield tr.toString,
	6,
	"float Scales",
	"for SceptreShockwave"
))
