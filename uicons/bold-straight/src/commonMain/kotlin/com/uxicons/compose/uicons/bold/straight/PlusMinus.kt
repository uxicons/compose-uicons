package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlusMinus: ImageVector? = null

val Icons.Bs.PlusMinus: ImageVector
    get() = _PlusMinus ?: UXIcon(name = "PlusMinus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 7.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-7.5f)
                horizontalLineTo(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(7.5f)
                verticalLineTo(0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(7.5f)
                close()
                moveTo(3f, 24f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-3f)
                horizontalLineTo(3f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _PlusMinus = it}
