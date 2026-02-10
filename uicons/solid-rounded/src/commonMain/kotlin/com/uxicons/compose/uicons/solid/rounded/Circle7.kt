package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Circle7: ImageVector? = null

val Icons.Sr.Circle7: ImageVector
    get() = _Circle7 ?: UXIcon(name = "Circle7") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(15.79f, 8.89f)
                lineToRelative(-4.92f, 8.6f)
                curveToRelative(-0.18f, 0.32f, -0.52f, 0.5f, -0.87f, 0.5f)
                curveToRelative(-0.17f, 0f, -0.34f, -0.04f, -0.5f, -0.13f)
                curveToRelative(-0.48f, -0.27f, -0.65f, -0.89f, -0.37f, -1.36f)
                lineTo(14.03f, 7.95f)
                lineToRelative(-5.03f, 0.05f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(5f)
                curveToRelative(0.7f, 0f, 1.33f, 0.35f, 1.7f, 0.95f)
                curveToRelative(0.37f, 0.59f, 0.4f, 1.32f, 0.09f, 1.95f)
                close()
            }
        }.also { _Circle7 = it}
