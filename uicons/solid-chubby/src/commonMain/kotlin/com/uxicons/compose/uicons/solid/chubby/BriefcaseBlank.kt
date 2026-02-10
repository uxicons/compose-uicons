package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BriefcaseBlank: ImageVector? = null

val Icons.Sc.BriefcaseBlank: ImageVector
    get() = _BriefcaseBlank ?: UXIcon(name = "BriefcaseBlank") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.95f, 7.14f)
                curveToRelative(-0.1f, -0.3f, -0.34f, -0.53f, -0.64f, -0.63f)
                curveToRelative(-0.09f, -0.03f, -1.7f, -0.53f, -4.81f, -0.82f)
                curveToRelative(0.1f, -2.55f, -1.94f, -4.7f, -4.5f, -4.7f)
                curveToRelative(-2.56f, -0.01f, -4.6f, 2.15f, -4.5f, 4.7f)
                curveToRelative(-3.11f, 0.29f, -4.72f, 0.79f, -4.81f, 0.82f)
                curveToRelative(-0.3f, 0.1f, -0.54f, 0.33f, -0.64f, 0.63f)
                curveToRelative(-0.04f, 0.12f, -1.05f, 3.11f, -1.05f, 7.11f)
                reflectiveCurveToRelative(1.01f, 6.98f, 1.05f, 7.11f)
                curveToRelative(0.1f, 0.3f, 0.34f, 0.53f, 0.64f, 0.63f)
                curveToRelative(0.13f, 0.04f, 3.22f, 1.02f, 9.31f, 1.02f)
                reflectiveCurveToRelative(9.18f, -0.98f, 9.31f, -1.02f)
                curveToRelative(0.3f, -0.1f, 0.54f, -0.33f, 0.64f, -0.63f)
                curveToRelative(0.04f, -0.12f, 1.05f, -3.11f, 1.05f, -7.11f)
                reflectiveCurveToRelative(-1.01f, -6.98f, -1.05f, -7.11f)
                close()
                moveTo(10.5f, 5.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(0.02f)
                curveToRelative(-0.48f, -0.01f, -0.97f, -0.02f, -1.5f, -0.02f)
                reflectiveCurveToRelative(-1.02f, 0.01f, -1.5f, 0.02f)
                close()
            }
        }.also { _BriefcaseBlank = it}
