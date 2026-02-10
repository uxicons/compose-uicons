package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Recipe: ImageVector? = null

val Icons.Sr.Recipe: ImageVector
    get() = _Recipe ?: UXIcon(name = "Recipe") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 10f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-2.17f)
                curveToRelative(-0.51f, -0.18f, -0.96f, -0.49f, -1.31f, -0.92f)
                curveTo(0.12f, 4.22f, -0.11f, 3.32f, 0.05f, 2.42f)
                curveTo(0.26f, 1.32f, 1.14f, 0.38f, 2.24f, 0.1f)
                curveToRelative(0.75f, -0.19f, 1.51f, -0.1f, 2.16f, 0.26f)
                curveTo(5.4f, -0.11f, 6.6f, -0.11f, 7.6f, 0.36f)
                curveTo(8.26f, 0f, 9.01f, -0.1f, 9.76f, 0.1f)
                horizontalLineToRelative(0f)
                curveToRelative(1.1f, 0.28f, 1.97f, 1.22f, 2.18f, 2.33f)
                curveToRelative(0.17f, 0.89f, -0.06f, 1.8f, -0.64f, 2.49f)
                curveToRelative(-0.35f, 0.42f, -0.81f, 0.74f, -1.31f, 0.92f)
                verticalLineToRelative(2.17f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(24f, 5f)
                verticalLineToRelative(9.52f)
                curveToRelative(0f, 0.16f, -0.01f, 0.32f, -0.02f, 0.48f)
                horizontalLineToRelative(-5.98f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(5.98f)
                curveToRelative(-0.16f, 0.01f, -1.32f, 0.02f, -1.49f, 0.02f)
                horizontalLineToRelative(-4.51f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(4f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-8.38f)
                curveToRelative(0.6f, -0.52f, 1.03f, -1.21f, 1.24f, -2f)
                horizontalLineToRelative(7.14f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-7f)
                curveToRelative(0.31f, -0.23f, 0.6f, -0.51f, 0.85f, -0.81f)
                curveToRelative(0.95f, -1.15f, 1.34f, -2.66f, 1.06f, -4.14f)
                curveToRelative(-0.14f, -0.76f, -0.47f, -1.46f, -0.92f, -2.06f)
                horizontalLineToRelative(6.01f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(12f, 16f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
                moveTo(18f, 17f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(6f)
                lineToRelative(7f, -7f)
                horizontalLineToRelative(-6f)
                close()
            }
        }.also { _Recipe = it}
