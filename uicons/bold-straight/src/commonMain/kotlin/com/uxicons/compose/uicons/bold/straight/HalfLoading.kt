package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HalfLoading: ImageVector? = null

val Icons.Bs.HalfLoading: ImageVector
    get() = _HalfLoading ?: UXIcon(name = "HalfLoading") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.5f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(10.5f, 24f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(20f, 10.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-3f)
                close()
                moveTo(18.16f, 17.32f)
                lineTo(21.62f, 19.32f)
                lineTo(23.13f, 16.73f)
                lineTo(19.67f, 14.72f)
                close()
                moveTo(19.32f, 2.38f)
                lineTo(16.73f, 0.87f)
                lineTo(14.72f, 4.33f)
                lineTo(17.31f, 5.84f)
                close()
                moveTo(19.68f, 9.27f)
                lineTo(23.13f, 7.25f)
                lineTo(21.62f, 4.66f)
                lineTo(18.17f, 6.68f)
                close()
                moveTo(14.74f, 19.67f)
                lineTo(16.76f, 23.12f)
                lineTo(19.35f, 21.61f)
                lineTo(17.34f, 18.16f)
                close()
            }
        }.also { _HalfLoading = it}
