package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoPlayFootball: ImageVector? = null

val Icons.Sr.NoPlayFootball: ImageVector
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
                lineToRelative(4.13f, 4.13f)
                curveToRelative(0.6f, -0.26f, 1.25f, -0.4f, 1.91f, -0.4f)
                horizontalLineToRelative(5.28f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2.88f)
                lineToRelative(1.5f, 3f)
                horizontalLineToRelative(2.38f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1.59f)
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
                moveTo(6.9f, 12.7f)
                lineTo(7.79f, 12.03f)
                lineTo(6.36f, 10.6f)
                lineTo(5.7f, 11.1f)
                curveToRelative(-0.43f, 0.33f, -0.53f, 0.93f, -0.22f, 1.37f)
                curveToRelative(0.32f, 0.46f, 0.97f, 0.57f, 1.42f, 0.23f)
                close()
                moveTo(10f, 14.24f)
                verticalLineToRelative(3.76f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1.76f)
                close()
            }
        }.also { _NoPlayFootball = it}
