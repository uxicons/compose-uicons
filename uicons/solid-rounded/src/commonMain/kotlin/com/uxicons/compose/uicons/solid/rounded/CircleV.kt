package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleV: ImageVector? = null

val Icons.Sr.CircleV: ImageVector
    get() = _CircleV ?: UXIcon(name = "CircleV") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(17.69f, 8.1f)
                lineToRelative(-3.22f, 8.77f)
                curveToRelative(-0.42f, 1.01f, -1.38f, 1.64f, -2.47f, 1.64f)
                reflectiveCurveToRelative(-2.05f, -0.63f, -2.45f, -1.6f)
                lineToRelative(-3.23f, -8.81f)
                curveToRelative(-0.19f, -0.52f, 0.07f, -1.09f, 0.59f, -1.28f)
                curveToRelative(0.52f, -0.19f, 1.09f, 0.08f, 1.28f, 0.59f)
                lineToRelative(3.22f, 8.77f)
                curveToRelative(0.13f, 0.3f, 0.48f, 0.33f, 0.59f, 0.33f)
                reflectiveCurveToRelative(0.47f, -0.03f, 0.61f, -0.37f)
                lineToRelative(3.2f, -8.73f)
                curveToRelative(0.19f, -0.52f, 0.77f, -0.79f, 1.28f, -0.59f)
                curveToRelative(0.52f, 0.19f, 0.78f, 0.77f, 0.59f, 1.28f)
                close()
            }
        }.also { _CircleV = it}
