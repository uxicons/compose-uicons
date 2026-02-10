package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BalanceScaleRight: ImageVector? = null

val Icons.Rs.BalanceScaleRight: ImageVector
    get() = _BalanceScaleRight ?: UXIcon(name = "BalanceScaleRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.26f, 4.67f)
                lineToRelative(-7.26f, -1.94f)
                lineTo(13f, 0f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 2.2f)
                lineTo(3.88f, 0.3f)
                lineTo(0f, 10.82f)
                verticalLineToRelative(0.68f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-0.68f)
                lineTo(6.1f, 2.96f)
                lineToRelative(4.9f, 1.3f)
                lineTo(11f, 22f)
                lineTo(4f, 22f)
                verticalLineToRelative(2f)
                lineTo(20f, 24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-7f)
                lineTo(13f, 4.8f)
                lineToRelative(5.18f, 1.38f)
                lineToRelative(-3.18f, 8.64f)
                verticalLineToRelative(0.68f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-0.68f)
                lineToRelative(-3.74f, -10.15f)
                close()
                moveTo(4.5f, 14f)
                curveToRelative(-1.21f, 0f, -2.22f, -0.86f, -2.45f, -2f)
                lineTo(6.95f, 12f)
                curveToRelative(-0.23f, 1.14f, -1.24f, 2f, -2.45f, 2f)
                close()
                moveTo(6.57f, 10f)
                lineTo(2.43f, 10f)
                lineToRelative(2.07f, -5.61f)
                lineToRelative(2.07f, 5.61f)
                close()
                moveTo(19.5f, 8.39f)
                lineToRelative(2.07f, 5.61f)
                horizontalLineToRelative(-4.13f)
                lineToRelative(2.07f, -5.61f)
                close()
                moveTo(19.5f, 18f)
                curveToRelative(-1.21f, 0f, -2.22f, -0.86f, -2.45f, -2f)
                horizontalLineToRelative(4.9f)
                curveToRelative(-0.23f, 1.14f, -1.24f, 2f, -2.45f, 2f)
                close()
            }
        }.also { _BalanceScaleRight = it}
