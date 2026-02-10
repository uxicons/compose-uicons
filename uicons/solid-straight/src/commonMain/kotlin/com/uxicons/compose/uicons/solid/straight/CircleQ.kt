package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleQ: ImageVector? = null

val Icons.Ss.CircleQ: ImageVector
    get() = _CircleQ ?: UXIcon(name = "CircleQ") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(16.04f, 18.46f)
                lineToRelative(-1.14f, -1.14f)
                curveToRelative(-0.82f, 0.59f, -1.82f, 0.93f, -2.9f, 0.93f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 0.95f, -0.27f, 1.84f, -0.73f, 2.6f)
                lineToRelative(1.19f, 1.19f)
                lineToRelative(-1.41f, 1.41f)
                close()
                moveTo(12f, 16.25f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 0.4f, -0.08f, 0.77f, -0.22f, 1.12f)
                lineToRelative(-1.58f, -1.58f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(1.66f, 1.66f)
                curveToRelative(-0.43f, 0.24f, -0.93f, 0.38f, -1.46f, 0.38f)
                close()
            }
        }.also { _CircleQ = it}
