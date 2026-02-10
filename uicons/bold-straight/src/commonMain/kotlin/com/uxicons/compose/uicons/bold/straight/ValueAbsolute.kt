package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ValueAbsolute: ImageVector? = null

val Icons.Bs.ValueAbsolute: ImageVector
    get() = _ValueAbsolute ?: UXIcon(name = "ValueAbsolute") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.06f, 8.06f)
                lineToRelative(-3.94f, 3.94f)
                lineToRelative(3.94f, 3.94f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(-3.94f, -3.94f)
                lineToRelative(-3.94f, 3.94f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(3.94f, -3.94f)
                lineToRelative(-3.94f, -3.94f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(3.94f, 3.94f)
                lineToRelative(3.94f, -3.94f)
                lineToRelative(2.12f, 2.12f)
                close()
                moveTo(0f, 24f)
                horizontalLineToRelative(3f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                verticalLineToRelative(24f)
                close()
                moveTo(21f, 0f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(3f)
                verticalLineTo(0f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.also { _ValueAbsolute = it}
