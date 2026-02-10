package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Reel: ImageVector? = null

val Icons.Ss.Reel: ImageVector
    get() = _Reel ?: UXIcon(name = "Reel") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 2f)
                lineTo(24f, 0f)
                lineTo(0f, 0f)
                lineTo(0f, 2f)
                lineTo(4f, 2f)
                lineTo(4f, 22f)
                lineTo(0f, 22f)
                verticalLineToRelative(2f)
                lineTo(24f, 24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-5f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                lineTo(20f, 2f)
                horizontalLineToRelative(4f)
                close()
                moveTo(18f, 11f)
                lineTo(6f, 11f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(2f)
                close()
                moveTo(18f, 7f)
                lineTo(6f, 7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(2f)
                close()
                moveTo(18f, 19f)
                lineTo(6f, 19f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(2f)
                close()
                moveTo(6f, 15f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(2f)
                lineTo(6f, 15f)
                close()
            }
        }.also { _Reel = it}
