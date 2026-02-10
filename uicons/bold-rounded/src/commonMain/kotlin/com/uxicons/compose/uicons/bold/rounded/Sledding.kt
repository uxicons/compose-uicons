package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sledding: ImageVector? = null

val Icons.Br.Sledding: ImageVector
    get() = _Sledding ?: UXIcon(name = "Sledding") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.85f, 21.45f)
            arcToRelative(4.39f, 4.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.91f, 2.11f)
            lineTo(0.88f, 15.87f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.23f, -2.74f)
            lineToRelative(17.09f, 7.7f)
            arcToRelative(1.4f, 1.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.94f, -0.69f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.71f, 1.3f)
            close()
            moveTo(18.5f, 5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 16f, 2.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 5f)
            close()
            moveTo(5.5f, 7f)
            horizontalLineToRelative(5.31f)
            lineTo(8.83f, 9.24f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.5f, 15f)
            horizontalLineToRelative(3.88f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.49f, 0.4f)
            lineToRelative(0.3f, 1.42f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.64f, 18f)
            arcToRelative(1.54f, 1.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.32f, -0.03f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.15f, -1.78f)
            lineToRelative(-0.3f, -1.42f)
            arcTo(3.52f, 3.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.38f, 12f)
            horizontalLineTo(14.3f)
            lineToRelative(1.83f, -2.06f)
            arcToRelative(3.6f, 3.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.17f, -4.88f)
            arcToRelative(1.62f, 1.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.22f, -0.17f)
            arcTo(5.43f, 5.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.78f, 4f)
            horizontalLineTo(5.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            close()
        }
    }.also { _Sledding = it }
