package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BalanceScaleLeft: ImageVector? = null

val Icons.Ss.BalanceScaleLeft: ImageVector
    get() = _BalanceScaleLeft ?: UXIcon(name = "BalanceScaleLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.12f, 0.3f)
                lineToRelative(-7.12f, 1.9f)
                verticalLineTo(0f)
                horizontalLineToRelative(-2f)
                verticalLineTo(2.73f)
                lineToRelative(-7.26f, 1.94f)
                lineTo(0f, 14.82f)
                verticalLineToRelative(0.68f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-0.68f)
                lineTo(5.82f, 6.18f)
                lineToRelative(5.18f, -1.38f)
                verticalLineTo(22f)
                horizontalLineTo(4f)
                verticalLineToRelative(2f)
                horizontalLineTo(20f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-7f)
                verticalLineTo(4.27f)
                lineToRelative(4.9f, -1.3f)
                lineToRelative(-2.9f, 7.86f)
                verticalLineToRelative(0.68f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-0.68f)
                lineTo(20.12f, 0.3f)
                close()
                moveTo(6.57f, 14f)
                horizontalLineTo(2.43f)
                lineToRelative(2.07f, -5.61f)
                lineToRelative(2.07f, 5.61f)
                close()
                moveTo(19.5f, 4.39f)
                lineToRelative(2.07f, 5.61f)
                horizontalLineToRelative(-4.13f)
                lineToRelative(2.07f, -5.61f)
                close()
            }
        }.also { _BalanceScaleLeft = it}
