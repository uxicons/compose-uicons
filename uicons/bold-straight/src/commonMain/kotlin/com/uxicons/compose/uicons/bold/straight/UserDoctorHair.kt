package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserDoctorHair: ImageVector? = null

val Icons.Bs.UserDoctorHair: ImageVector
    get() = _UserDoctorHair ?: UXIcon(name = "UserDoctorHair") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.02f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(9.03f, 5.95f)
                curveToRelative(0.16f, 0.01f, 0.31f, 0.05f, 0.47f, 0.05f)
                curveToRelative(1.82f, 0f, 3.39f, -0.98f, 4.26f, -2.43f)
                curveToRelative(0.76f, 0.55f, 1.26f, 1.43f, 1.26f, 2.43f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                curveToRelative(0f, -0.02f, 0.01f, -0.03f, 0.01f, -0.05f)
                close()
                moveTo(14f, 18.18f)
                curveToRelative(-1.16f, 0.41f, -2f, 1.51f, -2f, 2.82f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.75f, 2.23f, -4.99f, 4.98f, -5.0f)
                verticalLineToRelative(4.28f)
                curveToRelative(-0.59f, 0.35f, -1f, 0.98f, -1f, 1.72f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                curveToRelative(0f, -0.74f, -0.41f, -1.38f, -1f, -1.72f)
                verticalLineToRelative(-4.28f)
                horizontalLineToRelative(5.02f)
                close()
                moveTo(22f, 19f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.3f, -0.84f, -2.4f, -2f, -2.82f)
                verticalLineToRelative(-4.18f)
                horizontalLineToRelative(1f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(16f, 21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _UserDoctorHair = it}
