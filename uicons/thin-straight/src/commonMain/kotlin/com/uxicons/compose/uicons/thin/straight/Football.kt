package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Football: ImageVector? = null

val Icons.Ts.Football: ImageVector
    get() = _Football ?: UXIcon(name = "Football") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.4f, 0f, 0f, 5.4f, 0f, 12f)
                reflectiveCurveToRelative(5.4f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.4f, 12f, -12f)
                reflectiveCurveTo(18.6f, 0f, 12f, 0f)
                close()
                moveTo(23f, 12.6f)
                lineToRelative(-3.9f, -2.7f)
                lineToRelative(1.5f, -4.7f)
                curveTo(22.1f, 7f, 23f, 9.4f, 23f, 12f)
                curveTo(23f, 12.2f, 23f, 12.4f, 23f, 12.6f)
                close()
                moveTo(15.7f, 1.7f)
                lineTo(12f, 4.4f)
                lineTo(8.3f, 1.7f)
                curveTo(9.4f, 1.2f, 10.7f, 1f, 12f, 1f)
                reflectiveCurveTo(14.6f, 1.2f, 15.7f, 1.7f)
                close()
                moveTo(3.5f, 5.1f)
                lineToRelative(1.4f, 4.7f)
                lineTo(1f, 12.5f)
                curveToRelative(0f, -0.2f, 0f, -0.3f, 0f, -0.5f)
                curveTo(1f, 9.4f, 1.9f, 7f, 3.5f, 5.1f)
                close()
                moveTo(2.8f, 18f)
                horizontalLineToRelative(4.9f)
                lineToRelative(1.5f, 4.6f)
                curveTo(6.5f, 21.9f, 4.2f, 20.2f, 2.8f, 18f)
                close()
                moveTo(10.2f, 22.9f)
                lineTo(8.4f, 17f)
                horizontalLineTo(2.2f)
                curveToRelative(-0.5f, -1f, -0.9f, -2.2f, -1.1f, -3.4f)
                lineToRelative(5f, -3.5f)
                lineTo(4.3f, 4.2f)
                curveToRelative(0.9f, -0.8f, 1.8f, -1.6f, 2.9f, -2.1f)
                lineTo(12f, 5.6f)
                lineToRelative(4.8f, -3.5f)
                curveToRelative(1.1f, 0.5f, 2.1f, 1.2f, 2.9f, 2.1f)
                lineToRelative(-1.9f, 6f)
                lineToRelative(5f, 3.5f)
                curveToRelative(-0.2f, 1.2f, -0.5f, 2.3f, -1.1f, 3.3f)
                horizontalLineToRelative(-6.2f)
                lineToRelative(-1.9f, 5.9f)
                curveTo(13.2f, 23f, 12.6f, 23f, 12f, 23f)
                reflectiveCurveTo(10.8f, 23f, 10.2f, 22.9f)
                lineTo(10.2f, 22.9f)
                close()
                moveTo(14.9f, 22.6f)
                lineToRelative(1.5f, -4.6f)
                horizontalLineToRelative(4.9f)
                curveTo(19.8f, 20.2f, 17.5f, 21.9f, 14.9f, 22.6f)
                close()
                moveTo(16.8f, 10.4f)
                lineTo(12f, 6.9f)
                lineToRelative(-4.8f, 3.5f)
                lineTo(9f, 16f)
                horizontalLineTo(15f)
                lineTo(16.8f, 10.4f)
                lineTo(16.8f, 10.4f)
                close()
                moveTo(9.8f, 15f)
                lineToRelative(-1.4f, -4.3f)
                lineTo(12f, 8.1f)
                lineToRelative(3.6f, 2.6f)
                lineTo(14.2f, 15f)
                curveTo(14.2f, 15f, 9.8f, 15f, 9.8f, 15f)
                close()
            }
        }.also { _Football = it}
