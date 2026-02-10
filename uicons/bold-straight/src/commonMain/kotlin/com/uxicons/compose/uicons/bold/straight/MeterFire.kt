package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MeterFire: ImageVector? = null

val Icons.Bs.MeterFire: ImageVector
    get() = _MeterFire ?: UXIcon(name = "MeterFire") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 12f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(10.5f, 12f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(5f)
                close()
                moveTo(10.54f, 20.87f)
                curveToRelative(-4.27f, -0.7f, -7.54f, -4.41f, -7.54f, -8.87f)
                curveTo(3f, 7.04f, 7.04f, 3f, 12f, 3f)
                curveToRelative(4.18f, 0f, 7.7f, 2.88f, 8.7f, 6.75f)
                curveToRelative(0.02f, 0.01f, 0.03f, 0.03f, 0.05f, 0.04f)
                curveToRelative(1.02f, 0.89f, 2.21f, 1.92f, 3.2f, 3.14f)
                curveToRelative(0.02f, -0.31f, 0.05f, -0.62f, 0.05f, -0.93f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                reflectiveCurveTo(0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                curveToRelative(0.23f, 0f, 0.46f, -0.02f, 0.69f, -0.04f)
                curveToRelative(-0.94f, -0.84f, -1.68f, -1.9f, -2.15f, -3.09f)
                close()
                moveTo(24f, 18f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                curveToRelative(0f, -1.73f, 1f, -3.06f, 2.0f, -4.09f)
                curveToRelative(0f, 0f, 0.68f, 2.09f, 1.29f, 2.09f)
                curveToRelative(1.26f, 0f, 0.9f, -3.9f, 2.72f, -6f)
                curveToRelative(1.9f, 1.9f, 6f, 4.53f, 6f, 8f)
                close()
                moveTo(19.41f, 18.59f)
                horizontalLineToRelative(0f)
                lineToRelative(-1.42f, -1.42f)
                lineToRelative(-1.42f, 1.42f)
                curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0f, 2.83f)
                curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0f)
                reflectiveCurveToRelative(0.78f, -2.05f, 0f, -2.83f)
                close()
                moveTo(16.49f, 8.69f)
                lineToRelative(1.51f, -1.69f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(4f)
                curveToRelative(0.31f, -0.81f, 0.88f, -1.6f, 1.49f, -2.31f)
                close()
            }
        }.also { _MeterFire = it}
