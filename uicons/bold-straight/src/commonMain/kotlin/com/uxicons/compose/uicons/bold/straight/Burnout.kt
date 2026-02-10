package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Burnout: ImageVector? = null

val Icons.Bs.Burnout: ImageVector
    get() = _Burnout ?: UXIcon(name = "Burnout") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.5f, 14f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
                close()
                moveTo(3f, 6f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
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
                moveTo(21f, 22f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(3f)
                close()
                moveTo(12.07f, 15f)
                horizontalLineToRelative(8.93f)
                curveToRelative(1.18f, 0f, 2.24f, 0.53f, 2.97f, 1.34f)
                curveToRelative(0.02f, -0.2f, 0.03f, -0.41f, 0.03f, -0.61f)
                curveToRelative(0f, -3.72f, -3.87f, -6.28f, -6f, -8.73f)
                curveToRelative(-2.06f, 2.59f, -1.24f, 6.5f, -2.5f, 6.5f)
                curveToRelative(-0.97f, 0f, -1.33f, -2.5f, -1.33f, -2.5f)
                curveToRelative(-0.86f, 0.88f, -1.84f, 2.47f, -2.1f, 4f)
                close()
            }
        }.also { _Burnout = it}
