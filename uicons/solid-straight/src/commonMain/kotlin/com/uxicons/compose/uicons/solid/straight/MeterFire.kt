package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MeterFire: ImageVector? = null

val Icons.Ss.MeterFire: ImageVector
    get() = _MeterFire ?: UXIcon(name = "MeterFire") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 18f)
                curveToRelative(0f, -2.54f, 1.46f, -4.34f, 2.56f, -5.48f)
                lineToRelative(1.47f, -1.52f)
                horizontalLineToRelative(-1.03f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3.04f)
                curveToRelative(0.29f, -0.23f, 2f, -1.94f, 2f, -1.94f)
                verticalLineToRelative(-1.1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1.17f)
                reflectiveCurveToRelative(1.24f, 1.18f, 1.75f, 1.62f)
                curveToRelative(1.02f, 0.89f, 2.22f, 1.93f, 3.21f, 3.15f)
                curveToRelative(0.02f, -0.31f, 0.04f, -0.62f, 0.04f, -0.94f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                reflectiveCurveTo(0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                curveToRelative(0.23f, 0f, 0.46f, -0.01f, 0.69f, -0.02f)
                curveToRelative(-1.65f, -1.47f, -2.69f, -3.6f, -2.69f, -5.98f)
                close()
                moveTo(7f, 11f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                close()
                moveTo(9f, 7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                close()
                moveTo(18f, 10f)
                curveToRelative(-1.82f, 2.1f, -1.46f, 6f, -2.72f, 6f)
                curveToRelative(-0.61f, 0f, -1.29f, -2.09f, -1.29f, -2.09f)
                curveToRelative(-0.99f, 1.03f, -2.0f, 2.36f, -2.0f, 4.09f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                curveToRelative(0f, -3.47f, -4.11f, -6.11f, -6f, -8f)
                close()
                moveTo(19.41f, 21.41f)
                curveToRelative(-0.78f, 0.78f, -2.05f, 0.78f, -2.83f, 0f)
                curveToRelative(-0.78f, -0.78f, -0.78f, -2.05f, 0f, -2.83f)
                lineToRelative(1.42f, -1.42f)
                lineToRelative(1.42f, 1.42f)
                horizontalLineToRelative(0f)
                curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0f, 2.83f)
                close()
            }
        }.also { _MeterFire = it}
