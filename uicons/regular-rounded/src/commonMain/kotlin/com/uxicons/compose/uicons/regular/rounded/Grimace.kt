package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Grimace: ImageVector? = null

val Icons.Rr.Grimace: ImageVector
    get() = _Grimace ?: UXIcon(name = "Grimace") {
            path(fill = SolidColor(Color.Black)) {
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
                moveTo(7f, 9.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 9.5f)
                close()
                moveTo(14f, 9.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 9.5f)
                close()
                moveTo(16f, 13f)
                lineTo(8f, 13f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6f)
                horizontalLineToRelative(8f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 13f)
                close()
                moveTo(13f, 15f)
                verticalLineToRelative(2f)
                lineTo(11f, 17f)
                lineTo(11f, 15f)
                close()
                moveTo(7f, 16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                lineTo(9f, 15f)
                verticalLineToRelative(2f)
                lineTo(8f, 17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 16f)
                close()
                moveTo(16f, 17f)
                lineTo(15f, 17f)
                lineTo(15f, 15f)
                horizontalLineToRelative(1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 17f)
                close()
            }
        }.also { _Grimace = it}
