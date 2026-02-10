package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GreaterThanEqual: ImageVector? = null

val Icons.Bs.GreaterThanEqual: ImageVector
    get() = _GreaterThanEqual ?: UXIcon(name = "GreaterThanEqual") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 21f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(3f)
                horizontalLineTo(3f)
                verticalLineToRelative(-3f)
                close()
                moveTo(3f, 0.03f)
                verticalLineToRelative(3.38f)
                lineToRelative(11.75f, 6.1f)
                lineTo(3f, 15.61f)
                verticalLineToRelative(3.38f)
                lineToRelative(18.25f, -9.48f)
                lineTo(3f, 0.03f)
                close()
            }
        }.also { _GreaterThanEqual = it}
