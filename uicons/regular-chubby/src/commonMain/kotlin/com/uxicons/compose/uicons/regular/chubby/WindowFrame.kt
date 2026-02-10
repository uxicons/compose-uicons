package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WindowFrame: ImageVector? = null

val Icons.Rc.WindowFrame: ImageVector
    get() = _WindowFrame ?: UXIcon(name = "WindowFrame") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.29f, 21.04f)
                curveToRelative(-0.04f, -0.01f, -0.46f, -0.13f, -1.24f, -0.28f)
                curveToRelative(0.32f, -1.16f, 0.95f, -4.07f, 0.95f, -8.76f)
                curveToRelative(0f, -6.1f, -1.08f, -9.21f, -1.12f, -9.34f)
                curveToRelative(-0.1f, -0.28f, -0.32f, -0.5f, -0.59f, -0.6f)
                curveToRelative(-0.12f, -0.04f, -2.89f, -1.06f, -7.29f, -1.06f)
                reflectiveCurveToRelative(-7.17f, 1.02f, -7.28f, 1.06f)
                curveToRelative(-0.28f, 0.1f, -0.49f, 0.32f, -0.59f, 0.6f)
                curveToRelative(-0.05f, 0.13f, -1.12f, 3.23f, -1.12f, 9.34f)
                curveToRelative(0f, 4.69f, 0.64f, 7.6f, 0.95f, 8.76f)
                curveToRelative(-0.78f, 0.15f, -1.19f, 0.27f, -1.24f, 0.28f)
                curveToRelative(-0.53f, 0.16f, -0.83f, 0.71f, -0.67f, 1.24f)
                curveToRelative(0.16f, 0.53f, 0.71f, 0.83f, 1.24f, 0.67f)
                curveToRelative(0.03f, -0.01f, 2.97f, -0.86f, 8.71f, -0.86f)
                curveToRelative(6.14f, 0.01f, 8.46f, 0.87f, 9f, 0.9f)
                curveToRelative(0.43f, 0f, 0.83f, -0.28f, 0.96f, -0.71f)
                curveToRelative(0.16f, -0.53f, -0.14f, -1.09f, -0.67f, -1.25f)
                close()
                moveTo(13f, 20.11f)
                verticalLineToRelative(-7.11f)
                horizontalLineToRelative(5.99f)
                curveToRelative(-0.09f, 4.24f, -0.72f, 6.74f, -0.93f, 7.45f)
                curveToRelative(-1.3f, -0.16f, -2.98f, -0.3f, -5.06f, -0.34f)
                close()
                moveTo(18.98f, 11f)
                horizontalLineToRelative(-5.98f)
                verticalLineToRelative(-7.98f)
                curveToRelative(2.51f, 0.1f, 4.32f, 0.54f, 5.12f, 0.77f)
                curveToRelative(0.25f, 0.95f, 0.78f, 3.38f, 0.86f, 7.21f)
                close()
                moveTo(11f, 3.02f)
                verticalLineToRelative(7.98f)
                horizontalLineToRelative(-5.98f)
                curveToRelative(0.08f, -3.83f, 0.61f, -6.26f, 0.86f, -7.21f)
                curveToRelative(0.8f, -0.23f, 2.62f, -0.67f, 5.12f, -0.77f)
                close()
                moveTo(5.01f, 13f)
                horizontalLineToRelative(5.99f)
                verticalLineToRelative(7.11f)
                curveToRelative(-2.08f, 0.04f, -3.76f, 0.17f, -5.06f, 0.34f)
                curveToRelative(-0.21f, -0.71f, -0.84f, -3.21f, -0.93f, -7.45f)
                close()
            }
        }.also { _WindowFrame = it}
