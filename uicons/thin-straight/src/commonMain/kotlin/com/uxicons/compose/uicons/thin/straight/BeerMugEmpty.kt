package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BeerMugEmpty: ImageVector? = null

val Icons.Ts.BeerMugEmpty: ImageVector
    get() = _BeerMugEmpty ?: UXIcon(name = "BeerMugEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 18f)
                horizontalLineToRelative(-1f)
                lineTo(10f, 6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(12f)
                close()
                moveTo(15f, 6f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(1f)
                lineTo(15f, 6f)
                close()
                moveTo(7f, 6f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(1f)
                lineTo(7f, 6f)
                close()
                moveTo(24f, 8.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                lineTo(4.5f, 23f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                lineTo(2f, 2f)
                lineTo(0f, 2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(18f, 2f)
                lineTo(3f, 2f)
                verticalLineToRelative(18.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(12f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                lineTo(18f, 2f)
                close()
                moveTo(23f, 8.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-6.5f)
                close()
            }
        }.also { _BeerMugEmpty = it}
