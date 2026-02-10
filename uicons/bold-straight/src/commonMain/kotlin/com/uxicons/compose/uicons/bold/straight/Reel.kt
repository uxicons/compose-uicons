package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Reel: ImageVector? = null

val Icons.Bs.Reel: ImageVector
    get() = _Reel ?: UXIcon(name = "Reel") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 3f)
                lineTo(24f, 0f)
                lineTo(0f, 0f)
                lineTo(0f, 3f)
                lineTo(4f, 3f)
                lineTo(4f, 21f)
                lineTo(0f, 21f)
                verticalLineToRelative(3f)
                lineTo(24f, 24f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(1f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                horizontalLineToRelative(-4f)
                lineTo(20f, 3f)
                horizontalLineToRelative(4f)
                close()
                moveTo(7f, 21f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                lineTo(7f, 21f)
                close()
                moveTo(17f, 16f)
                lineTo(7f, 16f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2.5f)
                close()
                moveTo(7f, 10.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2.5f)
                lineTo(7f, 10.5f)
                close()
                moveTo(17f, 5f)
                lineTo(7f, 5f)
                lineTo(7f, 3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _Reel = it}
