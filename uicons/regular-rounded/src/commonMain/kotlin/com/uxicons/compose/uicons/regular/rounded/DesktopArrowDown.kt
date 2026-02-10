package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DesktopArrowDown: ImageVector? = null

val Icons.Rr.DesktopArrowDown: ImageVector
    get() = _DesktopArrowDown ?: UXIcon(name = "DesktopArrowDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 1f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(7f)
                lineTo(2f, 13f)
                verticalLineToRelative(-6.98f)
                curveToRelative(0f, -0.8f, 0.31f, -1.56f, 0.89f, -2.13f)
                curveToRelative(0.57f, -0.56f, 1.32f, -0.87f, 2.12f, -0.87f)
                horizontalLineToRelative(0.02f)
                lineToRelative(2.98f, 0.02f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.55f, 0f, 1.0f, -0.44f, 1f, -0.99f)
                curveToRelative(0.0f, -0.55f, -0.44f, -1.0f, -0.99f, -1.0f)
                lineToRelative(-2.98f, -0.02f)
                horizontalLineToRelative(-0.03f)
                curveToRelative(-1.33f, 0f, -2.58f, 0.52f, -3.52f, 1.46f)
                curveToRelative(-0.95f, 0.94f, -1.48f, 2.2f, -1.48f, 3.54f)
                verticalLineToRelative(7.98f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24.0f, 6f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(19f, 17f)
                lineTo(5f, 17f)
                curveToRelative(-1.3f, 0f, -2.4f, -0.84f, -2.82f, -2f)
                horizontalLineToRelative(19.63f)
                curveToRelative(-0.41f, 1.16f, -1.51f, 2f, -2.82f, 2f)
                close()
                moveTo(11f, 8.42f)
                lineTo(11f, 1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(7.42f)
                lineToRelative(2.32f, -2.15f)
                curveToRelative(0.4f, -0.38f, 1.04f, -0.35f, 1.41f, 0.05f)
                curveToRelative(0.38f, 0.41f, 0.35f, 1.04f, -0.05f, 1.41f)
                lineToRelative(-2.61f, 2.43f)
                curveToRelative(-0.56f, 0.56f, -1.31f, 0.84f, -2.06f, 0.84f)
                curveToRelative(-0.76f, 0f, -1.52f, -0.29f, -2.1f, -0.87f)
                lineToRelative(-2.59f, -2.4f)
                curveToRelative(-0.4f, -0.38f, -0.43f, -1.01f, -0.05f, -1.41f)
                curveToRelative(0.37f, -0.41f, 1.01f, -0.43f, 1.41f, -0.05f)
                lineToRelative(2.32f, 2.15f)
                close()
            }
        }.also { _DesktopArrowDown = it}
