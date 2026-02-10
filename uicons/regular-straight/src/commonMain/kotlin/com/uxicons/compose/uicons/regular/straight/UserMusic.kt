package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserMusic: ImageVector? = null

val Icons.Rs.UserMusic: ImageVector
    get() = _UserMusic ?: UXIcon(name = "UserMusic") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 20.5f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(0f, 0.0f, 0f, 0.0f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                curveToRelative(0.17f, 0f, 0.34f, 0.02f, 0.5f, 0.05f)
                verticalLineToRelative(-5.05f)
                lineToRelative(-5f, 0.71f)
                verticalLineToRelative(7.79f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                curveToRelative(0.17f, 0f, 0.34f, 0.02f, 0.5f, 0.05f)
                verticalLineToRelative(-5.34f)
                curveToRelative(0f, -0.99f, 0.74f, -1.84f, 1.72f, -1.98f)
                lineToRelative(5f, -0.71f)
                curveToRelative(0.58f, -0.08f, 1.16f, 0.09f, 1.59f, 0.47f)
                reflectiveCurveToRelative(0.69f, 0.93f, 0.69f, 1.51f)
                verticalLineToRelative(7.5f)
                close()
                moveTo(2f, 6f)
                curveTo(2f, 2.69f, 4.69f, 0f, 8f, 0f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                close()
                moveTo(4f, 6f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                close()
                moveTo(13f, 14f)
                lineTo(4.5f, 14f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _UserMusic = it}
