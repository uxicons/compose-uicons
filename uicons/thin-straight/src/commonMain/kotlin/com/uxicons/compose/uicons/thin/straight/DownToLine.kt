package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DownToLine: ImageVector? = null

val Icons.Ts.DownToLine: ImageVector
    get() = _DownToLine ?: UXIcon(name = "DownToLine") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 21f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.69f, 0f, -1.35f, -0.27f, -1.83f, -0.76f)
                horizontalLineToRelative(0f)
                reflectiveCurveTo(0.33f, 10f, 0.33f, 10f)
                lineTo(7f, 10f)
                lineTo(7f, 0f)
                horizontalLineToRelative(10f)
                lineTo(17f, 10f)
                horizontalLineToRelative(6.67f)
                lineToRelative(-9.83f, 10.23f)
                curveToRelative(-0.5f, 0.5f, -1.15f, 0.77f, -1.84f, 0.77f)
                close()
                moveTo(10.88f, 19.53f)
                curveToRelative(0.3f, 0.3f, 0.7f, 0.46f, 1.12f, 0.47f)
                horizontalLineToRelative(0f)
                curveToRelative(0.43f, 0f, 0.83f, -0.17f, 1.13f, -0.47f)
                lineToRelative(8.2f, -8.53f)
                horizontalLineToRelative(-5.33f)
                lineTo(16f, 1f)
                lineTo(8f, 1f)
                lineTo(8f, 11f)
                lineTo(2.67f, 11f)
                lineToRelative(8.2f, 8.53f)
                close()
                moveTo(24f, 23f)
                lineTo(0f, 23f)
                verticalLineToRelative(1f)
                lineTo(24f, 24f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _DownToLine = it}
