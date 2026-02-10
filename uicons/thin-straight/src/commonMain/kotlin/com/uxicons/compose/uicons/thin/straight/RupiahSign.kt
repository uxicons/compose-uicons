package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RupiahSign: ImageVector? = null

val Icons.Ts.RupiahSign: ImageVector
    get() = _RupiahSign ?: UXIcon(name = "RupiahSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 7.5f)
                curveTo(15f, 3.36f, 11.64f, 0f, 7.5f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                lineTo(0f, 24f)
                lineTo(1f, 24f)
                lineTo(1f, 15f)
                lineTo(7.5f, 15f)
                curveToRelative(0.48f, 0f, 0.94f, -0.04f, 1.39f, -0.13f)
                lineToRelative(4.92f, 9.13f)
                horizontalLineToRelative(1.19f)
                lineToRelative(-5.07f, -9.41f)
                curveToRelative(2.94f, -1.01f, 5.07f, -3.81f, 5.07f, -7.09f)
                close()
                moveTo(7.5f, 14f)
                lineTo(1f, 14f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(7.5f, 1f)
                curveToRelative(3.58f, 0f, 6.5f, 2.92f, 6.5f, 6.5f)
                reflectiveCurveToRelative(-2.92f, 6.5f, -6.5f, 6.5f)
                close()
                moveTo(20.5f, 13f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(20.5f, 19f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(2f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                close()
            }
        }.also { _RupiahSign = it}
