package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Equals: ImageVector? = null

val Icons.Rs.Equals: ImageVector
    get() = _Equals ?: UXIcon(name = "Equals") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 7f)
                verticalLineToRelative(2f)
                horizontalLineTo(0f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(24f)
                close()
                moveTo(0f, 17f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-2f)
                horizontalLineTo(0f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _Equals = it}
