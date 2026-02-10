package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GarageOpen: ImageVector? = null

val Icons.Rr.GarageOpen: ImageVector
    get() = _GarageOpen ?: UXIcon(name = "GarageOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.8f, 5.58f)
                lineTo(14.8f, 0.85f)
                arcTo(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.2f, 0.85f)
                lineToRelative(-7f, 4.72f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 9.72f)
                lineTo(0f, 19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                lineTo(6f, 15f)
                lineTo(18f, 15f)
                verticalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                lineTo(24f, 9.72f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.8f, 5.58f)
                close()
                moveTo(6f, 13f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                close()
                moveTo(22f, 19f)
                arcToRelative(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2.83f)
                lineTo(20f, 13f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, -4f)
                lineTo(8f, 9f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 4f)
                verticalLineToRelative(8.83f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 19f)
                lineTo(2f, 9.72f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.32f, 7.24f)
                lineToRelative(7f, -4.72f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.36f, 0f)
                lineToRelative(7f, 4.72f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 9.72f)
                close()
            }
        }.also { _GarageOpen = it}
