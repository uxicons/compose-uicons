package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ThermometerHalf: ImageVector? = null

val Icons.Ss.ThermometerHalf: ImageVector
    get() = _ThermometerHalf ?: UXIcon(name = "ThermometerHalf") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 12.11f)
                verticalLineTo(5f)
                curveTo(16.79f, -1.61f, 7.21f, -1.6f, 7f, 5f)
                verticalLineToRelative(7.11f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = false, 10f, 0f)
                close()
                moveTo(12f, 20f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -5.82f)
                verticalLineTo(8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6.18f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 20f)
                close()
            }
        }.also { _ThermometerHalf = it}
