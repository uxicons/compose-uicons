package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartHistogram: ImageVector? = null

val Icons.Ts.ChartHistogram: ImageVector
    get() = _ChartHistogram ?: UXIcon(name = "ChartHistogram") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 23f)
                verticalLineToRelative(1f)
                lineTo(2.5f, 24f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                lineTo(0f, 0.02f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(21.48f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(21.5f)
                close()
                moveTo(6f, 20.02f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(1f)
                close()
                moveTo(10f, 20.02f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(10f)
                close()
                moveTo(15f, 20.02f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(7f)
                close()
                moveTo(21f, 20.02f)
                verticalLineToRelative(-11.02f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(11.02f)
                horizontalLineToRelative(1f)
                close()
                moveTo(10f, 3.71f)
                lineToRelative(5f, 5f)
                lineTo(22.85f, 0.85f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-7.15f, 7.15f)
                lineToRelative(-5f, -5f)
                lineToRelative(-5.85f, 5.85f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(5.15f, -5.15f)
                close()
            }
        }.also { _ChartHistogram = it}
