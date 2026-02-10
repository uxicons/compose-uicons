package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UnderConstruction: ImageVector? = null

val Icons.Sr.UnderConstruction: ImageVector
    get() = _UnderConstruction ?: UXIcon(name = "UnderConstruction") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.05f, 13f)
                horizontalLineToRelative(3.91f)
                lineToRelative(0.6f, 2f)
                horizontalLineToRelative(-5.1f)
                lineToRelative(0.6f, -2f)
                close()
                moveTo(11.8f, 7.11f)
                lineToRelative(-1.16f, 3.89f)
                horizontalLineToRelative(2.71f)
                lineToRelative(-1.16f, -3.89f)
                curveToRelative(-0.09f, -0.14f, -0.31f, -0.14f, -0.4f, 0f)
                close()
                moveTo(1.45f, 8.5f)
                lineTo(8.5f, 1.45f)
                curveToRelative(1.93f, -1.93f, 5.06f, -1.93f, 6.99f, 0f)
                lineToRelative(7.05f, 7.05f)
                curveToRelative(1.93f, 1.93f, 1.93f, 5.06f, 0f, 6.99f)
                lineToRelative(-7.05f, 7.05f)
                curveToRelative(-1.93f, 1.93f, -5.06f, 1.93f, -6.99f, 0f)
                lineTo(1.45f, 15.5f)
                curveToRelative(-1.93f, -1.93f, -1.93f, -5.06f, 0f, -6.99f)
                close()
                moveTo(12f, 5.01f)
                curveToRelative(-0.89f, 0f, -1.67f, 0.5f, -2.04f, 1.31f)
                lineToRelative(-2.59f, 8.68f)
                horizontalLineToRelative(-0.37f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-0.36f)
                lineToRelative(-2.6f, -8.68f)
                curveToRelative(-0.37f, -0.81f, -1.15f, -1.31f, -2.04f, -1.31f)
                close()
            }
        }.also { _UnderConstruction = it}
