package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookAtlas: ImageVector? = null

val Icons.Br.BookAtlas: ImageVector
    get() = _BookAtlas ?: UXIcon(name = "BookAtlas") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.5f, 0f)
            lineTo(6.5f, 0f)
            curveTo(3.47f, 0f, 1f, 2.47f, 1f, 5.5f)
            verticalLineToRelative(14f)
            curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
            horizontalLineToRelative(12f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(23f, 5.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(6.5f, 3f)
            horizontalLineToRelative(11f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            lineTo(20f, 15f)
            lineTo(5.5f, 15f)
            curveToRelative(-0.53f, 0f, -1.03f, 0.09f, -1.5f, 0.26f)
            lineTo(4f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            close()
            moveTo(17.5f, 21f)
            lineTo(5.5f, 21f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(14.5f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            close()
            moveTo(6f, 9f)
            curveToRelative(0f, -2.0f, 0.98f, -3.77f, 2.48f, -4.86f)
            curveToRelative(0.46f, -0.33f, 1.09f, 0.09f, 0.97f, 0.64f)
            curveToRelative(-0.22f, 0.96f, -0.37f, 2.05f, -0.43f, 3.23f)
            horizontalLineToRelative(1.99f)
            curveToRelative(0.09f, -2.55f, 0.49f, -4.49f, 0.98f, -4.49f)
            reflectiveCurveToRelative(0.9f, 1.93f, 0.98f, 4.49f)
            horizontalLineToRelative(1.99f)
            curveToRelative(-0.06f, -1.17f, -0.2f, -2.27f, -0.43f, -3.23f)
            curveToRelative(-0.13f, -0.55f, 0.51f, -0.97f, 0.97f, -0.64f)
            curveToRelative(1.51f, 1.09f, 2.48f, 2.86f, 2.48f, 4.86f)
            reflectiveCurveToRelative(-0.98f, 3.77f, -2.48f, 4.86f)
            curveToRelative(-0.46f, 0.33f, -1.09f, -0.09f, -0.97f, -0.64f)
            curveToRelative(0.22f, -0.96f, 0.37f, -2.05f, 0.43f, -3.23f)
            horizontalLineToRelative(-1.99f)
            curveToRelative(-0.09f, 2.57f, -0.49f, 4.51f, -0.98f, 4.51f)
            reflectiveCurveToRelative(-0.9f, -1.95f, -0.98f, -4.51f)
            horizontalLineToRelative(-1.99f)
            curveToRelative(0.06f, 1.17f, 0.2f, 2.27f, 0.43f, 3.23f)
            curveToRelative(0.13f, 0.55f, -0.51f, 0.97f, -0.97f, 0.64f)
            curveToRelative(-1.51f, -1.09f, -2.48f, -2.86f, -2.48f, -4.86f)
            close()
        }
    }.also { _BookAtlas = it }
