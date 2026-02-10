package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VideoDuration: ImageVector? = null

val Icons.Ts.VideoDuration: ImageVector
    get() = _VideoDuration ?: UXIcon(name = "VideoDuration") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 17.29f)
                lineToRelative(1.85f, 1.85f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-2.15f, -2.15f)
                verticalLineToRelative(-3.71f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3.29f)
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
                moveTo(1f, 18f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(18f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(7.8f)
                curveToRelative(0.35f, 0.22f, 0.69f, 0.46f, 1f, 0.73f)
                lineTo(23f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                verticalLineToRelative(16.5f)
                horizontalLineToRelative(9.14f)
                curveToRelative(-0.06f, -0.33f, -0.1f, -0.66f, -0.12f, -1f)
                lineTo(1f, 18f)
                close()
                moveTo(8f, 13.79f)
                lineTo(8f, 4.65f)
                lineToRelative(8.23f, 4.57f)
                lineToRelative(-8.23f, 4.57f)
                close()
                moveTo(9f, 12.1f)
                lineToRelative(5.17f, -2.87f)
                lineToRelative(-5.17f, -2.87f)
                verticalLineToRelative(5.75f)
                close()
            }
        }.also { _VideoDuration = it}
