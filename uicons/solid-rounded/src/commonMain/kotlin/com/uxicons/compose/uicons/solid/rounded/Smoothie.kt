package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Smoothie: ImageVector? = null

val Icons.Sr.Smoothie: ImageVector
    get() = _Smoothie ?: UXIcon(name = "Smoothie") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 18f)
                curveToRelative(1.06f, 0f, 2.35f, -0.25f, 3.4f, -0.51f)
                lineToRelative(-0.13f, 1.86f)
                curveToRelative(-0.19f, 2.62f, -2.36f, 4.64f, -4.99f, 4.64f)
                horizontalLineToRelative(-4.55f)
                curveToRelative(-2.62f, 0f, -4.8f, -2.03f, -4.99f, -4.64f)
                lineToRelative(-0.11f, -1.6f)
                curveToRelative(0.76f, -0.26f, 2.44f, -0.76f, 4.44f, -0.76f)
                curveToRelative(1.36f, 0f, 2.26f, 0.23f, 3.22f, 0.47f)
                curveToRelative(1.04f, 0.26f, 2.11f, 0.53f, 3.71f, 0.53f)
                close()
                moveTo(21f, 9f)
                curveToRelative(0.0f, 0.58f, -0.49f, 1.03f, -1.07f, 1f)
                lineToRelative(-0.39f, 5.39f)
                curveToRelative(-1.0f, 0.27f, -2.46f, 0.61f, -3.55f, 0.61f)
                curveToRelative(-1.25f, 0f, -2.12f, -0.2f, -3f, -0.41f)
                verticalLineToRelative(-5.58f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5.15f)
                curveToRelative(-0.57f, -0.09f, -1.19f, -0.15f, -1.94f, -0.15f)
                curveToRelative(-1.92f, 0f, -3.57f, 0.39f, -4.59f, 0.7f)
                lineToRelative(-0.41f, -5.7f)
                curveToRelative(-0.57f, 0.03f, -1.07f, -0.42f, -1.07f, -1f)
                curveToRelative(-0.0f, -0.58f, 0.5f, -1.04f, 1.08f, -1f)
                curveToRelative(0.47f, -3.64f, 3.33f, -6.48f, 6.92f, -6.93f)
                curveToRelative(-0.04f, -0.58f, 0.42f, -1.07f, 1f, -1.07f)
                curveToRelative(0.58f, -0.0f, 1.03f, 0.49f, 1f, 1.07f)
                curveToRelative(3.61f, 0.45f, 6.48f, 3.32f, 6.93f, 6.93f)
                curveToRelative(0.58f, -0.04f, 1.07f, 0.42f, 1.07f, 1f)
                close()
                moveTo(11f, 8f)
                verticalLineToRelative(-4.91f)
                curveToRelative(-2.51f, 0.42f, -4.49f, 2.4f, -4.91f, 4.91f)
                close()
                moveTo(17.91f, 8f)
                curveToRelative(-0.42f, -2.51f, -2.4f, -4.49f, -4.91f, -4.91f)
                verticalLineToRelative(4.91f)
                close()
            }
        }.also { _Smoothie = it}
