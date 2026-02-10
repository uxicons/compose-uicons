package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GasPumpAlt: ImageVector? = null

val Icons.Rr.GasPumpAlt: ImageVector
    get() = _GasPumpAlt ?: UXIcon(name = "GasPumpAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 6.95f)
                arcToRelative(5.96f, 5.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.75f, -4.12f)
                lineTo(19.71f, 0.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, 1.41f)
                lineTo(20f, 3.41f)
                lineTo(20f, 6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                lineTo(22f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                lineTo(20f, 17f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                lineTo(16f, 14f)
                lineTo(16f, 5f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, -5f)
                lineTo(5f, 0f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5f)
                lineTo(0f, 19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                horizontalLineToRelative(6f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                lineTo(16f, 16f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(1f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 0f)
                reflectiveCurveTo(24f, 6.96f, 24f, 6.95f)
                close()
                moveTo(5f, 2f)
                horizontalLineToRelative(6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                lineTo(14f, 9f)
                lineTo(2f, 9f)
                lineTo(2f, 5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 2f)
                close()
                moveTo(14f, 19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                lineTo(5f, 22f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                lineTo(2f, 11f)
                lineTo(14f, 11f)
                close()
            }
        }.also { _GasPumpAlt = it}
