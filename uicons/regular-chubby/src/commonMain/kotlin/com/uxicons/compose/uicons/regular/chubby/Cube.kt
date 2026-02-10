package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cube: ImageVector? = null

val Icons.Rc.Cube: ImageVector
    get() = _Cube ?: UXIcon(name = "Cube") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.66f, 6.9f)
                curveToRelative(-0.04f, -0.26f, -0.19f, -0.49f, -0.4f, -0.64f)
                curveToRelative(-3.05f, -2.19f, -5.82f, -3.4f, -9.67f, -5.08f)
                lineToRelative(-0.19f, -0.09f)
                curveToRelative(-0.26f, -0.11f, -0.55f, -0.11f, -0.8f, 0f)
                lineToRelative(-0.2f, 0.09f)
                curveTo(7.56f, 2.86f, 4.78f, 4.08f, 1.74f, 6.26f)
                curveToRelative(-0.23f, 0.17f, -0.38f, 0.42f, -0.41f, 0.7f)
                curveToRelative(-0.05f, 0.34f, -0.33f, 2.34f, -0.33f, 6.13f)
                curveToRelative(0f, 3.81f, 0.31f, 4.96f, 0.37f, 5.16f)
                curveToRelative(0.07f, 0.21f, 0.21f, 0.4f, 0.39f, 0.53f)
                curveToRelative(3.28f, 2.21f, 7.25f, 3.87f, 10.12f, 4.21f)
                curveToRelative(0.0f, 0f, 0.07f, 0.01f, 0.12f, 0.01f)
                curveToRelative(0.03f, 0f, 0.11f, -0.01f, 0.12f, -0.01f)
                curveToRelative(2.87f, -0.34f, 6.84f, -1.99f, 10.12f, -4.21f)
                curveToRelative(0.19f, -0.13f, 0.33f, -0.31f, 0.39f, -0.53f)
                curveToRelative(0.06f, -0.19f, 0.37f, -1.35f, 0.37f, -5.16f)
                curveToRelative(0f, -4.08f, -0.34f, -6.18f, -0.34f, -6.19f)
                close()
                moveTo(12f, 3.1f)
                curveToRelative(3.11f, 1.36f, 5.5f, 2.42f, 7.9f, 3.97f)
                curveToRelative(-2.4f, 1.55f, -4.79f, 2.61f, -7.9f, 3.97f)
                curveToRelative(-3.11f, -1.36f, -5.5f, -2.42f, -7.91f, -3.97f)
                curveToRelative(2.4f, -1.55f, 4.79f, -2.61f, 7.91f, -3.97f)
                close()
                moveTo(3.22f, 17.34f)
                curveToRelative(-0.08f, -0.52f, -0.22f, -1.76f, -0.22f, -4.25f)
                curveToRelative(0f, -1.86f, 0.07f, -3.27f, 0.14f, -4.25f)
                curveToRelative(2.42f, 1.55f, 4.81f, 2.62f, 7.86f, 3.95f)
                verticalLineToRelative(8.01f)
                curveToRelative(-2.33f, -0.52f, -5.28f, -1.83f, -7.78f, -3.46f)
                close()
                moveTo(20.78f, 17.34f)
                curveToRelative(-2.51f, 1.64f, -5.46f, 2.94f, -7.78f, 3.46f)
                lineTo(13.0f, 12.79f)
                curveToRelative(3.05f, -1.33f, 5.43f, -2.4f, 7.86f, -3.95f)
                curveToRelative(0.07f, 0.97f, 0.14f, 2.39f, 0.14f, 4.25f)
                curveToRelative(0f, 2.5f, -0.14f, 3.74f, -0.22f, 4.25f)
                close()
            }
        }.also { _Cube = it}
