package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserKey: ImageVector? = null

val Icons.Bs.UserKey: ImageVector
    get() = _UserKey ?: UXIcon(name = "UserKey") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 17f)
                horizontalLineToRelative(-7f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(3f)
                close()
                moveTo(3f, 6f)
                curveTo(3f, 2.69f, 5.69f, 0f, 9f, 0f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                close()
                moveTo(6f, 6f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                close()
                moveTo(24f, 15f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                curveToRelative(-0.7f, 0f, -1.38f, -0.15f, -1.98f, -0.41f)
                lineToRelative(-4.41f, 4.41f)
                horizontalLineToRelative(-2.6f)
                reflectiveCurveToRelative(0f, -3.0f, 0f, -3.0f)
                horizontalLineToRelative(1.98f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2.07f)
                lineToRelative(0.32f, -0.3f)
                curveToRelative(-0.18f, -0.51f, -0.29f, -1.05f, -0.29f, -1.62f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                close()
                moveTo(21.5f, 14f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _UserKey = it}
