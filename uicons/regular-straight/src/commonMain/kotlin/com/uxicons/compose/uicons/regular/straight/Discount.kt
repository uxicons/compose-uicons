package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Discount: ImageVector? = null

val Icons.Rs.Discount: ImageVector
    get() = _Discount ?: UXIcon(name = "Discount") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.5f, 11f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(9.52f, 21.99f)
                lineTo(3.01f, 22.0f)
                curveToRelative(-0.55f, 0f, -1.0f, -0.45f, -1.0f, -0.99f)
                verticalLineToRelative(-14.32f)
                lineToRelative(7.99f, -4.41f)
                lineToRelative(7.99f, 4.41f)
                verticalLineToRelative(1.36f)
                curveToRelative(0.69f, 0.08f, 1.36f, 0.24f, 2.0f, 0.46f)
                verticalLineToRelative(-3.01f)
                lineToRelative(-9.99f, -5.52f)
                lineToRelative(-9.99f, 5.52f)
                verticalLineToRelative(15.5f)
                curveToRelative(0.01f, 1.64f, 1.35f, 2.98f, 3.0f, 2.98f)
                lineToRelative(8.35f, -0.01f)
                curveToRelative(-0.71f, -0.57f, -1.33f, -1.24f, -1.83f, -2.0f)
                close()
                moveTo(13.35f, 8.0f)
                horizontalLineToRelative(-2.28f)
                lineToRelative(-5.86f, 8.99f)
                horizontalLineToRelative(2.28f)
                close()
                moveTo(17.99f, 14.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.45f)
                lineToRelative(2.69f, 2.69f)
                curveToRelative(0.42f, 0.42f, 1.09f, 0.42f, 1.51f, 0f)
                lineToRelative(2.69f, -2.69f)
                horizontalLineToRelative(-2.43f)
                close()
                moveTo(23.99f, 17.0f)
                curveToRelative(0f, 3.86f, -3.14f, 6.99f, -6.99f, 6.99f)
                reflectiveCurveToRelative(-6.99f, -3.14f, -6.99f, -6.99f)
                reflectiveCurveToRelative(3.14f, -6.99f, 6.99f, -6.99f)
                reflectiveCurveToRelative(6.99f, 3.14f, 6.99f, 6.99f)
                close()
                moveTo(21.99f, 17.0f)
                curveToRelative(0f, -2.75f, -2.24f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.24f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f)
                close()
            }
        }.also { _Discount = it}
