package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Burnout: ImageVector? = null

val Icons.Ss.Burnout: ImageVector
    get() = _Burnout ?: UXIcon(name = "Burnout") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 6f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                close()
                moveTo(0f, 19f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(-5f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                close()
                moveTo(23f, 19f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(9f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(16f, 22f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                close()
                moveTo(14.17f, 11f)
                curveToRelative(-0.86f, 0.88f, -1.91f, 2.47f, -2.17f, 4f)
                horizontalLineToRelative(9f)
                curveToRelative(1.2f, 0f, 2.27f, 0.54f, 3f, 1.38f)
                curveToRelative(0f, -0.35f, 0f, -0.63f, 0f, -0.65f)
                curveToRelative(0f, -3.72f, -3.87f, -6.28f, -6f, -8.73f)
                curveToRelative(-2.06f, 2.59f, -1.24f, 6f, -2.5f, 6f)
                curveToRelative(-0.97f, 0f, -1.33f, -2f, -1.33f, -2f)
                close()
            }
        }.also { _Burnout = it}
