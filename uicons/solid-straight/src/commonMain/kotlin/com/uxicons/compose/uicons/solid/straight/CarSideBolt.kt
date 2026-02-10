package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarSideBolt: ImageVector? = null

val Icons.Ss.CarSideBolt: ImageVector
    get() = _CarSideBolt ?: UXIcon(name = "CarSideBolt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 10f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3.83f)
                lineToRelative(-3.98f, -5.71f)
                curveToRelative(-0.56f, -0.8f, -1.48f, -1.28f, -2.46f, -1.28f)
                lineTo(6.38f, 1f)
                curveToRelative(-1.24f, 0f, -2.37f, 0.78f, -2.81f, 1.94f)
                lineToRelative(-1.92f, 5.06f)
                horizontalLineToRelative(2.34f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(4f)
                lineTo(24f, 17f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(12.77f, 11.43f)
                lineToRelative(-1.76f, 3.53f)
                lineToRelative(-1.79f, -0.89f)
                lineToRelative(1.53f, -3.07f)
                horizontalLineToRelative(-2.13f)
                curveToRelative(-0.51f, 0f, -0.99f, -0.24f, -1.3f, -0.65f)
                reflectiveCurveToRelative(-0.4f, -0.94f, -0.25f, -1.43f)
                lineToRelative(2.22f, -4.16f)
                lineToRelative(1.76f, 0.95f)
                lineToRelative(-1.78f, 3.29f)
                horizontalLineToRelative(2.12f)
                curveToRelative(0.59f, 0f, 1.13f, 0.32f, 1.41f, 0.85f)
                curveToRelative(0.27f, 0.5f, 0.25f, 1.1f, -0.04f, 1.58f)
                close()
                moveTo(7.94f, 19f)
                curveToRelative(0.03f, 0.16f, 0.06f, 0.33f, 0.06f, 0.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                curveToRelative(0f, -0.17f, 0.02f, -0.34f, 0.06f, -0.5f)
                lineTo(7.94f, 19f)
                close()
                moveTo(20.94f, 19f)
                curveToRelative(0.03f, 0.16f, 0.06f, 0.33f, 0.06f, 0.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                curveToRelative(0f, -0.17f, 0.02f, -0.34f, 0.06f, -0.5f)
                horizontalLineToRelative(4.88f)
                close()
            }
        }.also { _CarSideBolt = it}
