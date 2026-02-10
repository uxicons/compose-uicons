package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserBasket: ImageVector? = null

val Icons.Ts.UserBasket: ImageVector
    get() = _UserBasket ?: UXIcon(name = "UserBasket") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.34f, 15f)
                lineToRelative(2.64f, -5.28f)
                lineToRelative(-0.9f, -0.45f)
                lineToRelative(-2.86f, 5.72f)
                horizontalLineToRelative(-6.24f)
                lineToRelative(0.97f, 6.62f)
                curveToRelative(0.2f, 1.36f, 1.38f, 2.38f, 2.76f, 2.38f)
                horizontalLineToRelative(5.53f)
                curveToRelative(1.37f, 0f, 2.56f, -1.02f, 2.75f, -2.38f)
                lineToRelative(0.97f, -6.62f)
                horizontalLineToRelative(-5.63f)
                close()
                moveTo(22.0f, 21.48f)
                curveToRelative(-0.13f, 0.87f, -0.89f, 1.52f, -1.76f, 1.52f)
                horizontalLineToRelative(-5.53f)
                curveToRelative(-0.88f, 0f, -1.64f, -0.66f, -1.77f, -1.53f)
                lineToRelative(-0.8f, -5.47f)
                horizontalLineToRelative(10.67f)
                lineToRelative(-0.81f, 5.47f)
                close()
                moveTo(15f, 6f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                reflectiveCurveTo(3f, 2.69f, 3f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                close()
                moveTo(9f, 11f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveTo(6.24f, 1f, 9f, 1f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
                moveTo(8.81f, 14f)
                lineToRelative(0.15f, 1f)
                lineTo(4.5f, 15f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(5.5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(4.31f)
                close()
            }
        }.also { _UserBasket = it}
