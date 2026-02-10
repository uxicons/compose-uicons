package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Equals: ImageVector? = null

val Icons.Ts.Equals: ImageVector
    get() = _Equals ?: UXIcon(name = "Equals") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 17f)
                lineTo(0f, 17f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(1f)
                close()
                moveTo(24f, 8f)
                lineTo(0f, 8f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _Equals = it}
