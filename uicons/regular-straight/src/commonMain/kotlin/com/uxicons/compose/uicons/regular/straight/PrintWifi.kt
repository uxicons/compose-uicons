package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PrintWifi: ImageVector? = null

val Icons.Rs.PrintWifi: ImageVector
    get() = _PrintWifi ?: UXIcon(name = "PrintWifi") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.62f, 6.88f)
                curveToRelative(-1.13f, -1.13f, -3.11f, -1.13f, -4.24f, 0f)
                lineToRelative(-1.41f, -1.41f)
                curveToRelative(0.94f, -0.94f, 2.2f, -1.47f, 3.54f, -1.47f)
                reflectiveCurveToRelative(2.59f, 0.52f, 3.54f, 1.47f)
                close()
                moveTo(12.55f, 4.05f)
                curveToRelative(2.73f, -2.73f, 7.17f, -2.73f, 9.9f, 0f)
                lineToRelative(1.41f, -1.41f)
                curveToRelative(-3.51f, -3.51f, -9.22f, -3.51f, -12.73f, 0f)
                lineToRelative(1.41f, 1.41f)
                close()
                moveTo(16f, 9.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(24f, 9f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-14f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-12f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(6.19f)
                curveToRelative(-0.52f, 0.36f, -1.01f, 0.76f, -1.47f, 1.22f)
                lineToRelative(-0.78f, 0.78f)
                horizontalLineToRelative(-1.94f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4.67f)
                lineToRelative(0.88f, 0.88f)
                reflectiveCurveToRelative(1.12f, 1.12f, 1.12f, 1.12f)
                horizontalLineToRelative(-10.67f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-10f)
                curveToRelative(0f, -0.46f, -0.31f, -0.82f, -0.73f, -0.94f)
                lineToRelative(1.18f, -1.18f)
                reflectiveCurveToRelative(0.3f, -0.3f, 0.3f, -0.3f)
                curveToRelative(0.75f, 0.55f, 1.25f, 1.43f, 1.25f, 2.42f)
                close()
                moveTo(17f, 16f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(10f)
                close()
            }
        }.also { _PrintWifi = it}
