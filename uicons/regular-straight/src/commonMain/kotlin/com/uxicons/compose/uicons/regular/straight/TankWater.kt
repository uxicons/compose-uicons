package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TankWater: ImageVector? = null

val Icons.Rs.TankWater: ImageVector
    get() = _TankWater ?: UXIcon(name = "TankWater") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0f)
                horizontalLineToRelative(-7.66f)
                lineToRelative(1.78f, 2f)
                horizontalLineToRelative(5.87f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(9.72f)
                curveToRelative(-0.3f, 0.18f, -0.64f, 0.28f, -1f, 0.28f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                curveToRelative(-0.36f, 0f, -0.7f, -0.11f, -1f, -0.28f)
                lineTo(2.0f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(5.87f)
                lineToRelative(1.78f, -2f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(24f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(2f, 22f)
                verticalLineToRelative(-7.13f)
                curveToRelative(0.33f, 0.08f, 0.66f, 0.14f, 1f, 0.14f)
                curveToRelative(1.2f, 0f, 2.27f, -0.54f, 3f, -1.38f)
                curveToRelative(0.73f, 0.84f, 1.8f, 1.38f, 3f, 1.38f)
                reflectiveCurveToRelative(2.27f, -0.54f, 3f, -1.38f)
                curveToRelative(0.73f, 0.84f, 1.8f, 1.38f, 3f, 1.38f)
                reflectiveCurveToRelative(2.27f, -0.54f, 3f, -1.38f)
                curveToRelative(0.73f, 0.84f, 1.8f, 1.38f, 3f, 1.38f)
                curveToRelative(0.34f, 0f, 0.68f, -0.05f, 1f, -0.14f)
                verticalLineToRelative(7.13f)
                lineTo(2f, 22f)
                close()
                moveTo(9.88f, 8.12f)
                curveToRelative(0.57f, 0.57f, 1.32f, 0.88f, 2.12f, 0.88f)
                reflectiveCurveToRelative(1.55f, -0.31f, 2.12f, -0.88f)
                curveToRelative(1.17f, -1.17f, 1.17f, -3.07f, 0.04f, -4.2f)
                lineToRelative(-2.16f, -2.42f)
                lineToRelative(-2.12f, 2.38f)
                curveToRelative(-1.17f, 1.17f, -1.17f, 3.07f, 0f, 4.24f)
                close()
            }
        }.also { _TankWater = it}
