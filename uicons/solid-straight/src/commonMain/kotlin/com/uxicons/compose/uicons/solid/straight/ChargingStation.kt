package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChargingStation: ImageVector? = null

val Icons.Ss.ChargingStation: ImageVector
    get() = _ChargingStation ?: UXIcon(name = "ChargingStation") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 2f)
                verticalLineTo(4f)
                horizontalLineTo(20f)
                verticalLineTo(2f)
                horizontalLineTo(18f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                verticalLineTo(18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                horizontalLineTo(16f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineToRelative(3f)
                verticalLineTo(3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                verticalLineToRelative(2f)
                horizontalLineTo(0f)
                verticalLineTo(24f)
                horizontalLineTo(16f)
                verticalLineTo(21f)
                horizontalLineToRelative(3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                verticalLineTo(8f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
                verticalLineTo(2f)
                close()
                moveTo(10.77f, 11.43f)
                lineTo(9.01f, 14.96f)
                lineToRelative(-1.79f, -0.89f)
                lineTo(8.75f, 11f)
                horizontalLineTo(6.62f)
                arcTo(1.61f, 1.61f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.07f, 8.92f)
                lineTo(7.29f, 4.76f)
                lineToRelative(1.76f, 0.95f)
                lineTo(7.28f, 9f)
                horizontalLineTo(9.4f)
                arcToRelative(1.6f, 1.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.38f, 2.43f)
                close()
            }
        }.also { _ChargingStation = it}
