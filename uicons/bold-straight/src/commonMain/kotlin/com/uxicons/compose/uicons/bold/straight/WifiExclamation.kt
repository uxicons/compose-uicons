package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WifiExclamation: ImageVector? = null

val Icons.Bs.WifiExclamation: ImageVector
    get() = _WifiExclamation ?: UXIcon(name = "WifiExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.64f, 12.64f)
                curveToRelative(0.7f, -0.7f, 1.5f, -1.27f, 2.36f, -1.7f)
                verticalLineToRelative(3.59f)
                curveToRelative(-0.08f, 0.07f, -0.16f, 0.15f, -0.24f, 0.23f)
                lineToRelative(-2.12f, -2.12f)
                close()
                moveTo(12f, 17f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(2.81f, 9.81f)
                curveToRelative(1.51f, -1.51f, 3.29f, -2.56f, 5.19f, -3.18f)
                lineTo(8f, 3.51f)
                curveToRelative(-2.68f, 0.69f, -5.22f, 2.08f, -7.31f, 4.17f)
                lineToRelative(2.12f, 2.12f)
                close()
                moveTo(16f, 3.51f)
                verticalLineToRelative(3.12f)
                curveToRelative(1.9f, 0.61f, 3.69f, 1.67f, 5.19f, 3.18f)
                lineToRelative(2.12f, -2.12f)
                curveToRelative(-2.1f, -2.1f, -4.63f, -3.49f, -7.31f, -4.17f)
                close()
                moveTo(16f, 14.53f)
                curveToRelative(0.08f, 0.07f, 0.16f, 0.15f, 0.24f, 0.23f)
                lineToRelative(2.12f, -2.12f)
                curveToRelative(-0.7f, -0.7f, -1.5f, -1.27f, -2.36f, -1.7f)
                verticalLineToRelative(3.59f)
                close()
                moveTo(13.5f, 3f)
                horizontalLineToRelative(-3f)
                lineTo(10.5f, 15f)
                horizontalLineToRelative(3f)
                lineTo(13.5f, 3f)
                close()
            }
        }.also { _WifiExclamation = it}
