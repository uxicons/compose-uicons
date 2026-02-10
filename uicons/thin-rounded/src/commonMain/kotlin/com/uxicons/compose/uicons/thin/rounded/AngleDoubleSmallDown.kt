package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleDoubleSmallDown: ImageVector? = null

val Icons.Tr.AngleDoubleSmallDown: ImageVector
    get() = _AngleDoubleSmallDown ?: UXIcon(name = "AngleDoubleSmallDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 18f)
                curveToRelative(-0.92f, 0f, -1.78f, -0.36f, -2.42f, -1.0f)
                lineToRelative(-4.42f, -4.13f)
                curveToRelative(-0.2f, -0.19f, -0.21f, -0.51f, -0.02f, -0.71f)
                curveToRelative(0.19f, -0.2f, 0.51f, -0.21f, 0.71f, -0.02f)
                lineToRelative(4.43f, 4.14f)
                curveToRelative(0.94f, 0.94f, 2.53f, 0.93f, 3.45f, 0.01f)
                lineToRelative(4.44f, -4.15f)
                curveToRelative(0.2f, -0.19f, 0.52f, -0.18f, 0.71f, 0.02f)
                curveToRelative(0.19f, 0.2f, 0.18f, 0.52f, -0.02f, 0.71f)
                lineToRelative(-4.43f, 4.14f)
                curveToRelative(-0.64f, 0.64f, -1.5f, 0.99f, -2.41f, 0.99f)
                close()
                moveTo(12.34f, 12.87f)
                lineToRelative(6.5f, -6f)
                curveToRelative(0.2f, -0.19f, 0.22f, -0.5f, 0.03f, -0.71f)
                curveToRelative(-0.19f, -0.2f, -0.5f, -0.21f, -0.71f, -0.03f)
                lineToRelative(-6.16f, 5.69f)
                lineTo(5.84f, 6.13f)
                curveToRelative(-0.2f, -0.19f, -0.52f, -0.17f, -0.71f, 0.03f)
                curveToRelative(-0.19f, 0.2f, -0.17f, 0.52f, 0.03f, 0.71f)
                lineToRelative(6.5f, 6f)
                curveToRelative(0.1f, 0.09f, 0.22f, 0.13f, 0.34f, 0.13f)
                reflectiveCurveToRelative(0.24f, -0.04f, 0.34f, -0.13f)
                close()
            }
        }.also { _AngleDoubleSmallDown = it}
