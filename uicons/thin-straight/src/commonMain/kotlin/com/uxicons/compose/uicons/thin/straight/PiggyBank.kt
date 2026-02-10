package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PiggyBank: ImageVector? = null

val Icons.Ts.PiggyBank: ImageVector
    get() = _PiggyBank ?: UXIcon(name = "PiggyBank") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 12f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(10f, 1f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveTo(6f, 1.79f, 6f, 4f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                close()
                moveTo(24f, 11f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-1.71f)
                curveToRelative(-0.85f, 1.85f, -2.39f, 3.28f, -4.29f, 4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                lineTo(5f, 24f)
                verticalLineToRelative(-3.0f)
                curveTo(2.0f, 19.86f, 0f, 16.99f, 0f, 13.75f)
                curveToRelative(0f, -1.58f, 0.48f, -3.06f, 1.29f, -4.28f)
                curveToRelative(-0.8f, -0.55f, -1.29f, -1.47f, -1.29f, -2.47f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                verticalLineToRelative(1f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                curveToRelative(0f, 0.68f, 0.34f, 1.3f, 0.9f, 1.67f)
                curveToRelative(1.42f, -1.64f, 3.52f, -2.67f, 5.85f, -2.67f)
                horizontalLineToRelative(7.5f)
                curveToRelative(0.12f, 0f, 0.23f, 0.0f, 0.35f, 0.01f)
                curveToRelative(0.49f, -2.36f, 2.72f, -3.01f, 3.9f, -3.01f)
                horizontalLineToRelative(0.5f)
                lineTo(20f, 7.63f)
                curveToRelative(1.12f, 0.87f, 1.99f, 2.05f, 2.5f, 3.37f)
                horizontalLineToRelative(1.5f)
                close()
                moveTo(23f, 12f)
                horizontalLineToRelative(-1.22f)
                lineToRelative(-0.11f, -0.34f)
                curveToRelative(-0.44f, -1.34f, -1.31f, -2.54f, -2.46f, -3.38f)
                lineToRelative(-0.21f, -0.15f)
                lineTo(19f, 4.05f)
                curveToRelative(-0.8f, 0.14f, -2.3f, 0.65f, -2.48f, 2.54f)
                lineToRelative(-0.05f, 0.5f)
                lineToRelative(-0.5f, -0.06f)
                curveToRelative(-0.24f, -0.03f, -0.47f, -0.04f, -0.72f, -0.04f)
                lineTo(7.75f, 7f)
                curveToRelative(-3.72f, 0f, -6.75f, 3.03f, -6.75f, 6.75f)
                curveToRelative(0f, 2.93f, 1.87f, 5.51f, 4.66f, 6.42f)
                lineToRelative(0.34f, 0.11f)
                verticalLineToRelative(2.72f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2.72f)
                lineToRelative(0.34f, -0.11f)
                curveToRelative(1.89f, -0.61f, 3.4f, -2.02f, 4.15f, -3.86f)
                lineToRelative(0.13f, -0.31f)
                horizontalLineToRelative(1.38f)
                verticalLineToRelative(-4f)
                close()
            }
        }.also { _PiggyBank = it}
