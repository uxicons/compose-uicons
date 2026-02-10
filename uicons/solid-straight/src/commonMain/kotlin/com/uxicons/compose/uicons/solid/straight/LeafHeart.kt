package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LeafHeart: ImageVector? = null

val Icons.Ss.LeafHeart: ImageVector
    get() = _LeafHeart ?: UXIcon(name = "LeafHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 10.43f)
                curveToRelative(0f, 1.24f, -1.89f, 3.19f, -3.5f, 4.43f)
                curveToRelative(-1.41f, -1.1f, -3.5f, -3.1f, -3.5f, -4.43f)
                curveToRelative(0f, -0.79f, 0.56f, -1.43f, 1.25f, -1.43f)
                curveToRelative(0.62f, 0f, 1.25f, 0.37f, 1.25f, 1.21f)
                verticalLineToRelative(0.79f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-0.79f)
                curveToRelative(0f, -0.83f, 0.63f, -1.21f, 1.25f, -1.21f)
                curveToRelative(0.69f, 0f, 1.25f, 0.64f, 1.25f, 1.43f)
                close()
                moveTo(24f, -0.0f)
                verticalLineToRelative(1.61f)
                curveToRelative(0f, 6.46f, -0.61f, 13.05f, -5.02f, 17.46f)
                curveToRelative(-1.94f, 1.94f, -4.49f, 2.91f, -7.03f, 2.91f)
                curveToRelative(-2.23f, 0f, -4.46f, -0.74f, -6.28f, -2.23f)
                lineToRelative(-4.22f, 4.22f)
                lineTo(0.03f, 22.55f)
                lineToRelative(4.22f, -4.22f)
                curveToRelative(-1.46f, -1.77f, -2.25f, -3.98f, -2.25f, -6.3f)
                curveToRelative(0f, -2.66f, 1.03f, -5.16f, 2.91f, -7.03f)
                curveToRelative(2.85f, -2.86f, 6.34f, -2.9f, 9.71f, -2.95f)
                curveToRelative(0.6f, -0.01f, 1.22f, -0.02f, 1.84f, -0.04f)
                curveToRelative(1.95f, -0.08f, 4.05f, -0.29f, 6.1f, -1.3f)
                lineTo(24f, -0.0f)
                close()
                moveTo(18f, 10.43f)
                curveToRelative(0f, -1.89f, -1.46f, -3.43f, -3.25f, -3.43f)
                curveToRelative(-0.89f, 0f, -1.68f, 0.32f, -2.25f, 0.85f)
                curveToRelative(-0.57f, -0.53f, -1.36f, -0.85f, -2.25f, -0.85f)
                curveToRelative(-1.79f, 0f, -3.25f, 1.54f, -3.25f, 3.43f)
                curveToRelative(0f, 2.98f, 4.42f, 6.14f, 4.93f, 6.49f)
                lineToRelative(0.57f, 0.4f)
                lineToRelative(0.57f, -0.4f)
                curveToRelative(0.51f, -0.35f, 4.93f, -3.51f, 4.93f, -6.49f)
                close()
            }
        }.also { _LeafHeart = it}
