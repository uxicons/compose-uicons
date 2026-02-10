package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TankWater: ImageVector? = null

val Icons.Ts.TankWater: ImageVector
    get() = _TankWater ?: UXIcon(name = "TankWater") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.88f, 7.12f)
                curveToRelative(0.57f, 0.57f, 1.32f, 0.88f, 2.12f, 0.88f)
                reflectiveCurveToRelative(1.55f, -0.31f, 2.12f, -0.88f)
                curveToRelative(1.17f, -1.17f, 1.17f, -3.07f, 0.02f, -4.22f)
                lineTo(12f, 0.5f)
                lineToRelative(-2.12f, 2.38f)
                curveToRelative(-1.17f, 1.17f, -1.17f, 3.07f, 0f, 4.24f)
                close()
                moveTo(10.61f, 3.56f)
                lineToRelative(1.4f, -1.56f)
                lineToRelative(1.41f, 1.58f)
                curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0f, 2.83f)
                curveToRelative(-0.76f, 0.76f, -2.07f, 0.76f, -2.83f, 0f)
                curveToRelative(-0.78f, -0.78f, -0.78f, -2.05f, 0.02f, -2.85f)
                close()
                moveTo(21.5f, 0f)
                horizontalLineToRelative(-7.26f)
                lineToRelative(0.89f, 1f)
                horizontalLineToRelative(6.37f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(11.45f)
                curveToRelative(-0.17f, 0.03f, -0.33f, 0.05f, -0.5f, 0.05f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                curveToRelative(-0.17f, 0f, -0.34f, -0.02f, -0.5f, -0.05f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(6.37f)
                lineToRelative(0.89f, -1f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 23f)
                lineTo(1f, 23f)
                verticalLineToRelative(-8.04f)
                curveToRelative(0.17f, 0.02f, 0.33f, 0.04f, 0.5f, 0.04f)
                curveToRelative(1.52f, 0f, 2.82f, -0.86f, 3.5f, -2.1f)
                curveToRelative(0.68f, 1.25f, 1.98f, 2.1f, 3.5f, 2.1f)
                reflectiveCurveToRelative(2.82f, -0.86f, 3.5f, -2.1f)
                curveToRelative(0.68f, 1.25f, 1.98f, 2.1f, 3.5f, 2.1f)
                reflectiveCurveToRelative(2.82f, -0.86f, 3.5f, -2.1f)
                curveToRelative(0.68f, 1.25f, 1.98f, 2.1f, 3.5f, 2.1f)
                curveToRelative(0.17f, 0f, 0.33f, -0.01f, 0.5f, -0.04f)
                verticalLineToRelative(8.04f)
                close()
            }
        }.also { _TankWater = it}
