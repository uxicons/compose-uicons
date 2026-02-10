package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GripLines: ImageVector? = null

val Icons.Rs.GripLines: ImageVector
    get() = _GripLines ?: UXIcon(name = "GripLines") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 8f)
                verticalLineToRelative(2f)
                horizontalLineTo(0f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(24f)
                close()
                moveTo(0f, 16f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-2f)
                horizontalLineTo(0f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _GripLines = it}
