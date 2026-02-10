package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UnderConstruction: ImageVector? = null

val Icons.Bs.UnderConstruction: ImageVector
    get() = _UnderConstruction ?: UXIcon(name = "UnderConstruction") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.93f, 9.42f)
                lineTo(14.58f, 1.06f)
                curveToRelative(-1.37f, -1.37f, -3.78f, -1.37f, -5.15f, 0f)
                lineTo(1.07f, 9.42f)
                curveToRelative(-0.69f, 0.69f, -1.07f, 1.6f, -1.07f, 2.58f)
                reflectiveCurveToRelative(0.38f, 1.89f, 1.07f, 2.58f)
                lineToRelative(8.36f, 8.36f)
                curveToRelative(0.71f, 0.71f, 1.64f, 1.07f, 2.58f, 1.07f)
                reflectiveCurveToRelative(1.87f, -0.35f, 2.58f, -1.07f)
                lineToRelative(8.36f, -8.36f)
                curveToRelative(1.42f, -1.42f, 1.42f, -3.73f, 0f, -5.15f)
                close()
                moveTo(20.81f, 12.45f)
                lineToRelative(-8.36f, 8.36f)
                curveToRelative(-0.25f, 0.25f, -0.66f, 0.25f, -0.91f, 0f)
                lineTo(3.19f, 12.45f)
                curveToRelative(-0.16f, -0.16f, -0.19f, -0.35f, -0.19f, -0.46f)
                reflectiveCurveToRelative(0.02f, -0.29f, 0.19f, -0.46f)
                lineTo(11.54f, 3.19f)
                horizontalLineToRelative(0f)
                curveToRelative(0.16f, -0.16f, 0.35f, -0.19f, 0.46f, -0.19f)
                reflectiveCurveToRelative(0.29f, 0.02f, 0.46f, 0.19f)
                lineToRelative(8.36f, 8.36f)
                curveToRelative(0.25f, 0.25f, 0.25f, 0.66f, 0f, 0.91f)
                close()
                moveTo(8f, 14f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-2f)
                close()
                moveTo(14.52f, 12f)
                horizontalLineToRelative(-5.04f)
                lineToRelative(1.5f, -5.35f)
                curveToRelative(0.2f, -0.44f, 0.61f, -0.65f, 1.02f, -0.65f)
                reflectiveCurveToRelative(0.82f, 0.22f, 1.02f, 0.65f)
                lineToRelative(1.5f, 5.35f)
                close()
            }
        }.also { _UnderConstruction = it}
