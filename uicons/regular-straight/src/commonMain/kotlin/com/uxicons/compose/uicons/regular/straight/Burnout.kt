package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Burnout: ImageVector? = null

val Icons.Rs.Burnout: ImageVector
    get() = _Burnout ?: UXIcon(name = "Burnout") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(9f, 2f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                close()
                moveTo(5f, 14f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                close()
                moveTo(21f, 17f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(9f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(16f, 22f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(3f)
                reflectiveCurveToRelative(-5f, 0f, -5f, 0f)
                close()
                moveTo(15.5f, 13f)
                curveToRelative(1.26f, 0f, 0.44f, -3.41f, 2.5f, -6f)
                curveToRelative(2.13f, 2.45f, 6f, 5.01f, 6f, 8.73f)
                curveToRelative(0f, 0.06f, 0f, 0.31f, -0.0f, 0.65f)
                curveToRelative(-0.54f, -0.61f, -1.25f, -1.06f, -2.06f, -1.26f)
                curveToRelative(-0.31f, -1.66f, -1.82f, -3.19f, -3.34f, -4.67f)
                curveToRelative(-0.08f, 0.36f, -0.15f, 0.72f, -0.21f, 1.07f)
                curveToRelative(-0.21f, 1.21f, -0.61f, 3.48f, -2.88f, 3.48f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(0.26f, -1.53f, 1.31f, -3.12f, 2.17f, -4f)
                curveToRelative(0f, 0f, 0.36f, 2f, 1.33f, 2f)
                close()
            }
        }.also { _Burnout = it}
