package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _At: ImageVector? = null

val Icons.Rr.At: ImageVector
    get() = _At ?: UXIcon(name = "At") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12f)
                curveToRelative(-0.13f, 9.57f, 11.16f, 15.43f, 18.9f, 9.82f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.15f, -1.63f)
                curveTo(11.3f, 24.86f, 1.9f, 19.98f, 2f, 12f)
                curveTo(2.55f, -1.27f, 21.45f, -1.26f, 22f, 12f)
                verticalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 0f)
                lineTo(18f, 12f)
                curveTo(17.75f, 4.07f, 6.25f, 4.07f, 6f, 12f)
                arcToRelative(6.02f, 6.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.52f, 3.93f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 14f)
                lineTo(24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(12f, 16f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 16f)
                close()
            }
        }.also { _At = it}
