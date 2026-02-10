package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShelvesEmpty: ImageVector? = null

val Icons.Bs.ShelvesEmpty: ImageVector
    get() = _ShelvesEmpty ?: UXIcon(name = "ShelvesEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.99f, 0f)
                verticalLineToRelative(7f)
                horizontalLineTo(2.99f)
                verticalLineTo(0f)
                horizontalLineTo(-0.01f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineTo(0f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(2.99f, 19f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(9f)
                horizontalLineTo(2.99f)
                close()
            }
        }.also { _ShelvesEmpty = it}
