package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Couple: ImageVector? = null

val Icons.Br.Couple: ImageVector
    get() = _Couple ?: UXIcon(name = "Couple") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.99f, 1f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
            horizontalLineTo(18.42f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.71f, 1.71f)
            lineToRelative(1.23f, 1.23f)
            lineTo(16.91f, 4.97f)
            arcToRelative(6.45f, 6.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.9f, 0.06f)
            arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 5f, 16.82f)
            verticalLineTo(18f)
            horizontalLineTo(4f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineTo(5f)
            verticalLineToRelative(1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            verticalLineTo(21f)
            horizontalLineTo(9f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            horizontalLineTo(8f)
            verticalLineTo(16.81f)
            arcToRelative(6.46f, 6.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -0.84f)
            arcTo(6.49f, 6.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.03f, 7.1f)
            lineToRelative(2.04f, -2.04f)
            lineToRelative(1.23f, 1.23f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 5.58f)
            close()
            moveTo(3f, 10.5f)
            arcTo(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.86f, 7.28f)
            arcToRelative(6.45f, 6.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6.44f)
            arcTo(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 10.5f)
            close()
            moveTo(13.5f, 14f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 17f, 10.5f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 14f)
            close()
        }
    }.also { _Couple = it }
