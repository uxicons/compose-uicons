package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonMilitaryPointing: ImageVector? = null

val Icons.Ss.PersonMilitaryPointing: ImageVector
    get() = _PersonMilitaryPointing ?: UXIcon(name = "PersonMilitaryPointing") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 5f)
                horizontalLineToRelative(8f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                close()
                moveTo(8.12f, 3f)
                horizontalLineToRelative(8.0f)
                lineToRelative(0.32f, -0.83f)
                curveToRelative(0.27f, -0.79f, -0.29f, -1.61f, -1.12f, -1.66f)
                lineTo(9.31f, 0.0f)
                curveToRelative(-1.13f, -0.06f, -1.99f, 1.01f, -1.68f, 2.1f)
                lineToRelative(0.48f, 0.9f)
                close()
                moveTo(7f, 24f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-2f)
                lineTo(7f, 22f)
                verticalLineToRelative(2f)
                close()
                moveTo(19.12f, 12.93f)
                curveToRelative(-0.72f, -1.19f, -2.03f, -1.93f, -3.43f, -1.93f)
                lineTo(0f, 11f)
                verticalLineToRelative(2f)
                lineTo(7f, 13f)
                verticalLineToRelative(6.86f)
                lineToRelative(5.69f, -6.86f)
                horizontalLineToRelative(2.58f)
                lineToRelative(-5.79f, 7f)
                horizontalLineToRelative(7.52f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0.15f, 0.13f, 0.29f, 0.28f, 0.4f, 0.46f)
                lineToRelative(4.86f, 8.05f)
                lineToRelative(1.71f, -1.03f)
                lineToRelative(-4.86f, -8.05f)
                close()
            }
        }.also { _PersonMilitaryPointing = it}
