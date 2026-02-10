package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tenge: ImageVector? = null

val Icons.Bs.Tenge: ImageVector
    get() = _Tenge ?: UXIcon(name = "Tenge") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 0f)
                verticalLineTo(3f)
                horizontalLineTo(2f)
                verticalLineTo(0f)
                horizontalLineTo(22f)
                close()
                moveTo(2f, 8f)
                horizontalLineTo(10.5f)
                verticalLineTo(24f)
                horizontalLineToRelative(3f)
                verticalLineTo(8f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(-3f)
                horizontalLineTo(2f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _Tenge = it}
