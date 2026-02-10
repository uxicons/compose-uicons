package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleStar: ImageVector? = null

val Icons.Rr.CircleStar: ImageVector
    get() = _CircleStar ?: UXIcon(name = "CircleStar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.02f, 17.35f)
                curveToRelative(-0.19f, 0f, -0.39f, -0.06f, -0.55f, -0.18f)
                curveToRelative(-0.31f, -0.23f, -0.44f, -0.64f, -0.32f, -1.01f)
                lineToRelative(0.86f, -2.76f)
                lineToRelative(-2.18f, -1.77f)
                curveToRelative(-0.29f, -0.25f, -0.4f, -0.65f, -0.27f, -1.01f)
                curveToRelative(0.13f, -0.36f, 0.48f, -0.6f, 0.86f, -0.6f)
                horizontalLineToRelative(2.75f)
                lineToRelative(0.97f, -2.61f)
                curveToRelative(0.13f, -0.36f, 0.48f, -0.6f, 0.86f, -0.6f)
                reflectiveCurveToRelative(0.73f, 0.24f, 0.86f, 0.6f)
                lineToRelative(0.97f, 2.61f)
                horizontalLineToRelative(2.75f)
                curveToRelative(0.38f, 0f, 0.73f, 0.24f, 0.86f, 0.6f)
                reflectiveCurveToRelative(0.02f, 0.77f, -0.27f, 1.02f)
                lineToRelative(-2.17f, 1.77f)
                lineToRelative(0.9f, 2.73f)
                curveToRelative(0.12f, 0.37f, 0f, 0.78f, -0.31f, 1.01f)
                curveToRelative(-0.31f, 0.24f, -0.73f, 0.25f, -1.06f, 0.04f)
                lineToRelative(-2.52f, -1.64f)
                lineToRelative(-2.48f, 1.66f)
                curveToRelative(-0.15f, 0.1f, -0.33f, 0.15f, -0.51f, 0.15f)
                close()
                moveTo(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
                close()
                moveTo(12f, 2f)
                curveTo(6.49f, 2f, 2f, 6.49f, 2f, 12f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.49f, 10f, -10f)
                reflectiveCurveTo(17.51f, 2f, 12f, 2f)
                close()
            }
        }.also { _CircleStar = it}
