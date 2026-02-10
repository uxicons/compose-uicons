package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BalanceScaleRight: ImageVector? = null

val Icons.Ts.BalanceScaleRight: ImageVector
    get() = _BalanceScaleRight ?: UXIcon(name = "BalanceScaleRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.86f, 4.08f)
                lineToRelative(-7.37f, -1.91f)
                lineTo(12.5f, 0f)
                horizontalLineToRelative(-1f)
                lineTo(11.5f, 1.91f)
                lineTo(4.21f, 0.02f)
                lineTo(0.04f, 9.8f)
                lineToRelative(-0.01f, 0.2f)
                horizontalLineToRelative(-0.03f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-0.5f)
                lineTo(5.41f, 1.37f)
                lineToRelative(6.09f, 1.58f)
                lineTo(11.5f, 23f)
                lineTo(4f, 23f)
                verticalLineToRelative(1f)
                lineTo(20f, 24f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-7.5f)
                lineTo(12.5f, 3.2f)
                lineToRelative(6.32f, 1.64f)
                lineToRelative(-3.78f, 8.97f)
                lineToRelative(-0.01f, 0.19f)
                horizontalLineToRelative(-0.03f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-0.5f)
                lineToRelative(-4.13f, -9.92f)
                close()
                moveTo(4.5f, 14f)
                curveToRelative(-1.76f, 0f, -3.22f, -1.31f, -3.46f, -3f)
                lineTo(7.96f, 11f)
                curveToRelative(-0.24f, 1.69f, -1.7f, 3f, -3.46f, 3f)
                close()
                moveTo(1.04f, 10f)
                lineTo(4.52f, 1.84f)
                lineToRelative(3.44f, 8.16f)
                lineTo(1.04f, 10f)
                close()
                moveTo(19.5f, 5.79f)
                lineToRelative(3.46f, 8.21f)
                horizontalLineToRelative(-6.92f)
                lineToRelative(3.46f, -8.21f)
                close()
                moveTo(19.5f, 18f)
                curveToRelative(-1.76f, 0f, -3.22f, -1.31f, -3.46f, -3f)
                horizontalLineToRelative(6.93f)
                curveToRelative(-0.24f, 1.69f, -1.7f, 3f, -3.46f, 3f)
                close()
            }
        }.also { _BalanceScaleRight = it}
