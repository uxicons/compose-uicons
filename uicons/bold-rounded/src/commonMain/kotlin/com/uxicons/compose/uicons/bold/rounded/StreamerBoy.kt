package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StreamerBoy: ImageVector? = null

val Icons.Br.StreamerBoy: ImageVector
    get() = _StreamerBoy ?: UXIcon(name = "StreamerBoy") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(2.5f, 8f)
            horizontalLineToRelative(0.85f)
            curveToRelative(0.83f, 2.33f, 3.04f, 4f, 5.65f, 4f)
            reflectiveCurveToRelative(4.82f, -1.67f, 5.65f, -4f)
            horizontalLineToRelative(0.85f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-0.85f)
            curveToRelative(-0.83f, -2.33f, -3.04f, -4f, -5.65f, -4f)
            reflectiveCurveToRelative(-4.82f, 1.67f, -5.65f, 4f)
            horizontalLineToRelative(-0.85f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            close()
            moveTo(9f, 9f)
            curveToRelative(-1.67f, 0.0f, -3.04f, -1.38f, -3.0f, -3.05f)
            curveToRelative(0.16f, 0.01f, 0.31f, 0.05f, 0.47f, 0.05f)
            curveToRelative(1.82f, 0f, 3.39f, -0.98f, 4.26f, -2.43f)
            curveToRelative(0.76f, 0.55f, 1.26f, 1.43f, 1.26f, 2.43f)
            curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
            close()
            moveTo(23.48f, 13.86f)
            lineTo(21.99f, 12.59f)
            curveToRelative(0.07f, -1.41f, -1.09f, -2.59f, -2.49f, -2.59f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
            curveToRelative(0.21f, 0f, 0.41f, -0.03f, 0.6f, -0.08f)
            lineToRelative(0.9f, 0.77f)
            verticalLineToRelative(2.81f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(0.0f, -0.35f, -0.06f, -0.7f, -0.18f, -1.04f)
            curveToRelative(-1.24f, -3.45f, -4.95f, -5.96f, -8.82f, -5.96f)
            curveToRelative(-3.92f, 0f, -7.55f, 2.45f, -8.82f, 5.95f)
            curveToRelative(-0.34f, 0.93f, -0.2f, 1.97f, 0.37f, 2.77f)
            curveToRelative(0.56f, 0.8f, 1.48f, 1.27f, 2.45f, 1.27f)
            horizontalLineToRelative(15.5f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            verticalLineToRelative(-3.5f)
            curveToRelative(0f, -0.44f, -0.19f, -0.85f, -0.52f, -1.14f)
            close()
            moveTo(3.0f, 20.97f)
            curveToRelative(0.83f, -2.3f, 3.35f, -3.97f, 6.0f, -3.97f)
            reflectiveCurveToRelative(5.16f, 1.67f, 6.0f, 3.99f)
            close()
        }
    }.also { _StreamerBoy = it }
