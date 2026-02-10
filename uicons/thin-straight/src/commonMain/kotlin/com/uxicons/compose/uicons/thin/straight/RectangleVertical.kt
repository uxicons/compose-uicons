package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RectangleVertical: ImageVector? = null

val Icons.Ts.RectangleVertical: ImageVector
    get() = _RectangleVertical ?: UXIcon(name = "RectangleVertical") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 24f)
                lineTo(3f, 24f)
                lineTo(3f, 0f)
                lineTo(21f, 0f)
                lineTo(21f, 24f)
                close()
                moveTo(4f, 23f)
                lineTo(20f, 23f)
                lineTo(20f, 1f)
                lineTo(4f, 1f)
                lineTo(4f, 23f)
                close()
            }
        }.also { _RectangleVertical = it}
