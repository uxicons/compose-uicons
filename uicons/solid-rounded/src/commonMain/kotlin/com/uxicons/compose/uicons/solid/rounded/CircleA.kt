package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleA: ImageVector? = null

val Icons.Sr.CircleA: ImageVector
    get() = _CircleA ?: UXIcon(name = "CircleA") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(17.09f, 17.19f)
                curveToRelative(-0.11f, 0.04f, -0.23f, 0.06f, -0.34f, 0.06f)
                curveToRelative(-0.41f, 0f, -0.79f, -0.25f, -0.94f, -0.66f)
                lineToRelative(-0.86f, -2.35f)
                horizontalLineToRelative(-5.9f)
                lineToRelative(-0.86f, 2.35f)
                curveToRelative(-0.19f, 0.52f, -0.77f, 0.78f, -1.28f, 0.59f)
                curveToRelative(-0.52f, -0.19f, -0.78f, -0.77f, -0.59f, -1.28f)
                lineToRelative(3.22f, -8.77f)
                curveToRelative(0.42f, -1.01f, 1.38f, -1.64f, 2.47f, -1.64f)
                reflectiveCurveToRelative(2.05f, 0.63f, 2.45f, 1.6f)
                lineToRelative(3.23f, 8.81f)
                curveToRelative(0.19f, 0.52f, -0.07f, 1.09f, -0.59f, 1.28f)
                close()
                moveTo(12.59f, 7.83f)
                lineToRelative(1.62f, 4.42f)
                horizontalLineToRelative(-4.43f)
                lineToRelative(1.61f, -4.38f)
                curveToRelative(0.14f, -0.34f, 0.5f, -0.37f, 0.61f, -0.37f)
                reflectiveCurveToRelative(0.47f, 0.03f, 0.59f, 0.33f)
                close()
            }
        }.also { _CircleA = it}
