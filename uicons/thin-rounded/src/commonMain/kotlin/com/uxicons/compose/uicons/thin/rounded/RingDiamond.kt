package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RingDiamond: ImageVector? = null

val Icons.Tr.RingDiamond: ImageVector
    get() = _RingDiamond ?: UXIcon(name = "RingDiamond") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.28f, 6.29f)
                lineToRelative(1.84f, -2.43f)
                curveToRelative(0.52f, -0.69f, 0.46f, -1.68f, -0.16f, -2.29f)
                lineToRelative(-0.83f, -0.83f)
                curveToRelative(-0.47f, -0.47f, -1.1f, -0.73f, -1.77f, -0.73f)
                horizontalLineToRelative(-2.72f)
                curveToRelative(-0.67f, 0f, -1.3f, 0.26f, -1.77f, 0.73f)
                lineToRelative(-0.83f, 0.83f)
                curveToRelative(-0.61f, 0.61f, -0.68f, 1.6f, -0.16f, 2.29f)
                lineToRelative(1.84f, 2.43f)
                curveToRelative(-3.86f, 1.01f, -6.72f, 4.53f, -6.72f, 8.71f)
                curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                curveToRelative(0f, -4.17f, -2.86f, -7.69f, -6.72f, -8.71f)
                close()
                moveTo(13.19f, 6.08f)
                curveToRelative(-0.23f, -0.03f, -0.46f, -0.05f, -0.69f, -0.07f)
                verticalLineToRelative(-2.12f)
                lineToRelative(2.88f, -0.72f)
                curveToRelative(-0.02f, 0.03f, -2.19f, 2.91f, -2.19f, 2.91f)
                close()
                moveTo(9.58f, 1.44f)
                curveToRelative(0.28f, -0.28f, 0.66f, -0.44f, 1.06f, -0.44f)
                horizontalLineToRelative(2.72f)
                curveToRelative(0.4f, 0f, 0.78f, 0.16f, 1.06f, 0.44f)
                lineToRelative(0.75f, 0.75f)
                lineToRelative(-3.17f, 0.79f)
                lineToRelative(-3.17f, -0.79f)
                lineToRelative(0.75f, -0.75f)
                close()
                moveTo(8.62f, 3.17f)
                lineToRelative(2.88f, 0.72f)
                verticalLineToRelative(2.12f)
                curveToRelative(-0.23f, 0.01f, -0.46f, 0.04f, -0.69f, 0.07f)
                curveToRelative(0f, 0f, -2.17f, -2.88f, -2.19f, -2.91f)
                close()
                moveTo(12f, 23.0f)
                curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                reflectiveCurveTo(7.59f, 7f, 12f, 7f)
                reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                reflectiveCurveToRelative(-3.59f, 8f, -8f, 8f)
                close()
            }
        }.also { _RingDiamond = it}
