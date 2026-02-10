package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiamondExclamation: ImageVector? = null

val Icons.Rr.DiamondExclamation: ImageVector
    get() = _DiamondExclamation ?: UXIcon(name = "DiamondExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.54f, 8.46f)
                lineTo(15.54f, 1.46f)
                curveTo(14.59f, 0.52f, 13.34f, -0.01f, 12.0f, -0.01f)
                reflectiveCurveToRelative(-2.59f, 0.52f, -3.54f, 1.47f)
                lineTo(1.47f, 8.46f)
                curveToRelative(-1.95f, 1.95f, -1.95f, 5.12f, 0f, 7.07f)
                lineToRelative(7.0f, 7.0f)
                curveToRelative(0.94f, 0.94f, 2.2f, 1.47f, 3.54f, 1.47f)
                reflectiveCurveToRelative(2.59f, -0.52f, 3.54f, -1.47f)
                lineToRelative(7.0f, -7.0f)
                curveToRelative(0.94f, -0.94f, 1.46f, -2.2f, 1.46f, -3.53f)
                reflectiveCurveToRelative(-0.52f, -2.59f, -1.46f, -3.54f)
                close()
                moveTo(21.12f, 14.12f)
                lineToRelative(-7.0f, 7.0f)
                curveToRelative(-1.13f, 1.13f, -3.11f, 1.13f, -4.24f, 0f)
                lineToRelative(-7.0f, -7.0f)
                curveToRelative(-1.17f, -1.17f, -1.17f, -3.07f, 0f, -4.24f)
                lineToRelative(7.0f, -7.0f)
                curveToRelative(0.57f, -0.57f, 1.32f, -0.88f, 2.12f, -0.88f)
                reflectiveCurveToRelative(1.55f, 0.31f, 2.12f, 0.88f)
                lineToRelative(7.0f, 7.0f)
                curveToRelative(0.57f, 0.57f, 0.88f, 1.32f, 0.88f, 2.12f)
                reflectiveCurveToRelative(-0.31f, 1.55f, -0.88f, 2.12f)
                close()
                moveTo(13.5f, 16.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(11f, 12.5f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
            }
        }.also { _DiamondExclamation = it}
