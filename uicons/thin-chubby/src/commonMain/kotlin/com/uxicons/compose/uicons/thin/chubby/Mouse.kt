package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mouse: ImageVector? = null

val Icons.Tc.Mouse: ImageVector
    get() = _Mouse ?: UXIcon(name = "Mouse") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.37f, 5.26f)
                curveToRelative(-0.04f, -0.17f, -0.16f, -0.3f, -0.32f, -0.36f)
                curveToRelative(-0.13f, -0.04f, -3.02f, -1.05f, -6.54f, -1.14f)
                lineTo(12.5f, 1.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                lineTo(11.5f, 3.77f)
                curveToRelative(-3.52f, 0.09f, -6.42f, 1.09f, -6.54f, 1.14f)
                curveToRelative(-0.16f, 0.06f, -0.28f, 0.19f, -0.32f, 0.36f)
                curveToRelative(-0.04f, 0.16f, -0.91f, 3.89f, -0.89f, 9.77f)
                curveToRelative(0.01f, 4.4f, 3.71f, 7.97f, 8.26f, 7.97f)
                reflectiveCurveToRelative(8.26f, -3.56f, 8.26f, -7.94f)
                curveToRelative(0f, -5.85f, -0.85f, -9.64f, -0.89f, -9.8f)
                close()
                moveTo(12.0f, 22f)
                curveToRelative(-3.99f, 0f, -7.25f, -3.13f, -7.26f, -6.98f)
                curveToRelative(-0.01f, -4.87f, 0.61f, -8.3f, 0.81f, -9.26f)
                curveToRelative(0.82f, -0.26f, 3.48f, -1f, 6.45f, -1f)
                reflectiveCurveToRelative(5.62f, 0.74f, 6.45f, 1f)
                curveToRelative(0.19f, 0.97f, 0.81f, 4.44f, 0.81f, 9.3f)
                curveToRelative(0f, 3.76f, -3.32f, 6.94f, -7.26f, 6.94f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 8.04f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(1.94f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-1.94f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                close()
            }
        }.also { _Mouse = it}
