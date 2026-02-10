package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartWaterfall: ImageVector? = null

val Icons.Ts.ChartWaterfall: ImageVector
    get() = _ChartWaterfall ?: UXIcon(name = "ChartWaterfall") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 24f)
                lineTo(2.5f, 24f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                lineTo(0f, 0f)
                lineTo(1f, 0f)
                lineTo(1f, 21.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                lineTo(24f, 23f)
                verticalLineToRelative(1f)
                close()
                moveTo(22f, 0f)
                horizontalLineToRelative(-1f)
                lineTo(21f, 17f)
                horizontalLineToRelative(1f)
                lineTo(22f, 0f)
                close()
                moveTo(17f, 4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1f)
                lineTo(17f, 4f)
                close()
                moveTo(12f, 8f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-6f)
                close()
                moveTo(7f, 12f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-6f)
                close()
            }
        }.also { _ChartWaterfall = it}
