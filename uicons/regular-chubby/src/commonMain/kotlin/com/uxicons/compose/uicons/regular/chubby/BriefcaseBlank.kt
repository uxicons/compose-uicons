package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BriefcaseBlank: ImageVector? = null

val Icons.Rc.BriefcaseBlank: ImageVector
    get() = _BriefcaseBlank ?: UXIcon(name = "BriefcaseBlank") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.95f, 6.68f)
                curveToRelative(-0.1f, -0.3f, -0.33f, -0.53f, -0.63f, -0.63f)
                curveToRelative(-0.1f, -0.03f, -1.86f, -0.61f, -5.32f, -0.89f)
                curveToRelative(0.08f, -2.26f, -1.74f, -4.16f, -4f, -4.16f)
                curveToRelative(-2.27f, -0.01f, -4.08f, 1.9f, -4f, 4.16f)
                curveToRelative(-3.45f, 0.28f, -5.22f, 0.86f, -5.32f, 0.89f)
                curveToRelative(-0.3f, 0.1f, -0.53f, 0.33f, -0.63f, 0.63f)
                curveToRelative(-0.04f, 0.13f, -1.05f, 3.2f, -1.05f, 7.32f)
                reflectiveCurveToRelative(1.01f, 7.19f, 1.05f, 7.32f)
                curveToRelative(0.1f, 0.3f, 0.33f, 0.53f, 0.63f, 0.63f)
                curveToRelative(0.13f, 0.04f, 3.22f, 1.05f, 9.32f, 1.05f)
                reflectiveCurveToRelative(9.19f, -1.01f, 9.32f, -1.05f)
                curveToRelative(0.3f, -0.1f, 0.53f, -0.33f, 0.63f, -0.63f)
                curveToRelative(0.04f, -0.13f, 1.05f, -3.2f, 1.05f, -7.32f)
                reflectiveCurveToRelative(-1.01f, -7.19f, -1.05f, -7.32f)
                close()
                moveTo(10f, 5f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                verticalLineToRelative(0.04f)
                curveToRelative(-0.63f, -0.02f, -1.29f, -0.04f, -2f, -0.04f)
                reflectiveCurveToRelative(-1.37f, 0.01f, -2f, 0.04f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-4.4f, 0f, -7.15f, -0.56f, -8.2f, -0.81f)
                curveToRelative(-0.27f, -0.98f, -0.8f, -3.32f, -0.8f, -6.18f)
                reflectiveCurveToRelative(0.54f, -5.2f, 0.8f, -6.18f)
                curveToRelative(1.05f, -0.26f, 3.8f, -0.81f, 8.2f, -0.81f)
                reflectiveCurveToRelative(7.15f, 0.56f, 8.2f, 0.81f)
                curveToRelative(0.27f, 0.98f, 0.8f, 3.32f, 0.8f, 6.18f)
                reflectiveCurveToRelative(-0.54f, 5.2f, -0.8f, 6.18f)
                curveToRelative(-1.05f, 0.26f, -3.8f, 0.81f, -8.2f, 0.81f)
                close()
            }
        }.also { _BriefcaseBlank = it}
