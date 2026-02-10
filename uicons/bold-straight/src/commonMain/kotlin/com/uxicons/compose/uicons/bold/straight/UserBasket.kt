package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserBasket: ImageVector? = null

val Icons.Bs.UserBasket: ImageVector
    get() = _UserBasket ?: UXIcon(name = "UserBasket") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 6f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                reflectiveCurveTo(3f, 2.69f, 3f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                close()
                moveTo(9f, 9f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                close()
                moveTo(19.43f, 14f)
                lineToRelative(1.92f, -3.83f)
                lineToRelative(-2.68f, -1.34f)
                lineToRelative(-2.58f, 5.17f)
                horizontalLineToRelative(-6.03f)
                lineToRelative(1.03f, 7.01f)
                curveToRelative(0.25f, 1.71f, 1.74f, 2.99f, 3.46f, 2.99f)
                horizontalLineToRelative(4.94f)
                curveToRelative(1.72f, 0f, 3.21f, -1.29f, 3.46f, -2.99f)
                lineToRelative(1.03f, -7.01f)
                horizontalLineToRelative(-4.54f)
                close()
                moveTo(19.97f, 20.57f)
                curveToRelative(-0.04f, 0.24f, -0.25f, 0.43f, -0.49f, 0.43f)
                horizontalLineToRelative(-4.94f)
                curveToRelative(-0.24f, 0f, -0.46f, -0.19f, -0.49f, -0.43f)
                lineToRelative(-0.52f, -3.57f)
                horizontalLineToRelative(6.98f)
                lineToRelative(-0.53f, 3.57f)
                close()
                moveTo(8.02f, 14f)
                lineToRelative(0.44f, 3f)
                horizontalLineToRelative(-3.46f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(3.02f)
                close()
            }
        }.also { _UserBasket = it}
