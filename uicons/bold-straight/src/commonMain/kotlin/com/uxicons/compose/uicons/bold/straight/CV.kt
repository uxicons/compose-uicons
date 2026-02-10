package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CV: ImageVector? = null

val Icons.Bs.CV: ImageVector
    get() = _CV ?: UXIcon(name = "CV") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.5f, 0f)
                lineTo(5.5f, 0f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(14.38f)
                lineToRelative(5.62f, -5.66f)
                lineTo(22f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(5f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(13f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(5f)
                lineTo(5f, 21f)
                lineTo(5f, 3.5f)
                close()
                moveTo(12.76f, 10.47f)
                lineToRelative(-1.27f, -6.21f)
                horizontalLineToRelative(1.63f)
                lineToRelative(1.2f, 5.89f)
                curveToRelative(0.01f, 0.07f, 0.03f, 0.12f, 0.05f, 0.16f)
                curveToRelative(0.02f, -0.05f, 0.04f, -0.11f, 0.06f, -0.19f)
                lineToRelative(1.18f, -5.86f)
                horizontalLineToRelative(1.63f)
                lineToRelative(-1.24f, 6.17f)
                curveToRelative(-0.13f, 0.65f, -0.56f, 1.57f, -1.63f, 1.57f)
                reflectiveCurveToRelative(-1.51f, -0.97f, -1.62f, -1.53f)
                close()
                moveTo(11f, 6.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.5f, -0.4f, -0.9f, -0.9f, -0.9f)
                reflectiveCurveToRelative(-0.9f, 0.4f, -0.9f, 0.9f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.5f, 0.4f, 0.9f, 0.9f, 0.9f)
                reflectiveCurveToRelative(0.9f, -0.4f, 0.9f, -0.9f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                close()
            }
        }.also { _CV = it}
