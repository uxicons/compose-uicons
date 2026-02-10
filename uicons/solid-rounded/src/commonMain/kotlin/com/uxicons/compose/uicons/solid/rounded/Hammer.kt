package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hammer: ImageVector? = null

val Icons.Sr.Hammer: ImageVector
    get() = _Hammer ?: UXIcon(name = "Hammer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.51f, 13.79f)
                lineTo(5.13f, 23.12f)
                curveToRelative(-0.63f, 0.64f, -1.48f, 0.93f, -2.31f, 0.88f)
                curveToRelative(-0.7f, -0.04f, -1.39f, -0.33f, -1.93f, -0.86f)
                curveToRelative(-1.18f, -1.16f, -1.19f, -3.07f, -0.03f, -4.24f)
                lineTo(10.27f, 9.53f)
                lineToRelative(4.23f, 4.25f)
                close()
                moveTo(20.98f, 7.6f)
                lineToRelative(-4.96f, -5.01f)
                curveTo(12.85f, -0.54f, 9.63f, -0.17f, 7.99f, 0.33f)
                curveToRelative(-0.69f, 0.21f, -1.2f, 0.75f, -1.37f, 1.45f)
                curveToRelative(-0.17f, 0.69f, 0.04f, 1.4f, 0.54f, 1.89f)
                lineToRelative(8.87f, 8.91f)
                lineToRelative(4.94f, -4.99f)
                close()
                moveTo(23.15f, 9.79f)
                lineToRelative(-0.76f, -0.77f)
                lineToRelative(-4.94f, 4.99f)
                lineToRelative(0.72f, 0.72f)
                curveToRelative(0.52f, 0.53f, 1.12f, 0.83f, 2.13f, 0.89f)
                curveToRelative(0.81f, 0.04f, 1.56f, -0.32f, 2.13f, -0.89f)
                lineToRelative(0.71f, -0.72f)
                curveToRelative(1.14f, -1.16f, 1.15f, -3.04f, 0.01f, -4.21f)
                close()
            }
        }.also { _Hammer = it}
