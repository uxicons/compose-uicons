package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BeerMugEmpty: ImageVector? = null

val Icons.Bs.BeerMugEmpty: ImageVector
    get() = _BeerMugEmpty ?: UXIcon(name = "BeerMugEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 10.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1f)
                lineTo(20f, 1f)
                lineTo(0f, 1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(15.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(11f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-7.5f)
                close()
                moveTo(15.5f, 20f)
                lineTo(4.5f, 20f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
                lineTo(4f, 4f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(15.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                close()
                moveTo(21f, 15f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(4.5f)
                close()
                moveTo(6f, 6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-3f)
                lineTo(6f, 6f)
                close()
                moveTo(11f, 6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-3f)
                lineTo(11f, 6f)
                close()
            }
        }.also { _BeerMugEmpty = it}
