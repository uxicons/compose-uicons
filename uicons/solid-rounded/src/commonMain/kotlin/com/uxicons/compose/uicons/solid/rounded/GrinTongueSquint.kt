package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GrinTongueSquint: ImageVector? = null

val Icons.Sr.GrinTongueSquint: ImageVector
    get() = _GrinTongueSquint ?: UXIcon(name = "GrinTongueSquint") {
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
                moveTo(7f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.55f, -0.17f)
                lineToRelative(3f, -2f)
                arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.66f)
                lineToRelative(-3f, -2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.11f, 1.66f)
                lineTo(8.2f, 9f)
                lineTo(6.45f, 10.17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 12f)
                close()
                moveTo(17f, 15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                lineTo(8f, 14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                lineTo(9f, 16f)
                verticalLineToRelative(0.6f)
                curveToRelative(0.13f, 4.5f, 5.87f, 4.49f, 6f, 0f)
                lineTo(15f, 16f)
                horizontalLineToRelative(1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 15f)
                close()
                moveTo(15.8f, 9f)
                lineToRelative(1.75f, -1.17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.11f, -1.66f)
                lineToRelative(-3f, 2f)
                arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.66f)
                lineToRelative(3f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.11f, -1.66f)
                close()
            }
        }.also { _GrinTongueSquint = it}
