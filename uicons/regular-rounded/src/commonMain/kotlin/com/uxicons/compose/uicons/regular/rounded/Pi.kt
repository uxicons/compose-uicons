package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pi: ImageVector? = null

val Icons.Rr.Pi: ImageVector
    get() = _Pi ?: UXIcon(name = "Pi") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 20f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                verticalLineTo(2f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(13.61f)
                curveToRelative(0f, 4.98f, -3.18f, 8.0f, -3.32f, 8.12f)
                curveToRelative(-0.19f, 0.18f, -0.44f, 0.27f, -0.68f, 0.27f)
                curveToRelative(-0.27f, 0f, -0.54f, -0.11f, -0.73f, -0.32f)
                curveToRelative(-0.38f, -0.41f, -0.35f, -1.04f, 0.05f, -1.41f)
                curveToRelative(0.02f, -0.02f, 2.68f, -2.57f, 2.68f, -6.66f)
                verticalLineTo(2f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-4.37f, 0f, -4.5f, 3.58f, -4.5f, 3.99f)
                curveToRelative(0f, 0.55f, -0.44f, 1f, -0.99f, 1.0f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.55f, 0f, -0.99f, -0.44f, -1f, -0.99f)
                curveToRelative(0f, -0.1f, -0.01f, -2.5f, 1.73f, -4.26f)
                curveTo(2.88f, 0.59f, 4.48f, 0f, 6.5f, 0f)
                horizontalLineToRelative(16.5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(18f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _Pi = it}
