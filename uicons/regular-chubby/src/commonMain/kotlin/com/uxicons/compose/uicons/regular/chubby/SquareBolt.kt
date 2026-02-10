package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareBolt: ImageVector? = null

val Icons.Rc.SquareBolt: ImageVector
    get() = _SquareBolt ?: UXIcon(name = "SquareBolt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 12f)
                curveToRelative(0f, 3.92f, -3.22f, 6.65f, -3.36f, 6.77f)
                curveToRelative(-0.42f, 0.35f, -1.05f, 0.3f, -1.41f, -0.13f)
                curveToRelative(-0.35f, -0.42f, -0.3f, -1.05f, 0.13f, -1.41f)
                curveToRelative(0.02f, -0.02f, 2.07f, -1.77f, 2.55f, -4.23f)
                horizontalLineToRelative(-4.9f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -3.92f, 3.22f, -6.65f, 3.36f, -6.77f)
                curveToRelative(0.43f, -0.35f, 1.06f, -0.29f, 1.41f, 0.13f)
                curveToRelative(0.35f, 0.42f, 0.3f, 1.05f, -0.13f, 1.41f)
                curveToRelative(-0.02f, 0.02f, -2.07f, 1.77f, -2.54f, 4.23f)
                horizontalLineToRelative(4.9f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, 4.5f, -0.98f, 9.02f, -1.02f, 9.21f)
                curveToRelative(-0.08f, 0.38f, -0.38f, 0.68f, -0.76f, 0.76f)
                curveToRelative(-0.19f, 0.04f, -4.71f, 1.02f, -9.21f, 1.02f)
                reflectiveCurveToRelative(-9.02f, -0.98f, -9.21f, -1.02f)
                curveToRelative(-0.38f, -0.08f, -0.68f, -0.38f, -0.76f, -0.76f)
                curveToRelative(-0.04f, -0.19f, -1.02f, -4.71f, -1.02f, -9.21f)
                reflectiveCurveToRelative(0.98f, -9.02f, 1.02f, -9.21f)
                curveToRelative(0.08f, -0.38f, 0.38f, -0.68f, 0.76f, -0.76f)
                curveToRelative(0.19f, -0.04f, 4.71f, -1.02f, 9.21f, -1.02f)
                reflectiveCurveToRelative(9.02f, 0.98f, 9.21f, 1.02f)
                curveToRelative(0.38f, 0.08f, 0.68f, 0.38f, 0.76f, 0.76f)
                curveToRelative(0.04f, 0.19f, 1.02f, 4.71f, 1.02f, 9.21f)
                close()
                moveTo(20.15f, 20.15f)
                curveToRelative(0.27f, -1.39f, 0.85f, -4.82f, 0.85f, -8.15f)
                reflectiveCurveToRelative(-0.58f, -6.76f, -0.85f, -8.15f)
                curveToRelative(-1.39f, -0.27f, -4.82f, -0.85f, -8.15f, -0.85f)
                reflectiveCurveToRelative(-6.76f, 0.58f, -8.15f, 0.85f)
                curveToRelative(-0.27f, 1.39f, -0.85f, 4.82f, -0.85f, 8.15f)
                reflectiveCurveToRelative(0.58f, 6.76f, 0.85f, 8.15f)
                curveToRelative(1.39f, 0.27f, 4.82f, 0.85f, 8.15f, 0.85f)
                reflectiveCurveToRelative(6.76f, -0.58f, 8.15f, -0.85f)
                close()
            }
        }.also { _SquareBolt = it}
