package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LessThanEqual: ImageVector? = null

val Icons.Tr.LessThanEqual: ImageVector
    get() = _LessThanEqual ?: UXIcon(name = "LessThanEqual") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 23.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(3.5f, 24f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(20.7f, 18.04f)
                lineToRelative(-15.51f, -6.83f)
                curveToRelative(-0.73f, -0.3f, -1.21f, -0.98f, -1.19f, -1.7f)
                curveToRelative(0.02f, -0.69f, 0.48f, -1.32f, 1.2f, -1.62f)
                lineTo(20.7f, 0.96f)
                curveToRelative(0.25f, -0.11f, 0.36f, -0.41f, 0.25f, -0.66f)
                curveToRelative(-0.11f, -0.25f, -0.41f, -0.37f, -0.66f, -0.25f)
                lineTo(4.81f, 6.97f)
                curveToRelative(-1.07f, 0.44f, -1.78f, 1.42f, -1.81f, 2.52f)
                curveToRelative(-0.03f, 1.14f, 0.7f, 2.2f, 1.8f, 2.65f)
                lineToRelative(15.5f, 6.82f)
                curveToRelative(0.07f, 0.03f, 0.13f, 0.04f, 0.2f, 0.04f)
                curveToRelative(0.19f, 0f, 0.38f, -0.11f, 0.46f, -0.3f)
                curveToRelative(0.11f, -0.25f, -0.0f, -0.55f, -0.26f, -0.66f)
                close()
            }
        }.also { _LessThanEqual = it}
