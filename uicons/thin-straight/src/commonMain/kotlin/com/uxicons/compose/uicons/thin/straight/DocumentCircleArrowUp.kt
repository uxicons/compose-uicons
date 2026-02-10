package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DocumentCircleArrowUp: ImageVector? = null

val Icons.Ts.DocumentCircleArrowUp: ImageVector
    get() = _DocumentCircleArrowUp ?: UXIcon(name = "DocumentCircleArrowUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 23f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(12f, 1f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(1.14f)
                curveToRelative(0.34f, 0.06f, 0.68f, 0.14f, 1f, 0.23f)
                verticalLineToRelative(-2.08f)
                lineTo(12.71f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                lineTo(0f, 24f)
                lineTo(12.03f, 24f)
                curveToRelative(-0.36f, -0.3f, -0.7f, -0.64f, -1.0f, -1f)
                lineTo(1f, 23f)
                close()
                moveTo(13f, 1.71f)
                lineToRelative(5.29f, 5.29f)
                horizontalLineToRelative(-5.29f)
                lineTo(13f, 1.71f)
                close()
                moveTo(17.5f, 11f)
                curveToRelative(-3.58f, 0f, -6.5f, 2.92f, -6.5f, 6.5f)
                reflectiveCurveToRelative(2.92f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.92f, 6.5f, -6.5f)
                reflectiveCurveToRelative(-2.92f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(17.5f, 23f)
                curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
                reflectiveCurveToRelative(2.47f, -5.5f, 5.5f, -5.5f)
                reflectiveCurveToRelative(5.5f, 2.47f, 5.5f, 5.5f)
                reflectiveCurveToRelative(-2.47f, 5.5f, -5.5f, 5.5f)
                close()
                moveTo(18.49f, 14.41f)
                curveToRelative(-0.53f, -0.55f, -1.48f, -0.55f, -2.0f, 0.0f)
                lineToRelative(-3.08f, 3.58f)
                horizontalLineToRelative(3.59f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3.59f)
                lineToRelative(-3.1f, -3.59f)
                close()
                moveTo(17.21f, 15.11f)
                curveToRelative(0.13f, -0.14f, 0.43f, -0.14f, 0.55f, -0.02f)
                lineToRelative(1.65f, 1.91f)
                horizontalLineToRelative(-3.82f)
                lineToRelative(1.62f, -1.89f)
                close()
            }
        }.also { _DocumentCircleArrowUp = it}
