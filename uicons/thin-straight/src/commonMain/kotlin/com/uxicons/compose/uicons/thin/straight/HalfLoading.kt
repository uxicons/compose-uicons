package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HalfLoading: ImageVector? = null

val Icons.Ts.HalfLoading: ImageVector
    get() = _HalfLoading ?: UXIcon(name = "HalfLoading") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.5f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(11.5f, 24f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(20f, 11.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1f)
                close()
                moveTo(18.66f, 16.45f)
                lineTo(22.12f, 18.46f)
                lineTo(22.62f, 17.6f)
                lineTo(19.16f, 15.59f)
                close()
                moveTo(18.46f, 1.88f)
                lineTo(17.59f, 1.37f)
                lineTo(15.58f, 4.83f)
                lineTo(16.45f, 5.33f)
                close()
                moveTo(22.63f, 6.39f)
                lineTo(22.13f, 5.53f)
                lineTo(18.67f, 7.54f)
                lineTo(19.18f, 8.4f)
                close()
                moveTo(15.61f, 19.16f)
                lineTo(17.62f, 22.62f)
                lineTo(18.49f, 22.12f)
                lineTo(16.47f, 18.66f)
                close()
            }
        }.also { _HalfLoading = it}
