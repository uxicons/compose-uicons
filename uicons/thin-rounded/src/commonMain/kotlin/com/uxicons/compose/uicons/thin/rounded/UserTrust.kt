package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserTrust: ImageVector? = null

val Icons.Tr.UserTrust: ImageVector
    get() = _UserTrust ?: UXIcon(name = "UserTrust") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 12f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveTo(5.69f, 0f, 9f, 0f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
                moveTo(9f, 1f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                reflectiveCurveTo(11.76f, 1f, 9f, 1f)
                close()
                moveTo(1f, 23.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -4.23f, 3.31f, -7.74f, 7.53f, -7.99f)
                curveToRelative(0.28f, -0.02f, 0.49f, -0.25f, 0.47f, -0.53f)
                curveToRelative(-0.02f, -0.28f, -0.25f, -0.5f, -0.53f, -0.47f)
                curveTo(3.72f, 14.29f, 0f, 18.24f, 0f, 23f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                close()
                moveTo(17.5f, 24f)
                curveToRelative(-3.58f, 0f, -6.5f, -2.92f, -6.5f, -6.5f)
                reflectiveCurveToRelative(2.92f, -6.5f, 6.5f, -6.5f)
                reflectiveCurveToRelative(6.5f, 2.92f, 6.5f, 6.5f)
                reflectiveCurveToRelative(-2.92f, 6.5f, -6.5f, 6.5f)
                close()
                moveTo(17.5f, 12f)
                curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
                reflectiveCurveToRelative(2.47f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.47f, 5.5f, -5.5f)
                reflectiveCurveToRelative(-2.47f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(18.14f, 19.46f)
                lineToRelative(2.7f, -2.61f)
                curveToRelative(0.2f, -0.19f, 0.2f, -0.51f, 0.01f, -0.71f)
                curveToRelative(-0.19f, -0.2f, -0.51f, -0.2f, -0.71f, -0.01f)
                lineToRelative(-2.71f, 2.62f)
                curveToRelative(-0.34f, 0.33f, -0.89f, 0.33f, -1.22f, 0.0f)
                lineToRelative(-1.36f, -1.34f)
                curveToRelative(-0.2f, -0.19f, -0.51f, -0.19f, -0.71f, 0.0f)
                curveToRelative(-0.19f, 0.2f, -0.19f, 0.51f, 0.01f, 0.71f)
                lineToRelative(1.36f, 1.35f)
                curveToRelative(0.36f, 0.35f, 0.84f, 0.53f, 1.31f, 0.53f)
                reflectiveCurveToRelative(0.95f, -0.18f, 1.31f, -0.53f)
                close()
            }
        }.also { _UserTrust = it}
