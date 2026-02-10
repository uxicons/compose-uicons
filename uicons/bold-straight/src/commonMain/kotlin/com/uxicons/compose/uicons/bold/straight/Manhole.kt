package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Manhole: ImageVector? = null

val Icons.Bs.Manhole: ImageVector
    get() = _Manhole ?: UXIcon(name = "Manhole") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(13.99f, 20.78f)
                curveToRelative(-0.11f, -1.0f, -0.96f, -1.78f, -1.99f, -1.78f)
                reflectiveCurveToRelative(-1.88f, 0.78f, -1.99f, 1.78f)
                curveToRelative(-4.01f, -0.91f, -7.01f, -4.5f, -7.01f, -8.78f)
                reflectiveCurveToRelative(3.0f, -7.87f, 7.01f, -8.78f)
                curveToRelative(0.11f, 1.0f, 0.96f, 1.78f, 1.99f, 1.78f)
                reflectiveCurveToRelative(1.88f, -0.78f, 1.99f, -1.78f)
                curveToRelative(4.01f, 0.91f, 7.01f, 4.5f, 7.01f, 8.78f)
                reflectiveCurveToRelative(-3.0f, 7.87f, -7.01f, 8.78f)
                close()
                moveTo(18.32f, 9f)
                lineTo(5.68f, 9f)
                curveToRelative(0.59f, -1.25f, 1.55f, -2.29f, 2.73f, -3f)
                horizontalLineToRelative(7.18f)
                curveToRelative(1.18f, 0.71f, 2.13f, 1.75f, 2.73f, 3f)
                close()
                moveTo(19f, 12f)
                curveToRelative(0f, 0.52f, -0.06f, 1.02f, -0.17f, 1.5f)
                lineTo(5.17f, 13.5f)
                curveToRelative(-0.11f, -0.48f, -0.17f, -0.98f, -0.17f, -1.5f)
                reflectiveCurveToRelative(0.06f, -1.02f, 0.17f, -1.5f)
                horizontalLineToRelative(13.67f)
                curveToRelative(0.11f, 0.48f, 0.17f, 0.98f, 0.17f, 1.5f)
                close()
                moveTo(5.68f, 15f)
                horizontalLineToRelative(12.63f)
                curveToRelative(-0.59f, 1.25f, -1.55f, 2.29f, -2.73f, 3f)
                horizontalLineToRelative(-7.18f)
                curveToRelative(-1.18f, -0.71f, -2.13f, -1.75f, -2.73f, -3f)
                close()
            }
        }.also { _Manhole = it}
