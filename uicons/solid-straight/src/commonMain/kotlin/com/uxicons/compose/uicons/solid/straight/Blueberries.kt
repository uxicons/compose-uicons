package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Blueberries: ImageVector? = null

val Icons.Ss.Blueberries: ImageVector
    get() = _Blueberries ?: UXIcon(name = "Blueberries") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.5f, 7f)
                curveTo(3.81f, 7f, 0f, 10.81f, 0f, 15.5f)
                reflectiveCurveToRelative(3.81f, 8.5f, 8.5f, 8.5f)
                reflectiveCurveToRelative(8.5f, -3.81f, 8.5f, -8.5f)
                reflectiveCurveToRelative(-3.81f, -8.5f, -8.5f, -8.5f)
                close()
                moveTo(13f, 14f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(24f, 8.5f)
                curveToRelative(0f, 3.45f, -2.07f, 6.43f, -5.04f, 7.76f)
                curveToRelative(0.02f, -0.25f, 0.04f, -0.5f, 0.04f, -0.76f)
                curveToRelative(0f, -2.46f, -0.85f, -4.71f, -2.27f, -6.5f)
                horizontalLineToRelative(1.27f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1.57f)
                curveToRelative(-1.6f, -0.99f, -3.48f, -1.57f, -5.5f, -1.57f)
                curveToRelative(-0.26f, 0f, -0.51f, 0.02f, -0.76f, 0.04f)
                curveTo(9.07f, 2.07f, 12.05f, 0f, 15.5f, 0f)
                curveToRelative(4.69f, 0f, 8.5f, 3.81f, 8.5f, 8.5f)
                close()
            }
        }.also { _Blueberries = it}
