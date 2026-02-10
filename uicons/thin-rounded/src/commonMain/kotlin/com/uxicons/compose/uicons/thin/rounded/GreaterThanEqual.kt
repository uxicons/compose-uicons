package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GreaterThanEqual: ImageVector? = null

val Icons.Tr.GreaterThanEqual: ImageVector
    get() = _GreaterThanEqual ?: UXIcon(name = "GreaterThanEqual") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 23.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(3.5f, 24f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(18.8f, 11.22f)
                lineToRelative(-15.5f, 6.82f)
                curveToRelative(-0.25f, 0.11f, -0.37f, 0.41f, -0.26f, 0.66f)
                curveToRelative(0.08f, 0.19f, 0.27f, 0.3f, 0.46f, 0.3f)
                curveToRelative(0.07f, 0f, 0.14f, -0.01f, 0.2f, -0.04f)
                lineToRelative(15.49f, -6.82f)
                curveToRelative(1.11f, -0.45f, 1.84f, -1.52f, 1.81f, -2.65f)
                curveToRelative(-0.03f, -1.09f, -0.74f, -2.08f, -1.79f, -2.51f)
                lineTo(3.7f, 0.04f)
                curveToRelative(-0.25f, -0.11f, -0.55f, 0f, -0.66f, 0.25f)
                curveToRelative(-0.11f, 0.25f, 0f, 0.55f, 0.25f, 0.66f)
                lineToRelative(15.52f, 6.94f)
                curveToRelative(0.7f, 0.29f, 1.17f, 0.92f, 1.19f, 1.61f)
                curveToRelative(0.02f, 0.72f, -0.46f, 1.41f, -1.2f, 1.71f)
                close()
            }
        }.also { _GreaterThanEqual = it}
