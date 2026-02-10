package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RectabgleVertical: ImageVector? = null

val Icons.Ss.RectabgleVertical: ImageVector
    get() = _RectabgleVertical ?: UXIcon(name = "RectabgleVertical") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 0f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-18f)
                close()
            }
        }.also { _RectabgleVertical = it}
