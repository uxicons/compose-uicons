package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Js: ImageVector? = null

val Icons.Brand.Js: ImageVector
    get() = _Js ?: UXIcon(name = "Js") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.12f, 18.75f)
            arcToRelative(2.46f, 2.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.23f, 1.37f)
            curveToRelative(0.93f, 0f, 1.53f, -0.47f, 1.53f, -1.11f)
            curveToRelative(0f, -0.77f, -0.61f, -1.05f, -1.64f, -1.5f)
            lineToRelative(-0.56f, -0.24f)
            curveToRelative(-1.63f, -0.69f, -2.71f, -1.56f, -2.71f, -3.4f)
            arcToRelative(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.3f, -2.98f)
            arcTo(3.33f, 3.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.47f, 12.7f)
            lineToRelative(-1.76f, 1.13f)
            arcToRelative(1.53f, 1.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.45f, -0.97f)
            arcToRelative(0.98f, 0.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.08f, 0.97f)
            curveToRelative(0f, 0.68f, 0.42f, 0.95f, 1.39f, 1.37f)
            lineToRelative(0.56f, 0.24f)
            curveToRelative(1.92f, 0.82f, 3f, 1.66f, 3f, 3.54f)
            curveToRelative(0f, 2.03f, -1.59f, 3.14f, -3.74f, 3.14f)
            arcToRelative(4.33f, 4.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.11f, -2.31f)
            close()
            moveTo(8.15f, 18.95f)
            curveToRelative(0.35f, 0.63f, 0.68f, 1.16f, 1.45f, 1.16f)
            curveToRelative(0.74f, 0f, 1.21f, -0.29f, 1.21f, -1.42f)
            lineTo(10.81f, 11.02f)
            lineTo(13.07f, 11.02f)
            verticalLineToRelative(7.7f)
            arcToRelative(3.06f, 3.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.37f, 3.4f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.38f, -2.06f)
            close()
        }
    }.also { _Js = it }
