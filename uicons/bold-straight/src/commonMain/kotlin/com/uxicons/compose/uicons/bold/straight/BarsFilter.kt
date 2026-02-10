package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BarsFilter: ImageVector? = null

val Icons.Bs.BarsFilter: ImageVector
    get() = _BarsFilter ?: UXIcon(name = "BarsFilter") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 2f)
                verticalLineToRelative(3f)
                horizontalLineTo(0f)
                verticalLineTo(2f)
                horizontalLineTo(24f)
                close()
                moveTo(8f, 23f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-3f)
                horizontalLineTo(8f)
                verticalLineToRelative(3f)
                close()
                moveTo(4f, 14f)
                horizontalLineTo(20f)
                verticalLineToRelative(-3f)
                horizontalLineTo(4f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _BarsFilter = it}
