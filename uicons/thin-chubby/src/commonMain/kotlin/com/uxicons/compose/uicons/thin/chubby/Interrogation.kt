package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Interrogation: ImageVector? = null

val Icons.Tc.Interrogation: ImageVector
    get() = _Interrogation ?: UXIcon(name = "Interrogation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.0f, 0.97f)
                curveTo(4.93f, 1.02f, 1f, 5.04f, 1f, 12.01f)
                curveToRelative(0f, 7.11f, 3.83f, 10.97f, 11.0f, 11.02f)
                curveToRelative(7.16f, -0.04f, 10.86f, -3.75f, 11.0f, -11.03f)
                curveToRelative(-0.12f, -7.06f, -4.03f, -10.97f, -11.0f, -11.02f)
                close()
                moveTo(12.0f, 22.02f)
                curveToRelative(-6.61f, -0.04f, -9.88f, -3.32f, -10.0f, -10.03f)
                curveToRelative(0.12f, -6.61f, 3.49f, -9.98f, 10.0f, -10.02f)
                curveToRelative(4.49f, 0.03f, 9.86f, 1.79f, 10.0f, 10.02f)
                curveToRelative(-0.12f, 6.71f, -3.4f, 9.99f, -10.0f, 10.03f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.0f, 5.78f)
                curveToRelative(-2.38f, 0.01f, -3.71f, 1.35f, -3.75f, 3.75f)
                curveToRelative(-0.01f, 0.28f, 0.21f, 0.5f, 0.49f, 0.51f)
                curveToRelative(0.27f, -0.02f, 0.5f, -0.22f, 0.51f, -0.49f)
                curveToRelative(0.03f, -1.88f, 0.91f, -2.76f, 2.75f, -2.77f)
                curveToRelative(1.83f, 0.01f, 2.73f, 0.92f, 2.76f, 2.75f)
                curveToRelative(-0.04f, 1.91f, -0.89f, 2.76f, -2.76f, 2.77f)
                curveToRelative(-0.28f, 0.0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(1.69f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-1.21f)
                curveToRelative(2.09f, -0.18f, 3.21f, -1.47f, 3.26f, -3.75f)
                curveToRelative(-0.04f, -2.41f, -1.38f, -3.74f, -3.76f, -3.75f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 17f)
                curveToRelative(-0.41f, 0f, -0.75f, 0.34f, -0.75f, 0.75f)
                reflectiveCurveToRelative(0.34f, 0.75f, 0.75f, 0.75f)
                reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f)
                reflectiveCurveToRelative(-0.34f, -0.75f, -0.75f, -0.75f)
                close()
            }
        }.also { _Interrogation = it}
