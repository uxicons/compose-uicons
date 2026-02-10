package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PrintWifi: ImageVector? = null

val Icons.Ss.PrintWifi: ImageVector
    get() = _PrintWifi ?: UXIcon(name = "PrintWifi") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.62f, 6.88f)
                curveToRelative(-1.13f, -1.13f, -3.11f, -1.13f, -4.24f, 0f)
                lineToRelative(-1.41f, -1.41f)
                curveToRelative(0.94f, -0.94f, 2.2f, -1.47f, 3.54f, -1.47f)
                reflectiveCurveToRelative(2.59f, 0.52f, 3.54f, 1.47f)
                close()
                moveTo(23.86f, 2.64f)
                curveToRelative(-3.51f, -3.51f, -9.22f, -3.51f, -12.73f, 0f)
                lineToRelative(1.41f, 1.41f)
                curveToRelative(2.73f, -2.73f, 7.17f, -2.73f, 9.9f, 0f)
                lineToRelative(1.41f, -1.41f)
                close()
                moveTo(16f, 9.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(6f, 15f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-9f)
                close()
                moveTo(8.31f, 2.64f)
                lineTo(9.72f, 1.22f)
                curveToRelative(0.46f, -0.46f, 0.96f, -0.86f, 1.47f, -1.22f)
                horizontalLineToRelative(-6.19f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5.67f)
                close()
                moveTo(22.11f, 7.22f)
                lineTo(20.84f, 8.49f)
                curveToRelative(0.1f, 0.32f, 0.17f, 0.65f, 0.17f, 1.01f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-10f)
                curveToRelative(0f, -1.26f, -0.78f, -2.34f, -1.89f, -2.78f)
                close()
                moveTo(14f, 9.5f)
                curveToRelative(0f, -0.35f, 0.07f, -0.69f, 0.17f, -1.01f)
                lineToRelative(-1.49f, -1.49f)
                lineToRelative(-9.67f, 0.0f)
                curveToRelative(-1.66f, -0.0f, -3.0f, 1.34f, -3.0f, 3f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(13.5f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                close()
            }
        }.also { _PrintWifi = it}
