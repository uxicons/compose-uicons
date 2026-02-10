package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AddressBook: ImageVector? = null

val Icons.Br.AddressBook: ImageVector
    get() = _AddressBook ?: UXIcon(name = "AddressBook") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.5f, 0f)
            horizontalLineToRelative(-9f)
            arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.61f, 3f)
            lineTo(2.5f, 3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            lineTo(3f, 6f)
            lineTo(3f, 8f)
            lineTo(2.5f, 8f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            lineTo(3f, 11f)
            verticalLineToRelative(2f)
            lineTo(2.5f, 13f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            lineTo(3f, 16f)
            verticalLineToRelative(2f)
            lineTo(2.5f, 18f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            lineTo(3.61f, 21f)
            arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.5f, 24f)
            horizontalLineToRelative(9f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 18.5f)
            lineTo(23f, 5.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 0f)
            close()
            moveTo(20f, 18.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 21f)
            horizontalLineToRelative(-9f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 18.5f)
            lineTo(6f, 5.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 3f)
            horizontalLineToRelative(9f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 5.5f)
            close()
            moveTo(10.5f, 9.5f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 0f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 9.5f)
            close()
            moveTo(16.99f, 16.23f)
            arcToRelative(0.67f, 0.67f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.67f, 0.77f)
            lineTo(9.65f, 17f)
            arcToRelative(0.67f, 0.67f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.67f, -0.77f)
            curveTo(9.84f, 11.96f, 16.13f, 11.97f, 16.99f, 16.23f)
            close()
        }
    }.also { _AddressBook = it }
