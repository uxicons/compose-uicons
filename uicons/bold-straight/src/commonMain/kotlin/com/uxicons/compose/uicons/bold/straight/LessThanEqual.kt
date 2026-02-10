package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LessThanEqual: ImageVector? = null

val Icons.Bs.LessThanEqual: ImageVector
    get() = _LessThanEqual ?: UXIcon(name = "LessThanEqual") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 21f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(3f)
                horizontalLineTo(3f)
                verticalLineToRelative(-3f)
                close()
                moveTo(21f, 0.03f)
                lineTo(2.75f, 9.51f)
                lineToRelative(18.25f, 9.48f)
                verticalLineToRelative(-3.38f)
                lineToRelative(-11.75f, -6.1f)
                lineToRelative(11.75f, -6.1f)
                verticalLineTo(0.03f)
                close()
            }
        }.also { _LessThanEqual = it}
