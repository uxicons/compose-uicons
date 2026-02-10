package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CardinalCompass: ImageVector? = null

val Icons.Ts.CardinalCompass: ImageVector
    get() = _CardinalCompass ?: UXIcon(name = "CardinalCompass") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.23f, 14.12f)
                lineToRelative(6.8f, -2.12f)
                lineToRelative(-6.8f, -2.12f)
                lineToRelative(2.84f, -5.94f)
                lineToRelative(-5.94f, 2.84f)
                lineTo(12f, -0.03f)
                lineToRelative(-2.12f, 6.8f)
                lineTo(3.94f, 3.94f)
                lineToRelative(2.84f, 5.94f)
                lineTo(-0.03f, 12f)
                lineToRelative(6.8f, 2.12f)
                lineToRelative(-2.84f, 5.94f)
                lineToRelative(5.94f, -2.84f)
                lineToRelative(2.12f, 6.8f)
                lineToRelative(2.12f, -6.8f)
                lineToRelative(5.94f, 2.84f)
                lineToRelative(-2.84f, -5.94f)
                close()
                moveTo(17.94f, 6.06f)
                lineToRelative(-1.68f, 3.51f)
                lineToRelative(-1.4f, -0.44f)
                lineToRelative(-0.44f, -1.4f)
                lineToRelative(3.51f, -1.68f)
                close()
                moveTo(6.06f, 6.06f)
                lineToRelative(3.51f, 1.68f)
                lineToRelative(-0.44f, 1.4f)
                lineToRelative(-1.4f, 0.44f)
                lineToRelative(-1.68f, -3.51f)
                close()
                moveTo(6.06f, 17.94f)
                lineToRelative(1.68f, -3.51f)
                lineToRelative(1.4f, 0.44f)
                lineToRelative(0.44f, 1.4f)
                lineToRelative(-3.51f, 1.68f)
                close()
                moveTo(9.94f, 14.06f)
                lineToRelative(-6.61f, -2.06f)
                lineToRelative(6.61f, -2.06f)
                lineToRelative(2.06f, -6.61f)
                lineToRelative(2.06f, 6.61f)
                lineToRelative(6.61f, 2.06f)
                lineToRelative(-6.61f, 2.06f)
                lineToRelative(-2.06f, 6.61f)
                lineToRelative(-2.06f, -6.61f)
                close()
                moveTo(14.86f, 14.86f)
                lineToRelative(1.4f, -0.44f)
                lineToRelative(1.68f, 3.51f)
                lineToRelative(-3.51f, -1.68f)
                lineToRelative(0.44f, -1.4f)
                close()
                moveTo(13.0f, 12f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _CardinalCompass = it}
