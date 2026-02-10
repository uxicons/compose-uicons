package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BadgeLeaf: ImageVector? = null

val Icons.Ss.BadgeLeaf: ImageVector
    get() = _BadgeLeaf ?: UXIcon(name = "BadgeLeaf") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 12f)
                curveToRelative(0f, 1.3f, -0.84f, 2.4f, -2f, 2.82f)
                verticalLineToRelative(-3.82f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3.82f)
                curveToRelative(-1.16f, -0.41f, -2f, -1.51f, -2f, -2.82f)
                curveToRelative(0f, -1.71f, 1.82f, -3.67f, 3f, -4.71f)
                curveToRelative(1.18f, 1.04f, 3f, 3f, 3f, 4.71f)
                close()
                moveTo(22.08f, 16.18f)
                curveToRelative(0.12f, 1.59f, -0.45f, 3.17f, -1.59f, 4.31f)
                curveToRelative(-1.14f, 1.14f, -2.71f, 1.72f, -4.31f, 1.59f)
                curveToRelative(-1.04f, 1.21f, -2.56f, 1.92f, -4.17f, 1.92f)
                reflectiveCurveToRelative(-3.14f, -0.71f, -4.17f, -1.92f)
                curveToRelative(-1.59f, 0.12f, -3.17f, -0.45f, -4.31f, -1.59f)
                curveToRelative(-1.14f, -1.14f, -1.72f, -2.72f, -1.59f, -4.31f)
                curveToRelative(-1.21f, -1.04f, -1.92f, -2.56f, -1.92f, -4.17f)
                reflectiveCurveToRelative(0.71f, -3.14f, 1.92f, -4.17f)
                curveToRelative(-0.12f, -1.59f, 0.45f, -3.17f, 1.59f, -4.31f)
                curveToRelative(1.14f, -1.14f, 2.72f, -1.72f, 4.31f, -1.59f)
                curveToRelative(1.04f, -1.21f, 2.56f, -1.92f, 4.17f, -1.92f)
                reflectiveCurveToRelative(3.14f, 0.71f, 4.17f, 1.92f)
                curveToRelative(1.59f, -0.12f, 3.17f, 0.45f, 4.31f, 1.59f)
                curveToRelative(1.14f, 1.14f, 1.72f, 2.72f, 1.59f, 4.31f)
                curveToRelative(1.21f, 1.04f, 1.92f, 2.56f, 1.92f, 4.17f)
                reflectiveCurveToRelative(-0.71f, 3.14f, -1.92f, 4.17f)
                close()
                moveTo(17f, 12f)
                curveToRelative(0f, -3.4f, -3.95f, -6.46f, -4.4f, -6.8f)
                lineToRelative(-0.6f, -0.45f)
                lineToRelative(-0.6f, 0.45f)
                curveToRelative(-0.45f, 0.34f, -4.4f, 3.4f, -4.4f, 6.8f)
                curveToRelative(0f, 2.41f, 1.72f, 4.43f, 4f, 4.9f)
                verticalLineToRelative(2.1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2.1f)
                curveToRelative(2.28f, -0.47f, 4f, -2.48f, 4f, -4.9f)
                close()
            }
        }.also { _BadgeLeaf = it}
