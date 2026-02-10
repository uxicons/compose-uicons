package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonMilitaryPointing: ImageVector? = null

val Icons.Bs.PersonMilitaryPointing: ImageVector
    get() = _PersonMilitaryPointing ?: UXIcon(name = "PersonMilitaryPointing") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.04f, 13.18f)
                curveToRelative(-0.81f, -1.34f, -2.29f, -2.18f, -3.85f, -2.18f)
                lineTo(0f, 11f)
                verticalLineToRelative(3f)
                lineTo(7f, 14f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-6.75f)
                lineToRelative(3.33f, 5.52f)
                lineToRelative(2.57f, -1.55f)
                lineToRelative(-4.86f, -8.05f)
                close()
                moveTo(10f, 14f)
                horizontalLineToRelative(2.9f)
                lineToRelative(-2.9f, 3.76f)
                verticalLineToRelative(-3.76f)
                close()
                moveTo(15f, 21f)
                horizontalLineToRelative(-3.71f)
                lineToRelative(3.71f, -4.82f)
                verticalLineToRelative(4.82f)
                close()
                moveTo(8f, 5f)
                horizontalLineToRelative(8f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                close()
                moveTo(7.57f, 2.1f)
                curveTo(7.25f, 1.01f, 8.11f, -0.06f, 9.24f, 0.0f)
                lineToRelative(6.0f, 0.51f)
                curveToRelative(0.83f, 0.05f, 1.39f, 0.87f, 1.12f, 1.66f)
                lineToRelative(-0.32f, 0.83f)
                horizontalLineToRelative(-8.0f)
                lineToRelative(-0.48f, -0.9f)
                close()
            }
        }.also { _PersonMilitaryPointing = it}
