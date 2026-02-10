package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmartphoneAr: ImageVector? = null

val Icons.Ts.SmartphoneAr: ImageVector
    get() = _SmartphoneAr ?: UXIcon(name = "SmartphoneAr") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 20f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 12.02f)
                curveToRelative(0.34f, 0f, 0.67f, -0.09f, 0.97f, -0.26f)
                lineToRelative(3.03f, -1.78f)
                verticalLineToRelative(-4.94f)
                lineToRelative(-3.03f, -1.78f)
                curveToRelative(-0.6f, -0.35f, -1.35f, -0.35f, -1.95f, 0f)
                lineToRelative(-3.03f, 1.78f)
                verticalLineToRelative(4.94f)
                lineToRelative(3.03f, 1.78f)
                curveToRelative(0.3f, 0.18f, 0.64f, 0.26f, 0.97f, 0.26f)
                close()
                moveTo(11.53f, 4.13f)
                curveToRelative(0.29f, -0.17f, 0.65f, -0.17f, 0.93f, 0f)
                lineToRelative(2.34f, 1.37f)
                lineToRelative(-2.34f, 1.37f)
                curveToRelative(-0.29f, 0.17f, -0.65f, 0.17f, -0.93f, 0f)
                lineToRelative(-2.34f, -1.37f)
                close()
                moveTo(9f, 6.55f)
                lineTo(11.03f, 7.74f)
                curveToRelative(0.3f, 0.18f, 0.64f, 0.26f, 0.97f, 0.26f)
                reflectiveCurveToRelative(0.67f, -0.09f, 0.97f, -0.26f)
                lineToRelative(2.03f, -1.19f)
                verticalLineToRelative(2.87f)
                lineToRelative(-2.53f, 1.49f)
                curveToRelative(-0.29f, 0.17f, -0.65f, 0.17f, -0.93f, 0f)
                lineToRelative(-2.53f, -1.49f)
                verticalLineToRelative(-2.86f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 5.24f)
                verticalLineToRelative(-5.24f)
                horizontalLineToRelative(-16f)
                verticalLineToRelative(5.24f)
                lineToRelative(-4.03f, 2.5f)
                verticalLineToRelative(0.63f)
                lineToRelative(4.03f, 2.49f)
                verticalLineToRelative(10.64f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(11f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-10.64f)
                lineToRelative(3.98f, -2.46f)
                verticalLineToRelative(-0.71f)
                close()
                moveTo(4f, 9.69f)
                lineTo(1.36f, 8.05f)
                lineTo(4f, 6.42f)
                close()
                moveTo(19f, 21.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-11f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(14f)
                close()
                moveTo(19f, 17f)
                horizontalLineToRelative(-14f)
                verticalLineToRelative(-5.52f)
                lineToRelative(7.0f, 4.33f)
                lineToRelative(7.0f, -4.32f)
                close()
                moveTo(19f, 10.31f)
                lineTo(12.0f, 14.63f)
                lineTo(5f, 10.3f)
                verticalLineToRelative(-9.3f)
                horizontalLineToRelative(14f)
                close()
                moveTo(20f, 9.69f)
                verticalLineToRelative(-3.27f)
                lineToRelative(2.65f, 1.64f)
                close()
            }
        }.also { _SmartphoneAr = it}
