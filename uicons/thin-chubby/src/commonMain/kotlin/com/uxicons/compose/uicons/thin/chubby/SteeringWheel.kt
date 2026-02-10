package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SteeringWheel: ImageVector? = null

val Icons.Tc.SteeringWheel: ImageVector
    get() = _SteeringWheel ?: UXIcon(name = "SteeringWheel") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                curveTo(6.89f, 1f, 1.03f, 2.25f, 1.03f, 12f)
                curveToRelative(0f, 7.71f, 3.28f, 11f, 10.97f, 11f)
                curveToRelative(5.11f, 0f, 10.97f, -1.25f, 10.97f, -11f)
                curveToRelative(0f, -7.71f, -3.28f, -11f, -10.97f, -11f)
                close()
                moveTo(12f, 2f)
                curveToRelative(4.65f, 0f, 7.5f, 1.25f, 8.9f, 4.12f)
                curveToRelative(-1.33f, 1.32f, -4.8f, 2.07f, -9.16f, 1.96f)
                curveToRelative(-3.95f, -0.1f, -7.64f, -0.94f, -8.65f, -1.94f)
                curveTo(4.49f, 3.26f, 7.34f, 2f, 12f, 2f)
                close()
                moveTo(2.03f, 12f)
                curveToRelative(0f, -0.07f, 0f, -0.14f, 0.0f, -0.2f)
                curveToRelative(3.25f, 0.63f, 6.59f, 3.55f, 6.7f, 9.95f)
                curveToRelative(-4.72f, -0.85f, -6.7f, -3.85f, -6.7f, -9.74f)
                close()
                moveTo(9.73f, 21.88f)
                curveToRelative(-0.06f, -7.21f, -3.95f, -10.45f, -7.67f, -11.1f)
                curveToRelative(0.07f, -1.41f, 0.28f, -2.63f, 0.64f, -3.67f)
                curveToRelative(1.66f, 1.24f, 5.56f, 1.88f, 9.02f, 1.97f)
                curveToRelative(0.2f, 0.01f, 0.46f, 0.01f, 0.76f, 0.01f)
                curveToRelative(2.2f, 0f, 6.67f, -0.23f, 8.83f, -1.98f)
                curveToRelative(0.36f, 1.05f, 0.57f, 2.28f, 0.64f, 3.7f)
                curveToRelative(-3.7f, 0.66f, -7.58f, 3.9f, -7.69f, 11.09f)
                curveToRelative(-0.7f, 0.08f, -1.45f, 0.12f, -2.25f, 0.12f)
                curveToRelative(-0.81f, 0f, -1.57f, -0.04f, -2.27f, -0.12f)
                close()
                moveTo(15.26f, 21.74f)
                curveToRelative(0.15f, -6.37f, 3.49f, -9.29f, 6.71f, -9.93f)
                curveToRelative(0f, 0.06f, 0.0f, 0.12f, 0.0f, 0.19f)
                curveToRelative(0f, 5.89f, -1.99f, 8.89f, -6.72f, 9.74f)
                close()
            }
        }.also { _SteeringWheel = it}
