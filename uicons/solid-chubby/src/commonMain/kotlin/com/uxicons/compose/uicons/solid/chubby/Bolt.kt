package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bolt: ImageVector? = null

val Icons.Sc.Bolt: ImageVector
    get() = _Bolt ?: UXIcon(name = "Bolt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.93f, 8.98f)
                curveToRelative(-0.19f, -0.25f, -0.49f, -0.4f, -0.8f, -0.4f)
                horizontalLineToRelative(-4.17f)
                lineToRelative(1.1f, -4.92f)
                curveToRelative(0.08f, -0.37f, -0.05f, -0.76f, -0.34f, -0.99f)
                curveToRelative(-0.08f, -0.07f, -2.07f, -1.67f, -4.46f, -1.67f)
                curveToRelative(-2.44f, 0f, -4.42f, 1.6f, -4.5f, 1.67f)
                curveToRelative(-0.17f, 0.14f, -0.28f, 0.32f, -0.34f, 0.53f)
                lineTo(3.9f, 13.38f)
                curveToRelative(-0.07f, 0.3f, -0.01f, 0.61f, 0.18f, 0.86f)
                curveToRelative(0.19f, 0.24f, 0.48f, 0.38f, 0.79f, 0.38f)
                horizontalLineToRelative(4.02f)
                lineToRelative(-0.86f, 7.26f)
                curveToRelative(-0.04f, 0.33f, 0.09f, 0.67f, 0.35f, 0.88f)
                curveToRelative(0.4f, 0.33f, 0.84f, 0.22f, 0.93f, 0.19f)
                curveToRelative(7.48f, -2.23f, 10.65f, -12.65f, 10.79f, -13.1f)
                curveToRelative(0.09f, -0.3f, 0.03f, -0.63f, -0.16f, -0.88f)
                close()
            }
        }.also { _Bolt = it}
