package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DongSign: ImageVector? = null

val Icons.Ts.DongSign: ImageVector
    get() = _DongSign ?: UXIcon(name = "DongSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 23f)
                verticalLineToRelative(1f)
                lineTo(2f, 24f)
                verticalLineToRelative(-1f)
                lineTo(22f, 23f)
                close()
                moveTo(5f, 14f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                curveToRelative(2.08f, 0f, 3.92f, 1.07f, 5f, 2.69f)
                lineTo(16f, 4f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(5f)
                lineTo(16f, 0f)
                horizontalLineToRelative(1f)
                lineTo(17f, 3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3f)
                lineTo(17f, 20f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2.69f)
                curveToRelative(-1.08f, 1.62f, -2.92f, 2.69f, -5f, 2.69f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                close()
                moveTo(6f, 14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                reflectiveCurveToRelative(-2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                close()
            }
        }.also { _DongSign = it}
