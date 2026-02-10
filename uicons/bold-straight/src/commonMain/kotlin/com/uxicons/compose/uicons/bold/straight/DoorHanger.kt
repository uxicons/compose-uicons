package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DoorHanger: ImageVector? = null

val Icons.Bs.DoorHanger: ImageVector
    get() = _DoorHanger ?: UXIcon(name = "DoorHanger") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.0f, 7f)
                curveToRelative(0f, -0.49f, -0.05f, -0.99f, -0.15f, -1.49f)
                curveToRelative(-0.55f, -2.65f, -2.7f, -4.8f, -5.36f, -5.36f)
                curveToRelative(-2.11f, -0.44f, -4.26f, 0.07f, -5.9f, 1.41f)
                curveToRelative(-1.64f, 1.34f, -2.59f, 3.32f, -2.59f, 5.43f)
                horizontalLineToRelative(3f)
                curveToRelative(0f, -1.21f, 0.54f, -2.34f, 1.48f, -3.1f)
                curveToRelative(0.95f, -0.78f, 2.16f, -1.06f, 3.4f, -0.8f)
                curveToRelative(1.83f, 0.37f, 3.19f, 2.13f, 3.12f, 3.99f)
                curveToRelative(0.01f, 2.11f, -1.88f, 3.97f, -4f, 3.92f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(9.5f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-17f)
                horizontalLineToRelative(-0.0f)
                close()
                moveTo(16f, 21f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.45f, 0f, 2.84f, -0.44f, 4f, -1.25f)
                close()
            }
        }.also { _DoorHanger = it}
