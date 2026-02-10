package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Wind: ImageVector? = null

val Icons.Ss.Wind: ImageVector
    get() = _Wind ?: UXIcon(name = "Wind") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 15f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 0f)
                horizontalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, -2f)
                lineTo(10f, 13f)
                lineTo(10f, 11f)
                horizontalLineToRelative(7f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3f, -3f)
                lineTo(14f, 9f)
                lineTo(12f, 9f)
                lineTo(12f, 8f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8.89f, 3.11f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 15f)
                close()
                moveTo(8f, 11f)
                lineTo(0f, 11f)
                verticalLineToRelative(2f)
                lineTo(8f, 13f)
                close()
                moveTo(11f, 4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 4f)
                lineTo(5f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7f, 6f)
                lineTo(0f, 6f)
                lineTo(0f, 8f)
                lineTo(7f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 4f)
                close()
                moveTo(11f, 16f)
                lineTo(0f, 16f)
                verticalLineToRelative(2f)
                lineTo(11f, 18f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 2f)
                lineTo(7f, 20f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4f, -4f)
                close()
            }
        }.also { _Wind = it}
