package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CV: ImageVector? = null

val Icons.Ss.CV: ImageVector
    get() = _CV ?: UXIcon(name = "CV") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 23.41f)
                verticalLineToRelative(-4.41f)
                horizontalLineToRelative(4.41f)
                lineToRelative(-4.41f, 4.41f)
                close()
                moveTo(2f, 0f)
                verticalLineToRelative(21f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(7f)
                lineTo(22f, 0f)
                lineTo(2f, 0f)
                close()
                moveTo(10f, 6f)
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
                verticalLineToRelative(0.5f)
                close()
                moveTo(15.01f, 9.43f)
                curveToRelative(-0.13f, 0.65f, -0.67f, 1.57f, -1.63f, 1.57f)
                reflectiveCurveToRelative(-1.51f, -0.97f, -1.62f, -1.53f)
                lineToRelative(-1.27f, -6.21f)
                horizontalLineToRelative(1.63f)
                lineToRelative(1.2f, 5.89f)
                curveToRelative(0.01f, 0.07f, 0.03f, 0.12f, 0.05f, 0.16f)
                curveToRelative(0.02f, -0.05f, 0.04f, -0.11f, 0.06f, -0.19f)
                lineToRelative(1.18f, -5.86f)
                horizontalLineToRelative(1.63f)
                lineToRelative(-1.24f, 6.17f)
                close()
            }
        }.also { _CV = it}
