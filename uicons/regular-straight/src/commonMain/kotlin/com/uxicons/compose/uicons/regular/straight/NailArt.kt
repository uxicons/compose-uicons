package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NailArt: ImageVector? = null

val Icons.Rs.NailArt: ImageVector
    get() = _NailArt ?: UXIcon(name = "NailArt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 5.73f)
                verticalLineToRelative(-1.73f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                horizontalLineToRelative(-6f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(1.73f)
                curveToRelative(-3.13f, 2.15f, -5f, 5.64f, -5f, 9.46f)
                verticalLineToRelative(8.8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-8.8f)
                curveToRelative(0f, -2.66f, 1.1f, -5.13f, 3f, -6.91f)
                verticalLineToRelative(8.71f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(4f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-8.71f)
                curveToRelative(1.9f, 1.78f, 3f, 4.24f, 3f, 6.91f)
                verticalLineToRelative(8.8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-8.8f)
                curveToRelative(0f, -3.82f, -1.87f, -7.31f, -5f, -9.46f)
                close()
                moveTo(17f, 17f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-13f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(6f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
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
