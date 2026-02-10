package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PrintWifi: ImageVector? = null

val Icons.Ts.PrintWifi: ImageVector
    get() = _PrintWifi ?: UXIcon(name = "PrintWifi") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 7f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(20.83f, 5.17f)
                curveToRelative(-1.51f, -1.51f, -4.15f, -1.51f, -5.66f, 0f)
                lineToRelative(0.71f, 0.71f)
                curveToRelative(1.13f, -1.13f, 3.11f, -1.13f, 4.24f, 0f)
                close()
                moveTo(22.95f, 3.05f)
                lineTo(23.66f, 2.34f)
                curveToRelative(-3.12f, -3.12f, -8.2f, -3.12f, -11.31f, 0f)
                lineToRelative(0.71f, 0.71f)
                curveToRelative(2.73f, -2.73f, 7.17f, -2.73f, 9.9f, 0f)
                close()
                moveTo(24f, 8.5f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-14f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-12.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(7.02f)
                curveToRelative(-0.4f, 0.3f, -0.8f, 0.63f, -1.16f, 1f)
                horizontalLineToRelative(-4.86f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(7.17f)
                lineToRelative(1f, 1f)
                horizontalLineToRelative(-11.67f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(11.5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-11.5f)
                curveToRelative(0f, -0.72f, -0.52f, -1.33f, -1.2f, -1.47f)
                lineToRelative(0.78f, -0.78f)
                curveToRelative(0.84f, 0.4f, 1.43f, 1.25f, 1.43f, 2.25f)
                close()
                moveTo(18f, 15f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(12f)
                close()
            }
        }.also { _PrintWifi = it}
