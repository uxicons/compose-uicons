package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Piano: ImageVector? = null

val Icons.Rr.Piano: ImageVector
    get() = _Piano ?: UXIcon(name = "Piano") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.38f, 9.48f)
                curveToRelative(-1.08f, 0f, -2.03f, -0.77f, -2.27f, -1.82f)
                lineToRelative(-0.23f, -1.04f)
                curveToRelative(-0.86f, -3.9f, -4.25f, -6.62f, -8.24f, -6.62f)
                curveTo(3.88f, 0f, 0f, 3.88f, 0f, 8.65f)
                verticalLineToRelative(10.35f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-4.91f)
                curveToRelative(0f, -2.55f, -2.07f, -4.62f, -4.62f, -4.62f)
                close()
                moveTo(8.65f, 2f)
                curveToRelative(3.0f, 0f, 5.64f, 2.12f, 6.28f, 5.05f)
                lineToRelative(0.23f, 1.04f)
                horizontalLineToRelative(0f)
                curveToRelative(0.44f, 2.0f, 2.18f, 3.39f, 4.22f, 3.39f)
                curveToRelative(1.44f, 0f, 2.62f, 1.17f, 2.62f, 2.62f)
                verticalLineToRelative(0.91f)
                lineTo(2f, 15f)
                verticalLineToRelative(-6.35f)
                curveToRelative(0f, -3.67f, 2.98f, -6.65f, 6.65f, -6.65f)
                close()
                moveTo(19f, 22f)
                lineTo(5f, 22f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                close()
            }
        }.also { _Piano = it}
