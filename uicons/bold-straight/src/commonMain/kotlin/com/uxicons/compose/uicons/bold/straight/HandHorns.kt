package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandHorns: ImageVector? = null

val Icons.Bs.HandHorns: ImageVector
    get() = _HandHorns ?: UXIcon(name = "HandHorns") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 13.5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(15.5f, 15f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(20.5f, 2f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                lineTo(19f, 21f)
                lineTo(7.09f, 21f)
                lineToRelative(-3.51f, -3.29f)
                lineToRelative(3.81f, -3.95f)
                curveToRelative(0.8f, -0.8f, 0.8f, -2.09f, 0f, -2.89f)
                curveToRelative(-0.8f, -0.8f, -2.09f, -0.8f, -2.89f, 0f)
                lineToRelative(-3.52f, 3.61f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.65f, 0.66f, -1f, 1.53f, -1f, 2.46f)
                reflectiveCurveToRelative(0.36f, 1.81f, 1.06f, 2.51f)
                lineToRelative(4.85f, 4.55f)
                lineTo(22f, 24f)
                lineTo(22f, 3.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(8f, 8.85f)
                lineTo(8f, 1.58f)
                curveTo(8f, 0.83f, 7.49f, 0.14f, 6.75f, 0.02f)
                curveToRelative(-0.94f, -0.15f, -1.75f, 0.57f, -1.75f, 1.48f)
                verticalLineToRelative(6.91f)
                curveToRelative(1.01f, -0.25f, 2.08f, -0.1f, 3f, 0.44f)
                close()
            }
        }.also { _HandHorns = it}
