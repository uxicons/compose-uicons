package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NailArt: ImageVector? = null

val Icons.Bs.NailArt: ImageVector
    get() = _NailArt ?: UXIcon(name = "NailArt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 5.48f)
                verticalLineToRelative(-0.98f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(0.98f)
                curveToRelative(-3.13f, 2.26f, -5f, 5.82f, -5f, 9.72f)
                verticalLineToRelative(8.8f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-8.8f)
                curveToRelative(0f, -2.1f, 0.73f, -4.07f, 2f, -5.64f)
                verticalLineToRelative(6.94f)
                curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(3f)
                curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
                verticalLineToRelative(-6.94f)
                curveToRelative(1.27f, 1.57f, 2f, 3.54f, 2f, 5.64f)
                verticalLineToRelative(8.8f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-8.8f)
                curveToRelative(0f, -3.9f, -1.86f, -7.46f, -5f, -9.72f)
                close()
                moveTo(16f, 16.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-12f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(13.5f, 13.5f)
                lineTo(15.5f, 14.5f)
                lineTo(13.5f, 15.5f)
                lineTo(12.5f, 17.5f)
                lineTo(11.5f, 15.5f)
                lineTo(9.5f, 14.5f)
                lineTo(11.5f, 13.5f)
                lineTo(12.5f, 11.5f)
                close()
                moveTo(10.67f, 7.33f)
                lineTo(9f, 6.5f)
                lineTo(10.67f, 5.67f)
                lineTo(11.5f, 4f)
                lineTo(12.33f, 5.67f)
                lineTo(14f, 6.5f)
                lineTo(12.33f, 7.33f)
                lineTo(11.5f, 9f)
                close()
            }
        }.also { _NailArt = it}
