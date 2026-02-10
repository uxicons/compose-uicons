package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserMask: ImageVector? = null

val Icons.Br.UserMask: ImageVector
    get() = _UserMask ?: UXIcon(name = "UserMask") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(20.03f, 23.9f)
            curveToRelative(-0.78f, 0.29f, -1.64f, -0.1f, -1.93f, -0.88f)
            curveToRelative(-0.9f, -2.41f, -3.35f, -4.02f, -6.09f, -4.02f)
            reflectiveCurveToRelative(-5.2f, 1.62f, -6.1f, 4.02f)
            curveToRelative(-0.29f, 0.78f, -1.18f, 1.17f, -1.93f, 0.88f)
            curveToRelative(-0.78f, -0.29f, -1.17f, -1.16f, -0.88f, -1.93f)
            curveToRelative(1.34f, -3.57f, 4.92f, -5.97f, 8.9f, -5.97f)
            reflectiveCurveToRelative(7.57f, 2.4f, 8.91f, 5.97f)
            curveToRelative(0.29f, 0.78f, -0.1f, 1.64f, -0.88f, 1.93f)
            close()
            moveTo(5.0f, 7.09f)
            curveToRelative(-0.07f, -3.89f, 3.11f, -7.1f, 7.0f, -7.09f)
            curveToRelative(3.86f, 0f, 7f, 3.14f, 7f, 7f)
            curveToRelative(-0.01f, 1.9f, -0.77f, 3.67f, -2.04f, 4.93f)
            curveToRelative(0.06f, -0.71f, 0.04f, -1.64f, -0.04f, -2.3f)
            curveToRelative(-0.56f, 0.43f, -1.21f, 0.83f, -1.93f, 1.09f)
            curveToRelative(0.03f, 0.52f, -0.01f, 1.11f, -0.06f, 1.53f)
            curveToRelative(-0.12f, 1.0f, -0.98f, 1.75f, -1.99f, 1.75f)
            horizontalLineToRelative(-1.89f)
            curveToRelative(-1.01f, 0f, -1.87f, -0.74f, -1.99f, -1.75f)
            curveToRelative(-0.05f, -0.42f, -0.09f, -1.01f, -0.06f, -1.53f)
            curveToRelative(-0.72f, -0.26f, -1.38f, -0.67f, -1.93f, -1.09f)
            curveToRelative(-0.08f, 0.66f, -0.1f, 1.59f, -0.04f, 2.3f)
            curveToRelative(-1.24f, -1.24f, -2.0f, -2.96f, -2.03f, -4.83f)
            close()
            moveTo(8.06f, 6.41f)
            lineTo(8.03f, 6.47f)
            curveToRelative(0.69f, 0.72f, 1.75f, 1.53f, 2.47f, 1.53f)
            horizontalLineToRelative(3.0f)
            curveToRelative(0.72f, 0f, 1.77f, -0.81f, 2.47f, -1.53f)
            lineToRelative(-0.03f, -0.06f)
            curveToRelative(-0.29f, -1.92f, -1.94f, -3.41f, -3.94f, -3.41f)
            reflectiveCurveToRelative(-3.65f, 1.49f, -3.94f, 3.41f)
            close()
        }
    }.also { _UserMask = it }
