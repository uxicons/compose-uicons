package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Kerning: ImageVector? = null

val Icons.Sr.Kerning: ImageVector
    get() = _Kerning ?: UXIcon(name = "Kerning") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.94f, 1.34f)
                lineTo(8.94f, 23.34f)
                curveToRelative(-0.15f, 0.41f, -0.53f, 0.66f, -0.94f, 0.66f)
                curveToRelative(-0.11f, 0f, -0.23f, -0.02f, -0.34f, -0.06f)
                curveToRelative(-0.52f, -0.19f, -0.79f, -0.76f, -0.6f, -1.28f)
                lineTo(15.06f, 0.66f)
                curveToRelative(0.19f, -0.52f, 0.76f, -0.79f, 1.28f, -0.6f)
                curveToRelative(0.52f, 0.19f, 0.79f, 0.76f, 0.6f, 1.28f)
                close()
                moveTo(9.91f, 6.06f)
                curveToRelative(-0.52f, -0.19f, -1.09f, 0.09f, -1.28f, 0.6f)
                lineToRelative(-3.34f, 9.36f)
                lineTo(1.94f, 6.66f)
                curveToRelative(-0.19f, -0.52f, -0.76f, -0.79f, -1.28f, -0.6f)
                reflectiveCurveTo(-0.13f, 6.82f, 0.06f, 7.34f)
                lineToRelative(3.81f, 10.65f)
                curveToRelative(0.22f, 0.61f, 0.78f, 1.0f, 1.42f, 1.0f)
                horizontalLineToRelative(0f)
                curveToRelative(0.65f, 0f, 1.21f, -0.39f, 1.42f, -1.0f)
                lineToRelative(3.81f, -10.65f)
                curveToRelative(0.19f, -0.52f, -0.09f, -1.09f, -0.6f, -1.28f)
                close()
                moveTo(23.34f, 18.94f)
                curveToRelative(-0.11f, 0.04f, -0.23f, 0.06f, -0.34f, 0.06f)
                curveToRelative(-0.41f, 0f, -0.8f, -0.26f, -0.94f, -0.66f)
                lineToRelative(-1.19f, -3.34f)
                horizontalLineToRelative(-4.3f)
                lineToRelative(-1.19f, 3.34f)
                curveToRelative(-0.19f, 0.52f, -0.76f, 0.79f, -1.28f, 0.6f)
                curveToRelative(-0.52f, -0.19f, -0.79f, -0.76f, -0.6f, -1.28f)
                lineToRelative(3.81f, -10.65f)
                curveToRelative(0.22f, -0.61f, 0.78f, -1.0f, 1.42f, -1.0f)
                horizontalLineToRelative(0f)
                curveToRelative(0.65f, 0f, 1.21f, 0.39f, 1.42f, 1.0f)
                lineToRelative(3.81f, 10.65f)
                curveToRelative(0.19f, 0.52f, -0.09f, 1.09f, -0.6f, 1.28f)
                close()
                moveTo(20.15f, 13.0f)
                lineToRelative(-1.44f, -4.03f)
                lineToRelative(-1.44f, 4.03f)
                horizontalLineToRelative(2.88f)
                close()
            }
        }.also { _Kerning = it}
