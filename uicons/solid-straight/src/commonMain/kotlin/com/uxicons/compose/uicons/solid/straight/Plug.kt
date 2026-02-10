package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Plug: ImageVector? = null

val Icons.Ss.Plug: ImageVector
    get() = _Plug ?: UXIcon(name = "Plug") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 7f)
                horizontalLineToRelative(-6f)
                verticalLineTo(0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-6f)
                verticalLineTo(0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7f)
                horizontalLineTo(1f)
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
            }
        }.also { _Plug = it}
