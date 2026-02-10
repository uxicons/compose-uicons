package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Smartphone: ImageVector? = null

val Icons.Rr.Smartphone: ImageVector
    get() = _Smartphone ?: UXIcon(name = "Smartphone") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 0f)
                lineTo(9f, 0f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 5f)
                lineTo(4f, 19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                horizontalLineToRelative(6f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                lineTo(20f, 5f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 0f)
                close()
                moveTo(9f, 2f)
                horizontalLineToRelative(6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                lineTo(18f, 16f)
                lineTo(6f, 16f)
                lineTo(6f, 5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 2f)
                close()
                moveTo(15f, 22f)
                lineTo(9f, 22f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                lineTo(6f, 18f)
                lineTo(18f, 18f)
                verticalLineToRelative(1f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 22f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 20f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
        }.also { _Smartphone = it}
