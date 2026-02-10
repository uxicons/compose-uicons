package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ReferArrow: ImageVector? = null

val Icons.Sc.ReferArrow: ImageVector
    get() = _ReferArrow ?: UXIcon(name = "ReferArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4.0f, 6.5f)
                curveToRelative(0f, -3.75f, 1.75f, -5.5f, 5.5f, -5.5f)
                reflectiveCurveToRelative(5.5f, 1.75f, 5.5f, 5.5f)
                reflectiveCurveToRelative(-1.75f, 5.5f, -5.5f, 5.5f)
                reflectiveCurveToRelative(-5.5f, -1.75f, -5.5f, -5.5f)
                close()
                moveTo(22.8f, 16.4f)
                curveToRelative(-0.91f, -1.21f, -1.99f, -2.29f, -3.2f, -3.2f)
                curveToRelative(-0.3f, -0.23f, -0.71f, -0.26f, -1.05f, -0.1f)
                reflectiveCurveToRelative(-0.55f, 0.52f, -0.55f, 0.89f)
                verticalLineToRelative(1.53f)
                curveToRelative(-2.17f, 0.22f, -5.0f, 1.89f, -5.0f, 5.97f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                curveToRelative(0f, -2.17f, 1.21f, -2.77f, 2f, -2.94f)
                verticalLineToRelative(1.44f)
                curveToRelative(0f, 0.38f, 0.21f, 0.72f, 0.55f, 0.89f)
                curveToRelative(0.34f, 0.17f, 0.74f, 0.13f, 1.05f, -0.1f)
                curveToRelative(1.21f, -0.91f, 2.29f, -1.99f, 3.2f, -3.2f)
                curveToRelative(0.27f, -0.35f, 0.27f, -0.84f, 0f, -1.2f)
                close()
                moveTo(14.2f, 14.89f)
                curveToRelative(-1.25f, -0.61f, -2.81f, -0.91f, -4.7f, -0.89f)
                curveToRelative(-5.64f, -0.07f, -8.35f, 2.72f, -8.5f, 7.94f)
                curveToRelative(-0.02f, 0.57f, 0.43f, 1.06f, 1.0f, 1.06f)
                horizontalLineToRelative(9.35f)
                curveToRelative(-0.22f, -0.46f, -0.35f, -0.96f, -0.35f, -1.5f)
                curveToRelative(0f, -3.07f, 1.35f, -5.29f, 3.2f, -6.61f)
                close()
            }
        }.also { _ReferArrow = it}
