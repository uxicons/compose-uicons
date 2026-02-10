package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ReferArrow: ImageVector? = null

val Icons.Bs.ReferArrow: ImageVector
    get() = _ReferArrow ?: UXIcon(name = "ReferArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(11.31f, 0f, 8f, 0f)
                reflectiveCurveTo(2f, 2.69f, 2f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(8f, 3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                close()
                moveTo(23.27f, 18.27f)
                lineToRelative(-3.75f, 3.75f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(1.9f, -1.9f)
                horizontalLineToRelative(-2.29f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(2.29f)
                lineToRelative(-1.9f, -1.9f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(3.75f, 3.75f)
                curveToRelative(0.97f, 0.97f, 0.97f, 2.56f, 0f, 3.54f)
                close()
                moveTo(13.03f, 14.24f)
                curveToRelative(-1.01f, 0.7f, -1.82f, 1.65f, -2.35f, 2.76f)
                horizontalLineToRelative(-5.68f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(5f)
                lineTo(0f, 24.0f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(6.5f)
                curveToRelative(0.53f, 0f, 1.05f, 0.08f, 1.53f, 0.24f)
                close()
            }
        }.also { _ReferArrow = it}
