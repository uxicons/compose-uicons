package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PiggyBank: ImageVector? = null

val Icons.Bs.PiggyBank: ImageVector
    get() = _PiggyBank ?: UXIcon(name = "PiggyBank") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 4f)
                lineTo(7f, 4f)
                curveTo(7f, 1.79f, 8.79f, 0f, 11f, 0f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                close()
                moveTo(24f, 17f)
                horizontalLineToRelative(-1.58f)
                curveToRelative(-0.67f, 1.66f, -1.88f, 3.04f, -3.42f, 3.93f)
                verticalLineToRelative(3.07f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                lineTo(5f, 24f)
                verticalLineToRelative(-3.07f)
                curveToRelative(-2.39f, -1.39f, -4f, -3.97f, -4f, -6.93f)
                curveToRelative(0f, -1.3f, 0.31f, -2.53f, 0.87f, -3.62f)
                curveToRelative(-1.12f, -0.71f, -1.87f, -1.96f, -1.87f, -3.38f)
                curveTo(0f, 4.79f, 1.79f, 3f, 4f, 3f)
                verticalLineToRelative(3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                curveToRelative(0f, 0.47f, 0.32f, 0.86f, 0.75f, 0.97f)
                curveToRelative(1.41f, -1.23f, 3.24f, -1.97f, 5.25f, -1.97f)
                horizontalLineToRelative(6f)
                curveToRelative(0.11f, 0f, 0.22f, 0.0f, 0.34f, 0.01f)
                curveToRelative(1.11f, -3.0f, 4.66f, -3.01f, 4.66f, -3.01f)
                lineTo(20f, 7.76f)
                curveToRelative(1.06f, 0.85f, 1.9f, 1.96f, 2.42f, 3.24f)
                horizontalLineToRelative(1.58f)
                verticalLineToRelative(6f)
                close()
                moveTo(4f, 14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(6f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                reflectiveCurveToRelative(-2.24f, -5f, -5f, -5f)
                horizontalLineToRelative(-6f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                close()
                moveTo(16.5f, 14f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
            }
        }.also { _PiggyBank = it}
