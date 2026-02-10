package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BeerMugEmpty: ImageVector? = null

val Icons.Rs.BeerMugEmpty: ImageVector
    get() = _BeerMugEmpty ?: UXIcon(name = "BeerMugEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 18f)
                horizontalLineToRelative(-2f)
                lineTo(9f, 6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(12f)
                close()
                moveTo(15f, 6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(2f)
                lineTo(15f, 6f)
                close()
                moveTo(7f, 6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(2f)
                lineTo(7f, 6f)
                close()
                moveTo(23.96f, 8.98f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(3.96f, 22.98f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(0.96f, 2.98f)
                lineTo(-0.04f, 2.98f)
                lineTo(-0.04f, 0.98f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(16.96f, 2.98f)
                lineTo(2.96f, 2.98f)
                verticalLineToRelative(17f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(12f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                lineTo(16.96f, 2.98f)
                close()
                moveTo(21.96f, 8.98f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6f)
                close()
            }
        }.also { _BeerMugEmpty = it}
