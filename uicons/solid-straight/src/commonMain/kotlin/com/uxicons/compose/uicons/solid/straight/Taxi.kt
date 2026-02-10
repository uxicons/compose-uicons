package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Taxi: ImageVector? = null

val Icons.Ss.Taxi: ImageVector
    get() = _Taxi ?: UXIcon(name = "Taxi") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 21f)
                verticalLineToRelative(3f)
                lineTo(3f, 24f)
                lineTo(3f, 21f)
                close()
                moveTo(17f, 21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                lineTo(21f, 21f)
                close()
                moveTo(24f, 16f)
                verticalLineToRelative(3f)
                lineTo(0f, 19f)
                lineTo(0f, 16f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                lineTo(21f, 13f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 16f)
                close()
                moveTo(5f, 15f)
                lineTo(5f, 15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                lineTo(4f, 16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                lineTo(5f, 17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                lineTo(6f, 16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 15f)
                close()
                moveTo(19f, 15f)
                horizontalLineToRelative(0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                horizontalLineToRelative(0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                horizontalLineToRelative(0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                horizontalLineToRelative(0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 15f)
                close()
                moveTo(15.11f, 2f)
                lineTo(14.9f, 1.37f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 0f)
                lineTo(11.11f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.9f, 1.37f)
                lineTo(9f, 2f)
                close()
                moveTo(20.67f, 9f)
                lineTo(19.46f, 5.37f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.56f, 4f)
                lineTo(6.44f, 4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.9f, 1.37f)
                lineTo(3.33f, 9f)
                lineTo(0f, 9f)
                verticalLineToRelative(2f)
                lineTo(24f, 11f)
                lineTo(24f, 9f)
                close()
            }
        }.also { _Taxi = it}
