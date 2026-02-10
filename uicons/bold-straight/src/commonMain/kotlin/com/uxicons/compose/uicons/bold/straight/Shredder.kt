package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Shredder: ImageVector? = null

val Icons.Bs.Shredder: ImageVector
    get() = _Shredder ?: UXIcon(name = "Shredder") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 6f)
                horizontalLineToRelative(-1.5f)
                lineTo(19f, 0f)
                lineTo(5f, 0f)
                lineTo(5f, 6f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(6.5f)
                lineTo(24f, 16f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(8f, 3f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(3f)
                lineTo(8f, 6f)
                lineTo(8f, 3f)
                close()
                moveTo(21f, 13f)
                lineTo(3f, 13f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                lineTo(20.5f, 9f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                close()
                moveTo(3f, 18f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(6f)
                lineTo(3f, 24f)
                verticalLineToRelative(-6f)
                close()
                moveTo(8f, 18f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-6f)
                close()
                moveTo(13f, 18f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-6f)
                close()
                moveTo(18f, 18f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-6f)
                close()
            }
        }.also { _Shredder = it}
