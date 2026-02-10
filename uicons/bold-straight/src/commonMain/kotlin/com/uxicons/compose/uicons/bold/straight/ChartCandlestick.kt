package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartCandlestick: ImageVector? = null

val Icons.Bs.ChartCandlestick: ImageVector
    get() = _ChartCandlestick ?: UXIcon(name = "ChartCandlestick") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 23.96f)
                lineToRelative(-20.5f, 0.04f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(0f, 0f)
                lineTo(3f, 0f)
                lineTo(3f, 20.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                lineToRelative(20.5f, -0.04f)
                verticalLineToRelative(3f)
                close()
                moveTo(18f, 16f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                lineTo(23f, 2f)
                horizontalLineToRelative(-2f)
                lineTo(21f, 0f)
                horizontalLineToRelative(-3f)
                lineTo(18f, 2f)
                horizontalLineToRelative(-2f)
                lineTo(16f, 14f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(8f, 19f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                lineTo(13f, 3f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 0f)
                horizontalLineToRelative(-3f)
                lineTo(8f, 3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _ChartCandlestick = it}
