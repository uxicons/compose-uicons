package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Banana: ImageVector? = null

val Icons.Ss.Banana: ImageVector
    get() = _Banana ?: UXIcon(name = "Banana") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.38f, 10.12f)
                curveToRelative(2.37f, 0.56f, 4.33f, -1.34f, 4.33f, -1.34f)
                curveTo(19.42f, 2.82f, 18.08f, 0.01f, 15.57f, 0.01f)
                horizontalLineToRelative(-0.01f)
                curveTo(12.97f, 0.01f, 11.72f, 2.81f, 11.04f, 6.17f)
                curveToRelative(-0.01f, 0.07f, 1.12f, 3.19f, 4.34f, 3.95f)
                close()
                moveTo(24f, 15.57f)
                curveToRelative(-0.81f, -2.06f, -2.38f, -3.59f, -4.26f, -4.42f)
                curveToRelative(0f, 0f, -1.59f, 1.46f, -4.74f, 0.93f)
                curveToRelative(-3.53f, -0.6f, -4.6f, -3.79f, -4.74f, -3.83f)
                curveToRelative(-0.21f, -0.05f, -0.44f, -0.1f, -0.69f, -0.14f)
                curveToRelative(-2.12f, -0.36f, -4.27f, 0.13f, -6.04f, 1.38f)
                lineToRelative(0.47f, 1.5f)
                curveToRelative(3.08f, -0.71f, 4.64f, -0.28f, 5.99f, 1.15f)
                curveToRelative(-0.21f, 0.59f, -0.51f, 1.26f, -0.93f, 1.95f)
                curveToRelative(-0.01f, -0.01f, -0.01f, -0.01f, -0.01f, -0.01f)
                curveToRelative(-0.77f, 1.27f, -1.95f, 2.58f, -3.78f, 3.5f)
                curveToRelative(-2.89f, 1.25f, -4.09f, 3.26f, -4.14f, 3.35f)
                lineToRelative(-0.01f, 0.03f)
                lineTo(0f, 20.95f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.07f)
                lineToRelative(0.22f, 0.22f)
                curveToRelative(0.3f, 0.3f, 1.17f, 0.82f, 3.71f, 0.82f)
                curveToRelative(0f, 0f, 0.0f, 0f, 0.0f, 0f)
                curveToRelative(4.73f, 0f, 7.92f, -1.36f, 10.09f, -3.13f)
                curveToRelative(-0.27f, -4.0f, -1.69f, -4.39f, -2.74f, -4.67f)
                lineToRelative(-0.42f, -0.11f)
                lineToRelative(0.94f, -1.83f)
                curveToRelative(2.11f, 0.56f, 4.01f, 1.87f, 4.25f, 6.84f)
                lineToRelative(1.39f, 0.39f)
                curveToRelative(1.07f, -2.17f, 1.43f, -4.54f, 0.86f, -6.59f)
                curveToRelative(1.07f, 0.18f, 2.2f, 0.6f, 3.42f, 1.44f)
                lineToRelative(1.22f, -0.78f)
                close()
            }
        }.also { _Banana = it}
