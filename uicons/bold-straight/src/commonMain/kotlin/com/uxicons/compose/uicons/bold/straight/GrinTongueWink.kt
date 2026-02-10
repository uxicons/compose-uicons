package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GrinTongueWink: ImageVector? = null

val Icons.Bs.GrinTongueWink: ImageVector
    get() = _GrinTongueWink ?: UXIcon(name = "GrinTongueWink") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 13f)
                lineTo(17f, 13f)
                verticalLineToRelative(3f)
                lineTo(14.5f, 16f)
                curveToRelative(-0.09f, 3.95f, -4.92f, 3.95f, -5f, 0f)
                lineTo(7f, 16f)
                close()
                moveTo(24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24f)
                curveTo(-3.9f, 23.4f, -3.89f, 0.6f, 12f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 12f)
                close()
                moveTo(21f, 12f)
                arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9f, -9f)
                curveTo(0.08f, 3.45f, 0.08f, 20.55f, 12f, 21f)
                arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 12f)
                close()
                moveTo(15.5f, 7f)
                arcTo(2.59f, 2.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 9.67f)
                lineTo(13f, 11f)
                horizontalLineToRelative(5f)
                lineTo(18f, 9.67f)
                arcTo(2.59f, 2.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 7f)
                close()
                moveTo(11f, 8f)
                lineTo(6f, 8f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5f)
                close()
            }
        }.also { _GrinTongueWink = it}
