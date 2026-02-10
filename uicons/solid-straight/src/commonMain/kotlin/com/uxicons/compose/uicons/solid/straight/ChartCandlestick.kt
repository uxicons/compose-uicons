package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartCandlestick: ImageVector? = null

val Icons.Ss.ChartCandlestick: ImageVector
    get() = _ChartCandlestick ?: UXIcon(name = "ChartCandlestick") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 22f)
                verticalLineToRelative(2f)
                lineTo(3f, 24f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(0f, 0f)
                lineTo(2f, 0f)
                lineTo(2f, 21f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                lineTo(24f, 22f)
                close()
                moveTo(17f, 13f)
                horizontalLineToRelative(-2f)
                lineTo(15f, 3f)
                horizontalLineToRelative(2f)
                lineTo(17f, 0f)
                horizontalLineToRelative(2f)
                lineTo(19f, 3f)
                horizontalLineToRelative(2f)
                lineTo(21f, 13f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                close()
                moveTo(8f, 16f)
                horizontalLineToRelative(-2f)
                lineTo(6f, 3f)
                horizontalLineToRelative(2f)
                lineTo(8f, 0f)
                horizontalLineToRelative(2f)
                lineTo(10f, 3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _ChartCandlestick = it}
