package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Snake: ImageVector? = null

val Icons.Ss.Snake: ImageVector
    get() = _Snake ?: UXIcon(name = "Snake") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 19f)
                horizontalLineTo(2.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(19f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3.47f, 17f)
                horizontalLineToRelative(6.56f)
                lineToRelative(-3.61f, -4.27f)
                curveToRelative(-0.88f, -1.06f, -4.92f, -1.73f, -4.92f, -1.73f)
                curveToRelative(0f, 0f, 0.2f, 3.87f, 1.08f, 4.93f)
                lineToRelative(0.89f, 1.07f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.27f, 2.79f)
                lineToRelative(-1.41f, -1.41f)
                curveToRelative(-0.99f, -0.99f, -2.35f, -1.45f, -3.67f, -1.36f)
                curveToRelative(-0.99f, -0.04f, -1.98f, 0.28f, -2.77f, 0.98f)
                lineToRelative(-1.03f, 0.49f)
                curveToRelative(-1.27f, 0.08f, -3.15f, 0.42f, -4.57f, 1.71f)
                curveToRelative(-0.82f, 0.75f, -1.81f, 2.1f, -1.81f, 4.29f)
                curveToRelative(0f, 3.35f, 2.4f, 7.44f, 4.51f, 9.5f)
                lineToRelative(7.49f, 0.01f)
                curveToRelative(-1.62f, -0.93f, -3.44f, -2.81f, -4.64f, -4.25f)
                curveToRelative(-1.86f, -2.25f, -2.36f, -4.25f, -2.36f, -5.26f)
                curveToRelative(0f, -0.71f, 0.65f, -0.92f, 1.25f, -0.98f)
                lineToRelative(1.24f, 1.24f)
                curveToRelative(1.75f, 1.75f, 4.61f, 1.75f, 6.36f, 0f)
                lineToRelative(1.41f, -1.41f)
                curveToRelative(0.97f, -0.97f, 0.97f, -2.56f, 0f, -3.54f)
                close()
                moveTo(19f, 6f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _Snake = it}
