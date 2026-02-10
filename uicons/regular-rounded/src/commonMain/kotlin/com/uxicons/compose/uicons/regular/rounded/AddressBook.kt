package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AddressBook: ImageVector? = null

val Icons.Rr.AddressBook: ImageVector
    get() = _AddressBook ?: UXIcon(name = "AddressBook") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 0f)
                lineTo(8f, 0f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.42f, 3f)
                lineTo(2f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 5f)
                lineTo(3f, 5f)
                lineTo(3f, 7f)
                lineTo(2f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 9f)
                lineTo(3f, 9f)
                verticalLineToRelative(2f)
                lineTo(2f, 11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                lineTo(3f, 13f)
                verticalLineToRelative(2f)
                lineTo(2f, 15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                lineTo(3f, 17f)
                verticalLineToRelative(2f)
                lineTo(2f, 19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                lineTo(3.42f, 21f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 24f)
                lineTo(18f, 24f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                lineTo(23f, 5f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 0f)
                close()
                moveTo(21f, 19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                lineTo(8f, 22f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                lineTo(5f, 5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 2f)
                lineTo(18f, 2f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                close()
                moveTo(13f, 12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 12f)
                close()
                moveTo(18f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                curveTo(8.21f, 11.39f, 17.79f, 11.39f, 18f, 18f)
                close()
            }
        }.also { _AddressBook = it}
