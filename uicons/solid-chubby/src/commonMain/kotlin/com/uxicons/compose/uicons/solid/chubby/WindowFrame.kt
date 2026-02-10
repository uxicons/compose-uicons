package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WindowFrame: ImageVector? = null

val Icons.Sc.WindowFrame: ImageVector
    get() = _WindowFrame ?: UXIcon(name = "WindowFrame") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.99f, 11f)
                horizontalLineToRelative(-7.99f)
                verticalLineToRelative(-9.98f)
                curveToRelative(3.81f, 0.14f, 6.18f, 1.0f, 6.29f, 1.04f)
                curveToRelative(0.28f, 0.1f, 0.49f, 0.32f, 0.59f, 0.6f)
                curveToRelative(0.04f, 0.12f, 1.0f, 2.9f, 1.11f, 8.34f)
                close()
                moveTo(11f, 1.02f)
                curveToRelative(-3.81f, 0.14f, -6.18f, 1.0f, -6.28f, 1.04f)
                curveToRelative(-0.28f, 0.1f, -0.49f, 0.32f, -0.59f, 0.6f)
                curveToRelative(-0.04f, 0.12f, -1.0f, 2.9f, -1.11f, 8.34f)
                horizontalLineToRelative(7.99f)
                close()
                moveTo(20.98f, 20.08f)
                curveToRelative(-0.03f, -0.01f, -0.28f, -0.09f, -0.71f, -0.2f)
                curveToRelative(0.29f, -1.35f, 0.66f, -3.64f, 0.73f, -6.88f)
                horizontalLineToRelative(-7.99f)
                verticalLineToRelative(6.07f)
                curveToRelative(-0.32f, -0.01f, -0.66f, -0.01f, -1f, -0.01f)
                reflectiveCurveToRelative(-0.68f, 0.0f, -1f, 0.01f)
                verticalLineToRelative(-6.07f)
                horizontalLineToRelative(-7.99f)
                curveToRelative(0.07f, 3.24f, 0.43f, 5.53f, 0.73f, 6.88f)
                curveToRelative(-0.44f, 0.11f, -0.68f, 0.18f, -0.71f, 0.2f)
                curveToRelative(-0.78f, 0.26f, -1.21f, 1.11f, -0.95f, 1.89f)
                curveToRelative(0.26f, 0.79f, 1.11f, 1.21f, 1.89f, 0.96f)
                curveToRelative(0.03f, -0.01f, 2.74f, -0.87f, 8.03f, -0.87f)
                curveToRelative(5.99f, 0.03f, 7.54f, 0.86f, 8.5f, 0.94f)
                curveToRelative(0.63f, 0f, 1.21f, -0.4f, 1.42f, -1.02f)
                curveToRelative(0.26f, -0.79f, -0.16f, -1.64f, -0.95f, -1.9f)
                close()
            }
        }.also { _WindowFrame = it}
