package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BadgeLeaf: ImageVector? = null

val Icons.Sr.BadgeLeaf: ImageVector
    get() = _BadgeLeaf ?: UXIcon(name = "BadgeLeaf") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 12f)
                curveToRelative(0f, 1.3f, -0.84f, 2.4f, -2f, 2.82f)
                verticalLineToRelative(-3.82f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3.82f)
                curveToRelative(-1.16f, -0.41f, -2f, -1.51f, -2f, -2.82f)
                curveToRelative(0f, -1.63f, 1.67f, -3.87f, 2.86f, -4.95f)
                curveToRelative(0.04f, -0.04f, 0.09f, -0.05f, 0.14f, -0.05f)
                curveToRelative(0.05f, 0f, 0.1f, 0.02f, 0.14f, 0.05f)
                curveToRelative(1.19f, 1.07f, 2.86f, 3.32f, 2.86f, 4.95f)
                close()
                moveTo(22.04f, 16.21f)
                curveToRelative(0.17f, 1.54f, -0.41f, 3.13f, -1.55f, 4.28f)
                curveToRelative(-1.15f, 1.15f, -2.74f, 1.73f, -4.36f, 1.59f)
                curveToRelative(-0.96f, 1.21f, -2.5f, 1.93f, -4.12f, 1.93f)
                reflectiveCurveToRelative(-3.16f, -0.71f, -4.21f, -1.96f)
                curveToRelative(-1.53f, 0.18f, -3.13f, -0.41f, -4.28f, -1.55f)
                reflectiveCurveToRelative(-1.73f, -2.74f, -1.59f, -4.36f)
                curveToRelative(-1.21f, -0.96f, -1.93f, -2.5f, -1.93f, -4.12f)
                reflectiveCurveToRelative(0.71f, -3.16f, 1.96f, -4.21f)
                curveToRelative(-0.17f, -1.54f, 0.41f, -3.13f, 1.55f, -4.28f)
                curveToRelative(1.15f, -1.15f, 2.74f, -1.73f, 4.36f, -1.59f)
                curveToRelative(0.96f, -1.21f, 2.5f, -1.93f, 4.12f, -1.93f)
                reflectiveCurveToRelative(3.16f, 0.71f, 4.21f, 1.96f)
                curveToRelative(1.53f, -0.17f, 3.13f, 0.41f, 4.28f, 1.55f)
                curveToRelative(1.15f, 1.15f, 1.73f, 2.74f, 1.59f, 4.36f)
                curveToRelative(1.21f, 0.96f, 1.93f, 2.5f, 1.93f, 4.12f)
                reflectiveCurveToRelative(-0.71f, 3.16f, -1.96f, 4.21f)
                close()
                moveTo(17f, 12f)
                curveToRelative(0f, -2.57f, -2.3f, -5.33f, -3.52f, -6.43f)
                curveToRelative(-0.84f, -0.76f, -2.11f, -0.76f, -2.96f, 0f)
                curveToRelative(-1.22f, 1.1f, -3.52f, 3.86f, -3.52f, 6.43f)
                curveToRelative(0f, 2.41f, 1.72f, 4.43f, 4f, 4.9f)
                verticalLineToRelative(1.1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1.1f)
                curveToRelative(2.28f, -0.47f, 4f, -2.48f, 4f, -4.9f)
                close()
            }
        }.also { _BadgeLeaf = it}
