package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CardClub: ImageVector? = null

val Icons.Sr.CardClub: ImageVector
    get() = _CardClub ?: UXIcon(name = "CardClub") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 0f)
                horizontalLineToRelative(-8f)
                curveTo(5.24f, 0f, 3f, 2.24f, 3f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(8f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(21f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(15.96f, 13.43f)
                curveToRelative(-0.15f, 0.73f, -0.73f, 1.33f, -1.45f, 1.51f)
                curveToRelative(-0.74f, 0.18f, -1.44f, -0.05f, -1.9f, -0.52f)
                curveToRelative(0.2f, 0.66f, 0.45f, 1.28f, 0.8f, 1.82f)
                curveToRelative(0.21f, 0.33f, -0.05f, 0.75f, -0.43f, 0.75f)
                horizontalLineToRelative(-1.94f)
                curveToRelative(-0.39f, 0f, -0.64f, -0.43f, -0.43f, -0.75f)
                curveToRelative(0.35f, -0.54f, 0.61f, -1.17f, 0.8f, -1.82f)
                curveToRelative(-0.47f, 0.46f, -1.16f, 0.7f, -1.9f, 0.52f)
                curveToRelative(-0.72f, -0.18f, -1.3f, -0.78f, -1.45f, -1.51f)
                curveToRelative(-0.27f, -1.29f, 0.71f, -2.43f, 1.96f, -2.43f)
                curveToRelative(0.1f, 0f, 0.2f, 0.01f, 0.29f, 0.03f)
                curveToRelative(-0.18f, -0.3f, -0.29f, -0.65f, -0.29f, -1.03f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                curveToRelative(0f, 0.38f, -0.11f, 0.73f, -0.29f, 1.03f)
                curveToRelative(0.1f, -0.01f, 0.19f, -0.03f, 0.29f, -0.03f)
                curveToRelative(1.24f, 0f, 2.22f, 1.14f, 1.96f, 2.43f)
                close()
            }
        }.also { _CardClub = it}
