package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BarsSort: ImageVector? = null

val Icons.Rs.BarsSort: ImageVector
    get() = _BarsSort ?: UXIcon(name = "BarsSort") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 2f)
                verticalLineToRelative(2f)
                horizontalLineTo(0f)
                verticalLineTo(2f)
                horizontalLineTo(24f)
                close()
                moveTo(0f, 22f)
                horizontalLineTo(8f)
                verticalLineToRelative(-2f)
                horizontalLineTo(0f)
                verticalLineToRelative(2f)
                close()
                moveTo(0f, 13f)
                horizontalLineTo(16f)
                verticalLineToRelative(-2f)
                horizontalLineTo(0f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _BarsSort = it}
