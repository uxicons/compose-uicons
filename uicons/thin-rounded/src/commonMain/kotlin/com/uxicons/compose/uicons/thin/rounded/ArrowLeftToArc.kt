package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowLeftToArc: ImageVector? = null

val Icons.Tr.ArrowLeftToArc: ImageVector
    get() = _ArrowLeftToArc ?: UXIcon(name = "ArrowLeftToArc") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 12f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-15.25f)
                lineToRelative(5.61f, 5.65f)
                curveToRelative(0.19f, 0.2f, 0.19f, 0.51f, -0.0f, 0.71f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f)
                curveToRelative(-0.13f, 0f, -0.26f, -0.05f, -0.35f, -0.15f)
                lineToRelative(-5.68f, -5.72f)
                curveToRelative(-0.62f, -0.62f, -0.62f, -1.64f, 0.0f, -2.27f)
                lineToRelative(5.68f, -5.72f)
                curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, -0.0f)
                curveToRelative(0.2f, 0.19f, 0.2f, 0.51f, 0.0f, 0.71f)
                lineToRelative(-5.61f, 5.65f)
                horizontalLineToRelative(15.25f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(11.52f, 22.98f)
                curveToRelative(-5.9f, -0.25f, -10.52f, -5.07f, -10.52f, -10.97f)
                reflectiveCurveTo(5.62f, 1.28f, 11.52f, 1.02f)
                curveToRelative(0.28f, -0.01f, 0.49f, -0.25f, 0.48f, -0.52f)
                curveToRelative(-0.01f, -0.28f, -0.25f, -0.48f, -0.52f, -0.48f)
                curveTo(5.04f, 0.3f, 0f, 5.56f, 0f, 12f)
                reflectiveCurveToRelative(5.04f, 11.7f, 11.48f, 11.97f)
                horizontalLineToRelative(0.02f)
                curveToRelative(0.27f, 0f, 0.49f, -0.21f, 0.5f, -0.48f)
                curveToRelative(0.01f, -0.28f, -0.2f, -0.51f, -0.48f, -0.52f)
                close()
            }
        }.also { _ArrowLeftToArc = it}
