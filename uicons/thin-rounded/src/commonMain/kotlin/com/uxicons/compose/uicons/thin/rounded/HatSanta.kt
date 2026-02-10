package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HatSanta: ImageVector? = null

val Icons.Tr.HatSanta: ImageVector
    get() = _HatSanta ?: UXIcon(name = "HatSanta") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.95f, 18.17f)
                curveToRelative(-0.39f, -3.02f, -1.12f, -5.76f, -2.17f, -8.19f)
                curveToRelative(0.07f, 0.0f, 0.14f, 0.02f, 0.22f, 0.02f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                curveToRelative(-0.23f, 0f, -0.46f, 0.03f, -0.68f, 0.07f)
                curveToRelative(-1.36f, -1.35f, -3.02f, -2.07f, -4.82f, -2.07f)
                curveTo(10.4f, 0f, 3.74f, 4.85f, 2.04f, 18.17f)
                curveToRelative(-1.18f, 0.4f, -2.04f, 1.51f, -2.04f, 2.83f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                curveToRelative(0f, -1.32f, -0.86f, -2.43f, -2.05f, -2.83f)
                close()
                moveTo(23f, 6f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                close()
                moveTo(14.5f, 1f)
                curveToRelative(1.39f, 0f, 2.64f, 0.48f, 3.74f, 1.43f)
                curveToRelative(-1.32f, 0.65f, -2.24f, 2.0f, -2.24f, 3.57f)
                curveToRelative(0f, 1.71f, 1.08f, 3.16f, 2.6f, 3.73f)
                curveToRelative(1.13f, 2.42f, 1.9f, 5.2f, 2.32f, 8.27f)
                lineTo(3.08f, 18f)
                curveTo(4.75f, 5.64f, 10.93f, 1f, 14.5f, 1f)
                close()
                moveTo(21f, 23f)
                lineTo(3f, 23f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(18f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
            }
        }.also { _HatSanta = it}
