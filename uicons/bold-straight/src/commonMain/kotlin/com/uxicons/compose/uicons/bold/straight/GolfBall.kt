package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GolfBall: ImageVector? = null

val Icons.Bs.GolfBall: ImageVector
    get() = _GolfBall ?: UXIcon(name = "GolfBall") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 12.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12.5f, 11f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 12.5f)
                close()
                moveTo(13f, 8.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 11.5f, 10f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 8.5f)
                close()
                moveTo(14f, 9.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 15.5f, 8f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 9.5f)
                close()
                moveTo(16f, 17.06f)
                verticalLineToRelative(0.11f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.88f, 2.12f)
                lineTo(13.5f, 20.91f)
                lineTo(13.5f, 24f)
                horizontalLineToRelative(-3f)
                lineTo(10.5f, 20.91f)
                lineTo(8.88f, 19.29f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 17.17f)
                lineTo(8f, 17.06f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8f, 0f)
                close()
                moveTo(18f, 9f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = false, -6f, 6f)
                arcTo(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 9f)
                close()
            }
        }.also { _GolfBall = it}
