package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GrinTongueSquint: ImageVector? = null

val Icons.Rr.GrinTongueSquint: ImageVector
    get() = _GrinTongueSquint ?: UXIcon(name = "GrinTongueSquint") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 14f)
                lineTo(8f, 14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                lineTo(9f, 16f)
                verticalLineToRelative(0.6f)
                curveToRelative(0.13f, 4.5f, 5.87f, 4.49f, 6f, 0f)
                lineTo(15f, 16f)
                horizontalLineToRelative(1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 14f)
                close()
                moveTo(13f, 16.6f)
                curveToRelative(-0.06f, 1.84f, -1.94f, 1.84f, -2f, 0f)
                lineTo(11f, 16f)
                horizontalLineToRelative(2f)
                close()
                moveTo(17.55f, 7.83f)
                lineTo(15.8f, 9f)
                lineToRelative(1.75f, 1.17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.11f, 1.66f)
                lineToRelative(-3f, -2f)
                arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.66f)
                lineToRelative(3f, -2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.11f, 1.66f)
                close()
                moveTo(7f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.56f, -1.83f)
                lineTo(8.2f, 9f)
                lineTo(6.45f, 7.83f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.11f, -1.66f)
                lineToRelative(3f, 2f)
                arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.66f)
                lineToRelative(-3f, 2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 12f)
                close()
                moveTo(12f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12f)
                curveToRelative(0.6f, 15.9f, 23.4f, 15.89f, 24f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(12f, 22f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                curveTo(2.5f, -1.25f, 21.5f, -1.24f, 22f, 12f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                close()
            }
        }.also { _GrinTongueSquint = it}
