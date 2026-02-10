package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarBattery: ImageVector? = null

val Icons.Ss.CarBattery: ImageVector
    get() = _CarBattery ?: UXIcon(name = "CarBattery") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 5f)
                lineTo(21f, 2f)
                lineTo(13f, 2f)
                lineTo(13f, 5f)
                lineTo(11f, 5f)
                lineTo(11f, 2f)
                lineTo(3f, 2f)
                lineTo(3f, 5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 8f)
                lineTo(0f, 22f)
                lineTo(24f, 22f)
                lineTo(24f, 8f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 5f)
                close()
                moveTo(10f, 12f)
                lineTo(4f, 12f)
                lineTo(4f, 10f)
                horizontalLineToRelative(6f)
                close()
                moveTo(20f, 12f)
                lineTo(18f, 12f)
                verticalLineToRelative(2f)
                lineTo(16f, 14f)
                lineTo(16f, 12f)
                lineTo(14f, 12f)
                lineTo(14f, 10f)
                horizontalLineToRelative(2f)
                lineTo(16f, 8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _CarBattery = it}
