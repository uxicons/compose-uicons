package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Spoon: ImageVector? = null

val Icons.Br.Spoon: ImageVector
    get() = _Spoon ?: UXIcon(name = "Spoon") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.77f, 1.23f)
            curveToRelative(-2.9f, -2.9f, -9.38f, -0.11f, -11.8f, 2.32f)
            arcToRelative(6.71f, 6.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.94f, 8.3f)
            lineTo(0.44f, 21.44f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, 2.12f)
            lineToRelative(9.59f, -9.59f)
            arcToRelative(6.71f, 6.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.3f, -0.94f)
            curveTo(22.88f, 10.61f, 25.66f, 4.13f, 22.77f, 1.23f)
            close()
            moveTo(18.33f, 10.91f)
            arcToRelative(3.71f, 3.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.25f, -5.25f)
            arcToRelative(11.12f, 11.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.34f, -2.68f)
            arcToRelative(1.72f, 1.72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.22f, 0.36f)
            curveTo(21.75f, 4.46f, 20.12f, 9.12f, 18.33f, 10.91f)
            close()
        }
    }.also { _Spoon = it }
