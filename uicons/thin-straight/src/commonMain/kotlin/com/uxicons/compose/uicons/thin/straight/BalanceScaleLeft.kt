package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BalanceScaleLeft: ImageVector? = null

val Icons.Ts.BalanceScaleLeft: ImageVector
    get() = _BalanceScaleLeft ?: UXIcon(name = "BalanceScaleLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.79f, 0.02f)
                lineToRelative(-7.29f, 1.89f)
                lineTo(12.5f, 0f)
                horizontalLineToRelative(-1f)
                lineTo(11.5f, 2.17f)
                lineToRelative(-7.37f, 1.91f)
                lineTo(0.04f, 13.81f)
                lineToRelative(-0.04f, 0.69f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-0.5f)
                lineTo(5.18f, 4.84f)
                lineToRelative(6.32f, -1.64f)
                lineTo(11.5f, 23f)
                lineTo(4f, 23f)
                verticalLineToRelative(1f)
                lineTo(20f, 24f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-7.5f)
                lineTo(12.5f, 2.94f)
                lineToRelative(6.09f, -1.58f)
                lineToRelative(-3.55f, 8.44f)
                lineToRelative(-0.04f, 0.69f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-0.5f)
                lineTo(19.79f, 0.02f)
                close()
                moveTo(4.5f, 18f)
                curveToRelative(-1.76f, 0f, -3.22f, -1.31f, -3.46f, -3f)
                lineTo(7.96f, 15f)
                curveToRelative(-0.24f, 1.69f, -1.7f, 3f, -3.46f, 3f)
                close()
                moveTo(1.04f, 14f)
                lineTo(4.5f, 5.79f)
                lineToRelative(3.46f, 8.21f)
                lineTo(1.04f, 14f)
                close()
                moveTo(19.48f, 1.84f)
                lineToRelative(3.48f, 8.16f)
                horizontalLineToRelative(-6.91f)
                lineTo(19.48f, 1.84f)
                close()
                moveTo(19.5f, 14f)
                curveToRelative(-1.76f, 0f, -3.22f, -1.31f, -3.46f, -3f)
                horizontalLineToRelative(6.93f)
                curveToRelative(-0.24f, 1.69f, -1.7f, 3f, -3.46f, 3f)
                close()
            }
        }.also { _BalanceScaleLeft = it}
