package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LimitSpeedometer: ImageVector? = null

val Icons.Ss.LimitSpeedometer: ImageVector
    get() = _LimitSpeedometer ?: UXIcon(name = "LimitSpeedometer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 12f)
                lineToRelative(-7f, 12f)
                horizontalLineToRelative(14f)
                lineToRelative(-7f, -12f)
                close()
                moveTo(18f, 23f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(16f, 20f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(11.77f, 17f)
                lineToRelative(4.08f, -7f)
                horizontalLineToRelative(2.3f)
                lineToRelative(3.01f, 5.16f)
                curveToRelative(0.54f, -1.31f, 0.84f, -2.71f, 0.84f, -4.16f)
                curveTo(22f, 4.93f, 17.07f, 0f, 11f, 0f)
                reflectiveCurveTo(0f, 4.93f, 0f, 11f)
                curveToRelative(0f, 3.57f, 1.75f, 6.94f, 4.69f, 9f)
                lineToRelative(0.58f, 0.41f)
                lineToRelative(2.23f, -3.41f)
                horizontalLineToRelative(4.27f)
                close()
                moveTo(4.52f, 5.82f)
                lineToRelative(1.3f, -1.3f)
                lineToRelative(4.58f, 4.58f)
                curveToRelative(0.19f, -0.06f, 0.39f, -0.1f, 0.6f, -0.1f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                curveToRelative(0f, -0.21f, 0.04f, -0.41f, 0.1f, -0.6f)
                lineToRelative(-4.58f, -4.58f)
                close()
            }
        }.also { _LimitSpeedometer = it}
