package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tooth: ImageVector? = null

val Icons.Br.Tooth: ImageVector
    get() = _Tooth ?: UXIcon(name = "Tooth") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.73f, 0f)
            arcToRelative(12.21f, 12.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.91f, 0.64f)
            arcTo(5.93f, 5.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 1f)
            arcTo(5.95f, 5.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.18f, 0.64f)
            arcTo(12.2f, 12.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.27f, 0f)
            arcTo(6.1f, 6.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6.27f)
            curveTo(0f, 12.4f, 3.08f, 18.39f, 5.4f, 22.36f)
            arcTo(3.33f, 3.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.37f, 24f)
            arcTo(2.78f, 2.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 21.18f)
            verticalLineTo(15f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
            verticalLineToRelative(6.18f)
            arcTo(2.78f, 2.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.63f, 24f)
            arcToRelative(3.33f, 3.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.97f, -1.64f)
            curveTo(20.92f, 18.39f, 24f, 12.4f, 24f, 6.27f)
            arcTo(6.1f, 6.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.73f, 0f)
            close()
            moveTo(16f, 20.86f)
            horizontalLineToRelative(0f)
            verticalLineTo(15f)
            arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 0f)
            verticalLineToRelative(5.86f)
            horizontalLineTo(8f)
            curveTo(5.86f, 17.19f, 3f, 11.68f, 3f, 6.27f)
            arcTo(3.12f, 3.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.27f, 3f)
            arcToRelative(9.24f, 9.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.04f, 0.51f)
            arcTo(8.69f, 8.69f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 4f)
            arcToRelative(8.68f, 8.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.69f, -0.49f)
            arcTo(9.24f, 9.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.73f, 3f)
            arcTo(3.12f, 3.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 6.27f)
            curveTo(21f, 11.68f, 18.14f, 17.19f, 16f, 20.86f)
            close()
        }
    }.also { _Tooth = it }
