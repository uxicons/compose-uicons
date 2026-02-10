package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UnderConstruction: ImageVector? = null

val Icons.Ss.UnderConstruction: ImageVector
    get() = _UnderConstruction ?: UXIcon(name = "UnderConstruction") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.64f, 11f)
                lineToRelative(1.16f, -3.89f)
                curveToRelative(0.09f, -0.14f, 0.31f, -0.14f, 0.4f, 0f)
                lineToRelative(1.16f, 3.89f)
                horizontalLineToRelative(-2.71f)
                close()
                moveTo(13.96f, 13f)
                horizontalLineToRelative(-3.91f)
                lineToRelative(-0.6f, 2f)
                horizontalLineToRelative(5.1f)
                lineToRelative(-0.6f, -2f)
                close()
                moveTo(24f, 12.0f)
                curveToRelative(0f, 0.87f, -0.34f, 1.68f, -0.95f, 2.3f)
                lineToRelative(-8.76f, 8.76f)
                curveToRelative(-0.63f, 0.63f, -1.46f, 0.95f, -2.3f, 0.95f)
                reflectiveCurveToRelative(-1.66f, -0.32f, -2.29f, -0.95f)
                lineTo(0.95f, 14.29f)
                curveTo(0.33f, 13.68f, -0.0f, 12.87f, -0.0f, 12.0f)
                curveToRelative(0f, -0.87f, 0.34f, -1.68f, 0.95f, -2.29f)
                lineTo(9.7f, 0.95f)
                curveToRelative(1.27f, -1.27f, 3.33f, -1.27f, 4.59f, 0f)
                lineToRelative(8.76f, 8.76f)
                curveToRelative(0.61f, 0.61f, 0.95f, 1.43f, 0.95f, 2.29f)
                close()
                moveTo(18f, 15f)
                horizontalLineToRelative(-1.36f)
                lineToRelative(-2.6f, -8.68f)
                curveToRelative(-0.37f, -0.81f, -1.15f, -1.31f, -2.04f, -1.31f)
                reflectiveCurveToRelative(-1.67f, 0.5f, -2.04f, 1.31f)
                lineToRelative(-2.59f, 8.68f)
                horizontalLineToRelative(-1.37f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _UnderConstruction = it}
