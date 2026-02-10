package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InsertAlt: ImageVector? = null

val Icons.Ts.InsertAlt: ImageVector
    get() = _InsertAlt ?: UXIcon(name = "InsertAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 11.5f)
                verticalLineToRelative(1f)
                lineTo(7.26f, 12.5f)
                lineToRelative(4.1f, 4.1f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-4.24f, -4.24f)
                curveToRelative(-0.58f, -0.58f, -0.58f, -1.54f, 0f, -2.12f)
                lineToRelative(4.24f, -4.24f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-4.1f, 4.1f)
                horizontalLineToRelative(16.74f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                curveToRelative(5.03f, 0f, 9.27f, 3.38f, 10.57f, 8f)
                horizontalLineToRelative(1.03f)
                curveTo(22.27f, 3.83f, 17.58f, 0f, 12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                curveToRelative(5.58f, 0f, 10.27f, -3.83f, 11.61f, -9f)
                horizontalLineToRelative(-1.03f)
                curveToRelative(-1.31f, 4.62f, -5.54f, 8f, -10.57f, 8f)
                close()
            }
        }.also { _InsertAlt = it}
