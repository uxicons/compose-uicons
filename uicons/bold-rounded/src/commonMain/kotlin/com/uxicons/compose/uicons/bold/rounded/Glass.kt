package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Glass: ImageVector? = null

val Icons.Br.Glass: ImageVector
    get() = _Glass ?: UXIcon(name = "Glass") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.44f, 1.55f)
            arcTo(4.49f, 4.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.04f, 0f)
            lineTo(5.96f, 0f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 5.14f)
            lineTo(3.77f, 21f)
            arcToRelative(3.52f, 3.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.46f, 3f)
            horizontalLineToRelative(9.53f)
            arcToRelative(3.52f, 3.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.46f, -3f)
            lineTo(22.5f, 5.14f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.44f, 1.55f)
            close()
            moveTo(19.53f, 4.71f)
            lineTo(17.26f, 20.57f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.49f, 0.43f)
            lineTo(7.23f, 21f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.49f, -0.43f)
            lineTo(5.37f, 11f)
            lineTo(15.5f, 11f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            lineTo(4.94f, 8f)
            lineToRelative(-0.47f, -3.29f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.96f, 3f)
            lineTo(18.04f, 3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.49f, 1.71f)
            close()
        }
    }.also { _Glass = it }
