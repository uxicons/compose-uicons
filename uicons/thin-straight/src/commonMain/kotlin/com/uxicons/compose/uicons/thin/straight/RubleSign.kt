package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RubleSign: ImageVector? = null

val Icons.Ts.RubleSign: ImageVector
    get() = _RubleSign ?: UXIcon(name = "RubleSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.5f, 15f)
                curveToRelative(4.14f, 0f, 7.5f, -3.36f, 7.5f, -7.5f)
                reflectiveCurveTo(18.64f, 0f, 14.5f, 0f)
                lineTo(5f, 0.04f)
                verticalLineTo(14f)
                horizontalLineTo(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineTo(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-1f)
                horizontalLineTo(6f)
                verticalLineToRelative(-3f)
                horizontalLineTo(14.5f)
                close()
                moveTo(6f, 1.04f)
                lineToRelative(8.5f, -0.04f)
                curveToRelative(3.58f, 0f, 6.5f, 2.92f, 6.5f, 6.5f)
                reflectiveCurveToRelative(-2.92f, 6.5f, -6.5f, 6.5f)
                horizontalLineTo(6f)
                verticalLineTo(1.04f)
                close()
            }
        }.also { _RubleSign = it}
