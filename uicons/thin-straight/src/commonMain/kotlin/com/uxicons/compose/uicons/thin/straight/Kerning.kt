package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Kerning: ImageVector? = null

val Icons.Ts.Kerning: ImageVector
    get() = _Kerning ?: UXIcon(name = "Kerning") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.83f, 0f)
                lineTo(8.26f, 24f)
                horizontalLineToRelative(-1.09f)
                lineTo(15.73f, 0f)
                horizontalLineToRelative(1.09f)
                close()
                moveTo(7.59f, 17.68f)
                lineTo(11.86f, 6f)
                horizontalLineToRelative(-1.06f)
                lineToRelative(-4.15f, 11.34f)
                curveToRelative(-0.14f, 0.4f, -0.51f, 0.66f, -0.94f, 0.66f)
                reflectiveCurveToRelative(-0.8f, -0.26f, -0.94f, -0.66f)
                lineTo(1.06f, 6f)
                lineTo(-0.02f, 6f)
                lineToRelative(3.84f, 11.67f)
                curveToRelative(0.29f, 0.81f, 1.03f, 1.33f, 1.88f, 1.33f)
                reflectiveCurveToRelative(1.59f, -0.52f, 1.88f, -1.32f)
                close()
                moveTo(21.48f, 15f)
                horizontalLineToRelative(-6.97f)
                lineToRelative(-1.31f, 4f)
                horizontalLineToRelative(-1.08f)
                lineToRelative(3.84f, -11.67f)
                curveToRelative(0.29f, -0.81f, 1.03f, -1.33f, 1.88f, -1.33f)
                reflectiveCurveToRelative(1.59f, 0.52f, 1.88f, 1.32f)
                lineToRelative(4.27f, 11.68f)
                horizontalLineToRelative(-1.06f)
                lineToRelative(-1.47f, -4f)
                close()
                moveTo(21.11f, 14f)
                lineToRelative(-2.32f, -6.34f)
                curveToRelative(-0.14f, -0.4f, -0.51f, -0.66f, -0.94f, -0.66f)
                reflectiveCurveToRelative(-0.8f, 0.26f, -0.94f, 0.66f)
                lineToRelative(-2.07f, 6.34f)
                horizontalLineToRelative(6.27f)
                close()
            }
        }.also { _Kerning = it}
