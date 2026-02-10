package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TankWater: ImageVector? = null

val Icons.Ss.TankWater: ImageVector
    get() = _TankWater ?: UXIcon(name = "TankWater") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1f, 12f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                horizontalLineToRelative(1f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(1f)
                close()
                moveTo(9.88f, 3.88f)
                lineToRelative(2.12f, -2.38f)
                lineToRelative(2.16f, 2.42f)
                curveToRelative(1.13f, 1.13f, 1.13f, 3.03f, -0.04f, 4.2f)
                curveToRelative(-0.57f, 0.57f, -1.32f, 0.88f, -2.12f, 0.88f)
                reflectiveCurveToRelative(-1.55f, -0.31f, -2.12f, -0.88f)
                curveToRelative(-1.17f, -1.17f, -1.17f, -3.07f, 0f, -4.24f)
                close()
                moveTo(24f, 14.62f)
                verticalLineToRelative(9.38f)
                lineTo(0f, 24f)
                verticalLineToRelative(-9.38f)
                curveToRelative(0.73f, 0.84f, 1.8f, 1.38f, 3f, 1.38f)
                reflectiveCurveToRelative(2.27f, -0.54f, 3f, -1.38f)
                curveToRelative(0.73f, 0.84f, 1.8f, 1.38f, 3f, 1.38f)
                reflectiveCurveToRelative(2.27f, -0.54f, 3f, -1.38f)
                curveToRelative(0.73f, 0.84f, 1.8f, 1.38f, 3f, 1.38f)
                reflectiveCurveToRelative(2.27f, -0.54f, 3f, -1.38f)
                curveToRelative(0.73f, 0.84f, 1.8f, 1.38f, 3f, 1.38f)
                reflectiveCurveToRelative(2.27f, -0.54f, 3f, -1.38f)
                close()
                moveTo(11.29f, 6.71f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.04f, -1.46f)
                lineToRelative(0.67f, -0.75f)
                lineToRelative(0.71f, 0.79f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(-0.38f, 0.38f, -1.04f, 0.38f, -1.41f, 0f)
                close()
            }
        }.also { _TankWater = it}
