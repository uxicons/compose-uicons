package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hammer: ImageVector? = null

val Icons.Br.Hammer: ImageVector
    get() = _Hammer ?: UXIcon(name = "Hammer") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.82f, 8.7f)
            lineToRelative(-4.84f, -5.2f)
            curveTo(13.65f, -0.74f, 9.25f, -0.22f, 7.02f, 0.47f)
            curveToRelative(-0.98f, 0.3f, -1.7f, 1.08f, -1.94f, 2.07f)
            curveToRelative(-0.23f, 0.98f, 0.06f, 1.98f, 0.77f, 2.68f)
            lineToRelative(4.98f, 5.12f)
            lineTo(0.57f, 20.6f)
            curveToRelative(-0.77f, 0.79f, -0.76f, 2.06f, 0.03f, 2.83f)
            curveToRelative(0.79f, 0.77f, 2.06f, 0.76f, 2.83f, -0.03f)
            lineTo(13.62f, 13.22f)
            lineToRelative(2.27f, 2.34f)
            curveToRelative(0.79f, 0.79f, 1.84f, 1.23f, 2.96f, 1.23f)
            horizontalLineToRelative(0.03f)
            curveToRelative(1.13f, -0.01f, 2.18f, -0.45f, 2.97f, -1.26f)
            lineToRelative(0.95f, -0.98f)
            curveToRelative(1.59f, -1.62f, 1.58f, -4.26f, 0.02f, -5.84f)
            close()
            moveTo(15.84f, 5.59f)
            lineToRelative(1.49f, 1.6f)
            lineToRelative(-2.72f, 2.74f)
            lineTo(8.13f, 3.27f)
            curveToRelative(1.95f, -0.53f, 4.8f, -0.51f, 7.7f, 2.32f)
            close()
            moveTo(20.66f, 12.45f)
            lineToRelative(-0.95f, 0.98f)
            curveToRelative(-0.22f, 0.23f, -0.52f, 0.36f, -0.84f, 0.36f)
            horizontalLineToRelative(-0.01f)
            curveToRelative(-0.32f, 0f, -0.62f, -0.12f, -0.83f, -0.33f)
            lineToRelative(-1.33f, -1.36f)
            lineToRelative(2.67f, -2.69f)
            lineToRelative(1.28f, 1.38f)
            curveToRelative(0.45f, 0.46f, 0.46f, 1.21f, 0.0f, 1.67f)
            close()
        }
    }.also { _Hammer = it }
