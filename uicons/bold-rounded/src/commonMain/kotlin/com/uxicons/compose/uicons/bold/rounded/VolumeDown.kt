package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VolumeDown: ImageVector? = null

val Icons.Br.VolumeDown: ImageVector
    get() = _VolumeDown ?: UXIcon(name = "VolumeDown") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(19f, 12f)
            curveToRelative(0f, -1.91f, -1.27f, -3.5f, -3f, -4.04f)
            lineTo(16f, 1.5f)
            curveToRelative(0f, -0.45f, -0.2f, -0.87f, -0.55f, -1.16f)
            curveToRelative(-0.35f, -0.28f, -0.8f, -0.4f, -1.24f, -0.32f)
            curveToRelative(-3.1f, 0.6f, -6.13f, 2.51f, -7.94f, 4.97f)
            horizontalLineToRelative(-0.77f)
            curveTo(2.47f, 5f, 0f, 7.47f, 0f, 10.5f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(1.14f)
            curveToRelative(1.81f, 2.2f, 4.7f, 3.92f, 7.57f, 4.47f)
            curveToRelative(0.09f, 0.02f, 0.19f, 0.03f, 0.28f, 0.03f)
            curveToRelative(0.35f, 0f, 0.68f, -0.12f, 0.95f, -0.34f)
            curveToRelative(0.34f, -0.28f, 0.55f, -0.71f, 0.55f, -1.16f)
            verticalLineToRelative(-6.46f)
            curveToRelative(1.73f, -0.54f, 3f, -2.13f, 3f, -4.04f)
            close()
            moveTo(13f, 20.49f)
            curveToRelative(-1.77f, -0.72f, -3.41f, -1.95f, -4.39f, -3.35f)
            curveToRelative(-0.28f, -0.4f, -0.74f, -0.64f, -1.23f, -0.64f)
            horizontalLineToRelative(-1.89f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-3.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(1.56f)
            curveToRelative(0.52f, 0f, 1.0f, -0.27f, 1.28f, -0.71f)
            curveToRelative(0.99f, -1.6f, 2.74f, -2.99f, 4.66f, -3.78f)
            verticalLineToRelative(16.98f)
            close()
        }
    }.also { _VolumeDown = it }
