package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartArea: ImageVector? = null

val Icons.Ss.ChartArea: ImageVector
    get() = _ChartArea ?: UXIcon(name = "ChartArea") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 24f)
                lineTo(3f, 24f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(0f, 0f)
                lineTo(2f, 0f)
                lineTo(2f, 21f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                lineTo(24f, 22f)
                verticalLineToRelative(2f)
                close()
                moveTo(24.02f, 10.78f)
                lineToRelative(-2.9f, -2.9f)
                curveToRelative(-1.13f, -1.13f, -3.11f, -1.13f, -4.24f, 0f)
                lineToRelative(-1.88f, 1.88f)
                lineToRelative(-3.88f, -3.88f)
                curveToRelative(-1.13f, -1.13f, -3.11f, -1.13f, -4.24f, 0f)
                lineToRelative(-2.88f, 2.88f)
                verticalLineToRelative(11.24f)
                lineTo(24.0f, 20f)
                lineToRelative(0.03f, -9.22f)
                close()
            }
        }.also { _ChartArea = it}
