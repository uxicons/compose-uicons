package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsH: ImageVector? = null

val Icons.Br.ArrowsH: ImageVector
    get() = _ArrowsH ?: UXIcon(name = "ArrowsH") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.01f, 9.57f)
            lineToRelative(-3.05f, -3.1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.14f, 2.1f)
            lineToRelative(1.9f, 1.93f)
            horizontalLineTo(4.26f)
            lineTo(6.18f, 8.55f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2.14f, -2.1f)
            lineTo(0.99f, 9.55f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12f)
            verticalLineToRelative(0f)
            horizontalLineTo(0f)
            arcToRelative(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.99f, 2.45f)
            curveToRelative(0.2f, 0.2f, 0.38f, 0.39f, 0.51f, 0.51f)
            lineTo(4.04f, 17.55f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.14f, -2.1f)
            lineTo(4.26f, 13.5f)
            horizontalLineTo(19.75f)
            lineToRelative(-1.93f, 1.96f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.14f, 2.1f)
            lineToRelative(3.05f, -3.1f)
            arcTo(3.52f, 3.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.01f, 9.57f)
            close()
        }
    }.also { _ArrowsH = it }
