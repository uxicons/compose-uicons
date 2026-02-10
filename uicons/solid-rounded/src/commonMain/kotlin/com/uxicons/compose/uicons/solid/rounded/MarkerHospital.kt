package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MarkerHospital: ImageVector? = null

val Icons.Sr.MarkerHospital: ImageVector
    get() = _MarkerHospital ?: UXIcon(name = "MarkerHospital") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.5f, 10f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(22.05f, 10.05f)
                curveToRelative(0f, 2.54f, -1.93f, 6.49f, -5.75f, 11.75f)
                curveToRelative(-0.98f, 1.37f, -2.59f, 2.19f, -4.28f, 2.19f)
                curveToRelative(-1.66f, 0.06f, -3.32f, -0.78f, -4.34f, -2.2f)
                curveToRelative(-3.81f, -5.25f, -5.74f, -9.21f, -5.74f, -11.74f)
                curveToRelative(-0.11f, -5.4f, 4.65f, -10.17f, 10.05f, -10.05f)
                curveToRelative(5.54f, 0f, 10.05f, 4.51f, 10.05f, 10.05f)
                close()
                moveTo(17.5f, 10f)
                curveToRelative(0f, -1.5f, -1.1f, -2.74f, -2.54f, -2.96f)
                curveToRelative(-0.22f, -1.44f, -1.47f, -2.54f, -2.96f, -2.54f)
                reflectiveCurveToRelative(-2.74f, 1.1f, -2.96f, 2.54f)
                curveToRelative(-1.44f, 0.22f, -2.54f, 1.47f, -2.54f, 2.96f)
                reflectiveCurveToRelative(1.1f, 2.74f, 2.54f, 2.96f)
                curveToRelative(0.22f, 1.43f, 1.47f, 2.54f, 2.96f, 2.54f)
                reflectiveCurveToRelative(2.74f, -1.1f, 2.96f, -2.54f)
                curveToRelative(1.44f, -0.22f, 2.54f, -1.47f, 2.54f, -2.96f)
                close()
            }
        }.also { _MarkerHospital = it}
