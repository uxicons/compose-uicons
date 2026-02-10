package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WifiXmark: ImageVector? = null

val Icons.Bs.WifiXmark: ImageVector
    get() = _WifiXmark ?: UXIcon(name = "WifiXmark") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.31f, 8.69f)
                lineToRelative(-2.12f, 2.12f)
                curveToRelative(-0.96f, -0.96f, -2.04f, -1.74f, -3.19f, -2.34f)
                verticalLineToRelative(-3.3f)
                curveToRelative(1.94f, 0.78f, 3.75f, 1.95f, 5.31f, 3.52f)
                close()
                moveTo(6f, 5.17f)
                curveToRelative(-1.94f, 0.78f, -3.75f, 1.95f, -5.31f, 3.52f)
                lineToRelative(2.12f, 2.12f)
                curveToRelative(0.96f, -0.96f, 2.04f, -1.74f, 3.19f, -2.34f)
                verticalLineToRelative(-3.3f)
                close()
                moveTo(4.93f, 12.93f)
                lineToRelative(2.12f, 2.12f)
                curveToRelative(1.32f, -1.32f, 3.08f, -2.05f, 4.95f, -2.05f)
                reflectiveCurveToRelative(3.63f, 0.73f, 4.95f, 2.05f)
                lineToRelative(2.12f, -2.12f)
                curveToRelative(-1.89f, -1.89f, -4.4f, -2.93f, -7.07f, -2.93f)
                reflectiveCurveToRelative(-5.18f, 1.04f, -7.07f, 2.93f)
                close()
                moveTo(9.69f, 8.93f)
                lineToRelative(2.31f, -2.31f)
                lineToRelative(2.31f, 2.31f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-2.31f, -2.31f)
                lineToRelative(2.31f, -2.31f)
                lineTo(14.31f, 0.07f)
                lineToRelative(-2.31f, 2.31f)
                lineTo(9.69f, 0.07f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(2.31f, 2.31f)
                lineToRelative(-2.31f, 2.31f)
                lineToRelative(2.12f, 2.12f)
                close()
                moveTo(12f, 17f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
                close()
            }
        }.also { _WifiXmark = it}
