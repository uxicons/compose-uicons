package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GolfBall: ImageVector? = null

val Icons.Rr.GolfBall: ImageVector
    get() = _GolfBall ?: UXIcon(name = "GolfBall") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 12f)
                close()
                moveTo(10f, 11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 11f)
                close()
                moveTo(12f, 8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 8f)
                close()
                moveTo(14f, 7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 7f)
                close()
                moveTo(16f, 8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 8f)
                close()
                moveTo(15.95f, 17.09f)
                arcToRelative(4.96f, 4.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, 2.79f)
                lineTo(13f, 21.41f)
                lineTo(13f, 23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                lineTo(11f, 21.41f)
                lineTo(9.46f, 19.88f)
                arcToRelative(4.96f, 4.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, -2.79f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7.89f, 0f)
                close()
                moveTo(13.12f, 18.46f)
                arcToRelative(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.8f, -1.46f)
                horizontalLineToRelative(-3.85f)
                arcToRelative(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.8f, 1.46f)
                lineTo(12f, 19.59f)
                close()
                moveTo(19f, 9f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = false, 8.41f, 15.01f)
                curveTo(8.44f, 15f, 8.47f, 15f, 8.5f, 15f)
                horizontalLineToRelative(7f)
                curveToRelative(0.03f, 0f, 0.06f, 0f, 0.09f, 0.01f)
                arcTo(6.97f, 6.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 9f)
                close()
            }
        }.also { _GolfBall = it}
