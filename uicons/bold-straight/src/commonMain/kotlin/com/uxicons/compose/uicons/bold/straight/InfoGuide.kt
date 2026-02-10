package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InfoGuide: ImageVector? = null

val Icons.Bs.InfoGuide: ImageVector
    get() = _InfoGuide ?: UXIcon(name = "InfoGuide") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 12f)
                horizontalLineToRelative(1.07f)
                lineToRelative(1.94f, 1.94f)
                curveToRelative(0.59f, 0.59f, 1.54f, 0.59f, 2.12f, 0f)
                lineToRelative(1.94f, -1.94f)
                horizontalLineToRelative(0.93f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                lineTo(18.0f, 2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-8f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                close()
                moveTo(11f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(11f, 5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                close()
                moveTo(24f, 5.41f)
                verticalLineToRelative(16.41f)
                lineToRelative(-12f, 2.18f)
                lineTo(0f, 21.82f)
                lineTo(0f, 5.41f)
                curveToRelative(0f, -0.94f, 0.38f, -1.82f, 1.06f, -2.47f)
                curveToRelative(0.65f, -0.62f, 1.52f, -0.95f, 2.41f, -0.93f)
                curveToRelative(0.03f, 0f, 0.39f, 0.02f, 0.53f, 0.04f)
                verticalLineToRelative(3.05f)
                reflectiveCurveToRelative(-0.56f, -0.1f, -0.57f, -0.1f)
                verticalLineToRelative(0.0f)
                curveToRelative(-0.16f, -0.01f, -0.25f, 0.07f, -0.3f, 0.11f)
                curveToRelative(-0.06f, 0.06f, -0.13f, 0.15f, -0.13f, 0.29f)
                verticalLineToRelative(13.9f)
                lineToRelative(7.5f, 1.36f)
                verticalLineToRelative(-4.68f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4.68f)
                lineToRelative(7.5f, -1.36f)
                lineTo(21f, 5.41f)
                curveToRelative(0f, -0.17f, -0.09f, -0.27f, -0.15f, -0.31f)
                curveToRelative(-0.06f, -0.05f, -0.17f, -0.12f, -0.34f, -0.09f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(-0.52f, 0.09f, -0.52f, 0.09f)
                verticalLineToRelative(-3.05f)
                curveToRelative(1f, -0.18f, 2.0f, 0.09f, 2.77f, 0.74f)
                curveToRelative(0.78f, 0.65f, 1.23f, 1.6f, 1.23f, 2.62f)
                close()
            }
        }.also { _InfoGuide = it}
