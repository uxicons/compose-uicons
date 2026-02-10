package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CassetteTape: ImageVector? = null

val Icons.Br.CassetteTape: ImageVector
    get() = _CassetteTape ?: UXIcon(name = "CassetteTape") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 3f)
            lineTo(5.5f, 3f)
            curveTo(2.47f, 3f, 0f, 5.47f, 0f, 8.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            verticalLineToRelative(-7f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(21f, 15.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-0.17f)
            lineToRelative(-0.74f, -1.11f)
            curveToRelative(-0.37f, -0.56f, -1f, -0.89f, -1.66f, -0.89f)
            horizontalLineToRelative(-7.86f)
            curveToRelative(-0.67f, 0f, -1.29f, 0.33f, -1.66f, 0.89f)
            lineToRelative(-0.74f, 1.11f)
            horizontalLineToRelative(-0.17f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-7f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(7f)
            close()
            moveTo(14.56f, 9f)
            curveToRelative(-0.34f, 0.59f, -0.56f, 1.27f, -0.56f, 2f)
            reflectiveCurveToRelative(0.21f, 1.41f, 0.56f, 2f)
            horizontalLineToRelative(-5.11f)
            curveToRelative(0.34f, -0.59f, 0.56f, -1.27f, 0.56f, -2f)
            reflectiveCurveToRelative(-0.21f, -1.41f, -0.56f, -2f)
            horizontalLineToRelative(5.11f)
            close()
            moveTo(8f, 11f)
            curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
            reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
            close()
            moveTo(20f, 11f)
            curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
            reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
            close()
        }
    }.also { _CassetteTape = it }
