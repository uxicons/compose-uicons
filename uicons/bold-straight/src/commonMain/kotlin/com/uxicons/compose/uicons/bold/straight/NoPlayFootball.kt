package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoPlayFootball: ImageVector? = null

val Icons.Bs.NoPlayFootball: ImageVector
    get() = _NoPlayFootball ?: UXIcon(name = "NoPlayFootball") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.5f, 14.99f)
                curveToRelative(0.83f, 0f, 1.51f, 0.68f, 1.51f, 1.51f)
                reflectiveCurveToRelative(-0.68f, 1.51f, -1.51f, 1.51f)
                reflectiveCurveToRelative(-1.51f, -0.68f, -1.51f, -1.51f)
                reflectiveCurveToRelative(0.68f, -1.51f, 1.51f, -1.51f)
                close()
                moveTo(12f, 16.88f)
                lineTo(10f, 14.88f)
                verticalLineToRelative(4.12f)
                horizontalLineToRelative(2f)
                close()
                moveTo(7.47f, 12.34f)
                lineTo(6.03f, 10.91f)
                lineTo(4.93f, 11.68f)
                lineTo(6.07f, 13.32f)
                lineTo(7.47f, 12.34f)
                close()
                moveTo(11.5f, 4f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveToRelative(-12f, -5.38f, -12f, -12f)
                reflectiveCurveToRelative(5.38f, -12f, 12f, -12f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(17.21f, 19.33f)
                lineTo(4.67f, 6.79f)
                curveToRelative(-1.05f, 1.47f, -1.67f, 3.27f, -1.67f, 5.21f)
                curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
                curveToRelative(1.94f, 0f, 3.73f, -0.62f, 5.21f, -1.67f)
                close()
                moveTo(21f, 12f)
                curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
                curveToRelative(-1.94f, 0f, -3.73f, 0.62f, -5.21f, 1.67f)
                lineToRelative(3.33f, 3.33f)
                horizontalLineToRelative(7.88f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3.88f)
                lineToRelative(1.5f, 3f)
                horizontalLineToRelative(3.38f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1.88f)
                lineToRelative(2.21f, 2.21f)
                curveToRelative(1.05f, -1.47f, 1.67f, -3.27f, 1.67f, -5.21f)
                close()
            }
        }.also { _NoPlayFootball = it}
