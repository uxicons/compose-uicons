package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Physics: ImageVector? = null

val Icons.Sr.Physics: ImageVector
    get() = _Physics ?: UXIcon(name = "Physics") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.56f, 1.44f)
                curveToRelative(-2.37f, -2.37f, -5.92f, -1.79f, -10.56f, 1.7f)
                curveToRelative(-4.64f, -3.5f, -8.19f, -4.08f, -10.56f, -1.7f)
                reflectiveCurveToRelative(-1.79f, 5.92f, 1.7f, 10.56f)
                curveToRelative(-3.5f, 4.64f, -4.08f, 8.19f, -1.7f, 10.56f)
                arcToRelative(4.7f, 4.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.44f, 1.44f)
                curveToRelative(1.97f, 0f, 4.35f, -1.05f, 7.12f, -3.14f)
                curveToRelative(2.77f, 2.08f, 5.15f, 3.14f, 7.12f, 3.14f)
                arcToRelative(4.7f, 4.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.44f, -1.44f)
                curveToRelative(2.38f, -2.38f, 1.8f, -5.92f, -1.7f, -10.56f)
                curveToRelative(3.5f, -4.64f, 4.08f, -8.19f, 1.7f, -10.56f)
                close()
                moveTo(19.09f, 2.03f)
                arcToRelative(2.81f, 2.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.07f, 0.82f)
                curveToRelative(1.75f, 1.75f, 0.46f, 4.71f, -1.59f, 7.54f)
                curveToRelative(-0.84f, -0.99f, -1.78f, -2.02f, -2.86f, -3.09f)
                reflectiveCurveToRelative(-2.11f, -2.02f, -3.09f, -2.86f)
                curveToRelative(1.9f, -1.37f, 3.86f, -2.41f, 5.47f, -2.41f)
                close()
                moveTo(18.31f, 12f)
                curveToRelative(-1.01f, 1.22f, -2.08f, 2.36f, -3.02f, 3.3f)
                reflectiveCurveToRelative(-2.08f, 2f, -3.29f, 3.01f)
                curveToRelative(-1.22f, -1.01f, -2.36f, -2.08f, -3.29f, -3.01f)
                reflectiveCurveToRelative(-2.0f, -2.08f, -3.02f, -3.3f)
                curveToRelative(1.01f, -1.22f, 2.08f, -2.36f, 3.02f, -3.29f)
                reflectiveCurveToRelative(2.08f, -2.0f, 3.29f, -3.02f)
                curveToRelative(1.22f, 1.01f, 2.36f, 2.08f, 3.3f, 3.02f)
                reflectiveCurveToRelative(2f, 2.08f, 3.01f, 3.29f)
                close()
                moveTo(2.85f, 2.85f)
                arcToRelative(2.8f, 2.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.07f, -0.82f)
                curveToRelative(1.61f, 0f, 3.58f, 1.03f, 5.47f, 2.41f)
                curveToRelative(-0.99f, 0.84f, -2.02f, 1.78f, -3.09f, 2.86f)
                reflectiveCurveToRelative(-2.02f, 2.1f, -2.86f, 3.09f)
                curveToRelative(-2.04f, -2.83f, -3.33f, -5.79f, -1.59f, -7.54f)
                close()
                moveTo(2.85f, 21.15f)
                curveToRelative(-1.75f, -1.75f, -0.46f, -4.71f, 1.59f, -7.54f)
                curveToRelative(0.84f, 0.99f, 1.78f, 2.02f, 2.86f, 3.09f)
                reflectiveCurveToRelative(2.1f, 2.02f, 3.09f, 2.86f)
                curveToRelative(-2.83f, 2.05f, -5.79f, 3.34f, -7.54f, 1.59f)
                close()
                moveTo(21.15f, 21.15f)
                curveToRelative(-1.75f, 1.74f, -4.71f, 0.46f, -7.54f, -1.58f)
                curveToRelative(0.99f, -0.84f, 2.01f, -1.79f, 3.09f, -2.86f)
                reflectiveCurveToRelative(2.02f, -2.1f, 2.86f, -3.09f)
                curveToRelative(2.05f, 2.83f, 3.34f, 5.8f, 1.59f, 7.54f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 12f)
                moveToRelative(-2f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
            }
        }.also { _Physics = it}
