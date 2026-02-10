package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleV: ImageVector? = null

val Icons.Rr.CircleV: ImageVector
    get() = _CircleV ?: UXIcon(name = "CircleV") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.73f, 8.11f)
                lineToRelative(-3.22f, 8.77f)
                curveToRelative(-0.42f, 1.01f, -1.38f, 1.64f, -2.47f, 1.64f)
                reflectiveCurveToRelative(-2.05f, -0.63f, -2.45f, -1.6f)
                lineToRelative(-3.23f, -8.81f)
                curveToRelative(-0.19f, -0.52f, 0.07f, -1.09f, 0.59f, -1.28f)
                reflectiveCurveToRelative(1.09f, 0.08f, 1.28f, 0.59f)
                lineToRelative(3.22f, 8.77f)
                curveToRelative(0.13f, 0.3f, 0.48f, 0.33f, 0.59f, 0.33f)
                reflectiveCurveToRelative(0.47f, -0.03f, 0.61f, -0.37f)
                lineToRelative(3.2f, -8.73f)
                curveToRelative(0.19f, -0.52f, 0.77f, -0.79f, 1.28f, -0.59f)
                curveToRelative(0.52f, 0.19f, 0.78f, 0.77f, 0.59f, 1.28f)
                close()
                moveTo(24.04f, 12.02f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0.04f, 18.64f, 0.04f, 12.02f)
                reflectiveCurveTo(5.42f, 0.02f, 12.04f, 0.02f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(22.04f, 12.02f)
                curveToRelative(0f, -5.51f, -4.49f, -10f, -10f, -10f)
                reflectiveCurveTo(2.04f, 6.51f, 2.04f, 12.02f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.49f, 10f, -10f)
                close()
            }
        }.also { _CircleV = it}
