package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Rose: ImageVector? = null

val Icons.Ss.Rose: ImageVector
    get() = _Rose ?: UXIcon(name = "Rose") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24.0f, 13.96f)
                lineToRelative(-0.13f, 1.12f)
                curveToRelative(-0.79f, 7.02f, -7.37f, 8.88f, -10.73f, 8.88f)
                horizontalLineToRelative(-2.28f)
                curveTo(7.49f, 23.96f, 0.92f, 22.1f, 0.13f, 15.08f)
                lineToRelative(-0.13f, -1.12f)
                lineTo(1.02f, 13.96f)
                curveToRelative(6.0f, 0f, 8.8f, 4.08f, 9.97f, 6.67f)
                verticalLineToRelative(-5.72f)
                curveToRelative(-2.83f, -0.48f, -5.0f, -2.94f, -5.0f, -5.91f)
                curveToRelative(0f, -2.18f, -0.47f, -4.1f, -0.74f, -5.04f)
                curveToRelative(0.23f, 0.01f, 1.84f, 0.13f, 3.86f, 0.96f)
                curveToRelative(2.13f, 0.88f, 4.68f, 4.0f, 5.19f, 8.1f)
                curveToRelative(0.0f, 0.01f, 0.09f, 0.6f, 0.2f, 1.42f)
                curveToRelative(-0.47f, 0.22f, -0.98f, 0.37f, -1.51f, 0.46f)
                verticalLineToRelative(5.72f)
                curveToRelative(1.17f, -2.6f, 3.97f, -6.67f, 9.97f, -6.67f)
                horizontalLineToRelative(1.02f)
                close()
                moveTo(9.88f, 3.08f)
                curveToRelative(0.7f, 0.29f, 1.42f, 0.74f, 2.11f, 1.34f)
                curveToRelative(0.69f, -0.59f, 1.41f, -1.04f, 2.13f, -1.34f)
                curveToRelative(1.0f, -0.41f, 1.81f, -0.66f, 2.43f, -0.82f)
                curveToRelative(0.12f, -1.58f, 0.45f, -2.26f, 0.45f, -2.26f)
                curveToRelative(0f, 0f, -2.5f, 0f, -5f, 1.5f)
                curveTo(9.5f, 0f, 7f, 0f, 7f, 0f)
                curveToRelative(0f, 0f, 0.32f, 0.68f, 0.45f, 2.26f)
                curveToRelative(0.62f, 0.16f, 1.43f, 0.41f, 2.43f, 0.82f)
                close()
                moveTo(13.39f, 5.86f)
                curveToRelative(1.42f, 1.75f, 2.56f, 4.13f, 2.9f, 6.89f)
                curveToRelative(0.0f, 0.02f, 0.02f, 0.15f, 0.06f, 0.37f)
                curveToRelative(1.02f, -1.08f, 1.65f, -2.53f, 1.65f, -4.12f)
                curveToRelative(0f, -2.23f, 0.49f, -4.19f, 0.76f, -5.11f)
                curveToRelative(-0.2f, 0.03f, -1.86f, 0.2f, -3.88f, 1.03f)
                curveToRelative(-0.49f, 0.2f, -1.0f, 0.52f, -1.49f, 0.93f)
                close()
            }
        }.also { _Rose = it}
