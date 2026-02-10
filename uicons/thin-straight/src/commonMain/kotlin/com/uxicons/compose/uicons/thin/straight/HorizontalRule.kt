package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HorizontalRule: ImageVector? = null

val Icons.Ts.HorizontalRule: ImageVector
    get() = _HorizontalRule ?: UXIcon(name = "HorizontalRule") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 12f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-24f)
                close()
            }
        }.also { _HorizontalRule = it}
