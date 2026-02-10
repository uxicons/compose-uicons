package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pi: ImageVector? = null

val Icons.Tr.Pi: ImageVector
    get() = _Pi ?: UXIcon(name = "Pi") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 20.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineTo(1f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(15.11f)
                curveToRelative(0f, 4.77f, -3.03f, 7.63f, -3.16f, 7.75f)
                curveToRelative(-0.1f, 0.09f, -0.22f, 0.13f, -0.34f, 0.13f)
                curveToRelative(-0.13f, 0f, -0.27f, -0.05f, -0.37f, -0.16f)
                curveToRelative(-0.19f, -0.2f, -0.18f, -0.52f, 0.03f, -0.71f)
                curveToRelative(0.03f, -0.03f, 2.84f, -2.71f, 2.84f, -7.02f)
                verticalLineTo(1f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.6f, 0f, -2.84f, 0.44f, -3.7f, 1.3f)
                curveToRelative(-1.29f, 1.3f, -1.3f, 3.17f, -1.3f, 3.19f)
                curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-0.27f, 0f, -0.5f, -0.22f, -0.5f, -0.49f)
                curveToRelative(0f, -0.09f, -0.01f, -2.29f, 1.58f, -3.9f)
                curveTo(2.63f, 0.54f, 4.12f, 0f, 6f, 0f)
                horizontalLineToRelative(17.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(19.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                close()
            }
        }.also { _Pi = it}
