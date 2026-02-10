package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GasPumpAlt: ImageVector? = null

val Icons.Ss.GasPumpAlt: ImageVector
    get() = _GasPumpAlt ?: UXIcon(name = "GasPumpAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 9f)
                lineTo(0f, 9f)
                lineTo(0f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
                lineTo(13f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                close()
                moveTo(23.41f, 4f)
                lineTo(19.71f, 0.29f)
                lineTo(18.29f, 1.71f)
                lineTo(20f, 3.41f)
                lineTo(20f, 6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                lineTo(22f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                lineTo(20f, 17f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                lineTo(16f, 14f)
                lineTo(16f, 11f)
                lineTo(0f, 11f)
                lineTo(0f, 24f)
                lineTo(16f, 24f)
                lineTo(16f, 16f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(1f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 0f)
                lineTo(24f, 5.41f)
                arcTo(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.41f, 4f)
                close()
            }
        }.also { _GasPumpAlt = it}
