package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartCandlestick: ImageVector? = null

val Icons.Ts.ChartCandlestick: ImageVector
    get() = _ChartCandlestick ?: UXIcon(name = "ChartCandlestick") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 23f)
                verticalLineToRelative(1f)
                lineTo(2.5f, 24f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                lineTo(0f, 0f)
                lineTo(1f, 0f)
                lineTo(1f, 21.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                lineTo(24f, 23f)
                close()
                moveTo(17f, 13f)
                horizontalLineToRelative(-2f)
                lineTo(15f, 3f)
                horizontalLineToRelative(2f)
                lineTo(17f, 0f)
                horizontalLineToRelative(1f)
                lineTo(18f, 3f)
                horizontalLineToRelative(2f)
                lineTo(20f, 13f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3f)
                close()
                moveTo(16f, 12f)
                horizontalLineToRelative(3f)
                lineTo(19f, 4f)
                horizontalLineToRelative(-3f)
                lineTo(16f, 12f)
                close()
                moveTo(8f, 16f)
                horizontalLineToRelative(-2f)
                lineTo(6f, 3f)
                horizontalLineToRelative(2f)
                lineTo(8f, 0f)
                horizontalLineToRelative(1f)
                lineTo(9f, 3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3f)
                close()
                moveTo(7f, 15f)
                horizontalLineToRelative(3f)
                lineTo(10f, 4f)
                horizontalLineToRelative(-3f)
                lineTo(7f, 15f)
                close()
            }
        }.also { _ChartCandlestick = it}
