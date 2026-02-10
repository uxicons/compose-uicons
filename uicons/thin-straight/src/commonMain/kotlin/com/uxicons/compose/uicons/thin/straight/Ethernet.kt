package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ethernet: ImageVector? = null

val Icons.Ts.Ethernet: ImageVector
    get() = _Ethernet ?: UXIcon(name = "Ethernet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 8f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                lineTo(6f, 2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                lineTo(0f, 8f)
                verticalLineToRelative(11.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(19f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-11.5f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(23f, 19.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-10.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(10.5f)
                close()
            }
        }.also { _Ethernet = it}
