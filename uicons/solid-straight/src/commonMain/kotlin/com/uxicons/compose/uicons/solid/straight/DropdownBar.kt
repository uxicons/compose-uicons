package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DropdownBar: ImageVector? = null

val Icons.Ss.DropdownBar: ImageVector
    get() = _DropdownBar ?: UXIcon(name = "DropdownBar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 15f)
                lineTo(9f, 15f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(2f)
                close()
                moveTo(2f, 16f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                lineTo(2f, 12f)
                verticalLineToRelative(4f)
                close()
                moveTo(22f, 19f)
                lineTo(9f, 19f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-2f)
                close()
                moveTo(2f, 22f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                lineTo(2f, 18f)
                verticalLineToRelative(4f)
                close()
                moveTo(24f, 3f)
                verticalLineToRelative(7f)
                lineTo(0f, 10f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                lineTo(21f, 0f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(20f, 4f)
                horizontalLineToRelative(-6.91f)
                lineToRelative(2.76f, 2.71f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(0.39f, 0.39f, 1.01f, 0.39f, 1.4f, 0f)
                lineToRelative(2.76f, -2.71f)
                close()
            }
        }.also { _DropdownBar = it}
