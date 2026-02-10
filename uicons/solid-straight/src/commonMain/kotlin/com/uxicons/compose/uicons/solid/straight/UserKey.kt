package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserKey: ImageVector? = null

val Icons.Ss.UserKey: ImageVector
    get() = _UserKey ?: UXIcon(name = "UserKey") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 10f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                curveToRelative(0f, 0.57f, 0.12f, 1.11f, 0.29f, 1.62f)
                lineToRelative(-0.32f, 0.3f)
                verticalLineToRelative(2.07f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1.98f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2.6f)
                reflectiveCurveToRelative(4.41f, -4.41f, 4.41f, -4.41f)
                curveToRelative(0.61f, 0.26f, 1.28f, 0.41f, 1.98f, 0.41f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                reflectiveCurveToRelative(-2.24f, -5f, -5f, -5f)
                close()
                moveTo(20f, 12.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(3f, 6f)
                curveTo(3f, 2.69f, 5.69f, 0f, 9f, 0f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                close()
                moveTo(8f, 24f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(7.08f)
                curveToRelative(-0.05f, 0.33f, -0.08f, 0.66f, -0.08f, 1f)
                curveToRelative(0f, 0.33f, -0.02f, 2f, -0.02f, 2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1.98f)
                verticalLineToRelative(5f)
                close()
            }
        }.also { _UserKey = it}
