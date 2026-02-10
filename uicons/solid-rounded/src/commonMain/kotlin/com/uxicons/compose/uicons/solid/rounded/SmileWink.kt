package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmileWink: ImageVector? = null

val Icons.Sr.SmileWink: ImageVector
    get() = _SmileWink ?: UXIcon(name = "SmileWink") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(7f, 9f)
                horizontalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                lineTo(7f, 11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 9f)
                close()
                moveTo(17.67f, 15.75f)
                arcTo(9.45f, 9.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 18f)
                arcToRelative(9.45f, 9.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.67f, -2.25f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.33f, -1.49f)
                arcTo(7.51f, 7.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 16f)
                arcToRelative(7.51f, 7.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.34f, -1.75f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.33f, 1.49f)
                close()
                moveTo(16f, 11f)
                curveToRelative(-1.1f, 0f, -2f, 0f, -2f, -1f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
                curveTo(18f, 11f, 17.11f, 11f, 16f, 11f)
                close()
            }
        }.also { _SmileWink = it}
