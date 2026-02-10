package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoPlayFootball: ImageVector? = null

val Icons.Ss.NoPlayFootball: ImageVector
    get() = _NoPlayFootball ?: UXIcon(name = "NoPlayFootball") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 5.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(7.5f, 14.99f)
                curveToRelative(-0.83f, 0f, -1.51f, 0.68f, -1.51f, 1.51f)
                reflectiveCurveToRelative(0.68f, 1.51f, 1.51f, 1.51f)
                reflectiveCurveToRelative(1.51f, -0.68f, 1.51f, -1.51f)
                reflectiveCurveToRelative(-0.68f, -1.51f, -1.51f, -1.51f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveToRelative(-12f, -5.38f, -12f, -12f)
                reflectiveCurveToRelative(5.38f, -12f, 12f, -12f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(12f, 2f)
                curveToRelative(-2.4f, 0f, -4.6f, 0.85f, -6.32f, 2.26f)
                lineToRelative(4.06f, 4.06f)
                lineToRelative(0.45f, -0.32f)
                horizontalLineToRelative(7.82f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3.88f)
                lineToRelative(1.5f, 3f)
                horizontalLineToRelative(3.38f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2.59f)
                lineToRelative(3.32f, 3.32f)
                curveToRelative(1.41f, -1.73f, 2.26f, -3.93f, 2.26f, -6.32f)
                curveToRelative(0f, -5.51f, -4.49f, -10f, -10f, -10f)
                close()
                moveTo(12f, 22f)
                curveToRelative(2.4f, 0f, 4.6f, -0.85f, 6.32f, -2.26f)
                lineToRelative(-14.06f, -14.06f)
                curveToRelative(-1.41f, 1.73f, -2.26f, 3.93f, -2.26f, 6.32f)
                curveToRelative(0f, 5.51f, 4.49f, 10f, 10f, 10f)
                close()
                moveTo(7.79f, 12.03f)
                lineTo(6.36f, 10.6f)
                lineTo(4.93f, 11.68f)
                lineTo(6.07f, 13.32f)
                lineTo(7.79f, 12.03f)
                close()
                moveTo(10f, 14.24f)
                verticalLineToRelative(4.76f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2.76f)
                close()
            }
        }.also { _NoPlayFootball = it}
