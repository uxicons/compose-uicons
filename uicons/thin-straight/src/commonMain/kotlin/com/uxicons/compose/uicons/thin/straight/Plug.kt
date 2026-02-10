package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Plug: ImageVector? = null

val Icons.Ts.Plug: ImageVector
    get() = _Plug ?: UXIcon(name = "Plug") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 8f)
                horizontalLineToRelative(-6f)
                lineTo(17f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-8f)
                lineTo(8f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(8f)
                lineTo(1f, 8f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 3.58f, 2.92f, 6.5f, 6.5f, 6.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                curveToRelative(3.58f, 0f, 6.5f, -2.92f, 6.5f, -6.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                close()
                moveTo(20f, 14.5f)
                curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(5.5f)
                close()
            }
        }.also { _Plug = it}
