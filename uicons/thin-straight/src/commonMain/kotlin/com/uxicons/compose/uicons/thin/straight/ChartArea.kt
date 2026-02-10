package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartArea: ImageVector? = null

val Icons.Ts.ChartArea: ImageVector
    get() = _ChartArea ?: UXIcon(name = "ChartArea") {
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
                moveTo(24f, 10.96f)
                lineToRelative(-3.23f, -3.23f)
                curveToRelative(-0.94f, -0.94f, -2.59f, -0.94f, -3.54f, 0f)
                lineToRelative(-2.23f, 2.23f)
                lineToRelative(-4.23f, -4.23f)
                curveToRelative(-0.94f, -0.94f, -2.59f, -0.94f, -3.54f, 0f)
                lineTo(3.09f, 9.88f)
                lineToRelative(-0.09f, 11.12f)
                lineTo(24f, 21f)
                lineTo(24f, 10.96f)
                close()
                moveTo(4.08f, 10.29f)
                lineToRelative(3.85f, -3.85f)
                curveToRelative(0.57f, -0.57f, 1.55f, -0.57f, 2.12f, 0f)
                lineToRelative(4.94f, 4.94f)
                lineToRelative(2.94f, -2.94f)
                curveToRelative(0.57f, -0.57f, 1.55f, -0.57f, 2.12f, 0f)
                lineToRelative(2.94f, 2.94f)
                verticalLineToRelative(8.62f)
                lineTo(4.0f, 20.0f)
                lineToRelative(0.08f, -9.71f)
                close()
            }
        }.also { _ChartArea = it}
