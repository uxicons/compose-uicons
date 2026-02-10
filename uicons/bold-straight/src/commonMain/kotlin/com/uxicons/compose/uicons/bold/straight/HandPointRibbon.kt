package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandPointRibbon: ImageVector? = null

val Icons.Bs.HandPointRibbon: ImageVector
    get() = _HandPointRibbon ?: UXIcon(name = "HandPointRibbon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 13.5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(16.5f, 15f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(6f, 7f)
                verticalLineToRelative(1.42f)
                curveToRelative(1.01f, -0.25f, 2.08f, -0.1f, 3f, 0.44f)
                lineTo(9f, 4f)
                lineTo(1f, 4f)
                lineToRelative(2f, 1.5f)
                lineToRelative(-2f, 1.5f)
                lineTo(6f, 7f)
                close()
                moveTo(9f, 1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-0.5f)
                close()
                moveTo(20.5f, 8f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(19f, 16.65f)
                verticalLineToRelative(4.35f)
                lineTo(8.09f, 21f)
                lineToRelative(-3.5f, -3.29f)
                lineToRelative(3.81f, -3.95f)
                curveToRelative(0.8f, -0.8f, 0.8f, -2.09f, 0f, -2.89f)
                curveToRelative(-0.8f, -0.8f, -2.09f, -0.8f, -2.89f, 0f)
                lineToRelative(-3.52f, 3.61f)
                lineToRelative(0.0f, 0.01f)
                curveToRelative(-0.65f, 0.66f, -1.0f, 1.53f, -1.0f, 2.45f)
                curveToRelative(0f, 0.94f, 0.36f, 1.81f, 1.06f, 2.51f)
                lineToRelative(4.85f, 4.55f)
                horizontalLineToRelative(15.09f)
                verticalLineToRelative(-7.35f)
                curveToRelative(-0.46f, 0.22f, -0.96f, 0.35f, -1.5f, 0.35f)
                reflectiveCurveToRelative(-1.04f, -0.13f, -1.5f, -0.35f)
                close()
            }
        }.also { _HandPointRibbon = it}
