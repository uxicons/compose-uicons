package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NailArt: ImageVector? = null

val Icons.Ss.NailArt: ImageVector
    get() = _NailArt ?: UXIcon(name = "NailArt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 0f)
                horizontalLineToRelative(-4f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(2f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-11f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
                moveTo(10.67f, 4.67f)
                lineTo(11.5f, 3f)
                lineTo(12.33f, 4.67f)
                lineTo(14f, 5.5f)
                lineTo(12.33f, 6.33f)
                lineTo(11.5f, 8f)
                lineTo(10.67f, 6.33f)
                lineTo(9f, 5.5f)
                close()
                moveTo(13.5f, 14.5f)
                lineTo(12.5f, 16.5f)
                lineTo(11.5f, 14.5f)
                lineTo(9.5f, 13.5f)
                lineTo(11.5f, 12.5f)
                lineTo(12.5f, 10.5f)
                lineTo(13.5f, 12.5f)
                lineTo(15.5f, 13.5f)
                close()
                moveTo(24f, 15.2f)
                verticalLineToRelative(8.8f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-8.8f)
                curveToRelative(0f, -3.4f, 1.48f, -6.54f, 4f, -8.7f)
                verticalLineToRelative(8.51f)
                curveToRelative(0f, 3.86f, 3.14f, 7f, 7f, 7f)
                horizontalLineToRelative(2f)
                curveToRelative(3.86f, 0f, 7f, -3.14f, 7f, -7f)
                verticalLineToRelative(-8.51f)
                curveToRelative(2.52f, 2.17f, 4f, 5.31f, 4f, 8.7f)
                close()
            }
        }.also { _NailArt = it}
