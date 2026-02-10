package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RubleSign: ImageVector? = null

val Icons.Tr.RubleSign: ImageVector
    get() = _RubleSign ?: UXIcon(name = "RubleSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.5f, 15f)
                curveToRelative(4.14f, 0f, 7.5f, -3.36f, 7.5f, -7.5f)
                reflectiveCurveTo(18.64f, 0f, 14.5f, 0f)
                horizontalLineToRelative(-5f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineTo(14f)
                horizontalLineTo(2.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(3f)
                horizontalLineTo(2.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(4.59f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-4.59f)
                horizontalLineTo(15.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineTo(6f)
                verticalLineToRelative(-3f)
                horizontalLineTo(14.5f)
                close()
                moveTo(6f, 4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(5f)
                curveToRelative(3.58f, 0f, 6.5f, 2.92f, 6.5f, 6.5f)
                reflectiveCurveToRelative(-2.92f, 6.5f, -6.5f, 6.5f)
                horizontalLineTo(6f)
                verticalLineTo(4.5f)
                close()
            }
        }.also { _RubleSign = it}
