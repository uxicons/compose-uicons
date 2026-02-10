package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Drumstick: ImageVector? = null

val Icons.Br.Drumstick: ImageVector
    get() = _Drumstick ?: UXIcon(name = "Drumstick") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.49f, 2.51f)
            arcToRelative(8.57f, 8.57f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12.12f, 0f)
            curveTo(7.14f, 4.75f, 6.31f, 9.54f, 6.01f, 13.17f)
            arcToRelative(4.46f, 4.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.43f, 2.26f)
            lineToRelative(-3.1f, 3.1f)
            arcTo(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 22f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3.47f, -1.35f)
            lineTo(8.56f, 17.56f)
            arcToRelative(4.42f, 4.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.27f, 0.42f)
            curveToRelative(3.63f, -0.3f, 8.42f, -1.12f, 10.66f, -3.36f)
            arcTo(8.61f, 8.61f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.49f, 2.51f)
            close()
            moveTo(19.37f, 12.5f)
            curveToRelative(-1.21f, 1.21f, -4.49f, 2.14f, -8.78f, 2.49f)
            arcToRelative(1.46f, 1.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.58f, -1.58f)
            curveTo(9.36f, 9.12f, 10.29f, 5.84f, 11.5f, 4.63f)
            arcTo(5.57f, 5.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.37f, 12.5f)
            close()
        }
    }.also { _Drumstick = it }
