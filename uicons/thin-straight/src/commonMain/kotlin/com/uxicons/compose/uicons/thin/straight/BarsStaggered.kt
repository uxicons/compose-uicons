package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BarsStaggered: ImageVector? = null

val Icons.Ts.BarsStaggered: ImageVector
    get() = _BarsStaggered ?: UXIcon(name = "BarsStaggered") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 4f)
                horizontalLineTo(0f)
                verticalLineToRelative(-1f)
                horizontalLineTo(19f)
                verticalLineToRelative(1f)
                close()
                moveTo(0f, 20f)
                horizontalLineTo(19f)
                verticalLineToRelative(-1f)
                horizontalLineTo(0f)
                verticalLineToRelative(1f)
                close()
                moveTo(5f, 11f)
                verticalLineToRelative(1f)
                horizontalLineTo(24f)
                verticalLineToRelative(-1f)
                horizontalLineTo(5f)
                close()
            }
        }.also { _BarsStaggered = it}
