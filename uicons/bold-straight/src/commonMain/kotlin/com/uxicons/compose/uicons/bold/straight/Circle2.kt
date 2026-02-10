package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Circle2: ImageVector? = null

val Icons.Bs.Circle2: ImageVector
    get() = _Circle2 ?: UXIcon(name = "Circle2") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
                close()
                moveTo(12f, 3f)
                curveTo(7.04f, 3f, 3f, 7.04f, 3f, 12f)
                reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                reflectiveCurveTo(16.96f, 3f, 12f, 3f)
                close()
                moveTo(16.5f, 15f)
                horizontalLineToRelative(-4.32f)
                curveToRelative(0.09f, -0.06f, 0.18f, -0.11f, 0.28f, -0.17f)
                curveToRelative(1.71f, -1.04f, 4.04f, -2.47f, 4.04f, -5.33f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveToRelative(-4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                curveToRelative(0f, 1.1f, -0.98f, 1.78f, -2.6f, 2.77f)
                curveToRelative(-1.51f, 0.93f, -3.4f, 2.08f, -3.4f, 4.23f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _Circle2 = it}
