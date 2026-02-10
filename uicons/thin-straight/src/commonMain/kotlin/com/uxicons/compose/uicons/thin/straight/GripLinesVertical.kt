package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GripLinesVertical: ImageVector? = null

val Icons.Ts.GripLinesVertical: ImageVector
    get() = _GripLinesVertical ?: UXIcon(name = "GripLinesVertical") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-1f)
                lineTo(8f, 0f)
                close()
                moveTo(15f, 0f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(1f)
                lineTo(16f, 0f)
                horizontalLineToRelative(-1f)
                close()
            }
        }.also { _GripLinesVertical = it}
