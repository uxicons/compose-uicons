package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Grate: ImageVector? = null

val Icons.Sr.Grate: ImageVector
    get() = _Grate ?: UXIcon(name = "Grate") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 0f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-4f)
                lineTo(7f, 0f)
                horizontalLineToRelative(4f)
                close()
                moveTo(19f, 11f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                horizontalLineToRelative(0f)
                verticalLineToRelative(11f)
                close()
                moveTo(11f, 24f)
                verticalLineToRelative(-11f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(4f)
                close()
                moveTo(17f, 13f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-11f)
                close()
                moveTo(5f, 11f)
                lineTo(5f, 0f)
                horizontalLineToRelative(0f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(5f)
                close()
                moveTo(13f, 0f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(4f)
                lineTo(17f, 0f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(19f, 13f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(0f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-5f)
                close()
                moveTo(5f, 13f)
                lineTo(0f, 13f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(0f)
                verticalLineToRelative(-11f)
                close()
            }
        }.also { _Grate = it}
