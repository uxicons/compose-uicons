package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ReferArrow: ImageVector? = null

val Icons.Tc.ReferArrow: ImageVector
    get() = _ReferArrow ?: UXIcon(name = "ReferArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.5f, 12f)
                curveToRelative(3.85f, 0f, 5.5f, -1.65f, 5.5f, -5.5f)
                reflectiveCurveToRelative(-1.65f, -5.5f, -5.5f, -5.5f)
                reflectiveCurveToRelative(-5.5f, 1.64f, -5.5f, 5.5f)
                reflectiveCurveToRelative(1.65f, 5.5f, 5.5f, 5.5f)
                close()
                moveTo(9.5f, 2.0f)
                curveToRelative(3.28f, 0f, 4.5f, 1.22f, 4.5f, 4.5f)
                reflectiveCurveToRelative(-1.22f, 4.5f, -4.5f, 4.5f)
                reflectiveCurveToRelative(-4.5f, -1.22f, -4.5f, -4.5f)
                reflectiveCurveToRelative(1.22f, -4.5f, 4.5f, -4.5f)
                close()
                moveTo(14.25f, 15.94f)
                curveToRelative(-1.13f, -0.63f, -2.69f, -0.94f, -4.75f, -0.94f)
                curveToRelative(-5.47f, 0f, -7.5f, 2.03f, -7.5f, 7.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                curveToRelative(0f, -5.96f, 2.54f, -8.5f, 8.5f, -8.5f)
                curveToRelative(2.24f, 0f, 3.95f, 0.35f, 5.24f, 1.06f)
                curveToRelative(0.24f, 0.13f, 0.33f, 0.44f, 0.19f, 0.68f)
                curveToRelative(-0.13f, 0.24f, -0.44f, 0.33f, -0.68f, 0.19f)
                close()
                moveTo(22.9f, 16.8f)
                curveToRelative(-1.02f, 1.36f, -2.23f, 2.58f, -3.6f, 3.6f)
                curveToRelative(-0.22f, 0.17f, -0.53f, 0.12f, -0.7f, -0.1f)
                curveToRelative(-0.17f, -0.22f, -0.12f, -0.53f, 0.1f, -0.7f)
                curveToRelative(1.01f, -0.76f, 1.91f, -1.64f, 2.72f, -2.6f)
                horizontalLineToRelative(-2.52f)
                curveToRelative(-0.16f, 0.0f, -3.9f, 0.1f, -3.9f, 5.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                curveToRelative(0f, -6.42f, 4.85f, -6.5f, 4.9f, -6.5f)
                horizontalLineToRelative(2.52f)
                curveToRelative(-0.81f, -0.96f, -1.71f, -1.84f, -2.72f, -2.6f)
                curveToRelative(-0.22f, -0.17f, -0.27f, -0.48f, -0.1f, -0.7f)
                curveToRelative(0.17f, -0.22f, 0.48f, -0.27f, 0.7f, -0.1f)
                curveToRelative(1.36f, 1.02f, 2.58f, 2.23f, 3.6f, 3.6f)
                curveToRelative(0.13f, 0.18f, 0.13f, 0.42f, 0f, 0.6f)
                close()
            }
        }.also { _ReferArrow = it}
