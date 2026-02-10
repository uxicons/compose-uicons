package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BusAlt: ImageVector? = null

val Icons.Rs.BusAlt: ImageVector
    get() = _BusAlt ?: UXIcon(name = "BusAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 10f)
                lineTo(22f, 4.23f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.82f, -2.76f)
                curveToRelative(-3.67f, -1.9f, -12.7f, -1.89f, -16.36f, 0f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 4.23f)
                lineTo(2f, 10f)
                lineTo(0f, 10f)
                verticalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                verticalLineToRelative(7f)
                lineTo(4f, 22f)
                verticalLineToRelative(2f)
                lineTo(9f, 24f)
                lineTo(9f, 22f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                lineTo(20f, 22f)
                horizontalLineToRelative(2f)
                lineTo(22f, 15f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
                lineTo(24f, 10f)
                close()
                moveTo(4f, 13f)
                lineTo(4f, 7f)
                lineTo(20f, 7f)
                verticalLineToRelative(6f)
                close()
                moveTo(4.6f, 3.31f)
                arcTo(19.01f, 19.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                arcToRelative(19.02f, 19.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.4f, 1.31f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.6f, 0.92f)
                lineTo(20f, 5f)
                lineTo(15f, 5f)
                lineTo(15f, 4f)
                lineTo(9f, 4f)
                lineTo(9f, 5f)
                lineTo(4f, 5f)
                lineTo(4f, 4.23f)
                arcTo(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.6f, 3.31f)
                close()
                moveTo(4f, 20f)
                lineTo(4f, 15f)
                lineTo(6f, 15f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                lineTo(8f, 15f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                lineTo(18f, 15f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                close()
            }
        }.also { _BusAlt = it}
