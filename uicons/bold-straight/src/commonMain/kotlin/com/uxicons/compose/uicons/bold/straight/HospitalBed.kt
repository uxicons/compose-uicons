package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HospitalBed: ImageVector? = null

val Icons.Bs.HospitalBed: ImageVector
    get() = _HospitalBed ?: UXIcon(name = "HospitalBed") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 11.5f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                curveToRelative(0f, -1.21f, 0.86f, -2.22f, 2f, -2.45f)
                verticalLineToRelative(-2.05f)
                horizontalLineToRelative(-18f)
                verticalLineToRelative(2.05f)
                curveToRelative(1.14f, 0.23f, 2f, 1.24f, 2f, 2.45f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-19.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(6.05f)
                curveToRelative(0.17f, -0.02f, 0.33f, -0.05f, 0.5f, -0.05f)
                horizontalLineToRelative(2.18f)
                curveToRelative(0.59f, 1.25f, 1.55f, 2.29f, 2.73f, 3f)
                horizontalLineToRelative(-4.91f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-4.91f)
                curveToRelative(1.18f, -0.71f, 2.13f, -1.75f, 2.73f, -3f)
                horizontalLineToRelative(2.18f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(7f, 5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                close()
                moveTo(9f, 6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.also { _HospitalBed = it}
