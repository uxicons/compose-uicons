package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FacePensive: ImageVector? = null

val Icons.Bs.FacePensive: ImageVector
    get() = _FacePensive ?: UXIcon(name = "FacePensive") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
                close()
                moveTo(12f, 3f)
                curveTo(7.04f, 3f, 3f, 7.04f, 3f, 12f)
                reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                reflectiveCurveTo(16.96f, 3f, 12f, 3f)
                close()
                moveTo(15f, 16f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-3f)
                close()
                moveTo(11f, 11f)
                reflectiveCurveToRelative(-2f, 1f, -3f, 1f)
                reflectiveCurveToRelative(-3f, -1f, -3f, -1f)
                curveToRelative(0f, 1.63f, 1f, 4f, 3f, 4f)
                reflectiveCurveToRelative(3f, -2.37f, 3f, -4f)
                close()
                moveTo(19f, 11f)
                reflectiveCurveToRelative(-2f, 1f, -3f, 1f)
                reflectiveCurveToRelative(-3f, -1f, -3f, -1f)
                curveToRelative(0f, 1.63f, 1f, 4f, 3f, 4f)
                reflectiveCurveToRelative(3f, -2.37f, 3f, -4f)
                close()
                moveTo(9.33f, 6.55f)
                lineToRelative(-1.66f, -1.11f)
                curveToRelative(-0.77f, 1.16f, -1.85f, 2.06f, -3.04f, 2.53f)
                lineToRelative(0.74f, 1.86f)
                curveToRelative(1.58f, -0.63f, 2.95f, -1.77f, 3.96f, -3.28f)
                close()
                moveTo(19.37f, 7.98f)
                curveToRelative(-1.19f, -0.47f, -2.27f, -1.37f, -3.04f, -2.53f)
                lineToRelative(-1.66f, 1.11f)
                curveToRelative(1.01f, 1.51f, 2.38f, 2.65f, 3.96f, 3.28f)
                lineToRelative(0.74f, -1.86f)
                close()
            }
        }.also { _FacePensive = it}
