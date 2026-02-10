package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Trophy: ImageVector? = null

val Icons.Ss.Trophy: ImageVector
    get() = _Trophy ?: UXIcon(name = "Trophy") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.06f, 16f)
                horizontalLineToRelative(0.94f)
                curveToRelative(6.64f, 0f, 9f, -3.5f, 9f, -6.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.91f, -3.44f)
                arcToRelative(11.56f, 11.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.85f, -2.47f)
                arcToRelative(2.96f, 2.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.61f, -2.48f)
                arcToRelative(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.35f, -1.12f)
                horizontalLineToRelative(-13.95f)
                arcToRelative(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.35f, 1.12f)
                arcToRelative(2.96f, 2.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.61f, 2.48f)
                arcToRelative(11.69f, 11.69f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.85f, 2.47f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.91f, 3.44f)
                curveToRelative(0f, 3f, 2.36f, 6.5f, 9f, 6.5f)
                horizontalLineToRelative(0.93f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.07f, 0.64f)
                verticalLineToRelative(3.36f)
                arcToRelative(1.88f, 1.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                arcToRelative(1.89f, 1.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.01f, -2f)
                verticalLineToRelative(-3.36f)
                arcToRelative(4.65f, 4.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.07f, -0.64f)
                close()
                moveTo(15.48f, 13.35f)
                arcToRelative(21.04f, 21.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.56f, -5.35f)
                horizontalLineToRelative(0.47f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 1.5f)
                curveToRelative(0f, 2.18f, -1.99f, 4.5f, -7.15f, 4.5f)
                arcToRelative(3.6f, 3.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.63f, -0.65f)
                close()
                moveTo(2f, 9.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, -1.5f)
                horizontalLineToRelative(0.46f)
                arcToRelative(20.98f, 20.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.55f, 5.35f)
                arcToRelative(3.67f, 3.67f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.63f, 0.65f)
                curveToRelative(-5.16f, 0f, -7.14f, -2.32f, -7.14f, -4.5f)
                close()
            }
        }.also { _Trophy = it}
