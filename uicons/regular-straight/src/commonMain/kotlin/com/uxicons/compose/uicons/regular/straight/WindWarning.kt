package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WindWarning: ImageVector? = null

val Icons.Rs.WindWarning: ImageVector
    get() = _WindWarning ?: UXIcon(name = "WindWarning") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 20f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 0f)
                lineTo(9f, 20f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, -2f)
                lineTo(0f, 18f)
                lineTo(0f, 16f)
                lineTo(11f, 16f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 20f)
                close()
                moveTo(8f, 3f)
                lineTo(6f, 3f)
                lineTo(6f, 8f)
                lineTo(8f, 8f)
                close()
                moveTo(8f, 9f)
                lineTo(6f, 9f)
                verticalLineToRelative(2f)
                lineTo(8f, 11f)
                close()
                moveTo(0f, 7f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7f, 7f)
                arcTo(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 7f)
                close()
                moveTo(2f, 7f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 7f, 2f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 7f)
                close()
                moveTo(20f, 9f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, -4f, -4f)
                horizontalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 2f)
                lineTo(16f, 7f)
                arcToRelative(9.03f, 9.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.22f, 2f)
                close()
                moveTo(20f, 11f)
                lineTo(15.06f, 11f)
                arcToRelative(9.06f, 9.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.36f, 2f)
                lineTo(20f, 13f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 2f)
                lineTo(16f, 15f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4f, -4f)
                close()
            }
        }.also { _WindWarning = it}
