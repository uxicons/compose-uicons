package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GolfBall: ImageVector? = null

val Icons.Br.GolfBall: ImageVector
    get() = _GolfBall ?: UXIcon(name = "GolfBall") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 0f)
            arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.06f, 17.09f)
            arcToRelative(4.66f, 4.66f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.37f, 2.56f)
            lineTo(10.5f, 20.72f)
            lineTo(10.5f, 22.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            lineTo(13.5f, 20.72f)
            lineToRelative(1.07f, -1.07f)
            arcToRelative(4.67f, 4.67f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.37f, -2.56f)
            arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
            close()
            moveTo(12f, 15f)
            arcToRelative(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6f, -6f)
            arcTo(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15f)
            close()
            moveTo(14f, 12.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12.5f, 11f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 12.5f)
            close()
            moveTo(15.5f, 8f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 14f, 9.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.5f, 8f)
            close()
            moveTo(11.5f, 10f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 13f, 8.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.5f, 10f)
            close()
        }
    }.also { _GolfBall = it }
