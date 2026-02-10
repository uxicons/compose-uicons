package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CanFood: ImageVector? = null

val Icons.Rs.CanFood: ImageVector
    get() = _CanFood ?: UXIcon(name = "CanFood") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(8.29f, 0f, 2f, 0.74f, 2f, 3.5f)
                curveToRelative(0f, 0.02f, 0.01f, 0.03f, 0.01f, 0.05f)
                horizontalLineToRelative(-0.01f)
                verticalLineToRelative(16.95f)
                curveToRelative(0f, 2.76f, 6.29f, 3.5f, 10f, 3.5f)
                curveToRelative(3.46f, 0f, 10f, -0.74f, 10f, -3.55f)
                lineTo(22f, 3.5f)
                curveToRelative(0f, -2.76f, -6.29f, -3.5f, -10f, -3.5f)
                close()
                moveTo(20f, 7.37f)
                curveToRelative(-0.4f, 0.58f, -3.41f, 1.63f, -8f, 1.63f)
                reflectiveCurveToRelative(-7.6f, -1.02f, -8f, -1.58f)
                verticalLineToRelative(-1.68f)
                curveToRelative(2.16f, 0.95f, 5.61f, 1.26f, 8f, 1.26f)
                reflectiveCurveToRelative(5.84f, -0.31f, 8f, -1.26f)
                verticalLineToRelative(1.63f)
                close()
                moveTo(20f, 16.37f)
                curveToRelative(-0.4f, 0.58f, -3.41f, 1.63f, -8f, 1.63f)
                reflectiveCurveToRelative(-7.6f, -1.02f, -8f, -1.58f)
                verticalLineToRelative(-6.68f)
                curveToRelative(2.16f, 0.95f, 5.61f, 1.26f, 8f, 1.26f)
                curveToRelative(2.25f, 0f, 5.79f, -0.32f, 8f, -1.31f)
                verticalLineToRelative(6.68f)
                close()
                moveTo(12f, 2f)
                curveToRelative(4.75f, 0f, 7.4f, 0.99f, 7.94f, 1.5f)
                curveToRelative(-0.54f, 0.51f, -3.19f, 1.5f, -7.94f, 1.5f)
                reflectiveCurveToRelative(-7.4f, -0.99f, -7.94f, -1.5f)
                curveToRelative(0.54f, -0.51f, 3.19f, -1.5f, 7.94f, -1.5f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-4.56f, 0f, -7.57f, -1.01f, -8f, -1.58f)
                verticalLineToRelative(-1.69f)
                curveToRelative(2.16f, 0.95f, 5.61f, 1.26f, 8f, 1.26f)
                curveToRelative(2.25f, 0f, 5.79f, -0.32f, 8f, -1.31f)
                verticalLineToRelative(1.69f)
                curveToRelative(-0.42f, 0.59f, -3.44f, 1.62f, -8f, 1.62f)
                close()
            }
        }.also { _CanFood = it}
