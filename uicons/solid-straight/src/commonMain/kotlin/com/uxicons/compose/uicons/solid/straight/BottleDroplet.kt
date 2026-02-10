package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BottleDroplet: ImageVector? = null

val Icons.Ss.BottleDroplet: ImageVector
    get() = _BottleDroplet ?: UXIcon(name = "BottleDroplet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 13.94f)
                curveToRelative(0.75f, 0.84f, 1.5f, 1.93f, 1.5f, 2.56f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                curveToRelative(0f, -0.64f, 0.75f, -1.72f, 1.5f, -2.56f)
                close()
                moveTo(20f, 11.94f)
                verticalLineToRelative(12.06f)
                lineTo(4f, 24.0f)
                verticalLineToRelative(-12.06f)
                curveToRelative(0f, -1.22f, 0.55f, -2.36f, 1.5f, -3.12f)
                lineToRelative(3.5f, -2.8f)
                lineTo(9f, 2f)
                horizontalLineToRelative(-1f)
                lineTo(8f, 0f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4.02f)
                lineToRelative(3.5f, 2.8f)
                curveToRelative(0.95f, 0.76f, 1.5f, 1.9f, 1.5f, 3.12f)
                close()
                moveTo(15.5f, 16.5f)
                curveToRelative(0f, -2f, -2.35f, -4.29f, -2.82f, -4.73f)
                lineToRelative(-0.68f, -0.64f)
                lineToRelative(-0.68f, 0.64f)
                curveToRelative(-0.47f, 0.44f, -2.82f, 2.73f, -2.82f, 4.73f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                close()
            }
        }.also { _BottleDroplet = it}
