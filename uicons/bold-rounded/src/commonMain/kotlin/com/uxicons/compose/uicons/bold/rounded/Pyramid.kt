package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pyramid: ImageVector? = null

val Icons.Br.Pyramid: ImageVector
    get() = _Pyramid ?: UXIcon(name = "Pyramid") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.51f, 24f)
            horizontalLineTo(4.49f)
            arcTo(4.45f, 4.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.66f, 21.83f)
            arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.14f, -4.42f)
            lineTo(8.02f, 2.43f)
            arcTo(4.46f, 4.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 0f)
            horizontalLineToRelative(0f)
            arcToRelative(4.46f, 4.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.98f, 2.43f)
            lineToRelative(7.52f, 15f)
            arcTo(4.51f, 4.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.51f, 24f)
            close()
            moveTo(10.68f, 3.81f)
            lineTo(3.17f, 18.78f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.04f, 1.49f)
            arcToRelative(1.47f, 1.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.28f, 0.72f)
            horizontalLineTo(19.51f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.33f, -2.2f)
            lineToRelative(-7.52f, -15f)
            arcTo(1.46f, 1.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 3.01f)
            horizontalLineToRelative(0f)
            arcTo(1.47f, 1.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.68f, 3.81f)
            close()
        }
    }.also { _Pyramid = it }
