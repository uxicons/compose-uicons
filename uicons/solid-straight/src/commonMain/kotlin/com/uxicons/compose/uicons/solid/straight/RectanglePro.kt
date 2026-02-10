package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RectanglePro: ImageVector? = null

val Icons.Ss.RectanglePro: ImageVector
    get() = _RectanglePro ?: UXIcon(name = "RectanglePro") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 12f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(20.5f, 8f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(8.5f)
                lineTo(0f, 22f)
                verticalLineToRelative(-5f)
                lineTo(2f, 17f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                lineTo(0f, 8f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                lineTo(21f, 2f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(16f, 17f)
                lineToRelative(-2.11f, -3.69f)
                curveToRelative(0.77f, -0.63f, 1.23f, -1.62f, 1.08f, -2.72f)
                curveToRelative(-0.2f, -1.51f, -1.59f, -2.59f, -3.12f, -2.59f)
                horizontalLineToRelative(-1.85f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                reflectiveCurveToRelative(0.06f, 0f, 0.08f, 0f)
                lineToRelative(1.72f, 3.01f)
                horizontalLineToRelative(2.19f)
                close()
                moveTo(5f, 11f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(2f, 10f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
                moveTo(19f, 11.5f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
            }
        }.also { _RectanglePro = it}
