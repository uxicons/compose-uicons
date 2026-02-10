package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HatSanta: ImageVector? = null

val Icons.Rr.HatSanta: ImageVector
    get() = _HatSanta ?: UXIcon(name = "HatSanta") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.94f, 17.31f)
                curveToRelative(-0.29f, -2.71f, -1.18f, -5.23f, -2.17f, -7.32f)
                curveToRelative(0.08f, 0.0f, 0.15f, 0.01f, 0.23f, 0.01f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                curveToRelative(-0.21f, 0f, -0.42f, 0.02f, -0.62f, 0.05f)
                lineToRelative(-0.15f, -0.1f)
                curveToRelative(-1.42f, -0.96f, -2.89f, -1.95f, -5.22f, -1.95f)
                curveTo(10.65f, 0f, 3.91f, 3.63f, 2.08f, 17.3f)
                curveToRelative(-1.23f, 0.55f, -2.08f, 1.77f, -2.08f, 3.2f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                lineToRelative(17.0f, -0.0f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0f, -1.42f, -0.85f, -2.64f, -2.06f, -3.19f)
                close()
                moveTo(22f, 6f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(14f, 2f)
                curveToRelative(1.36f, 0f, 2.3f, 0.44f, 3.29f, 1.06f)
                curveToRelative(-0.41f, 0.38f, -0.74f, 0.84f, -0.96f, 1.36f)
                curveToRelative(-0.03f, -0.03f, -0.04f, -0.06f, -0.05f, -0.07f)
                curveToRelative(-0.35f, -0.42f, -0.98f, -0.48f, -1.41f, -0.13f)
                curveToRelative(-0.42f, 0.35f, -0.48f, 0.98f, -0.13f, 1.41f)
                curveToRelative(0.04f, 0.06f, 4.3f, 5.22f, 5.16f, 11.36f)
                lineToRelative(-15.74f, 0.0f)
                curveTo(5.95f, 4.73f, 11.82f, 2f, 14f, 2f)
                close()
                moveTo(20.5f, 22f)
                lineToRelative(-17.0f, 0.0f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                lineToRelative(17f, -0.0f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _HatSanta = it}
