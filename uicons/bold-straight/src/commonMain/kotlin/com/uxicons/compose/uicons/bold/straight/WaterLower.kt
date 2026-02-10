package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WaterLower: ImageVector? = null

val Icons.Bs.WaterLower: ImageVector
    get() = _WaterLower ?: UXIcon(name = "WaterLower") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 15f)
                verticalLineToRelative(3f)
                arcToRelative(4.47f, 4.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -1.17f)
                arcToRelative(4.43f, 4.43f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, 0f)
                arcToRelative(4.43f, 4.43f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, 0f)
                arcToRelative(4.43f, 4.43f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, 0f)
                arcTo(4.47f, 4.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 18f)
                lineTo(0f, 15f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, -1f)
                lineTo(4.59f, 14f)
                arcToRelative(1.49f, 1.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.82f, 0f)
                horizontalLineToRelative(3.18f)
                arcToRelative(1.49f, 1.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.82f, 0f)
                horizontalLineToRelative(3.18f)
                arcToRelative(1.49f, 1.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.82f, 0f)
                horizontalLineToRelative(3.18f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 15f)
                close()
                moveTo(22.59f, 20f)
                lineTo(19.41f, 20f)
                arcToRelative(1.49f, 1.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.82f, 0f)
                lineTo(13.41f, 20f)
                arcToRelative(1.49f, 1.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.82f, 0f)
                lineTo(7.41f, 20f)
                arcToRelative(1.49f, 1.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.82f, 0f)
                lineTo(1.41f, 20f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 21f)
                verticalLineToRelative(3f)
                arcToRelative(4.47f, 4.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -1.17f)
                arcToRelative(4.43f, 4.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 0f)
                arcToRelative(4.43f, 4.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 0f)
                arcToRelative(4.43f, 4.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 0f)
                arcTo(4.47f, 4.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 24f)
                lineTo(24f, 21f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.59f, 20f)
                close()
                moveTo(10.5f, 0f)
                lineTo(10.5f, 8f)
                lineTo(7.54f, 8f)
                lineToRelative(3.67f, 3.67f)
                arcToRelative(1.11f, 1.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.58f, 0f)
                lineTo(16.46f, 8f)
                lineTo(13.5f, 8f)
                lineTo(13.5f, 0f)
                close()
            }
        }.also { _WaterLower = it}
