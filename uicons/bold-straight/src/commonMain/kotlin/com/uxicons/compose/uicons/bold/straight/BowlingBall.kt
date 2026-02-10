package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BowlingBall: ImageVector? = null

val Icons.Bs.BowlingBall: ImageVector
    get() = _BowlingBall ?: UXIcon(name = "BowlingBall") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24f)
                close()
                moveTo(12f, 3f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, 9f, 9f)
                arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 3f)
                close()
                moveTo(10f, 11.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 11.5f, 10f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 11.5f)
                close()
                moveTo(6.5f, 9f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 8f, 10.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 9f)
                close()
                moveTo(9.5f, 5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 11f, 6.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 5f)
                close()
            }
        }.also { _BowlingBall = it}
