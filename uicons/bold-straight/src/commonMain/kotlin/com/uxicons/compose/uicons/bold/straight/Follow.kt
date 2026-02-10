package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Follow: ImageVector? = null

val Icons.Bs.Follow: ImageVector
    get() = _Follow ?: UXIcon(name = "Follow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 6f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                close()
                moveTo(21f, 3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                close()
                moveTo(23.95f, 11f)
                curveToRelative(0.03f, 0.33f, 0.05f, 0.66f, 0.05f, 1f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveToRelative(-12f, -5.38f, -12f, -12f)
                reflectiveCurveToRelative(5.38f, -12f, 12f, -12f)
                curveToRelative(0.34f, 0f, 0.67f, 0.02f, 1f, 0.04f)
                verticalLineToRelative(3.02f)
                curveToRelative(-0.33f, -0.04f, -0.66f, -0.06f, -1f, -0.06f)
                curveToRelative(-4.96f, 0f, -9f, 4.04f, -9f, 9f)
                curveToRelative(0f, 2.66f, 1.16f, 5.04f, 3f, 6.69f)
                curveToRelative(0f, -2.19f, 1.5f, -3.69f, 3.5f, -3.69f)
                horizontalLineToRelative(5f)
                curveToRelative(2.0f, -0.01f, 3.5f, 1.5f, 3.5f, 3.69f)
                curveToRelative(1.84f, -1.65f, 3f, -4.03f, 3f, -6.69f)
                curveToRelative(0f, -0.34f, -0.02f, -0.67f, -0.06f, -1f)
                close()
                moveTo(12f, 21f)
                curveToRelative(1.05f, 0f, 2.06f, -0.19f, 3f, -0.53f)
                verticalLineToRelative(-1.98f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(1.98f)
                curveToRelative(0.94f, 0.33f, 1.95f, 0.53f, 3f, 0.53f)
                close()
            }
        }.also { _Follow = it}
