package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeadSideCough: ImageVector? = null

val Icons.Bs.HeadSideCough: ImageVector
    get() = _HeadSideCough ?: UXIcon(name = "HeadSideCough") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 15.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(17f, 12.68f)
                reflectiveCurveToRelative(-0.57f, -1.3f, -0.79f, -1.81f)
                curveToRelative(-1.12f, -2.58f, -2.18f, -5.02f, -3.32f, -6.43f)
                curveTo(10.4f, 1.12f, 6.3f, -0.52f, 2.18f, 0.15f)
                curveTo(1.42f, 0.28f, 0.7f, 0.51f, 0f, 0.78f)
                verticalLineToRelative(3.33f)
                curveToRelative(0.82f, -0.48f, 1.72f, -0.84f, 2.67f, -0.99f)
                curveToRelative(3.01f, -0.49f, 6f, 0.7f, 7.85f, 3.17f)
                curveToRelative(0.91f, 1.13f, 1.93f, 3.46f, 2.91f, 5.72f)
                horizontalLineToRelative(-1.35f)
                lineToRelative(-0.7f, 5.56f)
                curveToRelative(-0.03f, 0.25f, -0.24f, 0.44f, -0.5f, 0.44f)
                horizontalLineToRelative(-3.87f)
                verticalLineToRelative(3f)
                lineTo(0f, 21.01f)
                verticalLineToRelative(3f)
                lineTo(10f, 24.01f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(0.87f)
                curveToRelative(1.76f, 0f, 3.25f, -1.32f, 3.47f, -3.06f)
                lineToRelative(0.37f, -2.94f)
                horizontalLineToRelative(2.28f)
                verticalLineToRelative(-2.32f)
                close()
                moveTo(22.5f, 20f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(18.5f, 17f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _HeadSideCough = it}
