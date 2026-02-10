package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Token: ImageVector? = null

val Icons.Ts.Token: ImageVector
    get() = _Token ?: UXIcon(name = "Token") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
                moveTo(12.75f, 6.64f)
                horizontalLineToRelative(-1.5f)
                lineToRelative(-0.88f, 3.36f)
                horizontalLineToRelative(-3.37f)
                verticalLineToRelative(1.48f)
                lineToRelative(2.38f, 1.33f)
                lineToRelative(-0.96f, 3.0f)
                lineToRelative(1.15f, 0.84f)
                lineToRelative(2.43f, -1.89f)
                lineToRelative(2.42f, 1.87f)
                lineToRelative(1.17f, -0.81f)
                lineToRelative(-0.98f, -2.98f)
                lineToRelative(2.37f, -1.37f)
                verticalLineToRelative(-1.48f)
                horizontalLineToRelative(-3.35f)
                lineToRelative(-0.88f, -3.36f)
                close()
                moveTo(13.41f, 12.39f)
                lineToRelative(0.97f, 2.95f)
                lineToRelative(-2.38f, -1.84f)
                lineToRelative(-2.39f, 1.85f)
                lineToRelative(0.96f, -3.01f)
                lineToRelative(-2.39f, -1.33f)
                horizontalLineToRelative(2.95f)
                lineToRelative(0.86f, -3.27f)
                lineToRelative(0.86f, 3.27f)
                horizontalLineToRelative(2.95f)
                lineToRelative(-2.4f, 1.39f)
                close()
                moveTo(12.0f, 3f)
                curveTo(7.04f, 3f, 3f, 7.04f, 3f, 12f)
                reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                reflectiveCurveTo(16.96f, 3f, 12f, 3f)
                close()
                moveTo(12.0f, 20f)
                curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                reflectiveCurveTo(7.59f, 4f, 12f, 4f)
                reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                reflectiveCurveToRelative(-3.59f, 8f, -8f, 8f)
                close()
            }
        }.also { _Token = it}
