package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Discount: ImageVector? = null

val Icons.Ss.Discount: ImageVector
    get() = _Discount ?: UXIcon(name = "Discount") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.0f, 0f)
                lineToRelative(-9.99f, 5.52f)
                verticalLineToRelative(15.51f)
                curveToRelative(0.01f, 1.64f, 1.35f, 2.97f, 3.0f, 2.97f)
                horizontalLineToRelative(5.82f)
                reflectiveCurveToRelative(3.9f, 0f, 3.9f, 0f)
                curveToRelative(-1.67f, -1.47f, -2.72f, -3.6f, -2.72f, -6.0f)
                curveToRelative(0f, -4.42f, 3.58f, -8.0f, 8.0f, -8.0f)
                curveToRelative(0.69f, 0f, 1.36f, 0.1f, 2.0f, 0.26f)
                verticalLineToRelative(-4.75f)
                close()
                moveTo(6.5f, 8.01f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(7.48f, 17.0f)
                horizontalLineToRelative(-2.28f)
                lineToRelative(5.87f, -9.0f)
                horizontalLineToRelative(2.28f)
                close()
                moveTo(18.0f, 12.01f)
                curveToRelative(-3.31f, 0f, -6.0f, 2.69f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.69f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.69f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.69f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(18.74f, 20.69f)
                curveToRelative(-0.42f, 0.42f, -1.09f, 0.42f, -1.51f, 0f)
                lineToRelative(-2.69f, -2.69f)
                horizontalLineToRelative(2.45f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.43f)
                close()
            }
        }.also { _Discount = it}
