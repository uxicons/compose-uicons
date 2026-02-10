package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GasPumpSlash: ImageVector? = null

val Icons.Rs.GasPumpSlash: ImageVector
    get() = _GasPumpSlash ?: UXIcon(name = "GasPumpSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.17f, 20.76f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 18f)
                lineTo(24f, 5.41f)
                arcTo(2.02f, 2.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.41f, 4f)
                lineTo(19.71f, 0.29f)
                lineTo(18.29f, 1.71f)
                lineTo(20f, 3.41f)
                lineTo(20f, 6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                lineTo(22f, 18f)
                curveToRelative(0.04f, 0.9f, -1.1f, 1.19f, -1.67f, 0.92f)
                lineTo(16f, 14.59f)
                lineTo(16f, 3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                lineTo(1.41f, -0.01f)
                lineTo(-0.01f, 1.41f)
                lineToRelative(22.6f, 22.6f)
                lineToRelative(1.41f, -1.41f)
                close()
                moveTo(14f, 12.59f)
                lineTo(12.41f, 11f)
                lineTo(14f, 11f)
                close()
                moveTo(13f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                lineTo(14f, 9f)
                lineTo(10.41f, 9f)
                lineToRelative(-7f, -7f)
                close()
                moveTo(14f, 18.24f)
                lineTo(16f, 20.24f)
                lineTo(16f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 4.24f)
                lineToRelative(2f, 2f)
                lineTo(2f, 9f)
                lineTo(4.76f, 9f)
                lineToRelative(2f, 2f)
                lineTo(2f, 11f)
                lineTo(2f, 22f)
                lineTo(14f, 22f)
                close()
            }
        }.also { _GasPumpSlash = it}
