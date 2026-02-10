package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Skateboard: ImageVector? = null

val Icons.Br.Skateboard: ImageVector
    get() = _Skateboard ?: UXIcon(name = "Skateboard") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(19.56f, 7.44f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2.12f)
            lineToRelative(-3f, 3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.12f, -2.12f)
            lineToRelative(0.44f, -0.44f)
            lineToRelative(-0.88f, -0.88f)
            lineToRelative(-0.44f, 0.44f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.12f, -2.12f)
            lineToRelative(3f, -3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.12f, 2.12f)
            lineToRelative(-0.44f, 0.44f)
            lineToRelative(0.88f, 0.88f)
            lineToRelative(0.44f, -0.44f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.12f, 0f)
            close()
            moveTo(10.44f, 14.44f)
            lineTo(10f, 14.88f)
            lineTo(9.12f, 14f)
            lineTo(9.56f, 13.56f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.12f, -2.12f)
            lineToRelative(-3f, 3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, 2.12f)
            lineToRelative(0.44f, -0.44f)
            lineToRelative(0.88f, 0.88f)
            lineToRelative(-0.44f, 0.44f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, 2.12f)
            lineToRelative(3f, -3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.12f, -2.12f)
            close()
            moveTo(24f, 7.89f)
            arcToRelative(7.84f, 7.84f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.31f, 5.58f)
            lineToRelative(-8.22f, 8.22f)
            arcToRelative(7.89f, 7.89f, 0f, isMoreThanHalf = true, isPositiveArc = true, -11.16f, -11.16f)
            lineToRelative(8.22f, -8.22f)
            arcToRelative(7.89f, 7.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.47f, 5.58f)
            close()
            moveTo(21f, 7.89f)
            arcToRelative(4.89f, 4.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.35f, -3.46f)
            lineToRelative(-8.22f, 8.22f)
            arcToRelative(4.89f, 4.89f, 0f, isMoreThanHalf = true, isPositiveArc = false, 6.92f, 6.92f)
            lineToRelative(8.22f, -8.22f)
            arcToRelative(4.86f, 4.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.43f, -3.46f)
            close()
        }
    }.also { _Skateboard = it }
