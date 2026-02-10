package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Equals: ImageVector? = null

val Icons.Bs.Equals: ImageVector
    get() = _Equals ?: UXIcon(name = "Equals") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 6f)
                verticalLineToRelative(3f)
                horizontalLineTo(0f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(24f)
                close()
                moveTo(0f, 18f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-3f)
                horizontalLineTo(0f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _Equals = it}
