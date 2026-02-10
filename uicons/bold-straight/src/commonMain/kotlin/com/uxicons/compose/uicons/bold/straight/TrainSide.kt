package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrainSide: ImageVector? = null

val Icons.Bs.TrainSide: ImageVector
    get() = _TrainSide ?: UXIcon(name = "TrainSide") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.5f, 1f)
                lineTo(0f, 1f)
                lineTo(0f, 4f)
                lineTo(3f, 4f)
                lineTo(3f, 7f)
                lineTo(0f, 7f)
                verticalLineToRelative(3f)
                lineTo(19.16f, 10f)
                arcToRelative(12.4f, 12.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.75f, 5f)
                lineTo(0f, 15f)
                verticalLineToRelative(3f)
                lineTo(24f, 18f)
                lineTo(24f, 16.5f)
                arcTo(15.52f, 15.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.5f, 1f)
                close()
                moveTo(16.6f, 7f)
                lineTo(12f, 7f)
                lineTo(12f, 4.5f)
                arcTo(12.48f, 12.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.6f, 7f)
                close()
                moveTo(6f, 4f)
                lineTo(8.5f, 4f)
                curveToRelative(0.17f, 0f, 0.33f, 0.02f, 0.5f, 0.02f)
                lineTo(9f, 7f)
                lineTo(6f, 7f)
                close()
                moveTo(0f, 20f)
                lineTo(24f, 20f)
                verticalLineToRelative(3f)
                lineTo(0f, 23f)
                close()
            }
        }.also { _TrainSide = it}
