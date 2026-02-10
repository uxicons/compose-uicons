package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dinner: ImageVector? = null

val Icons.Bs.Dinner: ImageVector
    get() = _Dinner ?: UXIcon(name = "Dinner") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 8f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(5.12f)
                lineToRelative(-2.94f, 2.94f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(2.06f, -2.06f)
                verticalLineToRelative(-3.88f)
                close()
                moveTo(9.5f, 19f)
                curveToRelative(-3.58f, 0f, -6.5f, -2.92f, -6.5f, -6.5f)
                reflectiveCurveToRelative(2.92f, -6.5f, 6.5f, -6.5f)
                curveToRelative(0.56f, 0f, 1.09f, 0.08f, 1.61f, 0.21f)
                curveToRelative(0.14f, -0.9f, 0.43f, -1.9f, 0.84f, -2.88f)
                curveToRelative(-0.78f, -0.21f, -1.6f, -0.33f, -2.45f, -0.33f)
                curveTo(4.26f, 3f, 0f, 7.26f, 0f, 12.5f)
                reflectiveCurveToRelative(4.26f, 9.5f, 9.5f, 9.5f)
                curveToRelative(2.05f, 0f, 3.95f, -0.66f, 5.5f, -1.77f)
                verticalLineToRelative(-4.28f)
                curveToRelative(-1.15f, 1.83f, -3.18f, 3.05f, -5.5f, 3.05f)
                close()
                moveTo(20f, 12.79f)
                verticalLineToRelative(11.21f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-11.21f)
                curveToRelative(-2.31f, -0.66f, -4f, -2.77f, -4f, -5.29f)
                curveToRelative(0f, -2.64f, 2.09f, -7.5f, 5.5f, -7.5f)
                reflectiveCurveToRelative(5.5f, 4.86f, 5.5f, 7.5f)
                curveToRelative(0f, 2.51f, -1.7f, 4.63f, -4f, 5.29f)
                close()
                moveTo(21f, 7.5f)
                curveToRelative(0f, -1.77f, -1.52f, -4.5f, -2.5f, -4.5f)
                reflectiveCurveToRelative(-2.5f, 2.73f, -2.5f, 4.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                close()
            }
        }.also { _Dinner = it}
