package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AddressBook: ImageVector? = null

val Icons.Ss.AddressBook: ImageVector
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
                moveTo(13f, 4f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 9.5f, 7.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 4f)
                close()
                moveTo(19f, 18f)
                lineTo(17f, 18f)
                lineTo(17f, 16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                lineTo(10f, 15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(2f)
                lineTo(7f, 18f)
                lineTo(7f, 16f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineToRelative(6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                close()
                moveTo(11.5f, 7.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 13f, 9f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.5f, 7.5f)
                close()
            }
        }.also { _AddressBook = it}
