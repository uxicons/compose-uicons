package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bed: ImageVector? = null

val Icons.Rr.Bed: ImageVector
    get() = _Bed ?: UXIcon(name = "Bed") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 6f)
                lineTo(13f, 6f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.58f, 8.71f)
                arcTo(3.46f, 3.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 8f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 11.5f)
                arcTo(3.46f, 3.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.35f, 13f)
                lineTo(2f, 13f)
                lineTo(2f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                lineTo(0f, 21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                lineTo(2f, 19f)
                lineTo(22f, 19f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                lineTo(24f, 11f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 6f)
                close()
                moveTo(10f, 11f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineToRelative(6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                verticalLineToRelative(2f)
                lineTo(10f, 13f)
                close()
                moveTo(5f, 11.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6.5f, 13f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 11.5f)
                close()
                moveTo(2f, 17f)
                lineTo(2f, 15f)
                lineTo(22f, 15f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _Bed = it}
