package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaneTail: ImageVector? = null

val Icons.Tc.PlaneTail: ImageVector
    get() = _PlaneTail ?: UXIcon(name = "PlaneTail") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.79f, 12.63f)
                curveToRelative(1.56f, -4.74f, 2.2f, -9.52f, 2.2f, -9.56f)
                curveToRelative(0.02f, -0.14f, -0.03f, -0.29f, -0.12f, -0.4f)
                reflectiveCurveToRelative(-0.23f, -0.17f, -0.38f, -0.17f)
                horizontalLineToRelative(-2.52f)
                curveToRelative(-1.26f, 0f, -2.46f, 0.63f, -3.19f, 1.68f)
                curveToRelative(-3.08f, 4.41f, -4.89f, 5.92f, -5.23f, 6.18f)
                curveToRelative(-1.86f, -0.23f, -3.89f, -0.36f, -6.06f, -0.36f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(2f)
                curveToRelative(11.59f, 0f, 18.22f, 3.8f, 18.5f, 4.67f)
                curveToRelative(-0.27f, 0.95f, -6.85f, 4.83f, -18.4f, 4.83f)
                curveToRelative(-0.37f, 0f, -1.92f, 0f, -2.07f, -0.0f)
                curveToRelative(-0.28f, -0.02f, -0.53f, 0.21f, -0.53f, 0.5f)
                quadToRelative(0f, 0.5f, 2.6f, 0.5f)
                curveToRelative(11.87f, 0f, 19.4f, -4.07f, 19.4f, -5.79f)
                curveToRelative(0f, -0.75f, -1.5f, -1.97f, -4.21f, -3.08f)
                close()
                moveTo(15.61f, 4.75f)
                curveToRelative(0.55f, -0.79f, 1.43f, -1.25f, 2.37f, -1.25f)
                horizontalLineToRelative(1.94f)
                curveToRelative(-0.21f, 1.38f, -0.85f, 5.08f, -2.06f, 8.77f)
                curveToRelative(-1.88f, -0.69f, -4.23f, -1.31f, -6.98f, -1.73f)
                curveToRelative(0.89f, -0.84f, 2.48f, -2.55f, 4.73f, -5.79f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 16.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                close()
            }
        }.also { _PlaneTail = it}
