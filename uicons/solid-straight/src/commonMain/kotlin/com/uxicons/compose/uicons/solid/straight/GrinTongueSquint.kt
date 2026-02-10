package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GrinTongueSquint: ImageVector? = null

val Icons.Ss.GrinTongueSquint: ImageVector
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
                moveTo(7.9f, 9f)
                lineTo(6.38f, 10.22f)
                lineToRelative(1.25f, 1.56f)
                lineTo(11.1f, 9f)
                lineTo(7.62f, 6.22f)
                lineTo(6.38f, 7.78f)
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
                moveTo(16.1f, 9f)
                lineTo(17.62f, 7.78f)
                lineTo(16.37f, 6.22f)
                lineTo(12.9f, 9f)
                lineToRelative(3.48f, 2.78f)
                lineToRelative(1.25f, -1.56f)
                close()
            }
        }.also { _GrinTongueSquint = it}
