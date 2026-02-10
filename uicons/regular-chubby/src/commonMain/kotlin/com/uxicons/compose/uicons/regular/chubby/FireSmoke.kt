package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FireSmoke: ImageVector? = null

val Icons.Rc.FireSmoke: ImageVector
    get() = _FireSmoke ?: UXIcon(name = "FireSmoke") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.99f, 10f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -0.58f, 0.1f, -1.05f, 0.23f, -1.41f)
                curveToRelative(1.02f, 0.74f, 2.29f, 1.02f, 3.38f, 0.2f)
                curveToRelative(1.25f, -0.94f, 1.08f, -2.31f, 0.98f, -3.21f)
                curveToRelative(-0.12f, -0.99f, -0.13f, -1.29f, 0.5f, -1.55f)
                curveToRelative(1.01f, 0.23f, 4.92f, 1.44f, 4.92f, 5.96f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -2.69f, -1.1f, -4.9f, -3.19f, -6.4f)
                curveToRelative(-1.43f, -1.03f, -3.53f, -1.74f, -4.13f, -1.55f)
                curveToRelative(-2.45f, 0.82f, -2.22f, 2.74f, -2.09f, 3.78f)
                curveToRelative(0.11f, 0.89f, 0.1f, 1.16f, -0.19f, 1.37f)
                curveToRelative(-0.56f, 0.42f, -1.61f, -0.81f, -1.61f, -0.82f)
                curveToRelative(-0.18f, -0.22f, -0.44f, -0.36f, -0.73f, -0.38f)
                curveToRelative(-0.28f, -0.01f, -0.56f, 0.09f, -0.77f, 0.29f)
                curveToRelative(-0.13f, 0.13f, -1.29f, 1.36f, -1.29f, 3.71f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.56f, 14.73f)
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
                moveTo(16.8f, 21f)
                horizontalLineToRelative(-9.6f)
                curveToRelative(-1.21f, 0f, -2.2f, -1.05f, -2.2f, -2.33f)
                curveToRelative(0f, -1.07f, 0.68f, -2.0f, 1.66f, -2.26f)
                curveToRelative(0.45f, -0.12f, 0.75f, -0.61f, 0.74f, -1.07f)
                curveToRelative(0f, -1.29f, 0.99f, -2.33f, 2.2f, -2.33f)
                curveToRelative(0.49f, 0f, 1.18f, 0.11f, 1.64f, 0.66f)
                curveToRelative(0.38f, 0.45f, 1.15f, 0.45f, 1.53f, 0f)
                curveToRelative(0.46f, -0.54f, 1.14f, -0.66f, 1.64f, -0.66f)
                curveToRelative(1.21f, 0f, 2.2f, 1.05f, 2.2f, 2.33f)
                verticalLineToRelative(0.08f)
                curveToRelative(-0.01f, 0.46f, 0.29f, 0.88f, 0.74f, 0.99f)
                curveToRelative(0.98f, 0.26f, 1.66f, 1.19f, 1.66f, 2.26f)
                curveToRelative(0f, 1.29f, -0.99f, 2.33f, -2.2f, 2.33f)
                close()
            }
        }.also { _FireSmoke = it}
