package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EmailPending: ImageVector? = null

val Icons.Ts.EmailPending: ImageVector
    get() = _EmailPending ?: UXIcon(name = "EmailPending") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 11.49f)
                curveToRelative(0.36f, -0.27f, 0.69f, -0.57f, 1f, -0.9f)
                verticalLineToRelative(13.41f)
                lineTo(0f, 24f)
                lineTo(0f, 6.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(8.65f)
                curveToRelative(-0.07f, 0.33f, -0.1f, 0.66f, -0.12f, 1f)
                lineTo(2.5f, 5f)
                curveToRelative(-0.53f, 0f, -1f, 0.28f, -1.27f, 0.7f)
                lineToRelative(8.27f, 8.27f)
                curveToRelative(1.32f, 1.32f, 3.63f, 1.32f, 4.95f, 0f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(1.43f, -1.45f, 1.43f, -1.45f)
                curveToRelative(0.35f, 0.13f, 0.71f, 0.24f, 1.09f, 0.32f)
                lineToRelative(-1.81f, 1.84f)
                reflectiveCurveToRelative(-0.01f, 0.01f, -0.01f, 0.01f)
                curveToRelative(-0.85f, 0.84f, -1.97f, 1.31f, -3.17f, 1.31f)
                reflectiveCurveToRelative(-2.33f, -0.47f, -3.18f, -1.32f)
                lineTo(1f, 6.88f)
                verticalLineToRelative(16.12f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(-11.51f)
                close()
                moveTo(13f, 5.5f)
                curveToRelative(0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
                reflectiveCurveToRelative(5.5f, 2.47f, 5.5f, 5.5f)
                reflectiveCurveToRelative(-2.47f, 5.5f, -5.5f, 5.5f)
                reflectiveCurveToRelative(-5.5f, -2.47f, -5.5f, -5.5f)
                close()
                moveTo(14f, 5.5f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.02f, 4.5f, -4.5f)
                reflectiveCurveToRelative(-2.02f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveToRelative(-4.5f, 2.02f, -4.5f, 4.5f)
                close()
                moveTo(20.51f, 6.8f)
                lineToRelative(-1.51f, -1.51f)
                verticalLineToRelative(-2.29f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2.71f)
                lineToRelative(1.8f, 1.8f)
                lineToRelative(0.71f, -0.71f)
                close()
            }
        }.also { _EmailPending = it}
