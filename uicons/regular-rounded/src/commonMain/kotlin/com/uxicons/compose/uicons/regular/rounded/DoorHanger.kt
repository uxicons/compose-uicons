package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DoorHanger: ImageVector? = null

val Icons.Rr.DoorHanger: ImageVector
    get() = _DoorHanger ?: UXIcon(name = "DoorHanger") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.34f, 0.01f)
                curveToRelative(-1.9f, -0.08f, -3.71f, 0.57f, -5.1f, 1.87f)
                curveToRelative(-0.89f, 0.83f, -1.17f, 2.06f, -0.71f, 3.21f)
                curveToRelative(0.46f, 1.16f, 1.56f, 1.92f, 2.79f, 1.92f)
                curveToRelative(0.74f, 0.04f, 1.42f, -0.18f, 2.01f, -0.73f)
                curveToRelative(0.16f, -0.15f, 0.5f, -0.37f, 1f, -0.21f)
                curveToRelative(0.41f, 0.12f, 0.67f, 0.5f, 0.67f, 0.95f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-1f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(4f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-11.73f)
                curveToRelative(0.0f, -3.83f, -2.99f, -7.09f, -6.66f, -7.26f)
                close()
                moveTo(17f, 19f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(1f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                curveToRelative(0f, -1.33f, -0.84f, -2.48f, -2.09f, -2.86f)
                curveToRelative(-1.05f, -0.32f, -2.15f, -0.07f, -2.94f, 0.66f)
                curveToRelative(-0.13f, 0.17f, -0.43f, 0.23f, -0.65f, 0.2f)
                curveToRelative(-0.5f, 0f, -0.81f, -0.34f, -0.94f, -0.65f)
                curveToRelative(-0.07f, -0.18f, -0.19f, -0.63f, 0.22f, -1.01f)
                curveToRelative(0.99f, -0.92f, 2.29f, -1.4f, 3.64f, -1.33f)
                curveToRelative(2.62f, 0.12f, 4.76f, 2.48f, 4.76f, 5.26f)
                close()
            }
        }.also { _DoorHanger = it}
