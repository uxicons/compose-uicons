package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoPeople: ImageVector? = null

val Icons.Sc.NoPeople: ImageVector
    get() = _NoPeople ?: UXIcon(name = "NoPeople") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 12f)
                curveToRelative(0f, 4.08f, -0.99f, 8.07f, -1.03f, 8.24f)
                curveToRelative(-0.08f, 0.33f, -0.33f, 0.6f, -0.65f, 0.71f)
                curveToRelative(-0.13f, 0.04f, -3.23f, 1.05f, -9.32f, 1.05f)
                reflectiveCurveToRelative(-9.19f, -1.01f, -9.32f, -1.05f)
                curveToRelative(-0.32f, -0.11f, -0.57f, -0.38f, -0.65f, -0.71f)
                curveToRelative(-0.04f, -0.17f, -1.03f, -4.17f, -1.03f, -8.24f)
                reflectiveCurveToRelative(0.99f, -8.07f, 1.03f, -8.24f)
                curveToRelative(0.08f, -0.33f, 0.33f, -0.6f, 0.65f, -0.71f)
                curveToRelative(0.13f, -0.04f, 3.23f, -1.05f, 9.32f, -1.05f)
                reflectiveCurveToRelative(9.19f, 1.01f, 9.32f, 1.05f)
                curveToRelative(0.32f, 0.11f, 0.57f, 0.38f, 0.65f, 0.71f)
                curveToRelative(0.04f, 0.17f, 1.03f, 4.17f, 1.03f, 8.24f)
                close()
            }
        }.also { _NoPeople = it}
