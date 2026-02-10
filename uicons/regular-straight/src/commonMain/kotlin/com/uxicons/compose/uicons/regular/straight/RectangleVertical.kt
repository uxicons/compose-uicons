package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RectangleVertical: ImageVector? = null

val Icons.Rs.RectangleVertical: ImageVector
    get() = _RectangleVertical ?: UXIcon(name = "RectangleVertical") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 24f)
                lineTo(3f, 24f)
                lineTo(3f, 0f)
                lineTo(21f, 0f)
                lineTo(21f, 24f)
                close()
                moveTo(5f, 22f)
                horizontalLineToRelative(14f)
                lineTo(19f, 2f)
                lineTo(5f, 2f)
                lineTo(5f, 22f)
                close()
            }
        }.also { _RectangleVertical = it}
