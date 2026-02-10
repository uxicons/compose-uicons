package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarBattery: ImageVector? = null

val Icons.Bs.CarBattery: ImageVector
    get() = _CarBattery ?: UXIcon(name = "CarBattery") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 11f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                lineTo(4f, 14f)
                close()
                moveTo(18f, 9f)
                lineTo(15f, 9f)
                verticalLineToRelative(2f)
                lineTo(13f, 11f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                lineTo(18f, 14f)
                horizontalLineToRelative(2f)
                lineTo(20f, 11f)
                lineTo(18f, 11f)
                close()
                moveTo(24f, 8.5f)
                lineTo(24f, 22f)
                lineTo(0f, 22f)
                lineTo(0f, 8.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 5f)
                lineTo(4f, 5f)
                lineTo(4f, 2f)
                horizontalLineToRelative(6f)
                lineTo(10f, 5f)
                horizontalLineToRelative(4f)
                lineTo(14f, 2f)
                horizontalLineToRelative(6f)
                lineTo(20f, 5f)
                horizontalLineToRelative(0.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 8.5f)
                close()
                moveTo(21f, 8.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, -0.5f)
                lineTo(3.5f, 8f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, 0.5f)
                lineTo(3f, 19f)
                lineTo(21f, 19f)
                close()
            }
        }.also { _CarBattery = it}
