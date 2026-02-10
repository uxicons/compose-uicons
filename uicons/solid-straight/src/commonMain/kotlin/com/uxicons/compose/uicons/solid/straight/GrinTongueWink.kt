package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GrinTongueWink: ImageVector? = null

val Icons.Ss.GrinTongueWink: ImageVector
    get() = _GrinTongueWink ?: UXIcon(name = "GrinTongueWink") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 16f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(0.6f)
                curveToRelative(-0.06f, 1.84f, -1.94f, 1.84f, -2f, 0f)
                close()
                moveTo(24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24f)
                curveTo(-3.9f, 23.4f, -3.89f, 0.6f, 12f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 12f)
                close()
                moveTo(6f, 11f)
                horizontalLineToRelative(4f)
                lineTo(10f, 9f)
                lineTo(6f, 9f)
                close()
                moveTo(17f, 14f)
                lineTo(7f, 14f)
                verticalLineToRelative(2f)
                lineTo(9f, 16f)
                verticalLineToRelative(0.6f)
                curveToRelative(0.13f, 4.5f, 5.87f, 4.49f, 6f, 0f)
                lineTo(15f, 16f)
                horizontalLineToRelative(2f)
                close()
                moveTo(18f, 10f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 0f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4f)
                close()
            }
        }.also { _GrinTongueWink = it}
