package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PunchingBag: ImageVector? = null

val Icons.Tr.PunchingBag: ImageVector
    get() = _PunchingBag ?: UXIcon(name = "PunchingBag") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.98f, 7.68f)
                curveToRelative(-0.02f, -0.02f, -5.48f, -5.54f, -5.48f, -5.54f)
                verticalLineToRelative(-1.64f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(1.64f)
                reflectiveCurveToRelative(-5.52f, 5.55f, -5.55f, 5.62f)
                curveToRelative(-0.59f, 0.76f, -0.95f, 1.7f, -0.95f, 2.74f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(5f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-9f)
                curveToRelative(0f, -1.07f, -0.39f, -2.04f, -1.02f, -2.82f)
                close()
                moveTo(12.0f, 3.05f)
                lineTo(14.97f, 6.05f)
                curveToRelative(-0.16f, -0.02f, -0.31f, -0.05f, -0.47f, -0.05f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.17f, 0f, -0.33f, 0.03f, -0.5f, 0.05f)
                lineToRelative(3.0f, -3.0f)
                close()
                moveTo(18f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(9.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-9.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(5f)
                curveToRelative(1.91f, 0.01f, 3.49f, 1.6f, 3.5f, 3.5f)
                close()
            }
        }.also { _PunchingBag = it}
