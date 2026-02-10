package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mug: ImageVector? = null

val Icons.Rr.Mug: ImageVector
    get() = _Mug ?: UXIcon(name = "Mug") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 6f)
                lineTo(19f, 6f)
                lineTo(19f, 3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                lineTo(1f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 3f)
                lineTo(1f, 18f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                horizontalLineToRelative(8f)
                arcToRelative(5.17f, 5.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -6f)
                horizontalLineToRelative(1.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 13.5f)
                verticalLineToRelative(-4f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 6f)
                close()
                moveTo(14f, 21f)
                lineTo(6f, 21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                lineTo(3f, 8f)
                lineTo(14f, 8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                lineTo(3f, 6f)
                lineTo(3f, 3f)
                lineTo(17f, 3f)
                lineTo(17f, 18f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 21f)
                close()
                moveTo(22f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.5f, 15f)
                lineTo(19f, 15f)
                lineTo(19f, 8f)
                horizontalLineToRelative(1.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 9.5f)
                close()
            }
        }.also { _Mug = it}
