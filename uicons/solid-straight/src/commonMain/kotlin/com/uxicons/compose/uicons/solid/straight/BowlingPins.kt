package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BowlingPins: ImageVector? = null

val Icons.Ss.BowlingPins: ImageVector
    get() = _BowlingPins ?: UXIcon(name = "BowlingPins") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.57f, 6.34f)
                arcTo(6.73f, 6.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.8f, 3.7f)
                arcToRelative(3.7f, 3.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.4f, 0f)
                arcToRelative(6.73f, 6.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.77f, 2.64f)
                curveToRelative(-0.09f, 0.19f, -0.2f, 0.44f, -0.28f, 0.66f)
                horizontalLineToRelative(-5.3f)
                curveTo(15.77f, 6.78f, 15.66f, 6.54f, 15.57f, 6.34f)
                close()
                moveTo(21.34f, 9f)
                horizontalLineTo(15.66f)
                curveToRelative(-0.24f, 0.65f, -0.58f, 1.35f, -0.94f, 2.07f)
                arcTo(17.48f, 17.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 17.5f)
                arcTo(10.92f, 10.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.24f, 24f)
                horizontalLineToRelative(6.51f)
                arcTo(10.92f, 10.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 17.5f)
                arcToRelative(17.48f, 17.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.73f, -6.43f)
                curveTo(21.92f, 10.35f, 21.58f, 9.65f, 21.34f, 9f)
                close()
                moveTo(2.85f, 7f)
                horizontalLineToRelative(5.3f)
                curveToRelative(0.09f, -0.22f, 0.2f, -0.46f, 0.28f, -0.66f)
                arcTo(6.73f, 6.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.2f, 3.7f)
                arcToRelative(3.7f, 3.7f, 0f, isMoreThanHalf = true, isPositiveArc = false, -7.4f, 0f)
                arcToRelative(6.73f, 6.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.77f, 2.64f)
                curveTo(2.66f, 6.54f, 2.77f, 6.78f, 2.85f, 7f)
                close()
                moveTo(8.34f, 9f)
                horizontalLineTo(2.66f)
                curveToRelative(-0.24f, 0.65f, -0.58f, 1.35f, -0.94f, 2.07f)
                arcTo(17.48f, 17.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 17.5f)
                arcTo(10.92f, 10.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.24f, 24f)
                horizontalLineTo(8.76f)
                arcTo(10.92f, 10.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 17.5f)
                arcToRelative(17.48f, 17.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.73f, -6.43f)
                curveTo(8.92f, 10.35f, 8.58f, 9.65f, 8.34f, 9f)
                close()
            }
        }.also { _BowlingPins = it}
