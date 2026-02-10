package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GraphicTablet: ImageVector? = null

val Icons.Rs.GraphicTablet: ImageVector
    get() = _GraphicTablet ?: UXIcon(name = "GraphicTablet") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 4f)
                lineTo(2f, 4f)
                verticalLineToRelative(7f)
                lineTo(0f, 11f)
                verticalLineToRelative(2f)
                lineTo(2f, 13f)
                verticalLineToRelative(7f)
                lineTo(21f, 20f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                lineTo(24f, 7f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 4f)
                close()
                moveTo(4f, 13f)
                lineTo(5f, 13f)
                lineTo(5f, 11f)
                lineTo(4f, 11f)
                lineTo(4f, 6f)
                lineTo(7f, 6f)
                lineTo(7f, 18f)
                lineTo(4f, 18f)
                close()
                moveTo(22f, 17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                lineTo(9f, 18f)
                lineTo(9f, 6f)
                lineTo(21f, 6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                close()
            }
        }.also { _GraphicTablet = it}
