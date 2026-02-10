package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TvRetro: ImageVector? = null

val Icons.Sr.TvRetro: ImageVector
    get() = _TvRetro ?: UXIcon(name = "TvRetro") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 11f)
                verticalLineToRelative(8f)
                reflectiveCurveToRelative(-9f, 0f, -9f, 0f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(9f)
                close()
                moveTo(24f, 11f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(5f, 24f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(4.87f)
                lineTo(6.23f, 1.64f)
                curveToRelative(-0.35f, -0.42f, -0.3f, -1.05f, 0.13f, -1.41f)
                curveToRelative(0.42f, -0.35f, 1.05f, -0.3f, 1.41f, 0.13f)
                lineToRelative(4.23f, 5.08f)
                lineTo(16.23f, 0.36f)
                curveToRelative(0.35f, -0.42f, 0.98f, -0.48f, 1.41f, -0.13f)
                reflectiveCurveToRelative(0.48f, 0.98f, 0.13f, 1.41f)
                lineToRelative(-3.63f, 4.36f)
                horizontalLineToRelative(4.87f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(16f, 11f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                lineTo(5f, 9f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(9f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-8f)
                close()
                moveTo(21.5f, 17.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(21.5f, 12.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _TvRetro = it}
