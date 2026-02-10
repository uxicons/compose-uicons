package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WindowFrame: ImageVector? = null

val Icons.Tc.WindowFrame: ImageVector
    get() = _WindowFrame ?: UXIcon(name = "WindowFrame") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.64f, 22.02f)
                curveToRelative(-0.06f, -0.02f, -0.64f, -0.18f, -1.68f, -0.37f)
                curveToRelative(0.2f, -0.65f, 1.06f, -4.77f, 1.04f, -9.89f)
                curveToRelative(0f, -6.17f, -1.05f, -9.27f, -1.09f, -9.4f)
                curveToRelative(-0.05f, -0.15f, -0.17f, -0.26f, -0.32f, -0.31f)
                curveToRelative(-0.13f, -0.04f, -3.29f, -1.05f, -7.59f, -1.05f)
                reflectiveCurveToRelative(-7.46f, 1.01f, -7.59f, 1.05f)
                curveToRelative(-0.15f, 0.05f, -0.27f, 0.16f, -0.32f, 0.31f)
                curveToRelative(-0.04f, 0.13f, -1.09f, 3.23f, -1.09f, 9.4f)
                curveToRelative(-0.02f, 5.13f, 0.84f, 9.23f, 1.04f, 9.89f)
                curveToRelative(-1.04f, 0.19f, -1.62f, 0.35f, -1.68f, 0.37f)
                curveToRelative(-0.27f, 0.07f, -0.42f, 0.35f, -0.34f, 0.62f)
                curveToRelative(0.08f, 0.27f, 0.35f, 0.42f, 0.62f, 0.34f)
                curveToRelative(0.03f, -0.01f, 3.52f, -0.98f, 9.36f, -0.98f)
                reflectiveCurveToRelative(9.33f, 0.97f, 9.36f, 0.98f)
                curveToRelative(0.26f, 0.08f, 0.54f, -0.08f, 0.62f, -0.34f)
                curveToRelative(0.08f, -0.27f, -0.08f, -0.54f, -0.34f, -0.62f)
                close()
                moveTo(12.5f, 21.0f)
                verticalLineToRelative(-8.51f)
                horizontalLineToRelative(7.49f)
                curveToRelative(-0.07f, 5.16f, -0.89f, 8.49f, -1.02f, 8.99f)
                curveToRelative(-1.54f, -0.23f, -3.73f, -0.46f, -6.47f, -0.48f)
                close()
                moveTo(20.0f, 11.5f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(-9.49f)
                curveToRelative(3.22f, 0.06f, 5.76f, 0.7f, 6.53f, 0.92f)
                curveToRelative(0.23f, 0.81f, 0.94f, 3.7f, 0.96f, 8.57f)
                close()
                moveTo(4.97f, 2.93f)
                curveToRelative(0.77f, -0.22f, 3.3f, -0.85f, 6.53f, -0.92f)
                verticalLineToRelative(9.49f)
                horizontalLineToRelative(-7.5f)
                curveToRelative(0.03f, -4.87f, 0.73f, -7.76f, 0.96f, -8.57f)
                close()
                moveTo(4.01f, 12.5f)
                horizontalLineToRelative(7.49f)
                verticalLineToRelative(8.51f)
                curveToRelative(-2.74f, 0.03f, -4.92f, 0.25f, -6.47f, 0.48f)
                curveToRelative(-0.13f, -0.49f, -0.95f, -3.83f, -1.02f, -8.99f)
                close()
            }
        }.also { _WindowFrame = it}
