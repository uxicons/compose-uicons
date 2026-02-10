package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BarsSort: ImageVector? = null

val Icons.Bs.BarsSort: ImageVector
    get() = _BarsSort ?: UXIcon(name = "BarsSort") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 2f)
                verticalLineToRelative(3f)
                horizontalLineTo(0f)
                verticalLineTo(2f)
                horizontalLineTo(24f)
                close()
                moveTo(0f, 23f)
                horizontalLineTo(8f)
                verticalLineToRelative(-3f)
                horizontalLineTo(0f)
                verticalLineToRelative(3f)
                close()
                moveTo(0f, 14f)
                horizontalLineTo(16f)
                verticalLineToRelative(-3f)
                horizontalLineTo(0f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _BarsSort = it}
