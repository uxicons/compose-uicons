package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrainSide: ImageVector? = null

val Icons.Br.TrainSide: ImageVector
    get() = _TrainSide ?: UXIcon(name = "TrainSide") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 1f)
            lineTo(1.5f, 1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            lineTo(2.98f, 4f)
            lineTo(2.98f, 7f)
            lineTo(1.5f, 7f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            lineTo(19.55f, 10f)
            arcToRelative(13.56f, 13.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.43f, 3.06f)
            arcToRelative(1.48f, 1.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.22f, 1.33f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.54f, 15f)
            lineTo(1.5f, 15f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            lineTo(19.54f, 18f)
            arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.3f, -5.84f)
            curveTo(22.1f, 6.61f, 16.79f, 1f, 10f, 1f)
            close()
            moveTo(12f, 4.23f)
            arcTo(11.23f, 11.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.08f, 7f)
            lineTo(12f, 7f)
            close()
            moveTo(5.98f, 4f)
            lineTo(9f, 4f)
            lineTo(9f, 7f)
            lineTo(5.98f, 7f)
            close()
            moveTo(24f, 21.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.5f, 23f)
            lineTo(1.5f, 23f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
            horizontalLineToRelative(21f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 21.5f)
            close()
        }
    }.also { _TrainSide = it }
