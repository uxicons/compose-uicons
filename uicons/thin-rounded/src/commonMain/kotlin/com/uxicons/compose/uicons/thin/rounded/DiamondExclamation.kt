package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiamondExclamation: ImageVector? = null

val Icons.Tr.DiamondExclamation: ImageVector
    get() = _DiamondExclamation ?: UXIcon(name = "DiamondExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.69f, 8.83f)
                lineTo(15.16f, 1.31f)
                curveTo(14.32f, 0.46f, 13.2f, -0.01f, 12.0f, -0.01f)
                reflectiveCurveToRelative(-2.32f, 0.47f, -3.17f, 1.31f)
                lineTo(1.31f, 8.83f)
                curveTo(0.47f, 9.68f, 0f, 10.8f, 0f, 11.99f)
                reflectiveCurveToRelative(0.47f, 2.32f, 1.31f, 3.16f)
                lineToRelative(7.53f, 7.53f)
                curveToRelative(0.84f, 0.85f, 1.97f, 1.31f, 3.17f, 1.31f)
                reflectiveCurveToRelative(2.32f, -0.47f, 3.16f, -1.31f)
                lineToRelative(7.53f, -7.53f)
                curveToRelative(0.84f, -0.84f, 1.31f, -1.97f, 1.31f, -3.16f)
                reflectiveCurveToRelative(-0.47f, -2.32f, -1.31f, -3.16f)
                close()
                moveTo(21.98f, 14.45f)
                lineToRelative(-7.53f, 7.53f)
                curveToRelative(-1.31f, 1.31f, -3.6f, 1.31f, -4.92f, 0f)
                lineToRelative(-7.53f, -7.53f)
                curveToRelative(-1.35f, -1.35f, -1.35f, -3.56f, 0f, -4.91f)
                lineToRelative(7.53f, -7.53f)
                curveToRelative(0.66f, -0.66f, 1.53f, -1.02f, 2.46f, -1.02f)
                reflectiveCurveToRelative(1.8f, 0.36f, 2.46f, 1.02f)
                lineToRelative(7.53f, 7.53f)
                curveToRelative(1.35f, 1.35f, 1.35f, 3.56f, 0f, 4.91f)
                close()
                moveTo(13f, 17f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(11.5f, 13.5f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                close()
            }
        }.also { _DiamondExclamation = it}
