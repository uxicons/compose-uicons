package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChargingStation: ImageVector? = null

val Icons.Rr.ChargingStation: ImageVector
    get() = _ChargingStation ?: UXIcon(name = "ChargingStation") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.81f, 9.85f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.08f, 1.65f)
                lineTo(8.85f, 14.53f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.7f, -1.05f)
                lineTo(8.68f, 11f)
                horizontalLineTo(6.62f)
                arcTo(1.61f, 1.61f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.07f, 8.92f)
                curveTo(5.1f, 8.84f, 7.15f, 5.48f, 7.15f, 5.48f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.7f, 1.05f)
                lineTo(7.33f, 9f)
                horizontalLineTo(9.4f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.81f, 9.85f)
                close()
                moveTo(24f, 3f)
                verticalLineTo(5.5f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2.45f)
                verticalLineTo(17f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 4f)
                horizontalLineTo(15.58f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 24f)
                horizontalLineTo(5f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, -5f)
                verticalLineTo(5f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 0f)
                horizontalLineToRelative(6f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 5f)
                verticalLineTo(19f)
                horizontalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
                verticalLineTo(7.95f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 5.5f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                verticalLineTo(4f)
                horizontalLineToRelative(2f)
                verticalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 3f)
                close()
                moveTo(14f, 19f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(1f)
                verticalLineTo(5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                horizontalLineTo(5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 5f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                horizontalLineTo(2f)
                verticalLineToRelative(8f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineToRelative(6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 19f)
                close()
            }
        }.also { _ChargingStation = it}
