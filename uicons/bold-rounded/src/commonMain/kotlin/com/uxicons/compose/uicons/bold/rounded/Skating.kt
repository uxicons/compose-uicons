package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Skating: ImageVector? = null

val Icons.Br.Skating: ImageVector
    get() = _Skating ?: UXIcon(name = "Skating") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 2.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 18.5f, 5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 2.5f)
            close()
            moveTo(19.5f, 19f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 20.5f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, 0.5f)
            horizontalLineTo(17f)
            verticalLineTo(19.64f)
            arcToRelative(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.95f, -2.4f)
            lineToRelative(-3.02f, -3.21f)
            lineToRelative(2.95f, -2.96f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.06f, -5.01f)
            lineToRelative(-0.15f, -0.13f)
            arcTo(4.82f, 4.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.91f, 5f)
            horizontalLineTo(6.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(5.66f)
            lineTo(9.95f, 10.34f)
            arcToRelative(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.07f, 4.87f)
            lineTo(13.86f, 19.3f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.14f, 0.34f)
            verticalLineTo(21f)
            horizontalLineToRelative(-0.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(4f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 20.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.5f, 19f)
            close()
            moveTo(7.45f, 20.86f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.67f, 0.04f)
            lineToRelative(-0.21f, -0.23f)
            lineTo(8.59f, 18.53f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.18f, -2.06f)
            lineTo(4.55f, 18.43f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.17f, 2.07f)
            lineTo(4.6f, 22.95f)
            arcTo(3.47f, 3.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.07f, 24f)
            horizontalLineTo(7.1f)
            arcTo(3.48f, 3.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.55f, 23f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.1f, -2.14f)
            close()
        }
    }.also { _Skating = it }
