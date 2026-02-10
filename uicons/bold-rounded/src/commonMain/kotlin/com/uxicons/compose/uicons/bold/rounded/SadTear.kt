package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SadTear: ImageVector? = null

val Icons.Br.SadTear: ImageVector
    get() = _SadTear ?: UXIcon(name = "SadTear") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 9f)
            arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 9f)
            arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 9f)
            close()
            moveTo(16f, 7f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4f)
            arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 7f)
            close()
            moveTo(24f, 12f)
            curveTo(23.4f, -3.9f, 0.6f, -3.89f, 0f, 12f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            curveTo(3.45f, 0.08f, 20.55f, 0.08f, 21f, 12f)
            arcTo(9.05f, 9.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 20.49f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1f, 2.83f)
            arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 12f)
            close()
            moveTo(3f, 16.5f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 0f)
            curveToRelative(0.07f, -1.08f, -1.84f, -5.63f, -3.07f, -4.23f)
            arcTo(8.36f, 8.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 16.5f)
            close()
            moveTo(17.07f, 17.06f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.01f, -2.12f)
            arcTo(7.45f, 7.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 13f)
            arcToRelative(7.64f, 7.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.87f, 0.23f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.74f, 2.91f)
            arcToRelative(4.59f, 4.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.08f, 0.93f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.11f, -0.02f)
            close()
        }
    }.also { _SadTear = it }
