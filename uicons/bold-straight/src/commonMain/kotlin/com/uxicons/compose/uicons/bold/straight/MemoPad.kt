package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MemoPad: ImageVector? = null

val Icons.Bs.MemoPad: ImageVector
    get() = _MemoPad ?: UXIcon(name = "MemoPad") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.5f, 0f)
                lineTo(5.5f, 0f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(20f)
                lineTo(22f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(5f, 21f)
                lineTo(5f, 5f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(16f)
                lineTo(5f, 21f)
                close()
                moveTo(7f, 7f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(3f)
                lineTo(7f, 10f)
                verticalLineToRelative(-3f)
                close()
                moveTo(7f, 12f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _MemoPad = it}
