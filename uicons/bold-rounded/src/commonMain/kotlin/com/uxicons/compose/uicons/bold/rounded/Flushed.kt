package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Flushed: ImageVector? = null

val Icons.Br.Flushed: ImageVector
    get() = _Flushed ?: UXIcon(name = "Flushed") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 0f)
            arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12f)
            curveToRelative(0.6f, 15.9f, 23.4f, 15.89f, 24f, 0f)
            arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
            close()
            moveTo(12f, 21f)
            arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9f, -9f)
            curveTo(3.45f, 0.08f, 20.55f, 0.08f, 21f, 12f)
            arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 21f)
            close()
            moveTo(17f, 16.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.5f, 18f)
            horizontalLineToRelative(-7f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
            horizontalLineToRelative(7f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 16.5f)
            close()
            moveTo(16f, 7f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6f)
            arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 7f)
            close()
            moveTo(16f, 11f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 11f)
            close()
            moveTo(11f, 10f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, 0f)
            arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 10f)
            close()
            moveTo(7f, 10f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 10f)
            close()
        }
    }.also { _Flushed = it }
