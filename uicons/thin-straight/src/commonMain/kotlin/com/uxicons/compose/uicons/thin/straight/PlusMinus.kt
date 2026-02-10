package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlusMinus: ImageVector? = null

val Icons.Ts.PlusMinus: ImageVector
    get() = _PlusMinus ?: UXIcon(name = "PlusMinus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 8.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-8.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-8.5f)
                horizontalLineTo(3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(8.5f)
                verticalLineTo(0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(8.5f)
                close()
                moveTo(3f, 24f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-1f)
                horizontalLineTo(3f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _PlusMinus = it}
