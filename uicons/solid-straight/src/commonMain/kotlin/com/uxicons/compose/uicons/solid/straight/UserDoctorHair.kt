package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserDoctorHair: ImageVector? = null

val Icons.Ss.UserDoctorHair: ImageVector
    get() = _UserDoctorHair ?: UXIcon(name = "UserDoctorHair") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 12f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                horizontalLineToRelative(2.5f)
                curveToRelative(2.41f, 0f, 4.57f, -1.29f, 5.78f, -3.28f)
                curveToRelative(-0.56f, -0.39f, -1.23f, -0.62f, -1.94f, -0.69f)
                curveToRelative(-0.88f, 1.2f, -2.28f, 1.97f, -3.84f, 1.97f)
                horizontalLineToRelative(-2.15f)
                curveToRelative(0.83f, -2.33f, 3.04f, -4f, 5.65f, -4f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
                moveTo(14f, 18.18f)
                verticalLineToRelative(-4.18f)
                horizontalLineToRelative(-5.02f)
                verticalLineToRelative(4.28f)
                curveToRelative(0.59f, 0.35f, 1f, 0.98f, 1f, 1.72f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                curveToRelative(0f, -0.74f, 0.41f, -1.38f, 1f, -1.72f)
                verticalLineToRelative(-4.28f)
                curveToRelative(-2.75f, 0.01f, -4.98f, 2.25f, -4.98f, 5.0f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.3f, 0.84f, -2.4f, 2f, -2.82f)
                close()
                moveTo(17f, 14f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4.18f)
                curveToRelative(1.16f, 0.41f, 2f, 1.51f, 2f, 2.82f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(15f, 20f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _UserDoctorHair = it}
