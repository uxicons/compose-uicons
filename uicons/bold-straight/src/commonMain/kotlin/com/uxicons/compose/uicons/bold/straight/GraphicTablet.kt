package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GraphicTablet: ImageVector? = null

val Icons.Bs.GraphicTablet: ImageVector
    get() = _GraphicTablet ?: UXIcon(name = "GraphicTablet") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 3f)
                lineTo(0f, 3f)
                verticalLineToRelative(7.99f)
                lineTo(3f, 10.99f)
                verticalLineToRelative(2.01f)
                lineTo(0f, 13.01f)
                lineTo(0f, 21f)
                lineTo(21f, 21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                lineTo(24f, 6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 3f)
                close()
                moveTo(21f, 18f)
                lineTo(7f, 18f)
                lineTo(7f, 6f)
                lineTo(21f, 6f)
                close()
            }
        }.also { _GraphicTablet = it}
