package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CirclePhoneFlip: ImageVector? = null

val Icons.Ts.CirclePhoneFlip: ImageVector
    get() = _CirclePhoneFlip ?: UXIcon(name = "CirclePhoneFlip") {
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
                moveTo(9.11f, 19f)
                curveToRelative(-0.95f, 0f, -1.82f, -0.36f, -2.47f, -1.01f)
                lineToRelative(-1.85f, -1.84f)
                lineToRelative(3.65f, -3.65f)
                lineToRelative(2.04f, 2.04f)
                curveToRelative(1.87f, -0.79f, 3.21f, -2.13f, 4.06f, -4.07f)
                lineToRelative(-2.04f, -2.04f)
                lineToRelative(3.65f, -3.65f)
                lineToRelative(1.85f, 1.85f)
                curveToRelative(0.65f, 0.65f, 1.01f, 1.53f, 1.01f, 2.47f)
                curveToRelative(0f, 4.34f, -5.54f, 9.89f, -9.89f, 9.89f)
                close()
                moveTo(6.21f, 16.15f)
                lineToRelative(1.14f, 1.14f)
                curveToRelative(0.46f, 0.46f, 1.09f, 0.71f, 1.77f, 0.71f)
                curveToRelative(3.82f, 0f, 8.89f, -5.07f, 8.89f, -8.89f)
                curveToRelative(0f, -0.68f, -0.25f, -1.31f, -0.71f, -1.77f)
                lineToRelative(-1.14f, -1.14f)
                lineToRelative(-2.23f, 2.23f)
                lineToRelative(1.8f, 1.8f)
                lineToRelative(-0.12f, 0.31f)
                curveToRelative(-0.98f, 2.45f, -2.68f, 4.15f, -5.06f, 5.05f)
                lineToRelative(-0.3f, 0.12f)
                lineToRelative(-1.8f, -1.8f)
                lineToRelative(-2.23f, 2.23f)
                close()
            }
        }.also { _CirclePhoneFlip = it}
