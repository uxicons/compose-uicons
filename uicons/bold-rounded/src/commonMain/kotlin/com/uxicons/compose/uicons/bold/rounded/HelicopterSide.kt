package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HelicopterSide: ImageVector? = null

val Icons.Br.HelicopterSide: ImageVector
    get() = _HelicopterSide ?: UXIcon(name = "HelicopterSide") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.18f, 19f)
            arcTo(4.82f, 4.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 14.18f)
            arcToRelative(8.19f, 8.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7f, -8.1f)
            verticalLineTo(4f)
            horizontalLineToRelative(5.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            horizontalLineTo(16.91f)
            arcToRelative(1.51f, 1.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.83f, 0f)
            horizontalLineTo(8.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineTo(14f)
            verticalLineTo(6f)
            horizontalLineTo(3f)
            verticalLineTo(5.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            verticalLineTo(6.82f)
            arcToRelative(4.51f, 4.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.31f, 4.34f)
            lineToRelative(3.69f, 1f)
            verticalLineToRelative(0.56f)
            arcToRelative(6.28f, 6.28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 5.85f)
            verticalLineTo(21f)
            horizontalLineTo(8.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(13f)
            arcTo(2.45f, 2.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 21.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.92f, -0.5f)
            horizontalLineTo(19f)
            verticalLineTo(19f)
            close()
            moveTo(10f, 12.73f)
            verticalLineToRelative(-1.7f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.9f, 9.58f)
            lineTo(6.78f, 9f)
            horizontalLineTo(15f)
            verticalLineToRelative(3f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
            horizontalLineToRelative(4f)
            arcToRelative(1.83f, 1.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.81f, 2f)
            horizontalLineToRelative(-5.91f)
            arcTo(3.28f, 3.28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 12.73f)
            close()
            moveTo(16f, 21f)
            horizontalLineTo(14f)
            verticalLineTo(19f)
            horizontalLineToRelative(2f)
            close()
        }
    }.also { _HelicopterSide = it }
