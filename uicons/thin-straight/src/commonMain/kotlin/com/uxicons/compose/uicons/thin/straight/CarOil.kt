package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarOil: ImageVector? = null

val Icons.Ts.CarOil: ImageVector
    get() = _CarOil ?: UXIcon(name = "CarOil") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 9.36f)
                lineToRelative(-2.83f, 2.81f)
                curveToRelative(-1.56f, 1.56f, -1.56f, 4.1f, 0f, 5.66f)
                curveToRelative(0.76f, 0.76f, 1.76f, 1.17f, 2.83f, 1.17f)
                reflectiveCurveToRelative(2.07f, -0.42f, 2.83f, -1.17f)
                reflectiveCurveToRelative(1.17f, -1.76f, 1.17f, -2.83f)
                reflectiveCurveToRelative(-0.42f, -2.07f, -1.17f, -2.83f)
                close()
                moveTo(14.12f, 17.12f)
                curveToRelative(-1.13f, 1.13f, -3.11f, 1.13f, -4.24f, 0f)
                curveToRelative(-1.17f, -1.17f, -1.17f, -3.07f, 0f, -4.24f)
                lineToRelative(2.12f, -2.11f)
                lineToRelative(2.12f, 2.11f)
                curveToRelative(0.57f, 0.57f, 0.88f, 1.32f, 0.88f, 2.12f)
                reflectiveCurveToRelative(-0.31f, 1.55f, -0.88f, 2.12f)
                close()
                moveTo(22.34f, 3.73f)
                lineTo(18.77f, 0.16f)
                lineTo(17.12f, 1.8f)
                lineTo(15.32f, -0f)
                horizontalLineToRelative(-10.82f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-17.32f)
                lineToRelative(-1.3f, -1.3f)
                lineToRelative(1.64f, -1.64f)
                close()
                moveTo(18.77f, 1.58f)
                lineTo(20.92f, 3.73f)
                lineTo(19.99f, 4.67f)
                lineTo(17.83f, 2.51f)
                close()
                moveTo(21f, 23f)
                horizontalLineToRelative(-18f)
                verticalLineToRelative(-20.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(10.41f)
                lineToRelative(6.09f, 6.09f)
                close()
                moveTo(4f, 2.6f)
                verticalLineToRelative(3.4f)
                horizontalLineToRelative(8.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-10.4f)
                curveToRelative(-0.33f, 0f, -0.6f, 0.27f, -0.6f, 0.6f)
                close()
                moveTo(5f, 3f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-7.5f)
                close()
            }
        }.also { _CarOil = it}
