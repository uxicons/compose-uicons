package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sword: ImageVector? = null

val Icons.Rc.Sword: ImageVector
    get() = _Sword ?: UXIcon(name = "Sword") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.95f, 1.99f)
                curveToRelative(-0.04f, -0.48f, -0.43f, -0.86f, -0.91f, -0.91f)
                curveToRelative(-4.65f, -0.41f, -9.12f, 1.54f, -11.96f, 5.22f)
                lineToRelative(-5.93f, 7.48f)
                curveToRelative(-0.47f, -0.17f, -0.95f, -0.31f, -1.45f, -0.41f)
                curveToRelative(-0.55f, -0.12f, -1.07f, 0.24f, -1.18f, 0.78f)
                curveToRelative(-0.11f, 0.54f, 0.24f, 1.07f, 0.78f, 1.18f)
                curveToRelative(1.26f, 0.26f, 2.41f, 0.8f, 3.39f, 1.56f)
                lineToRelative(-2.0f, 1.99f)
                lineToRelative(-0.97f, -0.97f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(3.36f, 3.35f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, -0.0f, -1.41f)
                lineToRelative(-0.97f, -0.97f)
                lineToRelative(2.0f, -1.99f)
                curveToRelative(0.76f, 0.97f, 1.31f, 2.12f, 1.57f, 3.38f)
                curveToRelative(0.1f, 0.47f, 0.59f, 0.9f, 1.18f, 0.78f)
                curveToRelative(0.54f, -0.11f, 0.89f, -0.64f, 0.78f, -1.18f)
                curveToRelative(-0.1f, -0.5f, -0.24f, -0.98f, -0.41f, -1.45f)
                lineToRelative(7.49f, -5.9f)
                curveToRelative(3.7f, -2.84f, 5.66f, -7.3f, 5.25f, -11.94f)
                close()
                moveTo(16.47f, 12.35f)
                lineToRelative(-7.15f, 5.64f)
                curveToRelative(-0.83f, -1.35f, -1.97f, -2.48f, -3.32f, -3.31f)
                lineToRelative(5.66f, -7.14f)
                curveToRelative(2.25f, -2.92f, 5.65f, -4.57f, 9.35f, -4.51f)
                curveToRelative(0.06f, 3.64f, -1.6f, 7.07f, -4.53f, 9.32f)
                close()
            }
        }.also { _Sword = it}
