package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarBattery: ImageVector? = null

val Icons.Rs.CarBattery: ImageVector
    get() = _CarBattery ?: UXIcon(name = "CarBattery") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 11f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                lineTo(4f, 13f)
                close()
                moveTo(18f, 9f)
                lineTo(16f, 9f)
                verticalLineToRelative(2f)
                lineTo(14f, 11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                lineTo(18f, 13f)
                horizontalLineToRelative(2f)
                lineTo(20f, 11f)
                lineTo(18f, 11f)
                close()
                moveTo(24f, 8f)
                lineTo(24f, 22f)
                lineTo(0f, 22f)
                lineTo(0f, 8f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 5f)
                lineTo(3f, 2f)
                horizontalLineToRelative(8f)
                lineTo(11f, 5f)
                horizontalLineToRelative(2f)
                lineTo(13f, 2f)
                horizontalLineToRelative(8f)
                lineTo(21f, 5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 8f)
                close()
                moveTo(22f, 8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                lineTo(19f, 7f)
                lineTo(19f, 4f)
                lineTo(15f, 4f)
                lineTo(15f, 7f)
                lineTo(9f, 7f)
                lineTo(9f, 4f)
                lineTo(5f, 4f)
                lineTo(5f, 7f)
                lineTo(3f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 8f)
                lineTo(2f, 20f)
                lineTo(22f, 20f)
                close()
            }
        }.also { _CarBattery = it}
