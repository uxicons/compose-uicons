package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BusAlt: ImageVector? = null

val Icons.Ss.BusAlt: ImageVector
    get() = _BusAlt ?: UXIcon(name = "BusAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 9f)
                verticalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                lineTo(2f, 14f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
                lineTo(0f, 9f)
                lineTo(2f, 9f)
                lineTo(2f, 6f)
                lineTo(22f, 6f)
                lineTo(22f, 9f)
                close()
                moveTo(2f, 16f)
                lineTo(22f, 16f)
                verticalLineToRelative(6f)
                lineTo(20f, 22f)
                verticalLineToRelative(2f)
                lineTo(15f, 24f)
                lineTo(15f, 22f)
                lineTo(9f, 22f)
                verticalLineToRelative(2f)
                lineTo(4f, 24f)
                lineTo(4f, 22f)
                lineTo(2f, 22f)
                close()
                moveTo(17f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 20f)
                close()
                moveTo(7f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 20f)
                close()
                moveTo(9f, 3f)
                horizontalLineToRelative(6f)
                lineTo(15f, 4f)
                horizontalLineToRelative(6.98f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.8f, -2.53f)
                curveToRelative(-3.67f, -1.9f, -12.7f, -1.89f, -16.36f, 0f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.02f, 4f)
                lineTo(9f, 4f)
                close()
            }
        }.also { _BusAlt = it}
