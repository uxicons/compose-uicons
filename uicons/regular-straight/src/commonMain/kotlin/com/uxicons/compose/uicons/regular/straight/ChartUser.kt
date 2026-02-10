package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartUser: ImageVector? = null

val Icons.Rs.ChartUser: ImageVector
    get() = _ChartUser ?: UXIcon(name = "ChartUser") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 14f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                close()
                moveTo(7f, 8f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
                moveTo(14f, 19f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(3f, 18f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                lineTo(11f, 16f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(24f, 3f)
                verticalLineToRelative(15f)
                lineTo(15.9f, 18f)
                curveToRelative(-0.15f, -0.74f, -0.48f, -1.42f, -0.92f, -2f)
                horizontalLineToRelative(7.02f)
                lineTo(22f, 3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(8f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                curveToRelative(-0.7f, 0f, -1.37f, 0.13f, -2f, 0.35f)
                verticalLineToRelative(-1.35f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(13f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(18f, 9.41f)
                lineToRelative(-4f, 4f)
                lineToRelative(-1.37f, -1.37f)
                curveToRelative(0.23f, -0.64f, 0.37f, -1.33f, 0.37f, -2.05f)
                curveToRelative(0f, -0.15f, -0.01f, -0.29f, -0.02f, -0.44f)
                lineToRelative(1.02f, 1.02f)
                lineToRelative(2.59f, -2.59f)
                horizontalLineToRelative(-2.59f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.59f)
                close()
            }
        }.also { _ChartUser = it}
