package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiscDrive: ImageVector? = null

val Icons.Rc.DiscDrive: ImageVector
    get() = _DiscDrive ?: UXIcon(name = "DiscDrive") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 5f)
                curveToRelative(-4.84f, 0f, -7f, 2.16f, -7f, 7f)
                reflectiveCurveToRelative(2.16f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -2.16f, 7f, -7f)
                reflectiveCurveToRelative(-2.16f, -7f, -7f, -7f)
                close()
                moveTo(12f, 17f)
                curveToRelative(-3.74f, 0f, -5f, -1.26f, -5f, -5f)
                reflectiveCurveToRelative(1.26f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 1.26f, 5f, 5f)
                reflectiveCurveToRelative(-1.26f, 5f, -5f, 5f)
                close()
                moveTo(13f, 12f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(21.98f, 2.79f)
                curveToRelative(-0.08f, -0.38f, -0.38f, -0.68f, -0.76f, -0.76f)
                curveToRelative(-0.19f, -0.04f, -4.71f, -1.02f, -9.21f, -1.02f)
                reflectiveCurveToRelative(-9.03f, 0.98f, -9.21f, 1.02f)
                curveToRelative(-0.38f, 0.08f, -0.68f, 0.38f, -0.76f, 0.76f)
                curveToRelative(-0.04f, 0.19f, -1.02f, 4.71f, -1.02f, 9.21f)
                reflectiveCurveToRelative(0.98f, 9.02f, 1.02f, 9.21f)
                curveToRelative(0.08f, 0.38f, 0.38f, 0.68f, 0.76f, 0.76f)
                curveToRelative(0.19f, 0.04f, 4.71f, 1.02f, 9.21f, 1.02f)
                reflectiveCurveToRelative(9.02f, -0.98f, 9.21f, -1.02f)
                curveToRelative(0.38f, -0.08f, 0.68f, -0.38f, 0.76f, -0.76f)
                curveToRelative(0.04f, -0.19f, 1.02f, -4.71f, 1.02f, -9.21f)
                reflectiveCurveToRelative(-0.98f, -9.02f, -1.02f, -9.21f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-3.33f, 0f, -6.76f, -0.58f, -8.15f, -0.85f)
                curveToRelative(-0.27f, -1.39f, -0.85f, -4.82f, -0.85f, -8.15f)
                reflectiveCurveToRelative(0.58f, -6.76f, 0.85f, -8.15f)
                curveToRelative(1.39f, -0.27f, 4.82f, -0.85f, 8.15f, -0.85f)
                reflectiveCurveToRelative(6.76f, 0.58f, 8.15f, 0.85f)
                curveToRelative(0.27f, 1.39f, 0.85f, 4.82f, 0.85f, 8.15f)
                reflectiveCurveToRelative(-0.58f, 6.76f, -0.85f, 8.15f)
                curveToRelative(-1.39f, 0.27f, -4.82f, 0.85f, -8.15f, 0.85f)
                close()
            }
        }.also { _DiscDrive = it}
