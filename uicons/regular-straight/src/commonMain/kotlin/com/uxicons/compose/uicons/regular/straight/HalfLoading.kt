package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HalfLoading: ImageVector? = null

val Icons.Rs.HalfLoading: ImageVector
    get() = _HalfLoading ?: UXIcon(name = "HalfLoading") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(11f, 24f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(20f, 11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                close()
                moveTo(18.41f, 16.88f)
                lineTo(21.87f, 18.89f)
                lineTo(22.87f, 17.16f)
                lineTo(19.42f, 15.15f)
                close()
                moveTo(18.89f, 2.13f)
                lineTo(17.16f, 1.12f)
                lineTo(15.15f, 4.58f)
                lineTo(16.88f, 5.58f)
                close()
                moveTo(19.43f, 8.84f)
                lineTo(22.88f, 6.82f)
                lineTo(21.88f, 5.09f)
                lineTo(18.42f, 7.11f)
                close()
                moveTo(15.18f, 19.42f)
                lineTo(17.19f, 22.87f)
                lineTo(18.92f, 21.86f)
                lineTo(16.91f, 18.41f)
                close()
            }
        }.also { _HalfLoading = it}
