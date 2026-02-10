package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LampFloor: ImageVector? = null

val Icons.Rc.LampFloor: ImageVector
    get() = _LampFloor ?: UXIcon(name = "LampFloor") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.65f, 9.21f)
                curveToRelative(-0.82f, -3.44f, -2.38f, -6.72f, -2.45f, -6.86f)
                curveToRelative(-0.12f, -0.26f, -0.35f, -0.45f, -0.63f, -0.53f)
                curveToRelative(-0.12f, -0.03f, -2.97f, -0.82f, -6.57f, -0.82f)
                reflectiveCurveToRelative(-6.45f, 0.79f, -6.57f, 0.82f)
                curveToRelative(-0.28f, 0.08f, -0.51f, 0.27f, -0.63f, 0.53f)
                curveToRelative(-0.07f, 0.14f, -1.63f, 3.41f, -2.45f, 6.86f)
                curveToRelative(-0.11f, 0.47f, -0.21f, 0.95f, -0.29f, 1.42f)
                curveToRelative(-0.09f, 0.5f, 0.21f, 0.99f, 0.69f, 1.14f)
                curveToRelative(1.13f, 0.34f, 4.1f, 1.1f, 8.25f, 1.22f)
                verticalLineToRelative(7.63f)
                curveToRelative(-1.72f, 0.08f, -2.88f, 0.33f, -3.24f, 0.42f)
                curveToRelative(-0.54f, 0.13f, -0.86f, 0.68f, -0.73f, 1.21f)
                curveToRelative(0.13f, 0.54f, 0.68f, 0.86f, 1.21f, 0.73f)
                curveToRelative(0.37f, -0.09f, 1.72f, -0.39f, 3.76f, -0.39f)
                reflectiveCurveToRelative(3.39f, 0.3f, 3.76f, 0.39f)
                curveToRelative(0.08f, 0.02f, 0.16f, 0.03f, 0.24f, 0.03f)
                curveToRelative(0.45f, 0f, 0.86f, -0.3f, 0.97f, -0.76f)
                curveToRelative(0.13f, -0.54f, -0.19f, -1.08f, -0.73f, -1.21f)
                curveToRelative(-0.36f, -0.09f, -1.53f, -0.34f, -3.24f, -0.42f)
                verticalLineToRelative(-7.63f)
                curveToRelative(4.15f, -0.11f, 7.12f, -0.87f, 8.25f, -1.22f)
                curveToRelative(0.49f, -0.15f, 0.78f, -0.64f, 0.69f, -1.14f)
                curveToRelative(-0.09f, -0.47f, -0.18f, -0.95f, -0.29f, -1.42f)
                close()
                moveTo(12f, 11f)
                curveToRelative(-3.57f, 0f, -6.29f, -0.52f, -7.8f, -0.91f)
                curveToRelative(0.52f, -2.47f, 1.76f, -5.48f, 2.21f, -6.45f)
                curveToRelative(0.89f, -0.21f, 3.06f, -0.64f, 5.59f, -0.64f)
                reflectiveCurveToRelative(4.7f, 0.43f, 5.59f, 0.64f)
                curveToRelative(0.45f, 0.97f, 1.69f, 3.98f, 2.21f, 6.45f)
                curveToRelative(-1.51f, 0.39f, -4.23f, 0.91f, -7.8f, 0.91f)
                close()
            }
        }.also { _LampFloor = it}
