package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BikePath: ImageVector? = null

val Icons.Bs.BikePath: ImageVector
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
                moveTo(18.5f, 13f)
                lineTo(5f, 13f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(6.76f)
                curveToRelative(-0.48f, -0.72f, -0.76f, -1.57f, -0.76f, -2.5f)
                curveToRelative(0f, -0.17f, 0.03f, -0.33f, 0.05f, -0.5f)
                lineTo(5f, 6f)
                curveTo(2.24f, 6f, 0f, 8.24f, 0f, 11f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(13.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(6.5f)
                curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
                reflectiveCurveToRelative(-2.47f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(6f, 24f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-3f)
                lineTo(6f, 21f)
                verticalLineToRelative(3f)
                close()
                moveTo(0f, 24f)
                lineTo(4f, 24f)
                verticalLineToRelative(-3f)
                lineTo(0f, 21f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _BikePath = it}
