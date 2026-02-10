package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sidebar: ImageVector? = null

val Icons.Ss.Sidebar: ImageVector
    get() = _Sidebar ?: UXIcon(name = "Sidebar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 2f)
                lineTo(3f, 2f)
                curveTo(1.35f, 2f, 0f, 3.35f, 0f, 5f)
                lineTo(0f, 22f)
                lineTo(9f, 22f)
                lineTo(9f, 2f)
                close()
                moveTo(6f, 16f)
                lineTo(3f, 16f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                close()
                moveTo(6f, 12f)
                lineTo(3f, 12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                close()
                moveTo(3f, 8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                lineTo(3f, 8f)
                close()
                moveTo(24f, 5f)
                lineTo(24f, 22f)
                lineTo(11f, 22f)
                lineTo(11f, 2f)
                horizontalLineToRelative(10f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
            }
        }.also { _Sidebar = it}
