package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bus: ImageVector? = null

val Icons.Ss.Bus: ImageVector
    get() = _Bus ?: UXIcon(name = "Bus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 9f)
                verticalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                lineTo(13f, 14f)
                lineTo(13f, 6f)
                horizontalLineToRelative(9f)
                lineTo(22f, 9f)
                close()
                moveTo(20.18f, 1.47f)
                curveToRelative(-3.67f, -1.9f, -12.69f, -1.89f, -16.36f, 0f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.02f, 4f)
                lineTo(21.98f, 4f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.18f, 1.47f)
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
                moveTo(11f, 14f)
                lineTo(11f, 6f)
                lineTo(2f, 6f)
                lineTo(2f, 9f)
                lineTo(0f, 9f)
                verticalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                close()
            }
        }.also { _Bus = it}
