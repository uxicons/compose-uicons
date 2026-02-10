package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WifiXmark: ImageVector? = null

val Icons.Rs.WifiXmark: ImageVector
    get() = _WifiXmark ?: UXIcon(name = "WifiXmark") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 7.37f)
                curveToRelative(-1.41f, 0.67f, -2.73f, 1.57f, -3.9f, 2.73f)
                lineToRelative(-1.41f, -1.41f)
                curveToRelative(1.57f, -1.57f, 3.38f, -2.74f, 5.31f, -3.52f)
                verticalLineToRelative(2.2f)
                close()
                moveTo(18f, 5.17f)
                verticalLineToRelative(2.2f)
                curveToRelative(1.41f, 0.67f, 2.73f, 1.57f, 3.9f, 2.73f)
                lineToRelative(1.41f, -1.41f)
                curveToRelative(-1.57f, -1.57f, -3.38f, -2.74f, -5.31f, -3.52f)
                close()
                moveTo(12f, 18f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(5.64f, 13.64f)
                lineToRelative(1.41f, 1.41f)
                curveToRelative(1.32f, -1.32f, 3.08f, -2.05f, 4.95f, -2.05f)
                reflectiveCurveToRelative(3.63f, 0.73f, 4.95f, 2.05f)
                lineToRelative(1.41f, -1.41f)
                curveToRelative(-1.7f, -1.7f, -3.96f, -2.64f, -6.36f, -2.64f)
                reflectiveCurveToRelative(-4.66f, 0.94f, -6.36f, 2.64f)
                close()
                moveTo(9.01f, 8.91f)
                lineToRelative(2.99f, -2.99f)
                lineToRelative(2.99f, 2.99f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-2.99f, -2.99f)
                lineToRelative(2.99f, -2.99f)
                lineTo(14.99f, 0.09f)
                lineToRelative(-2.99f, 2.99f)
                lineTo(9.01f, 0.09f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(2.99f, 2.99f)
                lineToRelative(-2.99f, 2.99f)
                lineToRelative(1.41f, 1.41f)
                close()
            }
        }.also { _WifiXmark = it}
