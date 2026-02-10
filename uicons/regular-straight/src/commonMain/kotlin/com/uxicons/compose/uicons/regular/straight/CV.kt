package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CV: ImageVector? = null

val Icons.Rs.CV: ImageVector
    get() = _CV ?: UXIcon(name = "CV") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2f, 0f)
                verticalLineToRelative(21f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(9.41f)
                lineToRelative(7.59f, -7.59f)
                lineTo(22f, 0f)
                lineTo(2f, 0f)
                close()
                moveTo(15f, 20.59f)
                verticalLineToRelative(-3.59f)
                horizontalLineToRelative(3.59f)
                lineToRelative(-3.59f, 3.59f)
                close()
                moveTo(20f, 15f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(7f)
                lineTo(5f, 22f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                lineTo(4f, 2f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(13f)
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
                curveToRelative(-0.13f, 0.65f, -0.46f, 1.57f, -1.63f, 1.57f)
                reflectiveCurveToRelative(-1.51f, -0.97f, -1.62f, -1.53f)
                close()
                moveTo(6f, 9.5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
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
                close()
            }
        }.also { _CV = it}
