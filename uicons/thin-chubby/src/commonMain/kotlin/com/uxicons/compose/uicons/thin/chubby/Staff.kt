package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Staff: ImageVector? = null

val Icons.Tc.Staff: ImageVector
    get() = _Staff ?: UXIcon(name = "Staff") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.36f, 1.97f)
                curveToRelative(-0.05f, -0.16f, -0.18f, -0.29f, -0.34f, -0.34f)
                curveToRelative(-0.09f, -0.03f, -2.28f, -0.63f, -4.86f, -0.63f)
                reflectiveCurveToRelative(-4.77f, 0.61f, -4.86f, 0.63f)
                curveToRelative(-0.17f, 0.05f, -0.29f, 0.17f, -0.34f, 0.34f)
                curveToRelative(-0.03f, 0.09f, -0.64f, 2.13f, -0.64f, 4.87f)
                curveToRelative(0f, 0.88f, 0.06f, 1.78f, 0.19f, 2.67f)
                curveToRelative(0.18f, 1.27f, -0.25f, 2.52f, -1.16f, 3.44f)
                lineToRelative(-9.2f, 9.2f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.35f, -0.15f)
                lineToRelative(9.2f, -9.2f)
                curveToRelative(1.12f, -1.12f, 1.66f, -2.72f, 1.45f, -4.28f)
                curveToRelative(-0.12f, -0.85f, -0.18f, -1.7f, -0.18f, -2.53f)
                curveToRelative(0f, -2.03f, 0.36f, -3.69f, 0.52f, -4.31f)
                curveToRelative(0.65f, -0.16f, 2.39f, -0.53f, 4.32f, -0.53f)
                reflectiveCurveToRelative(3.67f, 0.37f, 4.32f, 0.53f)
                curveToRelative(0.16f, 0.62f, 0.52f, 2.27f, 0.52f, 4.31f)
                curveToRelative(0f, 2f, -0.35f, 3.64f, -0.51f, 4.29f)
                curveToRelative(-0.71f, 0.11f, -2.55f, 0.38f, -4.49f, 0.38f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                curveToRelative(2.56f, 0f, 4.88f, -0.43f, 4.98f, -0.45f)
                curveToRelative(0.18f, -0.03f, 0.33f, -0.17f, 0.39f, -0.35f)
                curveToRelative(0.03f, -0.09f, 0.64f, -2.13f, 0.64f, -4.87f)
                curveToRelative(0f, -2.76f, -0.61f, -4.79f, -0.64f, -4.87f)
                close()
            }
        }.also { _Staff = it}
