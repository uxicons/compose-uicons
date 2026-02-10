package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Category: ImageVector? = null

val Icons.Bs.Category: ImageVector
    get() = _Category ?: UXIcon(name = "Category") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 3.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(10f)
                lineTo(10f, 0f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                close()
                moveTo(7f, 7f)
                lineTo(3f, 7f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(4f)
                close()
                moveTo(22f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(10f)
                lineTo(22f, 3.5f)
                close()
                moveTo(19f, 7f)
                horizontalLineToRelative(-4f)
                lineTo(15f, 3f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                close()
                moveTo(0f, 18.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(-10f)
                lineTo(0f, 12f)
                verticalLineToRelative(6.5f)
                close()
                moveTo(3f, 15f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-3.5f)
                close()
                moveTo(23.91f, 21.79f)
                lineToRelative(-2.49f, -2.49f)
                curveToRelative(0.36f, -0.69f, 0.58f, -1.46f, 0.58f, -2.29f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                curveToRelative(0.83f, 0f, 1.6f, -0.22f, 2.29f, -0.58f)
                lineToRelative(2.49f, 2.49f)
                lineToRelative(2.12f, -2.12f)
                close()
                moveTo(17f, 19f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
            }
        }.also { _Category = it}
