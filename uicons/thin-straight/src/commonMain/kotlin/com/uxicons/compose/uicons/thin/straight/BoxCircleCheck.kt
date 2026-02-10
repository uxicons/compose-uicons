package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoxCircleCheck: ImageVector? = null

val Icons.Ts.BoxCircleCheck: ImageVector
    get() = _BoxCircleCheck ?: UXIcon(name = "BoxCircleCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 2.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3.03f)
                curveToRelative(-0.31f, -0.27f, -0.65f, -0.51f, -1f, -0.73f)
                verticalLineToRelative(-2.3f)
                lineTo(2f, 8.0f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(9.03f)
                curveToRelative(0.31f, 0.36f, 0.64f, 0.69f, 1.0f, 1f)
                lineTo(1f, 24.0f)
                lineTo(1f, 8f)
                lineTo(0f, 8f)
                lineTo(0f, 2.5f)
                curveTo(0f, 1.12f, 1.12f, 0f, 2.5f, 0f)
                horizontalLineToRelative(19f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(23f, 2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(2.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(22f)
                lineTo(23f, 2.5f)
                close()
                moveTo(24f, 17.5f)
                curveToRelative(0f, 3.58f, -2.92f, 6.5f, -6.5f, 6.5f)
                reflectiveCurveToRelative(-6.5f, -2.92f, -6.5f, -6.5f)
                reflectiveCurveToRelative(2.92f, -6.5f, 6.5f, -6.5f)
                reflectiveCurveToRelative(6.5f, 2.92f, 6.5f, 6.5f)
                close()
                moveTo(23f, 17.5f)
                curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                reflectiveCurveToRelative(-5.5f, 2.47f, -5.5f, 5.5f)
                reflectiveCurveToRelative(2.47f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.47f, 5.5f, -5.5f)
                close()
                moveTo(16.98f, 18.95f)
                curveToRelative(-0.07f, 0.06f, -0.17f, 0.06f, -0.24f, -0.01f)
                lineToRelative(-1.86f, -1.8f)
                lineToRelative(-0.7f, 0.72f)
                lineToRelative(1.85f, 1.79f)
                curveToRelative(0.23f, 0.23f, 0.53f, 0.34f, 0.83f, 0.34f)
                reflectiveCurveToRelative(0.59f, -0.11f, 0.82f, -0.34f)
                lineToRelative(3.46f, -3.4f)
                lineToRelative(-0.7f, -0.71f)
                lineToRelative(-3.46f, 3.4f)
                close()
            }
        }.also { _BoxCircleCheck = it}
