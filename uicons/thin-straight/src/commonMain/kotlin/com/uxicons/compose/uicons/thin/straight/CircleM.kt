package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleM: ImageVector? = null

val Icons.Ts.CircleM: ImageVector
    get() = _CircleM ?: UXIcon(name = "CircleM") {
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
                moveTo(18f, 7.23f)
                verticalLineToRelative(10.77f)
                horizontalLineToRelative(-1f)
                lineTo(17f, 7.23f)
                curveToRelative(0f, -0.18f, -0.09f, -0.21f, -0.12f, -0.22f)
                curveToRelative(-0.09f, -0.02f, -0.2f, -0.01f, -0.28f, 0.11f)
                lineToRelative(-4.59f, 7.46f)
                lineToRelative(-4.61f, -7.49f)
                curveToRelative(-0.06f, -0.08f, -0.18f, -0.11f, -0.27f, -0.08f)
                curveToRelative(-0.03f, 0.01f, -0.12f, 0.04f, -0.12f, 0.22f)
                verticalLineToRelative(10.77f)
                horizontalLineToRelative(-1f)
                lineTo(6.0f, 7.23f)
                curveToRelative(0f, -0.55f, 0.32f, -1.01f, 0.82f, -1.17f)
                curveToRelative(0.51f, -0.16f, 1.08f, 0.03f, 1.4f, 0.48f)
                lineToRelative(3.78f, 6.14f)
                lineToRelative(3.76f, -6.11f)
                curveToRelative(0.34f, -0.48f, 0.91f, -0.67f, 1.42f, -0.51f)
                curveToRelative(0.5f, 0.16f, 0.82f, 0.62f, 0.82f, 1.17f)
                close()
            }
        }.also { _CircleM = it}
