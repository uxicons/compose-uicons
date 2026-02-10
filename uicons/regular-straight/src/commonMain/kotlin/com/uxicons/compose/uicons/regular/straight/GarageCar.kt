package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GarageCar: ImageVector? = null

val Icons.Rs.GarageCar: ImageVector
    get() = _GarageCar ?: UXIcon(name = "GarageCar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.85f, 7.68f)
                lineToRelative(-9f, -7.04f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.7f, 0f)
                lineToRelative(-9f, 7.04f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 10.04f)
                lineTo(0f, 24f)
                lineTo(6f, 24f)
                lineTo(6f, 13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                lineTo(17f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                lineTo(18f, 24f)
                horizontalLineToRelative(6f)
                lineTo(24f, 10.04f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.85f, 7.68f)
                close()
                moveTo(22f, 22f)
                lineTo(20f, 22f)
                lineTo(20f, 13f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                lineTo(7f, 10f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(9f)
                lineTo(2f, 22f)
                lineTo(2f, 10.04f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.38f, -0.79f)
                lineToRelative(9f, -7.04f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.23f, 0f)
                lineToRelative(9f, 7.04f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.38f, 0.79f)
                close()
                moveTo(15.68f, 15.4f)
                arcTo(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.77f, 14f)
                lineTo(10.23f, 14f)
                arcTo(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.32f, 15.4f)
                lineToRelative(-1.09f, 3.44f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 20.35f)
                lineTo(7f, 22f)
                lineTo(8f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                lineTo(10f, 22f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                lineTo(16f, 22f)
                horizontalLineToRelative(1f)
                lineTo(17f, 20.35f)
                arcToRelative(5.02f, 5.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.23f, -1.51f)
                close()
                moveTo(13.77f, 16f)
                lineToRelative(0.63f, 2f)
                lineTo(9.6f, 18f)
                lineToRelative(0.63f, -2f)
                close()
            }
        }.also { _GarageCar = it}
