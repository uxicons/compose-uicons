package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChargingStation: ImageVector? = null

val Icons.Bs.ChargingStation: ImageVector
    get() = _ChargingStation ?: UXIcon(name = "ChargingStation") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.75f, 10.11f)
                arcToRelative(2.1f, 2.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.04f, 2.06f)
                lineTo(8.96f, 15.68f)
                lineToRelative(-2.69f, -1.34f)
                lineTo(7.44f, 12f)
                horizontalLineTo(7.12f)
                arcTo(2.12f, 2.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.09f, 9.27f)
                lineTo(7.35f, 5.02f)
                lineTo(9.99f, 6.44f)
                lineTo(8.61f, 9f)
                horizontalLineTo(8.9f)
                arcTo(2.1f, 2.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.75f, 10.11f)
                close()
                moveTo(24f, 2f)
                verticalLineTo(6.5f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2.45f)
                verticalLineTo(17.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 21f)
                horizontalLineTo(16f)
                verticalLineToRelative(3f)
                horizontalLineTo(0f)
                verticalLineTo(3.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 0f)
                horizontalLineToRelative(9f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 3.5f)
                verticalLineTo(18f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.5f, -0.5f)
                verticalLineTo(8.95f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 6.5f)
                verticalLineTo(2f)
                horizontalLineToRelative(3f)
                verticalLineTo(4f)
                horizontalLineToRelative(1f)
                verticalLineTo(2f)
                close()
                moveTo(13f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, -0.5f)
                horizontalLineToRelative(-9f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, 0.5f)
                verticalLineTo(21f)
                horizontalLineTo(13f)
                close()
            }
        }.also { _ChargingStation = it}
