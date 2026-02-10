package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TirePressureWarning: ImageVector? = null

val Icons.Ss.TirePressureWarning: ImageVector
    get() = _TirePressureWarning ?: UXIcon(name = "TirePressureWarning") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 13f)
                lineTo(11f, 13f)
                lineTo(11f, 3f)
                horizontalLineToRelative(2f)
                close()
                moveTo(13f, 15f)
                lineTo(11f, 15f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(24f, 12f)
                arcToRelative(12.98f, 12.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.62f, -7.94f)
                arcTo(6.66f, 6.66f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 0f)
                lineTo(18f, 0f)
                arcToRelative(8.64f, 8.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.78f, 5.27f)
                curveTo(23.74f, 10.42f, 21.96f, 17.29f, 17.7f, 20f)
                lineTo(6.3f, 20f)
                curveTo(2.02f, 17.28f, 0.28f, 10.4f, 4.21f, 5.27f)
                arcTo(8.64f, 8.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 0f)
                lineTo(4f, 0f)
                arcTo(6.66f, 6.66f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.62f, 4.06f)
                curveTo(-1.96f, 10.05f, -0.1f, 18.1f, 5f, 21.53f)
                lineTo(5f, 24f)
                lineTo(7f, 24f)
                lineTo(7f, 22f)
                lineTo(9f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                lineTo(11f, 22f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                lineTo(15f, 22f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                lineTo(19f, 21.53f)
                arcTo(11.9f, 11.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 12f)
                close()
            }
        }.also { _TirePressureWarning = it}
