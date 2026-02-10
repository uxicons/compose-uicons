package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Grin: ImageVector? = null

val Icons.Br.Grin: ImageVector
    get() = _Grin ?: UXIcon(name = "Grin") {
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
            moveTo(6f, 9f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
            arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 9f)
            close()
            moveTo(14f, 9f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
            arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 9f)
            close()
            moveTo(17.85f, 14.54f)
            arcTo(6.82f, 6.82f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.01f, 18f)
            arcToRelative(6.84f, 6.84f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.85f, -3.46f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.05f, -1.52f)
            arcTo(15.4f, 15.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 14f)
            arcToRelative(15.4f, 15.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.79f, -0.98f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.85f, 14.54f)
            close()
        }
    }.also { _Grin = it }
