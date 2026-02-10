package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShelvesEmpty: ImageVector? = null

val Icons.Ss.ShelvesEmpty: ImageVector
    get() = _ShelvesEmpty ?: UXIcon(name = "ShelvesEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 0f)
                verticalLineToRelative(7f)
                horizontalLineTo(2f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineTo(0f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(2f, 19f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(10f)
                horizontalLineTo(2f)
                close()
            }
        }.also { _ShelvesEmpty = it}
