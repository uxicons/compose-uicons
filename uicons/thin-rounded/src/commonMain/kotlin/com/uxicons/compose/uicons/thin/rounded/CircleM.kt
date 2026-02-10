package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleM: ImageVector? = null

val Icons.Tr.CircleM: ImageVector
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
                moveTo(18f, 7.72f)
                verticalLineToRelative(9.78f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                lineTo(17f, 7.72f)
                curveToRelative(0f, -0.36f, -0.15f, -0.62f, -0.4f, -0.68f)
                curveToRelative(-0.25f, -0.05f, -0.5f, 0.11f, -0.66f, 0.43f)
                lineToRelative(-3.5f, 6.86f)
                curveToRelative(-0.09f, 0.17f, -0.26f, 0.27f, -0.45f, 0.27f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.19f, 0f, -0.36f, -0.11f, -0.45f, -0.27f)
                lineToRelative(-3.5f, -6.91f)
                curveToRelative(-0.16f, -0.32f, -0.39f, -0.47f, -0.63f, -0.41f)
                curveToRelative(-0.19f, 0.05f, -0.42f, 0.26f, -0.42f, 0.71f)
                verticalLineToRelative(9.78f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                lineTo(6.0f, 7.72f)
                curveToRelative(0f, -0.84f, 0.48f, -1.52f, 1.19f, -1.68f)
                curveToRelative(0.7f, -0.17f, 1.39f, 0.2f, 1.76f, 0.94f)
                lineToRelative(3.05f, 6.03f)
                lineToRelative(3.05f, -5.98f)
                curveToRelative(0.37f, -0.74f, 1.07f, -1.12f, 1.78f, -0.95f)
                curveToRelative(0.71f, 0.17f, 1.17f, 0.81f, 1.17f, 1.65f)
                close()
            }
        }.also { _CircleM = it}
