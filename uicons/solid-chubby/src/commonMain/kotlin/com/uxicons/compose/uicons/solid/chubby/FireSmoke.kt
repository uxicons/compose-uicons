package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FireSmoke: ImageVector? = null

val Icons.Sc.FireSmoke: ImageVector
    get() = _FireSmoke ?: UXIcon(name = "FireSmoke") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.6f, 8.99f)
                curveToRelative(0.85f, 0f, 1.66f, 0.15f, 2.4f, 0.44f)
                curveToRelative(0.74f, -0.29f, 1.55f, -0.44f, 2.4f, -0.44f)
                curveToRelative(1.68f, 0f, 3.23f, 0.7f, 4.37f, 1.85f)
                curveToRelative(0.14f, -0.29f, 0.23f, -0.72f, 0.23f, -1.35f)
                curveToRelative(0f, -3.59f, -1.93f, -5.74f, -3.55f, -6.91f)
                curveToRelative(-0.93f, -0.67f, -3.03f, -1.78f, -3.77f, -1.54f)
                curveToRelative(-2.45f, 0.82f, -2.22f, 2.74f, -2.09f, 3.78f)
                curveToRelative(0.11f, 0.89f, 0.1f, 1.16f, -0.19f, 1.37f)
                curveToRelative(-0.56f, 0.42f, -1.61f, -0.81f, -1.61f, -0.82f)
                curveToRelative(-0.2f, -0.25f, -0.5f, -0.39f, -0.83f, -0.38f)
                curveToRelative(-0.32f, 0.01f, -0.61f, 0.18f, -0.79f, 0.45f)
                curveToRelative(-0.05f, 0.07f, -1.16f, 1.78f, -1.16f, 4.05f)
                curveToRelative(0f, 0.62f, 0.08f, 1.06f, 0.2f, 1.38f)
                curveToRelative(1.13f, -1.16f, 2.7f, -1.88f, 4.4f, -1.88f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.56f, 14.72f)
                curveToRelative(-0.28f, -2.1f, -2.04f, -3.73f, -4.16f, -3.73f)
                curveToRelative(-0.91f, 0f, -1.73f, 0.24f, -2.4f, 0.69f)
                curveToRelative(-0.67f, -0.45f, -1.49f, -0.69f, -2.4f, -0.69f)
                curveToRelative(-2.12f, 0f, -3.88f, 1.62f, -4.16f, 3.73f)
                curveToRelative(-1.47f, 0.7f, -2.44f, 2.22f, -2.44f, 3.94f)
                curveToRelative(0f, 2.39f, 1.88f, 4.33f, 4.2f, 4.33f)
                horizontalLineToRelative(9.6f)
                curveToRelative(2.32f, 0f, 4.2f, -1.94f, 4.2f, -4.33f)
                curveToRelative(0f, -1.71f, -0.97f, -3.24f, -2.44f, -3.94f)
                close()
            }
        }.also { _FireSmoke = it}
