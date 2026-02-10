package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cauldron: ImageVector? = null

val Icons.Ss.Cauldron: ImageVector
    get() = _Cauldron ?: UXIcon(name = "Cauldron") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 15.14f)
                curveToRelative(0f, -3.02f, -1.56f, -5.62f, -2.73f, -7.14f)
                horizontalLineToRelative(1.73f)
                reflectiveCurveToRelative(0f, -2.0f, 0f, -2.0f)
                lineToRelative(-22f, 0.01f)
                verticalLineToRelative(2f)
                reflectiveCurveToRelative(1.72f, 0f, 1.72f, 0f)
                curveToRelative(-1.17f, 1.53f, -2.72f, 4.12f, -2.72f, 7.13f)
                curveToRelative(0f, 2.11f, 1.0f, 4.04f, 2.68f, 5.56f)
                lineToRelative(-1.75f, 1.95f)
                lineToRelative(1.49f, 1.33f)
                lineToRelative(1.86f, -2.08f)
                curveToRelative(2.09f, 1.3f, 4.78f, 2.09f, 7.72f, 2.09f)
                reflectiveCurveToRelative(5.63f, -0.79f, 7.72f, -2.09f)
                lineToRelative(1.87f, 2.09f)
                lineToRelative(1.49f, -1.33f)
                lineToRelative(-1.76f, -1.96f)
                curveToRelative(1.67f, -1.52f, 2.68f, -3.46f, 2.68f, -5.56f)
                close()
                moveTo(7f, 1.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(14f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
            }
        }.also { _Cauldron = it}
