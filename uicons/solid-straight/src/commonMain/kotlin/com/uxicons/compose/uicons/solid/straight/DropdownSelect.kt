package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DropdownSelect: ImageVector? = null

val Icons.Ss.DropdownSelect: ImageVector
    get() = _DropdownSelect ?: UXIcon(name = "DropdownSelect") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                horizontalLineTo(3f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineTo(24f)
                horizontalLineTo(24f)
                verticalLineTo(3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(12.96f, 15.04f)
                curveToRelative(-0.53f, 0.53f, -1.39f, 0.53f, -1.92f, 0f)
                lineToRelative(-5.04f, -5.04f)
                horizontalLineToRelative(12f)
                lineToRelative(-5.04f, 5.04f)
                close()
            }
        }.also { _DropdownSelect = it}
