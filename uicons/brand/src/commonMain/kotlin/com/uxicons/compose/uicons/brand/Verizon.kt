package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Verizon: ImageVector? = null

val Icons.Brand.Verizon: ImageVector
    get() = _Verizon ?: UXIcon(name = "Verizon") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1.74f, 12f)
            horizontalLineToRelative(3.73f)
            lineToRelative(3.73f, 8f)
            lineToRelative(9.33f, -20f)
            horizontalLineToRelative(3.73f)
            lineTo(11.07f, 24f)
            horizontalLineToRelative(-3.73f)
            lineTo(1.74f, 12f)
            close()
        }
    }.also { _Verizon = it }
