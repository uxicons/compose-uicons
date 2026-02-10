package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GrinTongueWink: ImageVector? = null

val Icons.Rs.GrinTongueWink: ImageVector
    get() = _GrinTongueWink ?: UXIcon(name = "GrinTongueWink") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 10f)
                verticalLineToRelative(1f)
                lineTo(14f, 11f)
                lineTo(14f, 10f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
                close()
                moveTo(10f, 9f)
                lineTo(6f, 9f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                close()
                moveTo(24f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 12f)
                close()
                moveTo(22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 22f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                close()
                moveTo(7f, 14f)
                lineTo(17f, 14f)
                verticalLineToRelative(2f)
                lineTo(15f, 16f)
                verticalLineToRelative(0.6f)
                arcTo(3.24f, 3.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 20f)
                arcToRelative(3.24f, 3.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3.4f)
                lineTo(9f, 16f)
                lineTo(7f, 16f)
                close()
                moveTo(13f, 16f)
                lineTo(11f, 16f)
                verticalLineToRelative(0.6f)
                curveToRelative(0f, 0.66f, 0.41f, 1.4f, 1f, 1.4f)
                reflectiveCurveToRelative(1f, -0.74f, 1f, -1.4f)
                close()
            }
        }.also { _GrinTongueWink = it}
