package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VolumeOff: ImageVector? = null

val Icons.Br.VolumeOff: ImageVector
    get() = _VolumeOff ?: UXIcon(name = "VolumeOff") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(14.5f, 24f)
            curveToRelative(-0.1f, 0f, -0.19f, -0.01f, -0.28f, -0.03f)
            curveToRelative(-2.88f, -0.56f, -5.76f, -2.28f, -7.57f, -4.47f)
            horizontalLineToRelative(-1.14f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            verticalLineToRelative(-3.5f)
            curveToRelative(0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
            horizontalLineToRelative(0.77f)
            curveTo(8.09f, 2.54f, 11.12f, 0.62f, 14.22f, 0.03f)
            curveToRelative(0.44f, -0.09f, 0.89f, 0.03f, 1.24f, 0.32f)
            curveToRelative(0.34f, 0.28f, 0.55f, 0.71f, 0.55f, 1.16f)
            verticalLineToRelative(21f)
            curveToRelative(0f, 0.45f, -0.2f, 0.87f, -0.55f, 1.16f)
            curveToRelative(-0.27f, 0.22f, -0.61f, 0.34f, -0.95f, 0.34f)
            close()
            moveTo(5.5f, 8f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(1.89f)
            curveToRelative(0.49f, 0f, 0.95f, 0.24f, 1.23f, 0.64f)
            curveToRelative(0.98f, 1.4f, 2.62f, 2.63f, 4.39f, 3.35f)
            verticalLineTo(3.51f)
            curveToRelative(-1.92f, 0.79f, -3.67f, 2.18f, -4.66f, 3.78f)
            curveToRelative(-0.27f, 0.44f, -0.76f, 0.71f, -1.28f, 0.71f)
            horizontalLineToRelative(-1.56f)
            close()
        }
    }.also { _VolumeOff = it }
