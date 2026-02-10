package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SearchAlt: ImageVector? = null

val Icons.Ts.SearchAlt: ImageVector
    get() = _SearchAlt ?: UXIcon(name = "SearchAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.06f, 23f)
                curveToRelative(1.0f, 0.63f, 2.18f, 1f, 3.45f, 1f)
                lineTo(2.51f, 24f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                lineTo(0.01f, 2.5f)
                curveTo(0.01f, 1.12f, 1.13f, 0f, 2.51f, 0f)
                horizontalLineToRelative(16f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(10f)
                curveToRelative(-0.32f, -0.13f, -0.66f, -0.24f, -1f, -0.32f)
                lineTo(19.01f, 1.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(2.51f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(19f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(11.55f)
                close()
                moveTo(14.01f, 8f)
                verticalLineToRelative(-1f)
                lineTo(6.01f, 7f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(8f)
                close()
                moveTo(23.29f, 23.99f)
                lineToRelative(-2.99f, -2.99f)
                curveToRelative(-0.77f, 0.62f, -1.73f, 1f, -2.79f, 1f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                reflectiveCurveToRelative(2.02f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                curveToRelative(0f, 1.06f, -0.38f, 2.02f, -1f, 2.79f)
                lineToRelative(2.99f, 2.99f)
                lineToRelative(-0.71f, 0.71f)
                close()
                moveTo(21.01f, 17.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                close()
            }
        }.also { _SearchAlt = it}
