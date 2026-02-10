package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mouse: ImageVector? = null

val Icons.Rc.Mouse: ImageVector
    get() = _Mouse ?: UXIcon(name = "Mouse") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 5.47f)
                curveToRelative(-0.08f, -0.33f, -0.32f, -0.61f, -0.64f, -0.72f)
                curveToRelative(-0.12f, -0.04f, -2.67f, -0.93f, -5.86f, -1.09f)
                verticalLineToRelative(-1.66f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.66f)
                curveToRelative(-3.19f, 0.16f, -5.74f, 1.05f, -5.86f, 1.09f)
                curveToRelative(-0.32f, 0.11f, -0.56f, 0.38f, -0.64f, 0.71f)
                curveToRelative(-0.04f, 0.15f, -0.88f, 3.77f, -0.86f, 9.43f)
                curveToRelative(0.01f, 4.48f, 3.76f, 8.12f, 8.37f, 8.12f)
                reflectiveCurveToRelative(8.36f, -3.63f, 8.36f, -8.09f)
                curveToRelative(0f, -5.63f, -0.82f, -9.29f, -0.86f, -9.45f)
                close()
                moveTo(12.0f, 21f)
                curveToRelative(-3.5f, 0f, -6.36f, -2.75f, -6.37f, -6.12f)
                curveToRelative(-0.01f, -4.17f, 0.47f, -7.22f, 0.7f, -8.41f)
                curveToRelative(0.98f, -0.28f, 3.21f, -0.84f, 5.67f, -0.84f)
                reflectiveCurveToRelative(4.68f, 0.55f, 5.67f, 0.84f)
                curveToRelative(0.22f, 1.2f, 0.7f, 4.29f, 0.7f, 8.45f)
                curveToRelative(0f, 3.3f, -2.91f, 6.09f, -6.36f, 6.09f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 7.71f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.84f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1.84f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _Mouse = it}
