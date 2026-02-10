package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BarsStaggered: ImageVector? = null

val Icons.Rs.BarsStaggered: ImageVector
    get() = _BarsStaggered ?: UXIcon(name = "BarsStaggered") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 5f)
                horizontalLineTo(0f)
                verticalLineTo(3f)
                horizontalLineTo(19f)
                verticalLineToRelative(2f)
                close()
                moveTo(0f, 21f)
                horizontalLineTo(19f)
                verticalLineToRelative(-2f)
                horizontalLineTo(0f)
                verticalLineToRelative(2f)
                close()
                moveTo(5f, 11f)
                verticalLineToRelative(2f)
                horizontalLineTo(24f)
                verticalLineToRelative(-2f)
                horizontalLineTo(5f)
                close()
            }
        }.also { _BarsStaggered = it}
