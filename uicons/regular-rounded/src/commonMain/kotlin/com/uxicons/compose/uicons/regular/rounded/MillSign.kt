package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MillSign: ImageVector? = null

val Icons.Rr.MillSign: ImageVector
    get() = _MillSign ?: UXIcon(name = "MillSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 9f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineTo(9f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                curveToRelative(-0.61f, 0f, -1.19f, 0.14f, -1.71f, 0.39f)
                lineToRelative(-2.29f, 5.59f)
                verticalLineToRelative(9.02f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-4.14f)
                lineToRelative(-3.07f, 7.51f)
                curveToRelative(-0.16f, 0.39f, -0.53f, 0.62f, -0.93f, 0.62f)
                curveToRelative(-0.13f, 0f, -0.25f, -0.02f, -0.38f, -0.07f)
                curveToRelative(-0.51f, -0.21f, -0.76f, -0.79f, -0.55f, -1.3f)
                lineToRelative(4.93f, -12.04f)
                verticalLineToRelative(-1.58f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineTo(4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(0.53f)
                curveToRelative(1.06f, -0.95f, 2.46f, -1.53f, 4f, -1.53f)
                curveToRelative(2.08f, 0f, 3.92f, 1.07f, 5f, 2.69f)
                curveToRelative(0.45f, -0.67f, 1.02f, -1.25f, 1.69f, -1.69f)
                lineToRelative(1.38f, -3.37f)
                curveToRelative(0.21f, -0.51f, 0.79f, -0.76f, 1.3f, -0.55f)
                curveToRelative(0.51f, 0.21f, 0.76f, 0.79f, 0.55f, 1.3f)
                lineToRelative(-0.68f, 1.67f)
                curveToRelative(0.25f, -0.03f, 0.5f, -0.05f, 0.76f, -0.05f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                close()
            }
        }.also { _MillSign = it}
