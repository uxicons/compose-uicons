package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Screwdriver: ImageVector? = null

val Icons.Ts.Screwdriver: ImageVector
    get() = _Screwdriver ?: UXIcon(name = "Screwdriver") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.87f, 8f)
                lineToRelative(3.1f, -5.39f)
                lineTo(21.39f, 0.03f)
                lineToRelative(-5.39f, 3.1f)
                verticalLineToRelative(4.17f)
                lineToRelative(-5.58f, 5.58f)
                lineToRelative(-1.56f, -1.54f)
                lineTo(0.81f, 19.38f)
                curveToRelative(-0.51f, 0.51f, -0.79f, 1.19f, -0.79f, 1.91f)
                reflectiveCurveToRelative(0.28f, 1.4f, 0.79f, 1.91f)
                curveToRelative(0.51f, 0.51f, 1.19f, 0.79f, 1.91f, 0.79f)
                reflectiveCurveToRelative(1.4f, -0.28f, 1.91f, -0.79f)
                lineToRelative(8.07f, -8.07f)
                lineToRelative(-1.58f, -1.56f)
                lineToRelative(5.58f, -5.58f)
                horizontalLineToRelative(4.17f)
                close()
                moveTo(3.93f, 22.5f)
                curveToRelative(-0.65f, 0.65f, -1.77f, 0.65f, -2.41f, 0f)
                curveToRelative(-0.32f, -0.32f, -0.5f, -0.75f, -0.5f, -1.21f)
                reflectiveCurveToRelative(0.18f, -0.89f, 0.5f, -1.21f)
                lineToRelative(7.35f, -7.35f)
                lineToRelative(2.43f, 2.4f)
                lineToRelative(-7.36f, 7.36f)
                close()
                moveTo(17f, 3.71f)
                lineToRelative(4.22f, -2.43f)
                lineToRelative(1.5f, 1.5f)
                lineToRelative(-2.43f, 4.22f)
                horizontalLineToRelative(-3.29f)
                verticalLineToRelative(-3.29f)
                close()
            }
        }.also { _Screwdriver = it}
