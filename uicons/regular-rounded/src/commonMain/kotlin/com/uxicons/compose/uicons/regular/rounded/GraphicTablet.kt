package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GraphicTablet: ImageVector? = null

val Icons.Rr.GraphicTablet: ImageVector
    get() = _GraphicTablet ?: UXIcon(name = "GraphicTablet") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 4f)
                lineTo(7f, 4f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 9f)
                verticalLineToRelative(2f)
                lineTo(1f, 11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                lineTo(2f, 13f)
                verticalLineToRelative(2f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                lineTo(19f, 20f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                lineTo(24f, 9f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 4f)
                close()
                moveTo(4f, 15f)
                lineTo(4f, 13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                lineTo(4f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 6f)
                lineTo(7f, 18f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 15f)
                close()
                moveTo(22f, 15f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                lineTo(9f, 18f)
                lineTo(9f, 6f)
                lineTo(19f, 6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                close()
            }
        }.also { _GraphicTablet = it}
