package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Donut: ImageVector? = null

val Icons.Bs.Donut: ImageVector
    get() = _Donut ?: UXIcon(name = "Donut") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 20f)
                reflectiveCurveToRelative(0f, -8.07f, -0.0f, -8.1f)
                curveToRelative(-0.06f, -6.57f, -5.42f, -11.9f, -12.0f, -11.9f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                curveToRelative(0f, 7.35f, 5.72f, 12f, 12f, 12f)
                curveToRelative(2.62f, 0f, 5.03f, -0.85f, 7f, -2.28f)
                verticalLineToRelative(-1.72f)
                horizontalLineToRelative(-2.9f)
                curveToRelative(-1.23f, 0.64f, -2.62f, 1f, -4.1f, 1f)
                curveToRelative(-4.73f, 0f, -8.62f, -3.67f, -8.97f, -8.32f)
                curveToRelative(0.15f, -0.95f, 0.98f, -1.68f, 1.97f, -1.68f)
                curveToRelative(1.1f, 0f, 2.1f, 0.9f, 2.1f, 2f)
                curveToRelative(0.47f, 2.28f, 2.48f, 4f, 4.9f, 4f)
                curveToRelative(1.63f, 0f, 3.09f, -0.79f, 4f, -2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(3f)
                close()
                moveTo(12f, 14f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(20f, 8f)
                curveToRelative(-1.46f, 0f, -2.74f, 0.79f, -3.44f, 1.96f)
                curveToRelative(-0.78f, -1.74f, -2.53f, -2.96f, -4.56f, -2.96f)
                curveToRelative(-1.63f, 0f, -3.09f, 0.79f, -4f, 2.0f)
                curveToRelative(-0.84f, -0.63f, -1.88f, -1.0f, -3f, -1.0f)
                curveToRelative(-0.39f, 0f, -0.76f, 0.04f, -1.12f, 0.13f)
                curveToRelative(1.45f, -3.03f, 4.55f, -5.13f, 8.12f, -5.13f)
                curveToRelative(3.53f, 0f, 6.59f, 2.04f, 8.06f, 5.0f)
                curveToRelative(-0.02f, 0f, -0.04f, 0f, -0.06f, 0f)
                close()
            }
        }.also { _Donut = it}
