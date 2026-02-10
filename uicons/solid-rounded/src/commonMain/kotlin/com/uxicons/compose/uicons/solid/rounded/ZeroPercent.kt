package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ZeroPercent: ImageVector? = null

val Icons.Sr.ZeroPercent: ImageVector
    get() = _ZeroPercent ?: UXIcon(name = "ZeroPercent") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.9f, 10.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.5f, -0.4f, 0.9f, -0.9f, 0.9f)
                reflectiveCurveToRelative(-0.9f, -0.4f, -0.9f, -0.9f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.5f, 0.4f, -0.9f, 0.9f, -0.9f)
                reflectiveCurveToRelative(0.9f, 0.4f, 0.9f, 0.9f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(10.5f, 10.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-3f)
                close()
                moveTo(12.75f, 10.48f)
                curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
                reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f)
                reflectiveCurveToRelative(-1.25f, 0.56f, -1.25f, 1.25f)
                reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f)
                close()
                moveTo(13.52f, 15.62f)
                lineToRelative(4.18f, -6.4f)
                curveToRelative(0.35f, -0.53f, -0.03f, -1.24f, -0.67f, -1.24f)
                curveToRelative(-0.27f, 0f, -0.52f, 0.14f, -0.67f, 0.36f)
                lineToRelative(-4.18f, 6.4f)
                curveToRelative(-0.35f, 0.53f, 0.03f, 1.24f, 0.67f, 1.24f)
                curveToRelative(0.27f, 0f, 0.52f, -0.14f, 0.67f, -0.36f)
                close()
                moveTo(18.5f, 14.73f)
                curveToRelative(0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
                reflectiveCurveToRelative(-1.25f, 0.56f, -1.25f, 1.25f)
                reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f)
                reflectiveCurveToRelative(1.25f, -0.56f, 1.25f, -1.25f)
                close()
            }
        }.also { _ZeroPercent = it}
