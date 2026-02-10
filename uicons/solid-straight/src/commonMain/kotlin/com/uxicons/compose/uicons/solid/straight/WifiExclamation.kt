package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WifiExclamation: ImageVector? = null

val Icons.Ss.WifiExclamation: ImageVector
    get() = _WifiExclamation ?: UXIcon(name = "WifiExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0.69f, 7.69f)
                curveTo(3.04f, 5.33f, 5.95f, 3.87f, 9f, 3.29f)
                verticalLineToRelative(2.05f)
                curveToRelative(-2.53f, 0.55f, -4.94f, 1.8f, -6.9f, 3.76f)
                lineToRelative(-1.41f, -1.41f)
                close()
                moveTo(7.05f, 14.05f)
                curveToRelative(0.58f, -0.58f, 1.24f, -1.03f, 1.95f, -1.37f)
                verticalLineToRelative(-2.16f)
                curveToRelative(-1.25f, 0.44f, -2.4f, 1.15f, -3.36f, 2.12f)
                lineToRelative(1.41f, 1.41f)
                close()
                moveTo(15f, 3.29f)
                verticalLineToRelative(2.05f)
                curveToRelative(2.53f, 0.55f, 4.94f, 1.8f, 6.9f, 3.76f)
                lineToRelative(1.41f, -1.41f)
                curveToRelative(-2.35f, -2.35f, -5.27f, -3.82f, -8.31f, -4.39f)
                close()
                moveTo(15f, 12.68f)
                curveToRelative(0.71f, 0.34f, 1.37f, 0.79f, 1.95f, 1.37f)
                lineToRelative(1.41f, -1.41f)
                curveToRelative(-0.96f, -0.97f, -2.11f, -1.67f, -3.36f, -2.12f)
                verticalLineToRelative(2.16f)
                close()
                moveTo(12f, 17f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(13f, 3f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 15f)
                horizontalLineToRelative(2f)
                lineTo(13f, 3f)
                close()
            }
        }.also { _WifiExclamation = it}
