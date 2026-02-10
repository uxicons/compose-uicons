package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleQ: ImageVector? = null

val Icons.Rs.CircleQ: ImageVector
    get() = _CircleQ ?: UXIcon(name = "CircleQ") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveTo(6.49f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                reflectiveCurveToRelative(-4.49f, 10f, -10f, 10f)
                close()
                moveTo(17f, 13.25f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                curveToRelative(1.08f, 0f, 2.08f, -0.35f, 2.9f, -0.93f)
                lineToRelative(1.14f, 1.14f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-1.19f, -1.19f)
                curveToRelative(0.47f, -0.76f, 0.73f, -1.65f, 0.73f, -2.6f)
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
