package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GasPumpSlash: ImageVector? = null

val Icons.Ss.GasPumpSlash: ImageVector
    get() = _GasPumpSlash ?: UXIcon(name = "GasPumpSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24.01f, 22.59f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-22.6f, -22.6f)
                lineTo(1.41f, -0.01f)
                lineTo(1.71f, 0.3f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
                lineTo(13f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                lineTo(16f, 9f)
                lineTo(10.41f, 9f)
                lineToRelative(2f, 2f)
                lineTo(16f, 11f)
                verticalLineToRelative(3.59f)
                lineToRelative(4.33f, 4.33f)
                curveToRelative(0.57f, 0.27f, 1.7f, -0.02f, 1.67f, -0.92f)
                lineTo(22f, 8f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
                lineTo(20f, 3.41f)
                lineTo(18.29f, 1.71f)
                lineTo(19.71f, 0.29f)
                lineTo(23.41f, 4f)
                arcTo(2.02f, 2.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 5.41f)
                lineTo(24f, 18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.83f, 2.76f)
                close()
                moveTo(0f, 9f)
                lineTo(4.76f, 9f)
                lineTo(0f, 4.24f)
                close()
                moveTo(0f, 11f)
                lineTo(0f, 24f)
                lineTo(16f, 24f)
                lineTo(16f, 20.24f)
                lineTo(6.76f, 11f)
                close()
            }
        }.also { _GasPumpSlash = it}
