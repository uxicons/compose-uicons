package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FlagAlt: ImageVector? = null

val Icons.Tr.FlagAlt: ImageVector
    get() = _FlagAlt ?: UXIcon(name = "FlagAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.73f, 12.64f)
                lineToRelative(-3.6f, -5.14f)
                lineToRelative(3.59f, -5.11f)
                curveToRelative(0.32f, -0.46f, 0.36f, -1.05f, 0.1f, -1.55f)
                curveToRelative(-0.26f, -0.5f, -0.77f, -0.81f, -1.33f, -0.81f)
                lineTo(3.5f, 0.03f)
                curveTo(1.57f, 0.03f, -0.0f, 1.6f, -0.0f, 3.53f)
                lineToRelative(0.0f, 19.97f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                lineTo(1f, 15f)
                lineTo(22.5f, 15f)
                curveToRelative(0.56f, 0f, 1.07f, -0.31f, 1.33f, -0.81f)
                curveToRelative(0.26f, -0.5f, 0.22f, -1.09f, -0.1f, -1.55f)
                close()
                moveTo(22.94f, 13.73f)
                curveToRelative(-0.09f, 0.17f, -0.25f, 0.27f, -0.44f, 0.27f)
                lineTo(1.0f, 14.0f)
                lineToRelative(-0.0f, -10.47f)
                curveTo(1.0f, 2.15f, 2.12f, 1.02f, 3.5f, 1.02f)
                lineTo(22.49f, 1.02f)
                curveToRelative(0.19f, 0f, 0.36f, 0.1f, 0.44f, 0.27f)
                curveToRelative(0.09f, 0.17f, 0.07f, 0.36f, -0.03f, 0.52f)
                lineToRelative(-3.79f, 5.4f)
                curveToRelative(-0.12f, 0.17f, -0.12f, 0.4f, 0f, 0.57f)
                lineToRelative(3.8f, 5.43f)
                curveToRelative(0.11f, 0.16f, 0.12f, 0.35f, 0.03f, 0.52f)
                close()
            }
        }.also { _FlagAlt = it}
