package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CandleHolder: ImageVector? = null

val Icons.Ts.CandleHolder: ImageVector
    get() = _CandleHolder ?: UXIcon(name = "CandleHolder") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.5f, 7f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0f, -1.22f, -1.75f, -3.5f, -2.11f, -3.95f)
                lineToRelative(-0.39f, -0.5f)
                lineToRelative(-0.39f, 0.5f)
                curveToRelative(-0.35f, 0.45f, -2.11f, 2.73f, -2.11f, 3.95f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(8.5f, 1.69f)
                curveToRelative(0.72f, 0.99f, 1.5f, 2.27f, 1.5f, 2.81f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                curveToRelative(0f, -0.54f, 0.78f, -1.82f, 1.5f, -2.81f)
                close()
                moveTo(20.5f, 17f)
                curveToRelative(-0.86f, 0f, -1.69f, 0.32f, -2.33f, 0.89f)
                lineToRelative(0.67f, 0.74f)
                curveToRelative(0.46f, -0.41f, 1.05f, -0.64f, 1.67f, -0.64f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(-12.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(12.5f)
                lineTo(0f, 23f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(20.5f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(4f, 10.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(6f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(12.5f)
                lineTo(4f, 23f)
                verticalLineToRelative(-12.5f)
                close()
            }
        }.also { _CandleHolder = it}
