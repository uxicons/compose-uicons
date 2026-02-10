package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Flipboard: ImageVector? = null

val Icons.Brand.Flipboard: ImageVector
    get() = _Flipboard ?: UXIcon(name = "Flipboard") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(0f, 0f)
            verticalLineToRelative(24f)
            horizontalLineToRelative(24f)
            verticalLineTo(0f)
            horizontalLineTo(0f)
            close()
            moveTo(19.2f, 9.6f)
            horizontalLineToRelative(-4.8f)
            verticalLineToRelative(4.8f)
            horizontalLineTo(9.6f)
            verticalLineToRelative(4.8f)
            horizontalLineTo(4.8f)
            verticalLineTo(4.8f)
            horizontalLineToRelative(14.4f)
            verticalLineTo(9.6f)
            close()
        }
    }.also { _Flipboard = it }
