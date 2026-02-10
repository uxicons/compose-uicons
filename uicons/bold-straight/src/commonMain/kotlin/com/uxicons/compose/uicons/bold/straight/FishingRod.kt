package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FishingRod: ImageVector? = null

val Icons.Bs.FishingRod: ImageVector
    get() = _FishingRod ?: UXIcon(name = "FishingRod") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.83f, 22.68f)
                lineToRelative(0.17f, 1.32f)
                lineToRelative(-3.5f, -1.17f)
                lineToRelative(-3.5f, 1.17f)
                lineToRelative(0.17f, -1.32f)
                curveToRelative(0.19f, -1.49f, 1.09f, -2.72f, 1.79f, -3.48f)
                curveToRelative(-0.94f, -1.07f, -1.96f, -2.63f, -1.96f, -4.37f)
                curveToRelative(0f, -3.22f, 3.5f, -5.83f, 3.5f, -5.83f)
                curveToRelative(0f, 0f, 3.5f, 2.61f, 3.5f, 5.83f)
                curveToRelative(0f, 1.74f, -1.02f, 3.3f, -1.96f, 4.37f)
                curveToRelative(0.7f, 0.76f, 1.61f, 1.99f, 1.79f, 3.48f)
                close()
                moveTo(10f, 15f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                curveToRelative(-0.34f, 0f, -0.68f, -0.04f, -1f, -0.13f)
                verticalLineToRelative(2.63f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.88f, 0.46f, -1.65f, 1.15f, -2.1f)
                curveTo(1.92f, 6.79f, 6.0f, 0f, 19.5f, 0f)
                horizontalLineToRelative(1.5f)
                lineTo(21f, 7f)
                horizontalLineToRelative(-3f)
                lineTo(18f, 3.03f)
                curveToRelative(-7.41f, 0.31f, -11.83f, 3.02f, -13.38f, 8.21f)
                curveToRelative(0.43f, -0.16f, 0.89f, -0.24f, 1.38f, -0.24f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                close()
                moveTo(7.5f, 15f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _FishingRod = it}
