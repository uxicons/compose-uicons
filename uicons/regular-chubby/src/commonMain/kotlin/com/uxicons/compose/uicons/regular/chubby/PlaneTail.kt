package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaneTail: ImageVector? = null

val Icons.Rc.PlaneTail: ImageVector
    get() = _PlaneTail ?: UXIcon(name = "PlaneTail") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.14f, 12.23f)
                curveToRelative(1.37f, -4.34f, 1.84f, -8.45f, 1.86f, -8.62f)
                curveToRelative(0.03f, -0.28f, -0.06f, -0.56f, -0.25f, -0.78f)
                curveToRelative(-0.19f, -0.21f, -0.46f, -0.33f, -0.74f, -0.33f)
                horizontalLineToRelative(-2.3f)
                curveToRelative(-1.37f, 0f, -2.67f, 0.68f, -3.47f, 1.81f)
                curveToRelative(-2.59f, 3.68f, -4.15f, 5.12f, -4.63f, 5.52f)
                curveToRelative(-1.76f, -0.21f, -3.64f, -0.33f, -5.6f, -0.33f)
                curveToRelative(-2.72f, 0f, -3f, 0f, -3f, 1.0f)
                curveToRelative(0f, 0.56f, 0.49f, 1.03f, 1.04f, 1f)
                curveToRelative(0.18f, -0.0f, 1.62f, 0f, 1.96f, -0.0f)
                curveToRelative(9.87f, 0f, 15.58f, 2.87f, 16.83f, 4f)
                curveToRelative(-1.25f, 1.13f, -6.96f, 4f, -16.83f, 4f)
                curveToRelative(-0.35f, 0f, -1.78f, 0f, -1.96f, -0.0f)
                curveToRelative(-0.55f, -0.02f, -1.04f, 0.43f, -1.04f, 1f)
                curveToRelative(0f, 1.0f, 0.28f, 1.0f, 3f, 1.0f)
                curveToRelative(10.84f, 0f, 19f, -3.64f, 19f, -6f)
                curveToRelative(0f, -0.98f, -1.42f, -2.19f, -3.86f, -3.27f)
                close()
                moveTo(15.87f, 5.46f)
                curveToRelative(0.42f, -0.6f, 1.11f, -0.96f, 1.83f, -0.96f)
                horizontalLineToRelative(1.15f)
                curveToRelative(-0.22f, 1.47f, -0.71f, 4.21f, -1.59f, 7.01f)
                curveToRelative(-1.49f, -0.51f, -3.23f, -0.96f, -5.16f, -1.31f)
                curveToRelative(0.88f, -0.93f, 2.13f, -2.42f, 3.77f, -4.74f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 16.5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
            }
        }.also { _PlaneTail = it}
