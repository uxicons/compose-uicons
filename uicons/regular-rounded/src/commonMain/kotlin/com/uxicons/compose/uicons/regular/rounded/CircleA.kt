package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleA: ImageVector? = null

val Icons.Rr.CircleA: ImageVector
    get() = _CircleA ?: UXIcon(name = "CircleA") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.49f, 7.12f)
                curveToRelative(-0.41f, -0.97f, -1.37f, -1.6f, -2.45f, -1.6f)
                reflectiveCurveToRelative(-2.05f, 0.63f, -2.47f, 1.64f)
                lineToRelative(-3.22f, 8.77f)
                curveToRelative(-0.19f, 0.52f, 0.07f, 1.09f, 0.59f, 1.28f)
                curveToRelative(0.52f, 0.19f, 1.09f, -0.07f, 1.28f, -0.59f)
                lineToRelative(0.86f, -2.35f)
                horizontalLineToRelative(5.9f)
                lineToRelative(0.86f, 2.35f)
                curveToRelative(0.15f, 0.41f, 0.53f, 0.66f, 0.94f, 0.66f)
                curveToRelative(0.12f, 0f, 0.23f, -0.02f, 0.34f, -0.06f)
                curveToRelative(0.52f, -0.19f, 0.78f, -0.77f, 0.59f, -1.28f)
                lineToRelative(-3.23f, -8.81f)
                close()
                moveTo(9.82f, 12.27f)
                lineToRelative(1.61f, -4.38f)
                curveToRelative(0.14f, -0.34f, 0.5f, -0.37f, 0.61f, -0.37f)
                reflectiveCurveToRelative(0.47f, 0.03f, 0.59f, 0.33f)
                lineToRelative(1.62f, 4.42f)
                horizontalLineToRelative(-4.43f)
                close()
                moveTo(12.04f, 0.02f)
                curveTo(5.42f, 0.02f, 0.04f, 5.4f, 0.04f, 12.02f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.66f, 0.02f, 12.04f, 0.02f)
                close()
                moveTo(12.04f, 22.02f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveTo(6.52f, 2.02f, 12.04f, 2.02f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                reflectiveCurveToRelative(-4.49f, 10f, -10f, 10f)
                close()
            }
        }.also { _CircleA = it}
