package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tenge: ImageVector? = null

val Icons.Ss.Tenge: ImageVector
    get() = _Tenge ?: UXIcon(name = "Tenge") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 0f)
                verticalLineTo(2f)
                horizontalLineTo(2f)
                verticalLineTo(0f)
                horizontalLineTo(22f)
                close()
                moveTo(2f, 6f)
                horizontalLineTo(11f)
                verticalLineTo(24f)
                horizontalLineToRelative(2f)
                verticalLineTo(6f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-2f)
                horizontalLineTo(2f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _Tenge = it}
