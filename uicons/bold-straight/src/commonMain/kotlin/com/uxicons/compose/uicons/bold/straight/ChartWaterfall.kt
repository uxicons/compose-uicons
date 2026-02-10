package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartWaterfall: ImageVector? = null

val Icons.Bs.ChartWaterfall: ImageVector
    get() = _ChartWaterfall ?: UXIcon(name = "ChartWaterfall") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 24f)
                lineTo(3.5f, 24f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(0f, 0f)
                lineTo(3f, 0f)
                lineTo(3f, 20.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                lineTo(24f, 21f)
                verticalLineToRelative(3f)
                close()
                moveTo(24f, 0f)
                horizontalLineToRelative(-3f)
                lineTo(21f, 17f)
                horizontalLineToRelative(3f)
                lineTo(24f, 0f)
                close()
                moveTo(19f, 4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(3f)
                lineTo(19f, 4f)
                close()
                moveTo(14f, 8f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6f)
                close()
                moveTo(9f, 12f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6f)
                close()
            }
        }.also { _ChartWaterfall = it}
