package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldPlus: ImageVector? = null

val Icons.Br.ShieldPlus: ImageVector
    get() = _ShieldPlus ?: UXIcon(name = "ShieldPlus") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15f, 9.5f)
            horizontalLineTo(13.5f)
            verticalLineTo(8f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            verticalLineTo(9.5f)
            horizontalLineTo(9f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(1.5f)
            verticalLineTo(14f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            verticalLineTo(12.5f)
            horizontalLineTo(15f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 24f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.61f, -0.13f)
            curveTo(11f, 23.7f, 1.91f, 19.57f, 1.91f, 12f)
            verticalLineTo(7.25f)
            arcTo(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.67f, 2.03f)
            lineTo(11.53f, 0.08f)
            arcToRelative(1.51f, 1.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.95f, 0f)
            lineTo(18.33f, 2.03f)
            arcToRelative(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.76f, 5.22f)
            verticalLineTo(12f)
            curveToRelative(0f, 8.62f, -9.22f, 11.79f, -9.62f, 11.92f)
            arcTo(1.49f, 1.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24f)
            close()
            moveTo(12f, 3.08f)
            lineTo(6.62f, 4.88f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.71f, 2.37f)
            verticalLineTo(12f)
            curveToRelative(0f, 4.74f, 5.42f, 7.95f, 7.17f, 8.87f)
            curveToRelative(1.76f, -0.73f, 7.01f, -3.38f, 7.01f, -8.87f)
            verticalLineTo(7.25f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.71f, -2.37f)
            close()
        }
    }.also { _ShieldPlus = it }
