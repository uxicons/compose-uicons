package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WifiSlash: ImageVector? = null

val Icons.Ts.WifiSlash: ImageVector
    get() = _WifiSlash ?: UXIcon(name = "WifiSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 17f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(23.95f, 23.25f)
                lineToRelative(-0.71f, 0.71f)
                lineTo(0.05f, 0.75f)
                lineTo(0.75f, 0.05f)
                lineTo(5.21f, 4.51f)
                curveToRelative(6.1f, -2.86f, 13.31f, -1.61f, 18.1f, 3.18f)
                lineToRelative(-0.71f, 0.71f)
                curveTo(18.2f, 3.99f, 11.61f, 2.78f, 5.97f, 5.26f)
                lineToRelative(4.82f, 4.82f)
                curveToRelative(2.78f, -0.37f, 5.59f, 0.56f, 7.57f, 2.55f)
                lineToRelative(-0.71f, 0.71f)
                curveToRelative(-1.58f, -1.58f, -3.74f, -2.42f, -5.94f, -2.34f)
                lineToRelative(12.24f, 12.24f)
                close()
                moveTo(2.55f, 6.09f)
                lineToRelative(0.72f, 0.72f)
                curveToRelative(-0.66f, 0.48f, -1.29f, 1.01f, -1.87f, 1.59f)
                lineToRelative(-0.71f, -0.71f)
                curveToRelative(0.58f, -0.58f, 1.21f, -1.12f, 1.86f, -1.6f)
                close()
                moveTo(7.61f, 11.15f)
                lineToRelative(0.74f, 0.74f)
                curveToRelative(-0.73f, 0.38f, -1.41f, 0.87f, -2f, 1.46f)
                lineToRelative(-0.71f, -0.71f)
                curveToRelative(0.59f, -0.59f, 1.25f, -1.09f, 1.97f, -1.49f)
                close()
            }
        }.also { _WifiSlash = it}
