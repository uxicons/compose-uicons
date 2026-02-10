package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ZeroPercent: ImageVector? = null

val Icons.Br.ZeroPercent: ImageVector
    get() = _ZeroPercent ?: UXIcon(name = "ZeroPercent") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 8.02f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            close()
            moveTo(8.9f, 13.52f)
            curveToRelative(0f, 0.5f, -0.4f, 0.9f, -0.9f, 0.9f)
            reflectiveCurveToRelative(-0.9f, -0.4f, -0.9f, -0.9f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.5f, 0.4f, -0.9f, 0.9f, -0.9f)
            reflectiveCurveToRelative(0.9f, 0.4f, 0.9f, 0.9f)
            verticalLineToRelative(3f)
            close()
            moveTo(18.5f, 14.75f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            reflectiveCurveToRelative(-1.25f, -0.56f, -1.25f, -1.25f)
            reflectiveCurveToRelative(0.56f, -1.25f, 1.25f, -1.25f)
            reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f)
            close()
            moveTo(12.75f, 10.5f)
            curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
            reflectiveCurveToRelative(0.56f, -1.25f, 1.25f, -1.25f)
            reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f)
            reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f)
            close()
            moveTo(17.69f, 9.24f)
            lineToRelative(-4.18f, 6.4f)
            curveToRelative(-0.15f, 0.23f, -0.4f, 0.36f, -0.67f, 0.36f)
            curveToRelative(-0.64f, 0f, -1.02f, -0.7f, -0.67f, -1.24f)
            lineToRelative(4.18f, -6.4f)
            curveToRelative(0.15f, -0.23f, 0.4f, -0.36f, 0.67f, -0.36f)
            curveToRelative(0.64f, 0f, 1.02f, 0.7f, 0.67f, 1.24f)
            close()
            moveTo(12f, 0f)
            curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
            reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
            reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
            reflectiveCurveTo(18.62f, 0f, 12f, 0f)
            close()
            moveTo(12f, 21f)
            curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
            reflectiveCurveTo(7.04f, 3f, 12f, 3f)
            reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
            reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
            close()
        }
    }.also { _ZeroPercent = it }
