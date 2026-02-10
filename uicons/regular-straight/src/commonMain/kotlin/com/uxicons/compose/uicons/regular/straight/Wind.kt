package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Wind: ImageVector? = null

val Icons.Rs.Wind: ImageVector
    get() = _Wind ?: UXIcon(name = "Wind") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 13f)
                lineTo(0f, 13f)
                lineTo(0f, 11f)
                lineTo(8f, 11f)
                close()
                moveTo(20.91f, 11.11f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 8f)
                lineTo(12f, 9f)
                horizontalLineToRelative(2f)
                lineTo(14f, 8f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 3f)
                lineTo(10f, 11f)
                verticalLineToRelative(2f)
                lineTo(20f, 13f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 2f)
                lineTo(16f, 15f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4.92f, -3.89f)
                close()
                moveTo(11f, 16f)
                lineTo(0f, 16f)
                verticalLineToRelative(2f)
                lineTo(11f, 18f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 2f)
                lineTo(7f, 20f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4f, -4f)
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
            }
        }.also { _Wind = it}
