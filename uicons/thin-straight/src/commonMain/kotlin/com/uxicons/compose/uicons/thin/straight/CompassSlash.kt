package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CompassSlash: ImageVector? = null

val Icons.Ts.CompassSlash: ImageVector
    get() = _CompassSlash ?: UXIcon(name = "CompassSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 12f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                curveToRelative(-3.03f, 0f, -5.9f, 1.13f, -8.12f, 3.18f)
                lineTo(0.75f, 0.05f)
                lineTo(0.05f, 0.75f)
                lineToRelative(23.2f, 23.2f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-3.13f, -3.13f)
                curveToRelative(2.04f, -2.22f, 3.18f, -5.09f, 3.18f, -8.12f)
                close()
                moveTo(12f, 1f)
                curveToRelative(6.07f, 0f, 11f, 4.93f, 11f, 11f)
                curveToRelative(0f, 2.76f, -1.03f, 5.38f, -2.88f, 7.41f)
                lineToRelative(-5.35f, -5.35f)
                lineToRelative(4.3f, -9.15f)
                lineToRelative(-8.97f, 4.48f)
                lineTo(4.59f, 3.88f)
                curveToRelative(2.03f, -1.86f, 4.64f, -2.88f, 7.41f, -2.88f)
                close()
                moveTo(10.84f, 10.14f)
                lineToRelative(6.09f, -3.04f)
                lineToRelative(-2.92f, 6.21f)
                lineToRelative(-3.17f, -3.17f)
                close()
                moveTo(17.8f, 21.34f)
                lineToRelative(0.73f, 0.73f)
                curveToRelative(-1.93f, 1.25f, -4.17f, 1.94f, -6.53f, 1.94f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                curveToRelative(0f, -2.36f, 0.68f, -4.6f, 1.94f, -6.53f)
                lineToRelative(0.73f, 0.73f)
                curveToRelative(-1.08f, 1.72f, -1.66f, 3.71f, -1.66f, 5.8f)
                curveToRelative(0f, 6.07f, 4.93f, 11f, 11f, 11f)
                curveToRelative(2.09f, 0f, 4.08f, -0.59f, 5.8f, -1.66f)
                close()
                moveTo(9.19f, 12.73f)
                lineToRelative(-2.13f, 4.26f)
                lineToRelative(4.44f, -1.94f)
                lineToRelative(0.76f, 0.76f)
                lineToRelative(-7.33f, 3.21f)
                lineToRelative(3.51f, -7.03f)
                lineToRelative(0.74f, 0.74f)
                close()
            }
        }.also { _CompassSlash = it}
