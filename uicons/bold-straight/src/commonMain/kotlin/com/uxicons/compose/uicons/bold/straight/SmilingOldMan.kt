package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmilingOldMan: ImageVector? = null

val Icons.Bs.SmilingOldMan: ImageVector
    get() = _SmilingOldMan ?: UXIcon(name = "SmilingOldMan") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.5f, 11.5f)
                moveToRelative(-1.5f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 16f)
                curveToRelative(1.35f, 0f, 2.51f, -0.83f, 3.0f, -2f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(0.49f, 1.17f, 1.65f, 2f, 3.0f, 2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.36f, 7.23f)
                curveToRelative(-1.09f, -4.19f, -4.95f, -7.23f, -9.36f, -7.23f)
                reflectiveCurveToRelative(-8.27f, 3.04f, -9.36f, 7.23f)
                curveToRelative(-1.55f, 0.56f, -2.64f, 2.03f, -2.64f, 3.77f)
                curveToRelative(0f, 2.08f, 1.59f, 3.79f, 3.62f, 3.98f)
                curveToRelative(0.65f, 1.75f, 1.87f, 3.27f, 3.38f, 4.35f)
                verticalLineToRelative(4.67f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3.26f)
                curveToRelative(0.65f, 0.17f, 1.32f, 0.26f, 2f, 0.26f)
                reflectiveCurveToRelative(1.35f, -0.09f, 2f, -0.26f)
                verticalLineToRelative(3.26f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4.67f)
                curveToRelative(1.51f, -1.07f, 2.73f, -2.6f, 3.38f, -4.35f)
                curveToRelative(2.03f, -0.19f, 3.62f, -1.9f, 3.62f, -3.98f)
                curveToRelative(0f, -1.74f, -1.09f, -3.21f, -2.64f, -3.77f)
                close()
                moveTo(20f, 12f)
                horizontalLineToRelative(-1.96f)
                lineToRelative(-0.26f, 1.19f)
                curveToRelative(-0.64f, 2.97f, -3.5f, 4.81f, -5.78f, 4.81f)
                reflectiveCurveToRelative(-5.15f, -1.84f, -5.79f, -4.82f)
                lineToRelative(-0.26f, -1.19f)
                horizontalLineToRelative(-1.96f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -0.54f, 0.46f, -0.98f, 1f, -1f)
                curveToRelative(0.72f, 0f, 1.22f, -0.06f, 1.22f, -0.06f)
                curveToRelative(2.4f, -0.31f, 3.78f, -2.12f, 3.78f, -3.94f)
                curveToRelative(-0.88f, 0f, -1.5f, -0.34f, -1.95f, -0.79f)
                curveToRelative(1.23f, -1.36f, 3.01f, -2.21f, 4.95f, -2.21f)
                reflectiveCurveToRelative(3.71f, 0.85f, 4.95f, 2.21f)
                curveToRelative(-0.44f, 0.45f, -1.07f, 0.79f, -1.95f, 0.79f)
                curveToRelative(0f, 1.82f, 1.38f, 3.63f, 3.78f, 3.94f)
                curveToRelative(0f, 0f, 0.54f, 0.05f, 1.22f, 0.06f)
                curveToRelative(0.54f, 0.02f, 1f, 0.46f, 1f, 1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.5f, 11.5f)
                moveToRelative(-1.5f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 0f)
            }
        }.also { _SmilingOldMan = it}
