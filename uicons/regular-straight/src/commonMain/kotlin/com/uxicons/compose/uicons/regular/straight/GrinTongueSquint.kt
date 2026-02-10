package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GrinTongueSquint: ImageVector? = null

val Icons.Rs.GrinTongueSquint: ImageVector
    get() = _GrinTongueSquint ?: UXIcon(name = "GrinTongueSquint") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 22f, 12f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                close()
                moveTo(7f, 16f)
                lineTo(9f, 16f)
                verticalLineToRelative(0.6f)
                arcTo(3.24f, 3.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 20f)
                arcToRelative(3.24f, 3.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3.4f)
                lineTo(15f, 16f)
                horizontalLineToRelative(2f)
                lineTo(17f, 14f)
                lineTo(7f, 14f)
                close()
                moveTo(13f, 16.6f)
                curveToRelative(0f, 0.66f, -0.41f, 1.4f, -1f, 1.4f)
                reflectiveCurveToRelative(-1f, -0.74f, -1f, -1.4f)
                lineTo(11f, 16f)
                horizontalLineToRelative(2f)
                close()
                moveTo(17.62f, 7.78f)
                lineTo(16.1f, 9f)
                lineToRelative(1.52f, 1.22f)
                lineToRelative(-1.25f, 1.56f)
                lineTo(12.9f, 9f)
                lineToRelative(3.48f, -2.78f)
                close()
                moveTo(6.38f, 10.22f)
                lineTo(7.9f, 9f)
                lineTo(6.38f, 7.78f)
                lineToRelative(1.25f, -1.56f)
                lineTo(11.1f, 9f)
                lineTo(7.62f, 11.78f)
                close()
            }
        }.also { _GrinTongueSquint = it}
