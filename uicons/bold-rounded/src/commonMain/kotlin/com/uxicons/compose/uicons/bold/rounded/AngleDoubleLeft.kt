package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleDoubleLeft: ImageVector? = null

val Icons.Br.AngleDoubleLeft: ImageVector
    get() = _AngleDoubleLeft ?: UXIcon(name = "AngleDoubleLeft") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 24f)
            arcToRelative(1.49f, 1.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.06f, -0.44f)
            lineTo(3.26f, 15.89f)
            arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -7.78f)
            lineTo(10.94f, 0.44f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.12f, 2.12f)
            lineTo(5.38f, 10.23f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.54f)
            lineToRelative(7.67f, 7.67f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.54f, 24f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.06f, -0.44f)
            lineTo(11.4f, 14.47f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -4.95f)
            lineTo(20.48f, 0.44f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.6f, 2.56f)
            lineToRelative(-9.09f, 9.09f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 0.71f)
            lineTo(22.6f, 21.44f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.54f, 24f)
            close()
        }
    }.also { _AngleDoubleLeft = it }
