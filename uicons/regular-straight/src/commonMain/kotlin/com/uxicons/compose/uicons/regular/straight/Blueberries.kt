package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Blueberries: ImageVector? = null

val Icons.Rs.Blueberries: ImageVector
    get() = _Blueberries ?: UXIcon(name = "Blueberries") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 12f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
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
                close()
                moveTo(24f, 8.5f)
                curveToRelative(0f, 4.16f, -3.05f, 7.71f, -7.12f, 8.38f)
                curveToRelative(-0.66f, 4.03f, -4.16f, 7.12f, -8.38f, 7.12f)
                curveTo(3.81f, 24f, 0f, 20.19f, 0f, 15.5f)
                curveToRelative(0f, -4.21f, 3.08f, -7.71f, 7.11f, -8.38f)
                curveTo(7.77f, 3.07f, 11.31f, 0f, 15.5f, 0f)
                curveToRelative(4.69f, 0f, 8.5f, 3.81f, 8.5f, 8.5f)
                close()
                moveTo(15f, 15.5f)
                curveToRelative(0f, -3.58f, -2.92f, -6.5f, -6.5f, -6.5f)
                reflectiveCurveToRelative(-6.5f, 2.92f, -6.5f, 6.5f)
                reflectiveCurveToRelative(2.92f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.92f, 6.5f, -6.5f)
                close()
                moveTo(22f, 8.5f)
                curveToRelative(0f, -3.58f, -2.92f, -6.5f, -6.5f, -6.5f)
                curveToRelative(-3.06f, 0f, -5.66f, 2.14f, -6.33f, 5.03f)
                curveToRelative(4.14f, 0.33f, 7.45f, 3.63f, 7.79f, 7.77f)
                curveToRelative(2.9f, -0.68f, 5.04f, -3.27f, 5.04f, -6.31f)
                close()
                moveTo(17f, 3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _Blueberries = it}
