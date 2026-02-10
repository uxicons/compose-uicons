package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WingsBox: ImageVector? = null

val Icons.Ss.WingsBox: ImageVector
    get() = _WingsBox ?: UXIcon(name = "WingsBox") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.64f, 3.88f)
                curveToRelative(0.22f, 0.32f, 0.36f, 0.7f, 0.36f, 1.11f)
                curveToRelative(0f, 0.87f, -0.56f, 1.61f, -1.34f, 1.88f)
                curveToRelative(0.22f, 0.32f, 0.34f, 0.7f, 0.34f, 1.12f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-16f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                curveToRelative(0f, -0.41f, 0.13f, -0.8f, 0.34f, -1.12f)
                curveToRelative(-0.78f, -0.27f, -1.34f, -1.01f, -1.34f, -1.88f)
                curveToRelative(0f, -0.42f, 0.14f, -0.8f, 0.36f, -1.11f)
                curveToRelative(-0.79f, -0.27f, -1.36f, -1.01f, -1.36f, -1.89f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(4.5f)
                curveToRelative(2.4f, 0f, 2.71f, 2.2f, 2.76f, 2.5f)
                curveToRelative(0.3f, 1.7f, 0.9f, 4.02f, 2.74f, 5.5f)
                curveToRelative(1.84f, -1.48f, 2.44f, -3.8f, 2.74f, -5.5f)
                curveToRelative(0.05f, -0.3f, 0.36f, -2.5f, 2.76f, -2.5f)
                horizontalLineToRelative(4.5f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                curveToRelative(0f, 0.88f, -0.57f, 1.62f, -1.36f, 1.89f)
                close()
                moveTo(19f, 15f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-14f)
                verticalLineToRelative(-9f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(8f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(14f, 15f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                close()
            }
        }.also { _WingsBox = it}
