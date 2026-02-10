package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Luchador: ImageVector? = null

val Icons.Br.Luchador: ImageVector
    get() = _Luchador ?: UXIcon(name = "Luchador") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11f, 13f)
            verticalLineToRelative(1f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
            lineTo(8f, 16f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
            lineTo(5f, 9.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
            arcToRelative(1.06f, 1.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.21f, 0.51f)
            arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 13f)
            close()
            moveTo(16f, 9.5f)
            arcToRelative(1.06f, 1.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.21f, 0.51f)
            arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 13f)
            verticalLineToRelative(1f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
            horizontalLineToRelative(1f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
            lineTo(19f, 9.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            close()
            moveTo(24f, 12f)
            verticalLineToRelative(6.68f)
            arcTo(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.68f, 24f)
            horizontalLineToRelative(-0.87f)
            arcToRelative(4.49f, 4.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.99f, -2.42f)
            lineToRelative(-0.36f, -0.69f)
            arcToRelative(1.65f, 1.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.92f, 0f)
            lineToRelative(-0.36f, 0.69f)
            arcTo(4.49f, 4.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.19f, 24f)
            lineTo(5.32f, 24f)
            arcTo(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 18.68f)
            lineTo(0f, 12.35f)
            arcTo(12.24f, 12.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.78f, 0f)
            arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 12f)
            close()
            moveTo(21f, 12f)
            arcToRelative(8.93f, 8.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.69f, -6.42f)
            arcTo(9.03f, 9.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.83f, 3f)
            arcTo(9.23f, 9.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 12.35f)
            verticalLineToRelative(6.33f)
            arcTo(2.32f, 2.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.32f, 21f)
            horizontalLineToRelative(0.87f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.33f, -0.81f)
            lineToRelative(0.36f, -0.69f)
            arcToRelative(4.65f, 4.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.24f, 0f)
            lineToRelative(0.36f, 0.69f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.81f, 21f)
            horizontalLineToRelative(0.87f)
            arcTo(2.32f, 2.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 18.68f)
            close()
        }
    }.also { _Luchador = it }
