package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoPeople: ImageVector? = null

val Icons.Rc.NoPeople: ImageVector
    get() = _NoPeople ?: UXIcon(name = "NoPeople") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.97f, 3.76f)
                curveToRelative(-0.08f, -0.33f, -0.33f, -0.6f, -0.65f, -0.71f)
                curveToRelative(-0.13f, -0.04f, -3.23f, -1.05f, -9.32f, -1.05f)
                reflectiveCurveToRelative(-9.19f, 1.01f, -9.32f, 1.05f)
                curveToRelative(-0.32f, 0.11f, -0.57f, 0.38f, -0.65f, 0.71f)
                curveToRelative(-0.04f, 0.17f, -1.03f, 4.17f, -1.03f, 8.24f)
                reflectiveCurveToRelative(0.99f, 8.07f, 1.03f, 8.24f)
                curveToRelative(0.08f, 0.33f, 0.33f, 0.6f, 0.65f, 0.71f)
                curveToRelative(0.13f, 0.04f, 3.23f, 1.05f, 9.32f, 1.05f)
                reflectiveCurveToRelative(9.19f, -1.01f, 9.32f, -1.05f)
                curveToRelative(0.32f, -0.11f, 0.57f, -0.38f, 0.65f, -0.71f)
                curveToRelative(0.04f, -0.17f, 1.03f, -4.17f, 1.03f, -8.24f)
                reflectiveCurveToRelative(-0.99f, -8.07f, -1.03f, -8.24f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-4.34f, 0f, -7.08f, -0.54f, -8.16f, -0.81f)
                curveToRelative(-0.26f, -1.22f, -0.84f, -4.22f, -0.84f, -7.19f)
                reflectiveCurveToRelative(0.58f, -5.97f, 0.84f, -7.19f)
                curveToRelative(1.08f, -0.27f, 3.82f, -0.81f, 8.16f, -0.81f)
                reflectiveCurveToRelative(7.08f, 0.54f, 8.16f, 0.81f)
                curveToRelative(0.26f, 1.22f, 0.84f, 4.22f, 0.84f, 7.19f)
                reflectiveCurveToRelative(-0.58f, 5.97f, -0.84f, 7.19f)
                curveToRelative(-1.08f, 0.27f, -3.82f, 0.81f, -8.16f, 0.81f)
                close()
            }
        }.also { _NoPeople = it}
