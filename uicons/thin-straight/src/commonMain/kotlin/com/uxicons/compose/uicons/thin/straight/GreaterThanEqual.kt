package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GreaterThanEqual: ImageVector? = null

val Icons.Ts.GreaterThanEqual: ImageVector
    get() = _GreaterThanEqual ?: UXIcon(name = "GreaterThanEqual") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 23f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(1f)
                horizontalLineTo(3f)
                verticalLineToRelative(-1f)
                close()
                moveTo(3f, 0f)
                verticalLineToRelative(1.09f)
                lineToRelative(16.26f, 8.41f)
                lineTo(3f, 17.88f)
                verticalLineToRelative(1.12f)
                lineToRelative(18.5f, -9.5f)
                lineTo(3f, 0f)
                close()
            }
        }.also { _GreaterThanEqual = it}
