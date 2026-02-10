package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BarsFilter: ImageVector? = null

val Icons.Ts.BarsFilter: ImageVector
    get() = _BarsFilter ?: UXIcon(name = "BarsFilter") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 3f)
                verticalLineToRelative(1f)
                horizontalLineTo(0f)
                verticalLineToRelative(-1f)
                horizontalLineTo(24f)
                close()
                moveTo(8f, 22f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-1f)
                horizontalLineTo(8f)
                verticalLineToRelative(1f)
                close()
                moveTo(4f, 13f)
                horizontalLineTo(20f)
                verticalLineToRelative(-1f)
                horizontalLineTo(4f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _BarsFilter = it}
