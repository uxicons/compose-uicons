package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LimitSpeedometer: ImageVector? = null

val Icons.Bs.LimitSpeedometer: ImageVector
    get() = _LimitSpeedometer ?: UXIcon(name = "LimitSpeedometer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.5f, 17.35f)
                lineToRelative(1.93f, 2.3f)
                lineToRelative(-3.38f, 2.83f)
                lineToRelative(-0.94f, -0.66f)
                curveTo(1.91f, 19.57f, 0f, 15.9f, 0f, 12f)
                curveTo(0f, 5.38f, 5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                curveToRelative(0f, 1.98f, -0.5f, 3.91f, -1.41f, 5.62f)
                lineToRelative(-1.91f, -3.28f)
                curveToRelative(0.2f, -0.75f, 0.32f, -1.54f, 0.32f, -2.33f)
                curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
                reflectiveCurveTo(3f, 7.04f, 3f, 12f)
                curveToRelative(0f, 2.54f, 1.09f, 4.96f, 2.95f, 6.65f)
                lineToRelative(1.55f, -1.3f)
                close()
                moveTo(8.59f, 6.41f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(3.54f, 3.54f)
                curveToRelative(0.04f, 1.07f, 0.92f, 1.92f, 1.99f, 1.92f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                curveToRelative(0f, -1.04f, -0.8f, -1.88f, -1.81f, -1.98f)
                lineToRelative(-3.6f, -3.6f)
                close()
                moveTo(17f, 12f)
                lineToRelative(7f, 12f)
                horizontalLineToRelative(-14f)
                lineToRelative(7f, -12f)
                close()
                moveTo(18f, 21f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(18f, 16f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                close()
            }
        }.also { _LimitSpeedometer = it}
