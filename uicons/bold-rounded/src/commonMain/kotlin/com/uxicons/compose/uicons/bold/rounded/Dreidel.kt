package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dreidel: ImageVector? = null

val Icons.Br.Dreidel: ImageVector
    get() = _Dreidel ?: UXIcon(name = "Dreidel") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.56f, 0.44f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.12f, 0f)
            lineToRelative(-6.8f, 6.8f)
            lineToRelative(-0.7f, -0.7f)
            arcTo(5.27f, 5.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 6.53f)
            lineTo(1.54f, 11.42f)
            arcTo(5.23f, 5.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 15.14f)
            verticalLineToRelative(3.59f)
            arcTo(5.27f, 5.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.26f, 24f)
            lineTo(8.86f, 24f)
            arcToRelative(5.24f, 5.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.73f, -1.55f)
            lineToRelative(4.87f, -4.95f)
            arcToRelative(5.27f, 5.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -7.44f)
            lineToRelative(-0.7f, -0.7f)
            lineToRelative(6.8f, -6.8f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.56f, 0.44f)
            close()
            moveTo(3f, 18.73f)
            lineTo(3f, 16.16f)
            arcTo(6.42f, 6.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 17f)
            quadToRelative(0.55f, 0f, 1.05f, -0.05f)
            quadTo(7f, 17.45f, 7f, 18f)
            arcToRelative(6.53f, 6.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.82f, 3f)
            lineTo(5.26f, 21f)
            arcTo(2.27f, 2.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 18.73f)
            close()
            moveTo(15.33f, 15.39f)
            lineTo(10.75f, 20.05f)
            arcTo(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 18f)
            arcToRelative(3.46f, 3.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.06f, -2.94f)
            lineToRelative(0.5f, -0.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.44f, 12.44f)
            lineToRelative(-0.5f, 0.5f)
            arcTo(3.46f, 3.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 14f)
            arcToRelative(3.83f, 3.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.03f, -0.76f)
            lineTo(8.62f, 8.66f)
            arcToRelative(2.27f, 2.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.2f, 0f)
            lineToRelative(3.52f, 3.52f)
            arcTo(2.27f, 2.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.33f, 15.39f)
            close()
        }
    }.also { _Dreidel = it }
