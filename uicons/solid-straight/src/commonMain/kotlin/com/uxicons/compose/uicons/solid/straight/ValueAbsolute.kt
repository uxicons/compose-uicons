package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ValueAbsolute: ImageVector? = null

val Icons.Ss.ValueAbsolute: ImageVector
    get() = _ValueAbsolute ?: UXIcon(name = "ValueAbsolute") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.71f, 7.71f)
                lineToRelative(-4.29f, 4.29f)
                lineToRelative(4.29f, 4.29f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-4.29f, -4.29f)
                lineToRelative(-4.29f, 4.29f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(4.29f, -4.29f)
                lineToRelative(-4.29f, -4.29f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(4.29f, 4.29f)
                lineToRelative(4.29f, -4.29f)
                lineToRelative(1.41f, 1.41f)
                close()
                moveTo(0f, 24f)
                horizontalLineToRelative(2f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                verticalLineToRelative(24f)
                close()
                moveTo(22f, 0f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(2f)
                verticalLineTo(0f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.also { _ValueAbsolute = it}
