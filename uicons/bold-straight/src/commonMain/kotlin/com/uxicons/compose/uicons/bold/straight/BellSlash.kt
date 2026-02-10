package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BellSlash: ImageVector? = null

val Icons.Bs.BellSlash: ImageVector
    get() = _BellSlash ?: UXIcon(name = "BellSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.01f, 16.98f)
                lineToRelative(4.41f, 4.41f)
                curveToRelative(-0.94f, 1.51f, -2.56f, 2.6f, -4.43f, 2.6f)
                curveToRelative(-2.41f, 0f, -4.43f, -1.82f, -5.08f, -4.02f)
                lineTo(2.77f, 19.98f)
                curveToRelative(-0.76f, 0f, -1.47f, -0.34f, -1.95f, -0.94f)
                curveToRelative(-0.48f, -0.59f, -0.66f, -1.36f, -0.49f, -2.11f)
                lineTo(2.48f, 7.46f)
                lineToRelative(2.51f, 2.51f)
                lineToRelative(-1.59f, 7.02f)
                horizontalLineToRelative(8.61f)
                close()
                moveTo(21.84f, 23.96f)
                lineTo(0.04f, 2.16f)
                lineTo(2.16f, 0.04f)
                lineToRelative(2.8f, 2.8f)
                curveToRelative(1.72f, -1.77f, 4.12f, -2.84f, 6.76f, -2.84f)
                curveToRelative(4.23f, 0f, 7.97f, 2.84f, 9.1f, 6.92f)
                lineToRelative(2.81f, 9.9f)
                curveToRelative(0.21f, 0.76f, 0.06f, 1.55f, -0.42f, 2.18f)
                curveToRelative(-0.32f, 0.42f, -0.74f, 0.71f, -1.22f, 0.87f)
                lineToRelative(1.98f, 1.98f)
                lineToRelative(-2.12f, 2.12f)
                close()
                moveTo(19.1f, 16.98f)
                horizontalLineToRelative(1.45f)
                lineToRelative(-2.63f, -9.26f)
                curveToRelative(-0.77f, -2.78f, -3.33f, -4.72f, -6.21f, -4.72f)
                curveToRelative(-1.81f, 0f, -3.46f, 0.74f, -4.63f, 1.97f)
                lineToRelative(12.01f, 12.01f)
                close()
            }
        }.also { _BellSlash = it}
