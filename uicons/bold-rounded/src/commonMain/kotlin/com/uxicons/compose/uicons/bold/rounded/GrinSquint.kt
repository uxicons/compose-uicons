package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GrinSquint: ImageVector? = null

val Icons.Br.GrinSquint: ImageVector
    get() = _GrinSquint ?: UXIcon(name = "GrinSquint") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.5f, 12f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.9f, -2.7f)
            lineTo(7f, 9f)
            lineToRelative(-0.4f, -0.3f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.4f, 6.3f)
            lineToRelative(2f, 1.5f)
            arcToRelative(1.51f, 1.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2.4f)
            lineToRelative(-2f, 1.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 12f)
            close()
            moveTo(17.7f, 11.4f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.3f, -2.1f)
            lineTo(17f, 9f)
            lineToRelative(0.4f, -0.3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.8f, -2.4f)
            lineToRelative(-2f, 1.5f)
            arcToRelative(1.51f, 1.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2.4f)
            lineToRelative(2f, 1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.1f, -0.3f)
            close()
            moveTo(24f, 12f)
            arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
            curveTo(-3.9f, 0.6f, -3.89f, 23.4f, 12f, 24f)
            arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 12f)
            close()
            moveTo(21f, 12f)
            arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9f, 9f)
            curveTo(0.08f, 20.55f, 0.08f, 3.45f, 12f, 3f)
            arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 12f)
            close()
            moveTo(16.79f, 14.02f)
            arcTo(15.4f, 15.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15f)
            arcTo(15.4f, 15.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.2f, 14.02f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.05f, 1.52f)
            arcTo(6.84f, 6.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 19f)
            arcToRelative(6.83f, 6.83f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.84f, -3.46f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.79f, 14.02f)
            close()
        }
    }.also { _GrinSquint = it }
