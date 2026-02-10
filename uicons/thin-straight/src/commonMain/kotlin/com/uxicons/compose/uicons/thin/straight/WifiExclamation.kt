package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WifiExclamation: ImageVector? = null

val Icons.Ts.WifiExclamation: ImageVector
    get() = _WifiExclamation ?: UXIcon(name = "WifiExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.64f, 12.64f)
                curveToRelative(0.97f, -0.97f, 2.11f, -1.68f, 3.36f, -2.13f)
                verticalLineToRelative(1.07f)
                curveToRelative(-0.98f, 0.4f, -1.88f, 0.99f, -2.66f, 1.76f)
                lineToRelative(-0.71f, -0.71f)
                close()
                moveTo(1.39f, 8.39f)
                curveToRelative(2.11f, -2.11f, 4.74f, -3.52f, 7.61f, -4.1f)
                verticalLineToRelative(-1.02f)
                curveTo(5.87f, 3.87f, 2.99f, 5.38f, 0.69f, 7.69f)
                lineToRelative(0.71f, 0.71f)
                close()
                moveTo(15f, 11.58f)
                curveToRelative(0.98f, 0.4f, 1.88f, 0.99f, 2.66f, 1.76f)
                lineToRelative(0.71f, -0.71f)
                curveToRelative(-0.97f, -0.97f, -2.11f, -1.68f, -3.36f, -2.13f)
                verticalLineToRelative(1.07f)
                close()
                moveTo(15f, 3.28f)
                verticalLineToRelative(1.02f)
                curveToRelative(2.86f, 0.58f, 5.49f, 1.98f, 7.61f, 4.1f)
                lineToRelative(0.71f, -0.71f)
                curveToRelative(-2.3f, -2.3f, -5.18f, -3.82f, -8.31f, -4.41f)
                close()
                moveTo(14f, 19f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(13f, 19f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
                moveTo(12.5f, 3f)
                horizontalLineToRelative(-1f)
                lineTo(11.5f, 15f)
                horizontalLineToRelative(1f)
                lineTo(12.5f, 3f)
                close()
            }
        }.also { _WifiExclamation = it}
