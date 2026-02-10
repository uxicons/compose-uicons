package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ThermometerHalf: ImageVector? = null

val Icons.Rs.ThermometerHalf: ImageVector
    get() = _ThermometerHalf ?: UXIcon(name = "ThermometerHalf") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 14.17f)
                lineTo(13f, 8f)
                lineTo(11f, 8f)
                verticalLineToRelative(6.17f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 0f)
                close()
                moveTo(17f, 12.11f)
                lineTo(17f, 5f)
                curveTo(16.79f, -1.61f, 7.21f, -1.6f, 7f, 5f)
                verticalLineToRelative(7.11f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = false, 10f, 0f)
                close()
                moveTo(12f, 22f)
                arcToRelative(5.02f, 5.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.33f, -8.72f)
                lineToRelative(0.33f, -0.3f)
                lineTo(9f, 5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0f)
                verticalLineToRelative(7.98f)
                lineToRelative(0.33f, 0.3f)
                arcTo(5.02f, 5.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                close()
            }
        }.also { _ThermometerHalf = it}
