package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UsersMedical: ImageVector? = null

val Icons.Ss.UsersMedical: ImageVector
    get() = _UsersMedical ?: UXIcon(name = "UsersMedical") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2f, 3.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                close()
                moveTo(15.81f, 7f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                close()
                moveTo(14.74f, 8f)
                curveToRelative(0.79f, 0.95f, 1.26f, 2.17f, 1.26f, 3.5f)
                curveToRelative(0f, 0.17f, -0.01f, 0.34f, -0.03f, 0.5f)
                horizontalLineToRelative(5.03f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                horizontalLineToRelative(-3.26f)
                close()
                moveTo(20f, 18f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(10.5f, 8f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(5f, 19f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                close()
                moveTo(5f, 11.5f)
                curveToRelative(0f, -1.33f, 0.47f, -2.55f, 1.26f, -3.5f)
                horizontalLineToRelative(-3.26f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5.61f)
                curveToRelative(-0.38f, -0.75f, -0.6f, -1.6f, -0.6f, -2.5f)
                close()
            }
        }.also { _UsersMedical = it}
