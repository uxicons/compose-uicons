package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlusMinus: ImageVector? = null

val Icons.Rs.PlusMinus: ImageVector
    get() = _PlusMinus ?: UXIcon(name = "PlusMinus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-8f)
                horizontalLineTo(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8f)
                verticalLineTo(0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(8f)
                close()
                moveTo(3f, 24f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-2f)
                horizontalLineTo(3f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _PlusMinus = it}
