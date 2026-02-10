package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartMixed: ImageVector? = null

val Icons.Ts.ChartMixed: ImageVector
    get() = _ChartMixed ?: UXIcon(name = "ChartMixed") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 9.21f)
                lineTo(0.15f, 4.35f)
                lineToRelative(0.71f, -0.71f)
                lineTo(5f, 7.79f)
                lineTo(12f, 0.79f)
                lineToRelative(5f, 5f)
                lineTo(22.65f, 0.15f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-6.35f, 6.35f)
                lineTo(12f, 2.21f)
                lineToRelative(-7f, 7f)
                close()
                moveTo(7f, 14f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(1f)
                lineTo(7f, 14f)
                close()
                moveTo(2f, 12f)
                lineTo(1f, 12f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(1f)
                lineTo(2f, 12f)
                close()
                moveTo(12f, 8f)
                horizontalLineToRelative(-1f)
                lineTo(11f, 24f)
                horizontalLineToRelative(1f)
                lineTo(12f, 8f)
                close()
                moveTo(17f, 11f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(1f)
                lineTo(17f, 11f)
                close()
                moveTo(22f, 7f)
                horizontalLineToRelative(-1f)
                lineTo(21f, 24f)
                horizontalLineToRelative(1f)
                lineTo(22f, 7f)
                close()
            }
        }.also { _ChartMixed = it}
