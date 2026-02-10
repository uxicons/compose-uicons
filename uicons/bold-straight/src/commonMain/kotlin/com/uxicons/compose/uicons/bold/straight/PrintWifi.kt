package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PrintWifi: ImageVector? = null

val Icons.Bs.PrintWifi: ImageVector
    get() = _PrintWifi ?: UXIcon(name = "PrintWifi") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.96f, 8.83f)
                verticalLineToRelative(9.17f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3.63f)
                curveToRelative(-0.57f, 0.4f, -1.25f, 0.63f, -2f, 0.63f)
                curveToRelative(-1.39f, 0f, -2.59f, -0.82f, -3.15f, -2f)
                horizontalLineToRelative(-8.85f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(10.17f)
                lineToRelative(-5.17f, -5.17f)
                verticalLineToRelative(-1.8f)
                curveToRelative(0.72f, -0.74f, 1.52f, -1.48f, 2.37f, -2.03f)
                horizontalLineToRelative(-5.37f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-12f)
                curveToRelative(0f, -0.87f, -0.38f, -1.65f, -0.97f, -2.2f)
                close()
                moveTo(15.96f, 21f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(8f)
                close()
                moveTo(9.89f, 2.93f)
                curveToRelative(3.9f, -3.9f, 10.24f, -3.9f, 14.14f, 0f)
                lineToRelative(-2.12f, 2.12f)
                curveToRelative(-2.73f, -2.73f, -7.17f, -2.73f, -9.9f, 0f)
                lineToRelative(-2.12f, -2.12f)
                close()
                moveTo(20.5f, 6.46f)
                lineTo(18.38f, 8.59f)
                curveToRelative(-0.75f, -0.76f, -2.07f, -0.76f, -2.83f, 0f)
                lineToRelative(-2.12f, -2.12f)
                curveToRelative(0.94f, -0.94f, 2.2f, -1.47f, 3.54f, -1.47f)
                reflectiveCurveToRelative(2.59f, 0.52f, 3.54f, 1.47f)
                close()
                moveTo(18.46f, 11.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _PrintWifi = it}
