package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrainSide: ImageVector? = null

val Icons.Rr.TrainSide: ImageVector
    get() = _TrainSide ?: UXIcon(name = "TrainSide") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.99f, 15f)
                lineTo(1f, 15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                lineTo(19.99f, 17f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.83f, -5.19f)
                arcTo(13.94f, 13.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.46f, 2f)
                lineTo(1f, 2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 4f)
                lineTo(4f, 4f)
                lineTo(4f, 7f)
                lineTo(1f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 9f)
                lineTo(20.21f, 9f)
                arcToRelative(12.05f, 12.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.69f, 3.41f)
                arcToRelative(1.97f, 1.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.3f, 1.77f)
                arcTo(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.99f, 15f)
                close()
                moveTo(9f, 7f)
                lineTo(6f, 7f)
                lineTo(6f, 4f)
                lineTo(9f, 4f)
                close()
                moveTo(11f, 7f)
                lineTo(11f, 4.02f)
                arcTo(11.95f, 11.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.41f, 7f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 20f)
                horizontalLineTo(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineTo(23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                close()
            }
        }.also { _TrainSide = it}
