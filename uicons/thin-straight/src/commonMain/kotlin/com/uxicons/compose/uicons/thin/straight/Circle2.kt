package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Circle2: ImageVector? = null

val Icons.Ts.Circle2: ImageVector
    get() = _Circle2 ?: UXIcon(name = "Circle2") {
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
                moveTo(16f, 17f)
                horizontalLineToRelative(-6.93f)
                curveToRelative(0.29f, -0.98f, 1.45f, -1.54f, 2.77f, -2.18f)
                curveToRelative(1.85f, -0.89f, 4.16f, -2.0f, 4.16f, -4.82f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                curveToRelative(0f, 2.19f, -1.75f, 3.03f, -3.59f, 3.92f)
                curveToRelative(-1.68f, 0.81f, -3.41f, 1.64f, -3.41f, 3.58f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _Circle2 = it}
