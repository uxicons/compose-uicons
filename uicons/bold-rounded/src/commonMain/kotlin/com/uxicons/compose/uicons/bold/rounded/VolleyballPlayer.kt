package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VolleyballPlayer: ImageVector? = null

val Icons.Br.VolleyballPlayer: ImageVector
    get() = _VolleyballPlayer ?: UXIcon(name = "VolleyballPlayer") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.5f, 2.5f)
            moveToRelative(-2.5f, 0f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 0f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5f, 0f)
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(22f, 2f)
            moveToRelative(-2f, 0f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 0f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
        }
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.34f, 5.01f)
            lineToRelative(-9.42f, 0.99f)
            horizontalLineToRelative(-3.07f)
            lineToRelative(-3.85f, -1.93f)
            verticalLineToRelative(-2.57f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(2.88f)
            curveToRelative(0f, 0.95f, 0.53f, 1.81f, 1.38f, 2.24f)
            lineToRelative(3.62f, 1.81f)
            verticalLineToRelative(5.59f)
            lineToRelative(-1.84f, 2.58f)
            curveToRelative(-0.06f, 0.09f, -0.15f, 0.15f, -0.25f, 0.18f)
            lineToRelative(-3.88f, 1.29f)
            curveToRelative(-0.79f, 0.26f, -1.21f, 1.11f, -0.95f, 1.9f)
            curveToRelative(0.26f, 0.79f, 1.13f, 1.21f, 1.9f, 0.95f)
            lineToRelative(3.88f, -1.29f)
            curveToRelative(0.71f, -0.23f, 1.31f, -0.68f, 1.74f, -1.29f)
            lineToRelative(2.4f, -3.29f)
            verticalLineToRelative(2.88f)
            lineToRelative(-3.13f, 3.58f)
            curveToRelative(-0.55f, 0.62f, -0.48f, 1.57f, 0.14f, 2.12f)
            curveToRelative(0.62f, 0.54f, 1.57f, 0.48f, 2.12f, -0.14f)
            lineToRelative(3.25f, -3.72f)
            curveToRelative(0.4f, -0.46f, 0.62f, -1.04f, 0.62f, -1.65f)
            verticalLineToRelative(-9.22f)
            lineToRelative(8.66f, -0.91f)
            curveToRelative(0.82f, -0.09f, 1.42f, -0.82f, 1.33f, -1.65f)
            curveToRelative(-0.09f, -0.82f, -0.82f, -1.42f, -1.65f, -1.33f)
            close()
        }
    }.also { _VolleyballPlayer = it }
