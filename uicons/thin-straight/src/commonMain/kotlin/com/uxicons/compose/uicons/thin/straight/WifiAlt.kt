package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WifiAlt: ImageVector? = null

val Icons.Ts.WifiAlt: ImageVector
    get() = _WifiAlt ?: UXIcon(name = "WifiAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(17.79f, 7.21f)
                curveToRelative(-0.83f, -3.62f, -4.05f, -6.21f, -7.79f, -6.21f)
                curveTo(5.59f, 1f, 2f, 4.59f, 2f, 9f)
                curveToRelative(0f, 1.27f, 0.31f, 2.53f, 0.89f, 3.66f)
                curveToRelative(-1.77f, 0.95f, -2.89f, 2.8f, -2.89f, 4.84f)
                curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                curveToRelative(0f, -1.83f, 1.09f, -3.46f, 2.78f, -4.16f)
                lineToRelative(0.54f, -0.22f)
                lineToRelative(-0.3f, -0.5f)
                curveToRelative(-0.67f, -1.1f, -1.02f, -2.35f, -1.02f, -3.62f)
                curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                curveToRelative(3.37f, 0f, 6.26f, 2.41f, 6.88f, 5.72f)
                lineToRelative(0.06f, 0.34f)
                lineToRelative(0.34f, 0.06f)
                curveToRelative(3.31f, 0.61f, 5.72f, 3.5f, 5.72f, 6.88f)
                curveToRelative(0f, 3.86f, -3.14f, 7f, -7f, 7f)
                verticalLineToRelative(1f)
                curveToRelative(4.41f, 0f, 8f, -3.59f, 8f, -8f)
                curveToRelative(0f, -3.74f, -2.59f, -6.97f, -6.21f, -7.79f)
                close()
                moveTo(9.17f, 20.17f)
                lineToRelative(0.71f, 0.71f)
                curveToRelative(1.13f, -1.13f, 3.11f, -1.13f, 4.24f, 0f)
                lineToRelative(0.71f, -0.71f)
                curveToRelative(-1.51f, -1.51f, -4.15f, -1.51f, -5.66f, 0f)
                close()
                moveTo(16.95f, 18.05f)
                lineToRelative(0.71f, -0.71f)
                curveToRelative(-3.12f, -3.12f, -8.2f, -3.12f, -11.31f, 0f)
                lineToRelative(0.71f, 0.71f)
                curveToRelative(2.73f, -2.73f, 7.17f, -2.73f, 9.9f, 0f)
                close()
            }
        }.also { _WifiAlt = it}
