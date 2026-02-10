package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GripLinesVertical: ImageVector? = null

val Icons.Bs.GripLinesVertical: ImageVector
    get() = _GripLinesVertical ?: UXIcon(name = "GripLinesVertical") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 0f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-3f)
                verticalLineTo(0f)
                horizontalLineToRelative(3f)
                close()
                moveTo(7f, 24f)
                horizontalLineToRelative(3f)
                verticalLineTo(0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(24f)
                close()
            }
        }.also { _GripLinesVertical = it}
