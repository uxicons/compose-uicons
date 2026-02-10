package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Spoon: ImageVector? = null

val Icons.Tc.Spoon: ImageVector
    get() = _Spoon ?: UXIcon(name = "Spoon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.35f, 2.57f)
                curveTo(19.1f, 0.38f, 12.75f, 0.09f, 8.56f, 4.18f)
                curveToRelative(-2.89f, 3.05f, -2.73f, 6.71f, 0.41f, 10.1f)
                lineTo(1.15f, 22.15f)
                curveToRelative(-0.2f, 0.2f, -0.19f, 0.51f, 0.0f, 0.71f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                curveToRelative(0.13f, 0f, 0.26f, -0.05f, 0.35f, -0.15f)
                lineToRelative(7.82f, -7.86f)
                curveToRelative(1.77f, 1.66f, 3.61f, 2.49f, 5.4f, 2.49f)
                curveToRelative(1.63f, 0f, 3.21f, -0.69f, 4.66f, -2.08f)
                curveToRelative(0.01f, -0.01f, 0.01f, -0.01f, 0.01f, -0.01f)
                curveToRelative(4.3f, -4.45f, 3.81f, -10.66f, 1.6f, -12.82f)
                close()
                moveTo(19.04f, 14.69f)
                curveToRelative(-2.73f, 2.61f, -5.93f, 2.35f, -9.0f, -0.74f)
                curveToRelative(-3.09f, -3.1f, -3.36f, -6.33f, -0.76f, -9.06f)
                curveToRelative(2.1f, -2.06f, 4.86f, -2.9f, 7.21f, -2.9f)
                curveToRelative(1.79f, 0f, 3.34f, 0.49f, 4.17f, 1.3f)
                curveToRelative(1.71f, 1.67f, 2.39f, 7.26f, -1.61f, 11.4f)
                close()
            }
        }.also { _Spoon = it}
