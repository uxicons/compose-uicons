package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DropdownBar: ImageVector? = null

val Icons.Bs.DropdownBar: ImageVector
    get() = _DropdownBar ?: UXIcon(name = "DropdownBar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 0f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineToRelative(4.5f)
                lineTo(24f, 8f)
                lineTo(24f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(17.24f, 5.71f)
                curveToRelative(-0.39f, 0.39f, -1.01f, 0.39f, -1.4f, 0f)
                lineToRelative(-2.76f, -2.71f)
                horizontalLineToRelative(6.92f)
                lineToRelative(-2.76f, 2.71f)
                close()
                moveTo(10f, 11.5f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(3f)
                lineTo(10f, 14.5f)
                verticalLineToRelative(-3f)
                close()
                moveTo(2f, 10f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6f)
                lineTo(2f, 16f)
                verticalLineToRelative(-6f)
                close()
                moveTo(10f, 19.5f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(3f)
                lineTo(10f, 22.5f)
                verticalLineToRelative(-3f)
                close()
                moveTo(2f, 18f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6f)
                lineTo(2f, 24f)
                verticalLineToRelative(-6f)
                close()
            }
        }.also { _DropdownBar = it}
