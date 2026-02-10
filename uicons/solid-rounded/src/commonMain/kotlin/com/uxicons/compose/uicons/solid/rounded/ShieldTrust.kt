package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldTrust: ImageVector? = null

val Icons.Sr.ShieldTrust: ImageVector
    get() = _ShieldTrust ?: UXIcon(name = "ShieldTrust") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.13f, 9.87f)
                horizontalLineToRelative(0f)
                lineToRelative(-2.15f, -2.15f)
                verticalLineToRelative(-1.72f)
                curveToRelative(0f, -1.65f, -1.34f, -3.0f, -2.99f, -3.0f)
                horizontalLineToRelative(-1.72f)
                lineToRelative(-2.15f, -2.15f)
                curveToRelative(-1.13f, -1.13f, -3.1f, -1.13f, -4.23f, 0f)
                lineToRelative(-2.15f, 2.15f)
                horizontalLineToRelative(-1.72f)
                curveToRelative(-1.65f, 0f, -2.99f, 1.34f, -2.99f, 3.0f)
                verticalLineToRelative(1.72f)
                lineToRelative(-2.15f, 2.15f)
                curveToRelative(-1.17f, 1.17f, -1.17f, 3.07f, 0f, 4.24f)
                lineToRelative(2.15f, 2.15f)
                verticalLineToRelative(1.72f)
                curveToRelative(0f, 1.65f, 1.34f, 3.0f, 2.99f, 3.0f)
                horizontalLineToRelative(1.72f)
                lineToRelative(2.15f, 2.15f)
                curveToRelative(0.56f, 0.56f, 1.32f, 0.88f, 2.12f, 0.88f)
                reflectiveCurveToRelative(1.55f, -0.31f, 2.12f, -0.88f)
                lineToRelative(2.15f, -2.15f)
                horizontalLineToRelative(1.72f)
                curveToRelative(1.65f, 0f, 2.99f, -1.34f, 2.99f, -3.0f)
                verticalLineToRelative(-1.72f)
                lineToRelative(2.15f, -2.15f)
                curveToRelative(1.17f, -1.17f, 1.17f, -3.07f, 0f, -4.24f)
                close()
                moveTo(18.2f, 10.21f)
                lineToRelative(-5.05f, 5.0f)
                curveToRelative(-0.61f, 0.61f, -1.42f, 0.92f, -2.23f, 0.92f)
                reflectiveCurveToRelative(-1.61f, -0.3f, -2.23f, -0.91f)
                lineToRelative(-2.6f, -2.5f)
                curveToRelative(-0.39f, -0.39f, -0.4f, -1.02f, -0.01f, -1.41f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.4f, 1.42f, -0.01f)
                lineToRelative(2.6f, 2.5f)
                curveToRelative(0.45f, 0.45f, 1.19f, 0.45f, 1.64f, 0f)
                lineToRelative(5.05f, -5.0f)
                curveToRelative(0.39f, -0.39f, 1.03f, -0.39f, 1.42f, 0.01f)
                reflectiveCurveToRelative(0.39f, 1.02f, -0.01f, 1.41f)
                close()
            }
        }.also { _ShieldTrust = it}
