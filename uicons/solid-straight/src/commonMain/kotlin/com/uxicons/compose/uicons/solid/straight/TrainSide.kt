package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrainSide: ImageVector? = null

val Icons.Ss.TrainSide: ImageVector
    get() = _TrainSide ?: UXIcon(name = "TrainSide") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 22f)
                lineTo(0f, 22f)
                lineTo(0f, 20f)
                lineTo(24f, 20f)
                close()
                moveTo(0f, 8f)
                verticalLineToRelative(9f)
                lineTo(24f, 17f)
                lineTo(24f, 16f)
                arcToRelative(13.91f, 13.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.53f, -8f)
                close()
                moveTo(6f, 6f)
                horizontalLineToRelative(4f)
                lineTo(10f, 2f)
                lineTo(6f, 2f)
                close()
                moveTo(12f, 6f)
                horizontalLineToRelative(7.78f)
                arcTo(13.96f, 13.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2.16f)
                close()
                moveTo(4f, 6f)
                lineTo(4f, 2f)
                lineTo(0f, 2f)
                lineTo(0f, 6f)
                close()
            }
        }.also { _TrainSide = it}
