package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CirclePhone: ImageVector? = null

val Icons.Ts.CirclePhone: ImageVector
    get() = _CirclePhone ?: UXIcon(name = "CirclePhone") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
                close()
                moveTo(12f, 1f)
                curveTo(5.93f, 1f, 1f, 5.93f, 1f, 12f)
                reflectiveCurveToRelative(4.93f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -4.93f, 11f, -11f)
                reflectiveCurveTo(18.07f, 1f, 12f, 1f)
                close()
                moveTo(14.89f, 19f)
                curveToRelative(-4.34f, 0f, -9.89f, -5.54f, -9.89f, -9.89f)
                curveToRelative(0f, -0.94f, 0.36f, -1.82f, 1.01f, -2.47f)
                lineToRelative(1.85f, -1.85f)
                lineToRelative(3.65f, 3.65f)
                lineToRelative(-2.04f, 2.04f)
                curveToRelative(0.85f, 1.94f, 2.19f, 3.27f, 4.06f, 4.07f)
                lineToRelative(2.04f, -2.04f)
                lineToRelative(3.65f, 3.65f)
                lineToRelative(-1.85f, 1.85f)
                curveToRelative(-0.65f, 0.65f, -1.53f, 1.01f, -2.47f, 1.01f)
                close()
                moveTo(7.85f, 6.21f)
                lineToRelative(-1.14f, 1.14f)
                curveToRelative(-0.46f, 0.46f, -0.71f, 1.09f, -0.71f, 1.77f)
                curveToRelative(0f, 3.82f, 5.07f, 8.89f, 8.89f, 8.89f)
                curveToRelative(0.68f, 0f, 1.31f, -0.25f, 1.77f, -0.71f)
                lineToRelative(1.14f, -1.14f)
                lineToRelative(-2.23f, -2.23f)
                lineToRelative(-1.8f, 1.8f)
                lineToRelative(-0.3f, -0.12f)
                curveToRelative(-2.37f, -0.91f, -4.07f, -2.6f, -5.05f, -5.05f)
                lineToRelative(-0.12f, -0.31f)
                lineToRelative(1.8f, -1.8f)
                lineToRelative(-2.23f, -2.23f)
                close()
            }
        }.also { _CirclePhone = it}
