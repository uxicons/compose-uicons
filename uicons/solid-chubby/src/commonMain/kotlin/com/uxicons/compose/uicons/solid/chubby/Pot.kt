package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pot: ImageVector? = null

val Icons.Sc.Pot: ImageVector
    get() = _Pot ?: UXIcon(name = "Pot") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.79f, 11.15f)
                curveToRelative(-0.03f, -0.01f, -4.16f, -0.84f, -8.79f, -0.84f)
                reflectiveCurveToRelative(-8.76f, 0.83f, -8.8f, 0.84f)
                curveToRelative(-0.18f, 0.04f, -0.36f, 0.06f, -0.55f, 0.07f)
                lineToRelative(-0.07f, 9.37f)
                curveToRelative(-0.0f, 0.46f, 0.3f, 0.86f, 0.74f, 0.97f)
                curveToRelative(0.17f, 0.04f, 4.12f, 1.08f, 8.68f, 1.08f)
                reflectiveCurveToRelative(8.51f, -1.03f, 8.68f, -1.08f)
                curveToRelative(0.44f, -0.12f, 0.75f, -0.52f, 0.74f, -0.97f)
                lineToRelative(-0.07f, -9.37f)
                curveToRelative(-0.19f, -0.01f, -0.38f, -0.03f, -0.56f, -0.07f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.8f, 6.25f)
                curveToRelative(-0.17f, -0.03f, -3.78f, -0.77f, -8.3f, -0.92f)
                verticalLineToRelative(-0.98f)
                horizontalLineToRelative(0.86f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-4.72f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.86f)
                verticalLineToRelative(0.98f)
                curveToRelative(-4.52f, 0.14f, -8.14f, 0.88f, -8.3f, 0.92f)
                curveToRelative(-0.81f, 0.17f, -1.33f, 0.96f, -1.17f, 1.77f)
                curveToRelative(0.15f, 0.71f, 0.77f, 1.2f, 1.47f, 1.2f)
                curveToRelative(0.1f, 0f, 0.2f, -0.01f, 0.31f, -0.03f)
                curveToRelative(0.04f, -0.01f, 4.3f, -0.88f, 9.2f, -0.88f)
                reflectiveCurveToRelative(9.15f, 0.87f, 9.2f, 0.88f)
                curveToRelative(0.81f, 0.17f, 1.6f, -0.35f, 1.77f, -1.17f)
                curveToRelative(0.17f, -0.81f, -0.35f, -1.6f, -1.17f, -1.77f)
                close()
            }
        }.also { _Pot = it}
