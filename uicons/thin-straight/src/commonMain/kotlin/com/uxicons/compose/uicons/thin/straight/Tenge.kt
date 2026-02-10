package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tenge: ImageVector? = null

val Icons.Ts.Tenge: ImageVector
    get() = _Tenge ?: UXIcon(name = "Tenge") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 0f)
                verticalLineTo(1f)
                horizontalLineTo(2f)
                verticalLineTo(0f)
                horizontalLineTo(22f)
                close()
                moveTo(2f, 5f)
                horizontalLineTo(11.5f)
                verticalLineTo(24f)
                horizontalLineToRelative(1f)
                verticalLineTo(5f)
                horizontalLineToRelative(9.5f)
                verticalLineToRelative(-1f)
                horizontalLineTo(2f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _Tenge = it}
