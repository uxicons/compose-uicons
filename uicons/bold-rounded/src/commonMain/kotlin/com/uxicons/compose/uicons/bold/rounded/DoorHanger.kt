package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DoorHanger: ImageVector? = null

val Icons.Br.DoorHanger: ImageVector
    get() = _DoorHanger ?: UXIcon(name = "DoorHanger") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(14f, 24.0f)
            horizontalLineToRelative(-4f)
            curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
            horizontalLineToRelative(2f)
            curveToRelative(2.16f, 0.05f, 4.07f, -1.88f, 4f, -4.04f)
            curveToRelative(-0.0f, -0.28f, -0.03f, -0.56f, -0.09f, -0.84f)
            curveToRelative(-0.32f, -1.52f, -1.45f, -2.67f, -2.95f, -3.01f)
            curveToRelative(-1.18f, -0.27f, -2.36f, -0.04f, -3.31f, 0.65f)
            curveToRelative(-0.94f, 0.68f, -1.53f, 1.73f, -1.64f, 2.87f)
            curveToRelative(-0.07f, 0.83f, -0.81f, 1.43f, -1.63f, 1.36f)
            curveToRelative(-0.82f, -0.07f, -1.43f, -0.8f, -1.36f, -1.63f)
            curveToRelative(0.18f, -2.01f, 1.22f, -3.84f, 2.86f, -5.03f)
            curveToRelative(1.66f, -1.21f, 3.7f, -1.62f, 5.74f, -1.15f)
            curveToRelative(2.66f, 0.6f, 4.66f, 2.65f, 5.22f, 5.33f)
            curveToRelative(0.1f, 0.47f, 0.15f, 0.94f, 0.15f, 1.41f)
            curveToRelative(0.0f, 0.03f, 0.0f, 12.08f, 0.0f, 12.08f)
            curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
            close()
            moveTo(10f, 14.0f)
            curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
            horizontalLineToRelative(4f)
            curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
            verticalLineToRelative(-6.25f)
            curveToRelative(-1.16f, 0.81f, -2.55f, 1.25f, -4f, 1.25f)
            close()
        }
    }.also { _DoorHanger = it }
