package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrainSide: ImageVector? = null

val Icons.Rs.TrainSide: ImageVector
    get() = _TrainSide ?: UXIcon(name = "TrainSide") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 2f)
                lineTo(0f, 2f)
                lineTo(0f, 4f)
                lineTo(3f, 4f)
                lineTo(3f, 7f)
                lineTo(0f, 7f)
                lineTo(0f, 9f)
                lineTo(19.73f, 9f)
                arcToRelative(11.93f, 11.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.23f, 6f)
                lineTo(0f, 15f)
                verticalLineToRelative(2f)
                lineTo(24f, 17f)
                lineTo(24f, 16f)
                arcTo(14.02f, 14.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 2f)
                close()
                moveTo(17.91f, 7f)
                lineTo(10f, 7f)
                lineTo(10f, 4f)
                arcTo(11.94f, 11.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.91f, 7f)
                close()
                moveTo(5f, 4f)
                lineTo(8f, 4f)
                lineTo(8f, 7f)
                lineTo(5f, 7f)
                close()
                moveTo(0f, 20f)
                lineTo(24f, 20f)
                verticalLineToRelative(2f)
                lineTo(0f, 22f)
                close()
            }
        }.also { _TrainSide = it}
