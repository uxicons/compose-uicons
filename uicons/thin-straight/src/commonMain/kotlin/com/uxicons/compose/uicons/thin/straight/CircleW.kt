package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleW: ImageVector? = null

val Icons.Ts.CircleW: ImageVector
    get() = _CircleW ?: UXIcon(name = "CircleW") {
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
                moveTo(15.72f, 16.98f)
                reflectiveCurveToRelative(-0.02f, 0.05f, -0.02f, 0.05f)
                lineToRelative(-3.7f, -6.92f)
                lineToRelative(-3.64f, 6.8f)
                curveToRelative(-0.01f, 0.02f, -0.04f, 0.06f, -0.09f, 0.06f)
                lineToRelative(-1.8f, -10.72f)
                horizontalLineToRelative(-1.08f)
                lineToRelative(1.92f, 10.99f)
                curveToRelative(0.08f, 0.37f, 0.5f, 0.74f, 0.99f, 0.74f)
                curveToRelative(0.38f, 0f, 0.72f, -0.2f, 0.93f, -0.56f)
                lineToRelative(2.77f, -5.18f)
                lineToRelative(2.83f, 5.29f)
                curveToRelative(0.16f, 0.27f, 0.5f, 0.46f, 0.87f, 0.46f)
                curveToRelative(0.56f, 0f, 0.92f, -0.36f, 1.0f, -0.77f)
                lineToRelative(1.91f, -10.97f)
                horizontalLineToRelative(-1.08f)
                lineToRelative(-1.81f, 10.73f)
                close()
            }
        }.also { _CircleW = it}
