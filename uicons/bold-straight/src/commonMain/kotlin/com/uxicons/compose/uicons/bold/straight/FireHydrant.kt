package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FireHydrant: ImageVector? = null

val Icons.Bs.FireHydrant: ImageVector
    get() = _FireHydrant ?: UXIcon(name = "FireHydrant") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.5f, 13.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(18f, 15f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                lineTo(4f, 24f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -2.79f, 1.92f, -5.14f, 4.5f, -5.81f)
                lineTo(10.5f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1.69f)
                curveToRelative(2.58f, 0.67f, 4.5f, 3.02f, 4.5f, 5.81f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(9.04f, 7f)
                horizontalLineToRelative(5.92f)
                curveToRelative(-0.24f, -1.42f, -1.47f, -2.5f, -2.96f, -2.5f)
                reflectiveCurveToRelative(-2.72f, 1.08f, -2.96f, 2.5f)
                close()
                moveTo(15f, 21f)
                verticalLineToRelative(-11f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(6f)
                close()
            }
        }.also { _FireHydrant = it}
