package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShelvesEmpty: ImageVector? = null

val Icons.Ts.ShelvesEmpty: ImageVector
    get() = _ShelvesEmpty ?: UXIcon(name = "ShelvesEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 0f)
                verticalLineToRelative(8f)
                horizontalLineTo(1f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineTo(0f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(1f, 20f)
                verticalLineToRelative(-11f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(11f)
                horizontalLineTo(1f)
                close()
            }
        }.also { _ShelvesEmpty = it}
