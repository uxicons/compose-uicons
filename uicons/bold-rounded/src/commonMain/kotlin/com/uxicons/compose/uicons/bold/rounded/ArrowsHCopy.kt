package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsHCopy: ImageVector? = null

val Icons.Br.ArrowsHCopy: ImageVector
    get() = _ArrowsHCopy ?: UXIcon(name = "ArrowsHCopy") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.56f, 1f)
            lineToRelative(-3.1f, 3.05f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.1f, 2.14f)
            lineToRelative(1.93f, -1.9f)
            verticalLineTo(19.74f)
            lineTo(8.54f, 17.83f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2.1f, 2.14f)
            lineToRelative(3.1f, 3.05f)
            arcToRelative(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.45f, 0.99f)
            horizontalLineToRelative(0f)
            arcToRelative(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.45f, -0.99f)
            curveToRelative(0.2f, -0.2f, 0.39f, -0.38f, 0.51f, -0.5f)
            lineToRelative(2.59f, -2.55f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2.1f, -2.14f)
            lineToRelative(-1.95f, 1.92f)
            verticalLineTo(4.26f)
            lineToRelative(1.96f, 1.93f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.1f, -2.14f)
            lineTo(14.46f, 1f)
            arcTo(3.52f, 3.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.56f, 1f)
            close()
        }
    }.also { _ArrowsHCopy = it }
