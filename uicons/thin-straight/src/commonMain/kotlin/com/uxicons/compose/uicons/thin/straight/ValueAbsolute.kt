package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ValueAbsolute: ImageVector? = null

val Icons.Ts.ValueAbsolute: ImageVector
    get() = _ValueAbsolute ?: UXIcon(name = "ValueAbsolute") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.85f, 6.85f)
                lineToRelative(-5.15f, 5.15f)
                lineToRelative(5.15f, 5.15f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-5.15f, -5.15f)
                lineToRelative(-5.15f, 5.15f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(5.15f, -5.15f)
                lineToRelative(-5.15f, -5.15f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(5.15f, 5.15f)
                lineToRelative(5.15f, -5.15f)
                lineToRelative(0.71f, 0.71f)
                close()
                moveTo(0f, 24f)
                horizontalLineToRelative(1f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                verticalLineToRelative(24f)
                close()
                moveTo(23f, 0f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(1f)
                verticalLineTo(0f)
                horizontalLineToRelative(-1f)
                close()
            }
        }.also { _ValueAbsolute = it}
