package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Beer: ImageVector? = null

val Icons.Bs.Beer: ImageVector
    get() = _Beer ?: UXIcon(name = "Beer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 11.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 8f)
                lineTo(19f, 8f)
                lineTo(19f, 4f)
                lineTo(16.33f, 4f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.05f, -1.73f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.43f, -0.24f)
                arcTo(2.96f, 2.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.7f, 4f)
                lineTo(0f, 4f)
                lineTo(0f, 20.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.5f, 24f)
                horizontalLineToRelative(12f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 20.5f)
                lineTo(19f, 19f)
                horizontalLineToRelative(5f)
                close()
                moveTo(16f, 20.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, 0.5f)
                lineTo(3.5f, 21f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, -0.5f)
                lineTo(3f, 7f)
                lineTo(5f, 7f)
                verticalLineToRelative(6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 0f)
                lineTo(9f, 7f)
                horizontalLineToRelative(7f)
                close()
                moveTo(21f, 16f)
                lineTo(19f, 16f)
                lineTo(19f, 11f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
                close()
            }
        }.also { _Beer = it}
