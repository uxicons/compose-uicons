package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Comments: ImageVector? = null

val Icons.Bs.Comments: ImageVector
    get() = _Comments ?: UXIcon(name = "Comments") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 9f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 9f)
                verticalLineToRelative(9f)
                lineTo(9f, 18f)
                arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 9f)
                close()
                moveTo(9f, 15f)
                lineTo(3f, 15f)
                lineTo(3f, 9f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6f, 6f)
                close()
                moveTo(24f, 16f)
                verticalLineToRelative(8f)
                lineTo(16f, 24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.92f, -4f)
                arcToRelative(10.96f, 10.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.32f, -0.54f)
                arcTo(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 21f)
                horizontalLineToRelative(5f)
                lineTo(21f, 16f)
                arcToRelative(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.54f, -3.6f)
                arcTo(10.96f, 10.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 9.08f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 16f)
                close()
            }
        }.also { _Comments = it}
