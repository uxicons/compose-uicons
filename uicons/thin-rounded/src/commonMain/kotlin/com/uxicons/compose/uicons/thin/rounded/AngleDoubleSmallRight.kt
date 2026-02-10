package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleDoubleSmallRight: ImageVector? = null

val Icons.Tr.AngleDoubleSmallRight: ImageVector
    get() = _AngleDoubleSmallRight ?: UXIcon(name = "AngleDoubleSmallRight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 12f)
                curveToRelative(0f, 0.92f, -0.36f, 1.78f, -1.0f, 2.42f)
                lineToRelative(-4.13f, 4.42f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.16f, -0.36f, 0.16f)
                curveToRelative(-0.12f, 0f, -0.24f, -0.04f, -0.34f, -0.14f)
                curveToRelative(-0.2f, -0.19f, -0.21f, -0.51f, -0.02f, -0.71f)
                lineToRelative(4.14f, -4.43f)
                curveToRelative(0.47f, -0.47f, 0.72f, -1.08f, 0.72f, -1.73f)
                reflectiveCurveToRelative(-0.25f, -1.26f, -0.71f, -1.72f)
                lineToRelative(-4.15f, -4.44f)
                curveToRelative(-0.19f, -0.2f, -0.18f, -0.52f, 0.02f, -0.71f)
                curveToRelative(0.2f, -0.19f, 0.52f, -0.18f, 0.71f, 0.02f)
                lineToRelative(4.14f, 4.43f)
                curveToRelative(0.64f, 0.64f, 0.99f, 1.5f, 0.99f, 2.41f)
                close()
                moveTo(12.87f, 11.66f)
                lineToRelative(-6f, -6.5f)
                curveToRelative(-0.19f, -0.2f, -0.5f, -0.21f, -0.71f, -0.03f)
                curveToRelative(-0.2f, 0.19f, -0.21f, 0.5f, -0.03f, 0.71f)
                lineToRelative(5.69f, 6.16f)
                lineToRelative(-5.69f, 6.16f)
                curveToRelative(-0.19f, 0.2f, -0.17f, 0.52f, 0.03f, 0.71f)
                curveToRelative(0.1f, 0.09f, 0.22f, 0.13f, 0.34f, 0.13f)
                curveToRelative(0.14f, 0f, 0.27f, -0.05f, 0.37f, -0.16f)
                lineToRelative(6f, -6.5f)
                curveToRelative(0.18f, -0.19f, 0.18f, -0.49f, 0f, -0.68f)
                close()
            }
        }.also { _AngleDoubleSmallRight = it}
