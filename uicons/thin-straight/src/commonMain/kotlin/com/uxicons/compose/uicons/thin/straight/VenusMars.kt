package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VenusMars: ImageVector? = null

val Icons.Ts.VenusMars: ImageVector
    get() = _VenusMars ?: UXIcon(name = "VenusMars") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.5f, 0f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4.29f)
                lineToRelative(-4.57f, 4.57f)
                curveToRelative(-1.14f, -0.98f, -2.61f, -1.57f, -4.23f, -1.57f)
                curveToRelative(-1.29f, 0f, -2.49f, 0.38f, -3.5f, 1.02f)
                curveToRelative(-1.05f, -0.67f, -2.25f, -1.02f, -3.5f, -1.02f)
                curveTo(2.92f, 4f, 0f, 6.92f, 0f, 10.5f)
                curveToRelative(0f, 3.42f, 2.65f, 6.22f, 6f, 6.48f)
                verticalLineToRelative(3.02f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3.02f)
                curveToRelative(1.07f, -0.08f, 2.1f, -0.42f, 3.0f, -1.0f)
                curveToRelative(1.01f, 0.65f, 2.21f, 1.02f, 3.5f, 1.02f)
                curveToRelative(3.58f, 0f, 6.5f, -2.92f, 6.5f, -6.5f)
                curveToRelative(0f, -1.61f, -0.59f, -3.09f, -1.57f, -4.23f)
                lineToRelative(4.57f, -4.57f)
                verticalLineToRelative(4.29f)
                horizontalLineToRelative(1f)
                lineTo(24f, 1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(6.5f, 16f)
                curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
                reflectiveCurveToRelative(2.47f, -5.5f, 5.5f, -5.5f)
                curveToRelative(0.93f, 0f, 1.84f, 0.23f, 2.65f, 0.68f)
                curveToRelative(-1.32f, 1.19f, -2.15f, 2.91f, -2.15f, 4.82f)
                reflectiveCurveToRelative(0.83f, 3.63f, 2.15f, 4.82f)
                curveToRelative(-0.81f, 0.44f, -1.71f, 0.68f, -2.65f, 0.68f)
                close()
                moveTo(13.5f, 16f)
                curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
                reflectiveCurveToRelative(2.47f, -5.5f, 5.5f, -5.5f)
                reflectiveCurveToRelative(5.5f, 2.47f, 5.5f, 5.5f)
                reflectiveCurveToRelative(-2.47f, 5.5f, -5.5f, 5.5f)
                close()
            }
        }.also { _VenusMars = it}
