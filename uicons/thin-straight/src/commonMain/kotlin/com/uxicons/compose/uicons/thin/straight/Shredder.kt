package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Shredder: ImageVector? = null

val Icons.Ts.Shredder: ImageVector
    get() = _Shredder ?: UXIcon(name = "Shredder") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 6f)
                horizontalLineToRelative(-2.5f)
                lineTo(19f, 0f)
                lineTo(5f, 0f)
                lineTo(5f, 6f)
                lineTo(2.5f, 6f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(7.5f)
                lineTo(24f, 16f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(6f, 1f)
                horizontalLineToRelative(12f)
                lineTo(18f, 6f)
                lineTo(6f, 6f)
                lineTo(6f, 1f)
                close()
                moveTo(23f, 15f)
                lineTo(1f, 15f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(21.5f, 7f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(6.5f)
                close()
                moveTo(3f, 18f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-6f)
                close()
                moveTo(7f, 18f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-6f)
                close()
                moveTo(11.5f, 18f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-6f)
                close()
                moveTo(16f, 18f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-6f)
                close()
                moveTo(20f, 18f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-6f)
                close()
            }
        }.also { _Shredder = it}
