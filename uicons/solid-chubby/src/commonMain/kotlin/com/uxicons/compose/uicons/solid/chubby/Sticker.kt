package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sticker: ImageVector? = null

val Icons.Sc.Sticker: ImageVector
    get() = _Sticker ?: UXIcon(name = "Sticker") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.87f, 10.82f)
                curveToRelative(0.74f, 0.0f, 1.45f, 0.04f, 2.13f, 0.12f)
                curveToRelative(-0.55f, -6.26f, -4.41f, -9.71f, -10.96f, -9.76f)
                horizontalLineToRelative(-0.01f)
                curveTo(4.94f, 1.23f, 1.13f, 5.03f, 1f, 12.23f)
                curveToRelative(0.11f, 5.86f, 2.57f, 9.42f, 7.32f, 10.59f)
                curveToRelative(0.34f, -7.93f, 4.56f, -11.95f, 12.55f, -12f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.87f, 12.83f)
                curveToRelative(-6.81f, 0.04f, -10.18f, 3.16f, -10.54f, 9.8f)
                curveToRelative(1.22f, -0.57f, 3.89f, -1.92f, 6.52f, -3.99f)
                curveToRelative(2.84f, -2.24f, 4.92f, -4.75f, 5.68f, -5.73f)
                curveToRelative(-0.53f, -0.05f, -1.09f, -0.08f, -1.67f, -0.08f)
                close()
            }
        }.also { _Sticker = it}
