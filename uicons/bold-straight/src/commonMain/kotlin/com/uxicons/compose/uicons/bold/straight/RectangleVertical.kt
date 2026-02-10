package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RectangleVertical: ImageVector? = null

val Icons.Bs.RectangleVertical: ImageVector
    get() = _RectangleVertical ?: UXIcon(name = "RectangleVertical") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 24f)
                lineTo(3f, 24f)
                lineTo(3f, 0f)
                lineTo(21f, 0f)
                lineTo(21f, 24f)
                close()
                moveTo(6f, 21f)
                horizontalLineToRelative(12f)
                lineTo(18f, 3f)
                lineTo(6f, 3f)
                lineTo(6f, 21f)
                close()
            }
        }.also { _RectangleVertical = it}
