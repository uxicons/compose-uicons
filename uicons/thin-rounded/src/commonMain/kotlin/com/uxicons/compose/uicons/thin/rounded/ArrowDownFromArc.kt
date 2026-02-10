package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowDownFromArc: ImageVector? = null

val Icons.Tr.ArrowDownFromArc: ImageVector
    get() = _ArrowDownFromArc ?: UXIcon(name = "ArrowDownFromArc") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.85f, 17.15f)
                curveToRelative(0.2f, 0.2f, 0.19f, 0.51f, -0.0f, 0.71f)
                lineToRelative(-5.72f, 5.68f)
                curveToRelative(-0.31f, 0.31f, -0.72f, 0.47f, -1.13f, 0.47f)
                reflectiveCurveToRelative(-0.82f, -0.16f, -1.13f, -0.47f)
                lineToRelative(-5.72f, -5.68f)
                curveToRelative(-0.2f, -0.19f, -0.2f, -0.51f, -0.0f, -0.71f)
                curveToRelative(0.19f, -0.2f, 0.51f, -0.2f, 0.71f, -0.0f)
                lineToRelative(5.65f, 5.6f)
                verticalLineTo(7.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(15.25f)
                lineToRelative(5.65f, -5.6f)
                curveToRelative(0.2f, -0.2f, 0.51f, -0.19f, 0.71f, 0.0f)
                close()
                moveTo(12f, 0f)
                curveTo(5.55f, 0f, 0.29f, 5.04f, 0.01f, 11.48f)
                curveToRelative(-0.01f, 0.28f, 0.2f, 0.51f, 0.48f, 0.52f)
                curveToRelative(0.3f, 0.02f, 0.51f, -0.2f, 0.52f, -0.48f)
                curveTo(1.26f, 5.62f, 6.09f, 1f, 12f, 1f)
                reflectiveCurveToRelative(10.74f, 4.62f, 10.99f, 10.52f)
                curveToRelative(0.01f, 0.27f, 0.23f, 0.48f, 0.5f, 0.48f)
                curveToRelative(0.01f, 0f, 0.01f, 0f, 0.02f, 0f)
                curveToRelative(0.28f, -0.01f, 0.49f, -0.24f, 0.48f, -0.52f)
                curveToRelative(-0.28f, -6.44f, -5.54f, -11.48f, -11.99f, -11.48f)
                close()
            }
        }.also { _ArrowDownFromArc = it}
