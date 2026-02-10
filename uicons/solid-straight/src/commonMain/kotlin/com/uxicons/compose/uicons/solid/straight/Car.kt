package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Car: ImageVector? = null

val Icons.Ss.Car: ImageVector
    get() = _Car ?: UXIcon(name = "Car") {
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
                moveTo(23.22f, 11f)
                curveToRelative(-0.19f, -0.72f, -0.4f, -1.43f, -0.66f, -2.13f)
                lineTo(20.42f, 2.98f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.6f, 1f)
                lineTo(6.4f, 1f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.58f, 2.98f)
                lineTo(1.44f, 8.87f)
                curveTo(1.18f, 9.57f, 0.97f, 10.28f, 0.78f, 11f)
                close()
                moveTo(24f, 17.03f)
                lineTo(24f, 19f)
                lineTo(0f, 19f)
                lineTo(0f, 17.03f)
                arcTo(23.9f, 23.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.35f, 13f)
                lineTo(23.65f, 13f)
                arcTo(23.9f, 23.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 17.03f)
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
            }
        }.also { _Car = it}
