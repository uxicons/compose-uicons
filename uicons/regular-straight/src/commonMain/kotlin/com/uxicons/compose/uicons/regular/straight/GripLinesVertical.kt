package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GripLinesVertical: ImageVector? = null

val Icons.Rs.GripLinesVertical: ImageVector
    get() = _GripLinesVertical ?: UXIcon(name = "GripLinesVertical") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 0f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-2f)
                lineTo(14f, 0f)
                horizontalLineToRelative(2f)
                close()
                moveTo(8f, 24f)
                horizontalLineToRelative(2f)
                lineTo(10f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(24f)
                close()
            }
        }.also { _GripLinesVertical = it}
