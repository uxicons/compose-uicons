package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleN: ImageVector? = null

val Icons.Ts.CircleN: ImageVector
    get() = _CircleN ?: UXIcon(name = "CircleN") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
                moveTo(16f, 6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(10.92f)
                curveToRelative(0f, 0.47f, -0.3f, 0.87f, -0.77f, 1.02f)
                curveToRelative(-0.49f, 0.15f, -1.0f, -0.02f, -1.29f, -0.42f)
                lineToRelative(-6.63f, -10.48f)
                curveToRelative(-0.04f, -0.06f, -0.13f, -0.03f, -0.15f, -0.02f)
                lineToRelative(-0.16f, 10.98f)
                lineToRelative(-1f, -0.01f)
                lineToRelative(0.09f, -10.91f)
                curveToRelative(0f, -0.47f, 0.3f, -0.87f, 0.77f, -1.02f)
                curveToRelative(0.49f, -0.15f, 1.0f, 0.02f, 1.29f, 0.42f)
                lineToRelative(6.63f, 10.48f)
                curveToRelative(0.04f, 0.06f, 0.14f, 0.03f, 0.15f, 0.02f)
                lineToRelative(0.07f, -10.99f)
                close()
            }
        }.also { _CircleN = it}
