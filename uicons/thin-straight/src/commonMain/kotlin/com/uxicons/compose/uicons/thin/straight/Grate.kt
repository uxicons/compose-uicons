package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Grate: ImageVector? = null

val Icons.Ts.Grate: ImageVector
    get() = _Grate ?: UXIcon(name = "Grate") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 2.5f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-5f)
                lineTo(18f, 1f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(11.5f, 12.5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-10.5f)
                horizontalLineToRelative(4.5f)
                close()
                moveTo(7f, 11.5f)
                lineTo(7f, 1f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(-4.5f)
                close()
                moveTo(12.5f, 12.5f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-10.5f)
                close()
                moveTo(12.5f, 11.5f)
                lineTo(12.5f, 1f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(-4.5f)
                close()
                moveTo(2.5f, 1f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(10.5f)
                lineTo(1f, 11.5f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(1f, 12.5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(10.5f)
                lineTo(1f, 23f)
                verticalLineToRelative(-10.5f)
                close()
                moveTo(18f, 23f)
                verticalLineToRelative(-10.5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(-5f)
                close()
            }
        }.also { _Grate = it}
