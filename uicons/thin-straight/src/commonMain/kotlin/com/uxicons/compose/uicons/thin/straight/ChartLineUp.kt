package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartLineUp: ImageVector? = null

val Icons.Ts.ChartLineUp: ImageVector
    get() = _ChartLineUp ?: UXIcon(name = "ChartLineUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.5f, 23f)
                horizontalLineTo(24f)
                verticalLineToRelative(1f)
                horizontalLineTo(2.5f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineTo(0f)
                horizontalLineTo(1f)
                verticalLineTo(21.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(17f, 5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(5.29f)
                lineToRelative(-7.29f, 7.29f)
                lineToRelative(-4f, -4f)
                lineToRelative(-6.85f, 6.85f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(6.15f, -6.15f)
                lineToRelative(4f, 4f)
                lineTo(23f, 6.71f)
                verticalLineToRelative(5.29f)
                horizontalLineToRelative(1f)
                verticalLineTo(5f)
                horizontalLineToRelative(-7f)
                close()
            }
        }.also { _ChartLineUp = it}
