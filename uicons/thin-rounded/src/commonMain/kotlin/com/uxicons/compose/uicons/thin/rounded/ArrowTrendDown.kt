package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowTrendDown: ImageVector? = null

val Icons.Tr.ArrowTrendDown: ImageVector
    get() = _ArrowTrendDown ?: UXIcon(name = "ArrowTrendDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.5f, 9f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.23f, -0.05f, 0.45f, -0.15f, 0.65f)
                lineTo(14.23f, 7.52f)
                curveToRelative(-0.68f, -0.68f, -1.77f, -0.68f, -2.45f, 0f)
                lineToRelative(-4.29f, 4.29f)
                curveToRelative(-0.26f, 0.26f, -0.69f, 0.26f, -0.96f, 0f)
                lineTo(0.85f, 6.15f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                reflectiveCurveToRelative(-0.2f, 0.51f, 0f, 0.71f)
                lineToRelative(5.67f, 5.67f)
                curveToRelative(0.65f, 0.65f, 1.72f, 0.65f, 2.37f, 0f)
                lineToRelative(4.29f, -4.29f)
                curveToRelative(0.28f, -0.28f, 0.75f, -0.28f, 1.04f, 0f)
                lineToRelative(8.63f, 8.63f)
                curveToRelative(-0.2f, 0.09f, -0.41f, 0.15f, -0.65f, 0.15f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(6f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                close()
            }
        }.also { _ArrowTrendDown = it}
