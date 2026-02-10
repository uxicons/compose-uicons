package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AddressBook: ImageVector? = null

val Icons.Bs.AddressBook: ImageVector
    get() = _AddressBook ?: UXIcon(name = "AddressBook") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 0f)
                lineTo(3f, 0f)
                lineTo(3f, 3f)
                lineTo(1f, 3f)
                lineTo(1f, 6f)
                lineTo(3f, 6f)
                lineTo(3f, 8f)
                lineTo(1f, 8f)
                verticalLineToRelative(3f)
                lineTo(3f, 11f)
                verticalLineToRelative(2f)
                lineTo(1f, 13f)
                verticalLineToRelative(3f)
                lineTo(3f, 16f)
                verticalLineToRelative(2f)
                lineTo(1f, 18f)
                verticalLineToRelative(3f)
                lineTo(3f, 21f)
                verticalLineToRelative(3f)
                lineTo(19.5f, 24f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 20.5f)
                lineTo(23f, 3.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.5f, 0f)
                close()
                moveTo(20f, 20.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, 0.5f)
                lineTo(6f, 21f)
                lineTo(6f, 3f)
                lineTo(19.5f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
                close()
                moveTo(10.5f, 9.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 13f, 12f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 9.5f)
                close()
                moveTo(17f, 15f)
                verticalLineToRelative(2f)
                lineTo(9f, 17f)
                lineTo(9f, 15f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
                horizontalLineToRelative(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 15f)
                close()
            }
        }.also { _AddressBook = it}
