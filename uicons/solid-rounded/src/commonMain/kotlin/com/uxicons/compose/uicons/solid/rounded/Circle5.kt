package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Circle5: ImageVector? = null

val Icons.Sr.Circle5: ImageVector
    get() = _Circle5 ?: UXIcon(name = "Circle5") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(14.9f, 16.75f)
                curveToRelative(-0.75f, 0.79f, -1.81f, 1.25f, -2.9f, 1.25f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1.07f, -0.22f, 1.45f, -0.62f)
                curveToRelative(0.38f, -0.4f, 0.58f, -0.93f, 0.55f, -1.49f)
                curveToRelative(-0.06f, -1.04f, -1.03f, -1.89f, -2.17f, -1.89f)
                horizontalLineToRelative(-2.83f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.83f)
                curveToRelative(2.22f, 0f, 4.05f, 1.66f, 4.17f, 3.79f)
                curveToRelative(0.06f, 1.11f, -0.33f, 2.16f, -1.09f, 2.97f)
                close()
            }
        }.also { _Circle5 = it}
