package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Square2: ImageVector? = null

val Icons.Rr.Square2: ImageVector
    get() = _Square2 ?: UXIcon(name = "Square2") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 24f)
                lineTo(5f, 24f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(0f, 5f)
                curveTo(0f, 2.24f, 2.24f, 0f, 5f, 0f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                close()
                moveTo(5f, 2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                lineTo(22f, 5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(5f, 2f)
                close()
                moveTo(16f, 17f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4.78f)
                curveToRelative(0.43f, -0.37f, 1.07f, -0.72f, 1.74f, -1.09f)
                curveToRelative(1.75f, -0.96f, 4.16f, -2.26f, 4.04f, -5.13f)
                curveToRelative(-0.09f, -2.12f, -1.84f, -3.78f, -4.0f, -3.78f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                curveToRelative(1.06f, 0f, 1.95f, 0.84f, 2.0f, 1.87f)
                curveToRelative(0.06f, 1.51f, -1.09f, 2.25f, -2.99f, 3.29f)
                curveToRelative(-0.99f, 0.54f, -1.93f, 1.05f, -2.56f, 1.8f)
                curveToRelative(-0.47f, 0.56f, -0.58f, 1.32f, -0.27f, 1.98f)
                curveToRelative(0.3f, 0.66f, 0.94f, 1.06f, 1.67f, 1.06f)
                horizontalLineToRelative(5.16f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _Square2 = it}
