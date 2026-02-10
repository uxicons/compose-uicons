package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Fill: ImageVector? = null

val Icons.Br.Fill: ImageVector
    get() = _Fill ?: UXIcon(name = "Fill") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.33f, 18.42f)
            curveToRelative(0.73f, 1.03f, 1.67f, 2.23f, 1.67f, 3.08f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, 0f)
            curveToRelative(0f, -0.78f, 0.96f, -2.01f, 1.69f, -3.07f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.64f, -0.01f)
            close()
            moveTo(21.45f, 14.57f)
            lineTo(13.63f, 22.39f)
            arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.78f, 0f)
            lineToRelative(-4.24f, -4.24f)
            arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -7.78f)
            lineToRelative(3.82f, -3.82f)
            lineToRelative(-2.99f, -2.99f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.12f, -2.12f)
            lineToRelative(2.99f, 2.99f)
            lineToRelative(1.88f, -1.88f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.13f, -2.11f)
            lineToRelative(12f, 12f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.11f, 2.13f)
            close()
            moveTo(19.33f, 12.45f)
            lineTo(11.55f, 4.67f)
            lineTo(9.67f, 6.55f)
            lineTo(13.56f, 10.44f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.12f, 2.12f)
            lineToRelative(-3.89f, -3.89f)
            lineToRelative(-3.82f, 3.82f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.54f)
            lineToRelative(4.24f, 4.24f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.54f, 0f)
            close()
        }
    }.also { _Fill = it }
