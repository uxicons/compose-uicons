package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AddressBook: ImageVector? = null

val Icons.Rs.AddressBook: ImageVector
    get() = _AddressBook ?: UXIcon(name = "AddressBook") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 0f)
                lineTo(3f, 0f)
                lineTo(3f, 3f)
                lineTo(1f, 3f)
                lineTo(1f, 5f)
                lineTo(3f, 5f)
                lineTo(3f, 7f)
                lineTo(1f, 7f)
                lineTo(1f, 9f)
                lineTo(3f, 9f)
                verticalLineToRelative(2f)
                lineTo(1f, 11f)
                verticalLineToRelative(2f)
                lineTo(3f, 13f)
                verticalLineToRelative(2f)
                lineTo(1f, 15f)
                verticalLineToRelative(2f)
                lineTo(3f, 17f)
                verticalLineToRelative(2f)
                lineTo(1f, 19f)
                verticalLineToRelative(2f)
                lineTo(3f, 21f)
                verticalLineToRelative(3f)
                lineTo(20f, 24f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                lineTo(23f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 0f)
                close()
                moveTo(21f, 21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                lineTo(5f, 22f)
                lineTo(5f, 2f)
                lineTo(20f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                close()
                moveTo(13f, 12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3f, -3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 12f)
                close()
                moveTo(18f, 16f)
                verticalLineToRelative(2f)
                lineTo(16f, 18f)
                lineTo(16f, 16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                lineTo(11f, 15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(2f)
                lineTo(8f, 18f)
                lineTo(8f, 16f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineToRelative(4f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 16f)
                close()
            }
        }.also { _AddressBook = it}
