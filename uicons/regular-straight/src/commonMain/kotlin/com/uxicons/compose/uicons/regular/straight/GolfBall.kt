package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GolfBall: ImageVector? = null

val Icons.Rs.GolfBall: ImageVector
    get() = _GolfBall ?: UXIcon(name = "GolfBall") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 12f)
                close()
                moveTo(12f, 8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 8f)
                close()
                moveTo(14f, 7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 7f)
                close()
                moveTo(10f, 11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 11f)
                close()
                moveTo(16f, 8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 8f)
                close()
                moveTo(21f, 9f)
                arcToRelative(8.94f, 8.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, 8.03f)
                verticalLineToRelative(0.14f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.88f, 2.12f)
                lineTo(13f, 21.41f)
                lineTo(13f, 24f)
                lineTo(11f, 24f)
                lineTo(11f, 21.41f)
                lineTo(8.88f, 19.29f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 17.17f)
                verticalLineToRelative(-0.14f)
                arcTo(8.99f, 8.99f, 0f, isMoreThanHalf = true, isPositiveArc = true, 21f, 9f)
                close()
                moveTo(14f, 17f)
                lineTo(10f, 17f)
                verticalLineToRelative(0.17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.29f, 0.71f)
                lineTo(12f, 19.59f)
                lineToRelative(1.71f, -1.71f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 17.17f)
                close()
                moveTo(19f, 9f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = false, 8.4f, 15f)
                horizontalLineToRelative(7.2f)
                arcTo(6.96f, 6.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 9f)
                close()
            }
        }.also { _GolfBall = it}
