package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DropdownSelect: ImageVector? = null

val Icons.Sr.DropdownSelect: ImageVector
    get() = _DropdownSelect ?: UXIcon(name = "DropdownSelect") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 0f)
                lineTo(5f, 0f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(16.57f, 12.05f)
                lineToRelative(-3.51f, 3.51f)
                curveToRelative(-0.59f, 0.59f, -1.54f, 0.59f, -2.12f, 0f)
                lineToRelative(-3.51f, -3.51f)
                curveToRelative(-0.76f, -0.76f, -0.22f, -2.05f, 0.85f, -2.05f)
                horizontalLineToRelative(7.44f)
                curveToRelative(1.07f, 0f, 1.61f, 1.29f, 0.85f, 2.05f)
                close()
            }
        }.also { _DropdownSelect = it}
