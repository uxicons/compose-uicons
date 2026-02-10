package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GarageCar: ImageVector? = null

val Icons.Ss.GarageCar: ImageVector
    get() = _GarageCar ?: UXIcon(name = "GarageCar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 10.04f)
                lineTo(24f, 24f)
                lineTo(19f, 24f)
                lineTo(19f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                lineTo(6f, 11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                lineTo(5f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 10.04f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.15f, 7.68f)
                lineToRelative(9f, -7.04f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.7f, 0f)
                lineToRelative(9f, 7.04f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 10.04f)
                close()
                moveTo(16.77f, 18.83f)
                arcTo(5.02f, 5.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 20.35f)
                lineTo(17f, 22f)
                lineTo(16f, 22f)
                verticalLineToRelative(2f)
                lineTo(14f, 24f)
                lineTo(14f, 22f)
                lineTo(10f, 22f)
                verticalLineToRelative(2f)
                lineTo(8f, 24f)
                lineTo(8f, 22f)
                lineTo(7f, 22f)
                lineTo(7f, 20.35f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.23f, -1.51f)
                lineTo(8.32f, 15.4f)
                arcTo(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.23f, 14f)
                horizontalLineToRelative(3.54f)
                arcTo(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.68f, 15.4f)
                close()
                moveTo(10.23f, 16f)
                lineTo(9.6f, 18f)
                lineTo(14.4f, 18f)
                lineToRelative(-0.63f, -2f)
                close()
            }
        }.also { _GarageCar = it}
