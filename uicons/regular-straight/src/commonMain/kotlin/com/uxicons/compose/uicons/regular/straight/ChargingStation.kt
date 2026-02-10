package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChargingStation: ImageVector? = null

val Icons.Rs.ChargingStation: ImageVector
    get() = _ChargingStation ?: UXIcon(name = "ChargingStation") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.81f, 9.85f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.04f, 1.58f)
                lineTo(9.01f, 14.96f)
                lineToRelative(-1.79f, -0.89f)
                lineTo(8.75f, 11f)
                horizontalLineTo(6.62f)
                arcTo(1.61f, 1.61f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.07f, 8.92f)
                lineTo(7.29f, 4.76f)
                lineToRelative(1.76f, 0.95f)
                lineTo(7.28f, 9f)
                horizontalLineTo(9.4f)
                arcTo(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.81f, 9.85f)
                close()
                moveTo(24f, 2f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                verticalLineTo(18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                horizontalLineTo(16f)
                verticalLineToRelative(3f)
                horizontalLineTo(0f)
                verticalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
                horizontalLineTo(13f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                verticalLineTo(19f)
                horizontalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                verticalLineTo(8f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
                verticalLineTo(2f)
                horizontalLineToRelative(2f)
                verticalLineTo(4f)
                horizontalLineToRelative(2f)
                verticalLineTo(2f)
                close()
                moveTo(14f, 22f)
                verticalLineTo(11f)
                horizontalLineTo(12f)
                verticalLineTo(9f)
                horizontalLineToRelative(2f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                horizontalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 3f)
                verticalLineTo(9f)
                horizontalLineTo(4f)
                verticalLineToRelative(2f)
                horizontalLineTo(2f)
                verticalLineTo(22f)
                close()
            }
        }.also { _ChargingStation = it}
