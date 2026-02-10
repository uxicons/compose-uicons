package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowLeftFromArc: ImageVector? = null

val Icons.Tr.ArrowLeftFromArc: ImageVector
    get() = _ArrowLeftFromArc ?: UXIcon(name = "ArrowLeftFromArc") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.86f, 18.15f)
                curveToRelative(0.19f, 0.2f, 0.19f, 0.51f, -0.0f, 0.71f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f)
                curveToRelative(-0.13f, 0f, -0.26f, -0.05f, -0.35f, -0.15f)
                lineTo(0.47f, 13.13f)
                curveToRelative(-0.62f, -0.62f, -0.62f, -1.64f, 0.0f, -2.27f)
                lineToRelative(5.68f, -5.72f)
                curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, -0.0f)
                curveToRelative(0.2f, 0.19f, 0.2f, 0.51f, 0.0f, 0.71f)
                lineTo(1.25f, 11.5f)
                horizontalLineToRelative(15.25f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineTo(1.25f)
                lineToRelative(5.61f, 5.65f)
                close()
                moveTo(12.52f, 0.03f)
                curveToRelative(-0.28f, 0f, -0.51f, 0.2f, -0.52f, 0.48f)
                curveToRelative(-0.01f, 0.28f, 0.2f, 0.51f, 0.48f, 0.52f)
                curveToRelative(5.9f, 0.25f, 10.52f, 5.07f, 10.52f, 10.97f)
                reflectiveCurveToRelative(-4.62f, 10.72f, -10.52f, 10.97f)
                curveToRelative(-0.28f, 0.01f, -0.49f, 0.25f, -0.48f, 0.52f)
                curveToRelative(0.01f, 0.27f, 0.23f, 0.48f, 0.5f, 0.48f)
                horizontalLineToRelative(0.02f)
                curveToRelative(6.44f, -0.28f, 11.48f, -5.54f, 11.48f, -11.97f)
                reflectiveCurveTo(18.96f, 0.3f, 12.52f, 0.03f)
                close()
            }
        }.also { _ArrowLeftFromArc = it}
