package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Chess: ImageVector? = null

val Icons.Br.Chess: ImageVector
    get() = _Chess ?: UXIcon(name = "Chess") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.3f, 20.02f)
            arcTo(64.16f, 64.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.53f, 9.59f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.82f, 7.8f)
            reflectiveCurveToRelative(0.85f, -1.32f, 0.88f, -1.38f)
            arcTo(3.1f, 3.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.9f, 2f)
            horizontalLineTo(8.51f)
            verticalLineTo(1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            verticalLineTo(2f)
            horizontalLineTo(5.1f)
            arcTo(3.1f, 3.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.3f, 6.42f)
            curveToRelative(0.03f, 0.06f, 0.88f, 1.38f, 0.88f, 1.38f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.3f, 1.79f)
            arcTo(63.41f, 63.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.7f, 20.02f)
            arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 24f)
            horizontalLineTo(12f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.3f, -3.98f)
            close()
            moveTo(7.55f, 10f)
            arcTo(64.94f, 64.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.21f, 20f)
            horizontalLineTo(4.8f)
            arcTo(64.01f, 64.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.45f, 10f)
            close()
            moveTo(5.1f, 5f)
            horizontalLineTo(8.9f)
            lineToRelative(0.08f, 0.13f)
            lineTo(7.77f, 7f)
            horizontalLineTo(6.23f)
            lineTo(4.98f, 5.07f)
            close()
            moveTo(24f, 9.5f)
            verticalLineToRelative(-1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            verticalLineTo(9f)
            horizontalLineTo(20f)
            verticalLineTo(8.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            verticalLineTo(9f)
            horizontalLineTo(16f)
            verticalLineTo(8.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            verticalLineToRelative(1f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 2f)
            verticalLineToRelative(7.06f)
            arcTo(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.44f, 20f)
            horizontalLineToRelative(0f)
            arcTo(3.27f, 3.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 22f)
            arcToRelative(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.56f, 2f)
            horizontalLineTo(22f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -3.73f)
            verticalLineTo(11.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 9.5f)
            close()
            moveTo(17f, 12f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(8f)
            horizontalLineTo(17f)
            close()
        }
    }.also { _Chess = it }
