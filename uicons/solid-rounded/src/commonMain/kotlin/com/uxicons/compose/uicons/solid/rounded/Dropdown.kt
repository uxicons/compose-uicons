package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dropdown: ImageVector? = null

val Icons.Sr.Dropdown: ImageVector
    get() = _Dropdown ?: UXIcon(name = "Dropdown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 4f)
                lineTo(5f, 4f)
                curveTo(2.24f, 4f, 0f, 6.24f, 0f, 9f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(20.14f, 11.94f)
                lineToRelative(-2.21f, 2.17f)
                curveToRelative(-0.52f, 0.52f, -1.35f, 0.52f, -1.86f, 0f)
                lineToRelative(-2.21f, -2.17f)
                curveToRelative(-0.54f, -0.53f, -0.16f, -1.44f, 0.59f, -1.44f)
                horizontalLineToRelative(5.1f)
                curveToRelative(0.75f, 0f, 1.13f, 0.91f, 0.59f, 1.44f)
                close()
            }
        }.also { _Dropdown = it}
