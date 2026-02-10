package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SunSalutationYoga: ImageVector? = null

val Icons.Ts.SunSalutationYoga: ImageVector
    get() = _SunSalutationYoga ?: UXIcon(name = "SunSalutationYoga") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(11.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(16.9f, 7.21f)
                lineToRelative(-1.96f, 2.67f)
                lineToRelative(-2.52f, -3.12f)
                curveToRelative(-0.52f, -0.49f, -1.21f, -0.76f, -1.93f, -0.76f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(5.46f)
                curveToRelative(0f, 1.14f, 0.64f, 2.17f, 1.66f, 2.68f)
                lineToRelative(1.36f, 0.68f)
                lineToRelative(-0.02f, 6.68f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-6.92f)
                curveToRelative(0.85f, -2.59f, 0.98f, -5.17f, 0.99f, -8.03f)
                lineToRelative(1.57f, 1.95f)
                horizontalLineToRelative(0.8f)
                lineToRelative(2.34f, -3.21f)
                lineToRelative(-0.81f, -0.59f)
                close()
                moveTo(11.19f, 16.29f)
                lineToRelative(-1.08f, -0.54f)
                curveToRelative(-0.68f, -0.34f, -1.1f, -1.03f, -1.1f, -1.79f)
                verticalLineToRelative(-5.46f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                curveToRelative(0.46f, 0f, 0.9f, 0.17f, 1.2f, 0.44f)
                lineToRelative(0.3f, 0.38f)
                curveToRelative(0f, 3.09f, -0.04f, 5.81f, -0.81f, 8.47f)
                close()
            }
        }.also { _SunSalutationYoga = it}
