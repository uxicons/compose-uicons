package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tachometer: ImageVector? = null

val Icons.Br.Tachometer: ImageVector
    get() = _Tachometer ?: UXIcon(name = "Tachometer") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.9f, 11.4f)
            arcTo(12.04f, 12.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.38f, 1.08f)
            curveTo(2.02f, -0.21f, -4.6f, 13.77f, 3.76f, 21.63f)
            arcTo(5.18f, 5.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.34f, 23f)
            horizontalLineToRelative(9.32f)
            arcToRelative(5.31f, 5.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.73f, -1.51f)
            arcTo(11.86f, 11.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.9f, 11.4f)
            close()
            moveTo(18.29f, 19.34f)
            arcTo(2.33f, 2.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.66f, 20f)
            lineTo(7.34f, 20f)
            arcToRelative(2.23f, 2.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.52f, -0.56f)
            arcToRelative(8.97f, 8.97f, 0f, isMoreThanHalf = true, isPositiveArc = true, 15.11f, -7.67f)
            arcTo(8.89f, 8.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.29f, 19.34f)
            close()
            moveTo(16.56f, 8.44f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2.12f)
            lineTo(14f, 13.12f)
            arcTo(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 11.88f, 11f)
            lineToRelative(2.56f, -2.56f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.56f, 8.44f)
            close()
        }
    }.also { _Tachometer = it }
