package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BikePath: ImageVector? = null

val Icons.Rs.BikePath: ImageVector
    get() = _BikePath ?: UXIcon(name = "BikePath") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 6.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                curveToRelative(0.01f, 0f, 0.02f, 0.0f, 0.04f, 0.0f)
                lineToRelative(-0.6f, -1.0f)
                horizontalLineToRelative(-0.93f)
                lineTo(14f, 1f)
                horizontalLineToRelative(2.07f)
                lineToRelative(1.36f, 2.27f)
                lineToRelative(1.05f, -0.57f)
                lineToRelative(-0.48f, -0.95f)
                lineTo(18f, 0f)
                horizontalLineToRelative(4f)
                lineTo(22f, 2f)
                horizontalLineToRelative(-1.63f)
                lineToRelative(1.01f, 2.01f)
                curveToRelative(0.04f, -0.0f, 0.08f, -0.01f, 0.12f, -0.01f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                curveToRelative(0f, -0.61f, 0.23f, -1.16f, 0.59f, -1.59f)
                lineToRelative(-0.21f, -0.43f)
                lineToRelative(-1.65f, 0.9f)
                curveToRelative(0.17f, 0.34f, 0.28f, 0.71f, 0.28f, 1.12f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(19f, 14f)
                lineTo(4.5f, 14f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(7.29f)
                curveToRelative(-0.4f, -0.58f, -0.66f, -1.26f, -0.74f, -2f)
                lineTo(4.5f, 7f)
                curveTo(2.02f, 7f, 0f, 9.02f, 0f, 11.5f)
                reflectiveCurveToRelative(2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(14.5f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(7f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                reflectiveCurveToRelative(-2.24f, -5f, -5f, -5f)
                close()
                moveTo(6f, 24f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                lineTo(6f, 22f)
                verticalLineToRelative(2f)
                close()
                moveTo(0f, 24f)
                lineTo(4f, 24f)
                verticalLineToRelative(-2f)
                lineTo(0f, 22f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _BikePath = it}
