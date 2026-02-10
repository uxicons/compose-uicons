package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CandleHolder: ImageVector? = null

val Icons.Tr.CandleHolder: ImageVector
    get() = _CandleHolder ?: UXIcon(name = "CandleHolder") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 17f)
                curveToRelative(-0.86f, 0f, -1.69f, 0.32f, -2.33f, 0.89f)
                curveToRelative(-0.21f, 0.18f, -0.22f, 0.5f, -0.04f, 0.71f)
                curveToRelative(0.18f, 0.21f, 0.5f, 0.22f, 0.71f, 0.04f)
                curveToRelative(0.46f, -0.41f, 1.05f, -0.64f, 1.67f, -0.64f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(-11f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                horizontalLineToRelative(-3f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(11f)
                lineTo(0.5f, 23f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(20f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(4f, 12f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(11f)
                lineTo(4f, 23f)
                verticalLineToRelative(-11f)
                close()
                moveTo(8.5f, 7f)
                curveToRelative(1.54f, 0f, 2.79f, -1.25f, 2.79f, -2.79f)
                curveToRelative(0f, -0.25f, 0f, -1.02f, -1.48f, -3.47f)
                curveToRelative(-0.28f, -0.46f, -0.77f, -0.74f, -1.31f, -0.74f)
                reflectiveCurveToRelative(-1.03f, 0.28f, -1.31f, 0.74f)
                curveToRelative(-1.48f, 2.45f, -1.48f, 3.22f, -1.48f, 3.47f)
                curveToRelative(0f, 1.54f, 1.25f, 2.79f, 2.79f, 2.79f)
                close()
                moveTo(8.05f, 1.25f)
                curveToRelative(0.14f, -0.23f, 0.36f, -0.25f, 0.45f, -0.25f)
                reflectiveCurveToRelative(0.31f, 0.03f, 0.45f, 0.25f)
                curveToRelative(1.21f, 1.99f, 1.34f, 2.73f, 1.34f, 2.96f)
                curveToRelative(0f, 0.99f, -0.8f, 1.79f, -1.79f, 1.79f)
                reflectiveCurveToRelative(-1.79f, -0.8f, -1.79f, -1.79f)
                curveToRelative(0f, -0.22f, 0.13f, -0.96f, 1.34f, -2.96f)
                close()
            }
        }.also { _CandleHolder = it}
