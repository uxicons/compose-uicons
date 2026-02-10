package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bio: ImageVector? = null

val Icons.Rs.Bio: ImageVector
    get() = _Bio ?: UXIcon(name = "Bio") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveTo(6.49f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                reflectiveCurveToRelative(-4.49f, 10f, -10f, 10f)
                close()
                moveTo(16.7f, 8f)
                curveToRelative(-1.27f, 0f, -2.3f, 1.03f, -2.3f, 2.3f)
                verticalLineToRelative(3.4f)
                curveToRelative(0f, 1.27f, 1.03f, 2.3f, 2.3f, 2.3f)
                reflectiveCurveToRelative(2.3f, -1.03f, 2.3f, -2.3f)
                verticalLineToRelative(-3.4f)
                curveToRelative(0f, -1.27f, -1.03f, -2.3f, -2.3f, -2.3f)
                close()
                moveTo(17.4f, 13.7f)
                curveToRelative(0f, 0.39f, -0.31f, 0.7f, -0.7f, 0.7f)
                reflectiveCurveToRelative(-0.7f, -0.31f, -0.7f, -0.7f)
                verticalLineToRelative(-3.4f)
                curveToRelative(0f, -0.39f, 0.31f, -0.7f, 0.7f, -0.7f)
                reflectiveCurveToRelative(0.7f, 0.31f, 0.7f, 0.7f)
                verticalLineToRelative(3.4f)
                close()
                moveTo(11.4f, 8f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-8f)
                close()
                moveTo(10f, 10.3f)
                curveToRelative(0f, -1.27f, -1.03f, -2.3f, -2.3f, -2.3f)
                horizontalLineToRelative(-2.2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0f, -0.77f, -0.35f, -1.45f, -0.9f, -1.91f)
                curveToRelative(0.25f, -0.37f, 0.4f, -0.81f, 0.4f, -1.29f)
                close()
                moveTo(7.1f, 9.6f)
                horizontalLineToRelative(0.6f)
                curveToRelative(0.39f, 0f, 0.7f, 0.31f, 0.7f, 0.7f)
                reflectiveCurveToRelative(-0.31f, 0.7f, -0.7f, 0.7f)
                horizontalLineToRelative(-0.6f)
                verticalLineToRelative(-1.4f)
                close()
                moveTo(8f, 14.4f)
                horizontalLineToRelative(-0.9f)
                verticalLineToRelative(-1.8f)
                horizontalLineToRelative(0.9f)
                curveToRelative(0.5f, 0f, 0.9f, 0.4f, 0.9f, 0.9f)
                reflectiveCurveToRelative(-0.4f, 0.9f, -0.9f, 0.9f)
                close()
            }
        }.also { _Bio = it}
