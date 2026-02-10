package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LevelDownAlt: ImageVector? = null

val Icons.Tr.LevelDownAlt: ImageVector
    get() = _LevelDownAlt ?: UXIcon(name = "LevelDownAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.89f, 16.87f)
                curveToRelative(-0.23f, -0.54f, -0.72f, -0.87f, -1.3f, -0.87f)
                horizontalLineToRelative(-4.59f)
                lineTo(13f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                lineTo(0.5f, 0f)
                curveTo(0.22f, 0f, 0f, 0.22f, 0f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                lineTo(8.5f, 1f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(11.5f)
                lineTo(7.41f, 16f)
                curveToRelative(-0.58f, 0f, -1.07f, 0.33f, -1.3f, 0.87f)
                curveToRelative(-0.22f, 0.53f, -0.11f, 1.15f, 0.3f, 1.56f)
                lineToRelative(5.09f, 5.15f)
                curveToRelative(0.27f, 0.27f, 0.62f, 0.42f, 1.0f, 0.42f)
                reflectiveCurveToRelative(0.73f, -0.15f, 1.0f, -0.42f)
                lineToRelative(5.09f, -5.15f)
                curveToRelative(0.41f, -0.41f, 0.52f, -1.02f, 0.3f, -1.56f)
                close()
                moveTo(17.88f, 17.72f)
                lineToRelative(-5.09f, 5.15f)
                curveToRelative(-0.16f, 0.16f, -0.42f, 0.16f, -0.58f, 0f)
                lineToRelative(-5.09f, -5.15f)
                curveToRelative(-0.18f, -0.19f, -0.11f, -0.41f, -0.09f, -0.47f)
                curveToRelative(0.03f, -0.08f, 0.13f, -0.26f, 0.38f, -0.26f)
                horizontalLineToRelative(10.17f)
                curveToRelative(0.24f, 0f, 0.35f, 0.18f, 0.38f, 0.26f)
                curveToRelative(0.03f, 0.06f, 0.1f, 0.28f, -0.09f, 0.47f)
                close()
            }
        }.also { _LevelDownAlt = it}
