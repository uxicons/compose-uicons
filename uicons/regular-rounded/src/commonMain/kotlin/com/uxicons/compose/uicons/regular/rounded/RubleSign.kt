package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RubleSign: ImageVector? = null

val Icons.Rr.RubleSign: ImageVector
    get() = _RubleSign ?: UXIcon(name = "RubleSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.5f, 15f)
                curveToRelative(4.14f, 0f, 7.5f, -3.36f, 7.5f, -7.5f)
                reflectiveCurveTo(18.64f, 0f, 14.5f, 0f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineTo(13f)
                horizontalLineTo(3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineTo(3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-4f)
                horizontalLineTo(15f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineTo(7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(7.5f)
                close()
                moveTo(7f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(4.5f)
                curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
                reflectiveCurveToRelative(-2.47f, 5.5f, -5.5f, 5.5f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                close()
            }
        }.also { _RubleSign = it}
