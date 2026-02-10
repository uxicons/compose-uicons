package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Car: ImageVector? = null

val Icons.Rs.Car: ImageVector
    get() = _Car ?: UXIcon(name = "Car") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.42f, 2.98f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.6f, 1f)
                lineTo(6.4f, 1f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.58f, 2.98f)
                lineTo(1.44f, 8.87f)
                arcTo(23.79f, 23.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 17.03f)
                lineTo(0f, 19f)
                lineTo(2f, 19f)
                verticalLineToRelative(4f)
                lineTo(8f, 23f)
                lineTo(8f, 19f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(6f)
                lineTo(22f, 19f)
                horizontalLineToRelative(2f)
                lineTo(24f, 17.03f)
                arcToRelative(23.79f, 23.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.44f, -8.16f)
                close()
                moveTo(5.46f, 3.66f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.4f, 3f)
                lineTo(17.6f, 3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.94f, 0.66f)
                lineToRelative(2.14f, 5.9f)
                curveToRelative(0.17f, 0.48f, 0.32f, 0.96f, 0.46f, 1.45f)
                lineTo(2.86f, 11.01f)
                curveToRelative(0.14f, -0.48f, 0.28f, -0.97f, 0.46f, -1.45f)
                close()
                moveTo(6f, 21f)
                lineTo(4f, 21f)
                lineTo(4f, 19f)
                lineTo(6f, 19f)
                close()
                moveTo(20f, 21f)
                lineTo(18f, 21f)
                lineTo(18f, 19f)
                horizontalLineToRelative(2f)
                close()
                moveTo(2f, 17f)
                arcToRelative(21.9f, 21.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.38f, -4f)
                lineTo(4f, 13f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                lineTo(5f, 15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                lineTo(6f, 13f)
                lineTo(18f, 13f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                horizontalLineToRelative(0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                lineTo(20f, 13f)
                horizontalLineToRelative(1.62f)
                arcTo(21.9f, 21.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 17f)
                close()
            }
        }.also { _Car = it}
