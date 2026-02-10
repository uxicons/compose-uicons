package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MakeupBrush: ImageVector? = null

val Icons.Br.MakeupBrush: ImageVector
    get() = _MakeupBrush ?: UXIcon(name = "MakeupBrush") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.98f, 1.02f)
            arcToRelative(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.71f, -0.18f)
            lineToRelative(-12.63f, 10.92f)
            curveToRelative(-2.08f, 0.47f, -5.65f, 1.76f, -5.65f, 5.05f)
            arcToRelative(7.21f, 7.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.2f, 7.2f)
            curveToRelative(3.28f, 0f, 4.57f, -3.57f, 5.05f, -5.65f)
            lineToRelative(10.93f, -12.64f)
            arcToRelative(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.2f, -4.69f)
            close()
            moveTo(7.2f, 21f)
            arcToRelative(4.2f, 4.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.2f, -4.2f)
            curveToRelative(0f, -1.09f, 2.12f, -1.89f, 3.68f, -2.2f)
            lineToRelative(2.72f, 2.72f)
            curveToRelative(-0.31f, 1.56f, -1.11f, 3.68f, -2.2f, 3.68f)
            close()
            moveTo(20.9f, 3.76f)
            lineTo(14.65f, 10.98f)
            lineTo(13.02f, 9.35f)
            lineTo(20.23f, 3.11f)
            arcToRelative(0.47f, 0.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.67f, 0.65f)
            close()
        }
    }.also { _MakeupBrush = it }
