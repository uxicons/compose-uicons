package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Plug: ImageVector? = null

val Icons.Rs.Plug: ImageVector
    get() = _Plug ?: UXIcon(name = "Plug") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 7f)
                horizontalLineToRelative(-6f)
                lineTo(17f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-6f)
                lineTo(9f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7f)
                lineTo(1f, 7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 3.86f, 3.14f, 7f, 7f, 7f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1f)
                curveToRelative(3.86f, 0f, 7f, -3.14f, 7f, -7f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(19f, 14f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                horizontalLineToRelative(-4f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(5f)
                close()
            }
        }.also { _Plug = it}
