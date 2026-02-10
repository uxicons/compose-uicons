package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sack: ImageVector? = null

val Icons.Rr.Sack: ImageVector
    get() = _Sack ?: UXIcon(name = "Sack") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.65f, 5.49f)
                curveToRelative(0.87f, -0.7f, 1.77f, -1.64f, 2.23f, -2.79f)
                curveToRelative(0.24f, -0.6f, 0.16f, -1.28f, -0.2f, -1.82f)
                curveToRelative(-0.38f, -0.56f, -1.0f, -0.89f, -1.67f, -0.89f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.67f, 0f, -1.29f, 0.33f, -1.67f, 0.89f)
                curveToRelative(-0.37f, 0.54f, -0.44f, 1.22f, -0.2f, 1.81f)
                curveToRelative(0.46f, 1.15f, 1.35f, 2.09f, 2.23f, 2.79f)
                curveTo(4.7f, 7.22f, 1f, 13.16f, 1f, 18f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                horizontalLineToRelative(10f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                curveToRelative(0f, -4.84f, -3.69f, -10.78f, -8.35f, -12.51f)
                close()
                moveTo(15.02f, 1.97f)
                curveToRelative(-0.52f, 1.3f, -2.09f, 2.39f, -3.02f, 2.91f)
                curveToRelative(-0.92f, -0.51f, -2.5f, -1.6f, -3.0f, -2.88f)
                lineToRelative(6.02f, -0.04f)
                close()
                moveTo(17.0f, 22f)
                lineTo(7f, 22f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                curveToRelative(0f, -5.24f, 4.71f, -11f, 9f, -11f)
                reflectiveCurveToRelative(9f, 5.76f, 9f, 11f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                close()
            }
        }.also { _Sack = it}
