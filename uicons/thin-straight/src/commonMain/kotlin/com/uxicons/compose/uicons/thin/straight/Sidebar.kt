package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sidebar: ImageVector? = null

val Icons.Ts.Sidebar: ImageVector
    get() = _Sidebar ?: UXIcon(name = "Sidebar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 2f)
                lineTo(2.5f, 2f)
                curveTo(1.12f, 2f, 0f, 3.12f, 0f, 4.5f)
                lineTo(0f, 22f)
                lineTo(24f, 22f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(1f, 4.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(5.5f)
                lineTo(8f, 21f)
                lineTo(1f, 21f)
                lineTo(1f, 4.5f)
                close()
                moveTo(23f, 21f)
                lineTo(9f, 21f)
                lineTo(9f, 3f)
                horizontalLineToRelative(12.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                lineTo(23f, 21f)
                close()
                moveTo(3f, 10f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1f)
                lineTo(3f, 11f)
                verticalLineToRelative(-1f)
                close()
                moveTo(3f, 14f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1f)
                lineTo(3f, 15f)
                verticalLineToRelative(-1f)
                close()
                moveTo(6f, 6f)
                verticalLineToRelative(1f)
                lineTo(3f, 7f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3f)
                close()
            }
        }.also { _Sidebar = it}
