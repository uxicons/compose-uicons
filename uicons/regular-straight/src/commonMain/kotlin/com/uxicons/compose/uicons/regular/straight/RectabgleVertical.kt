package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RectabgleVertical: ImageVector? = null

val Icons.Rs.RectabgleVertical: ImageVector
    get() = _RectabgleVertical ?: UXIcon(name = "RectabgleVertical") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 24f)
                horizontalLineTo(3f)
                verticalLineTo(0f)
                horizontalLineTo(21f)
                close()
                moveTo(5f, 22f)
                horizontalLineTo(19f)
                verticalLineTo(2f)
                horizontalLineTo(5f)
                close()
            }
        }.also { _RectabgleVertical = it}
