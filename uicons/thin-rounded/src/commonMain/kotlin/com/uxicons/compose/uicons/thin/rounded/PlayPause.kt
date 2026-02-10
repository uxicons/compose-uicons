package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlayPause: ImageVector? = null

val Icons.Tr.PlayPause: ImageVector
    get() = _PlayPause ?: UXIcon(name = "PlayPause") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 21f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                lineTo(21f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                lineTo(22f, 20.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                close()
                moveTo(17.5f, 21f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                lineTo(17f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                lineTo(18f, 20.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                close()
                moveTo(4.29f, 21.0f)
                curveToRelative(-0.34f, 0f, -0.69f, -0.08f, -1.02f, -0.24f)
                curveToRelative(-0.79f, -0.39f, -1.28f, -1.18f, -1.28f, -2.06f)
                lineTo(2.0f, 5.4f)
                curveToRelative(0f, -0.91f, 0.51f, -1.73f, 1.33f, -2.13f)
                curveToRelative(0.82f, -0.4f, 1.78f, -0.3f, 2.5f, 0.26f)
                lineToRelative(8.02f, 6.21f)
                curveToRelative(0.73f, 0.54f, 1.15f, 1.36f, 1.15f, 2.27f)
                reflectiveCurveToRelative(-0.42f, 1.74f, -1.15f, 2.27f)
                lineToRelative(-8.16f, 6.26f)
                curveToRelative(-0.41f, 0.31f, -0.9f, 0.47f, -1.39f, 0.47f)
                close()
                moveTo(4.38f, 4.02f)
                curveToRelative(-0.21f, 0f, -0.41f, 0.05f, -0.61f, 0.14f)
                curveToRelative(-0.48f, 0.24f, -0.77f, 0.7f, -0.77f, 1.24f)
                verticalLineToRelative(13.31f)
                curveToRelative(0f, 0.5f, 0.27f, 0.94f, 0.72f, 1.16f)
                curveToRelative(0.45f, 0.22f, 0.96f, 0.17f, 1.36f, -0.13f)
                lineToRelative(8.17f, -6.26f)
                curveToRelative(0.48f, -0.35f, 0.75f, -0.89f, 0.75f, -1.47f)
                reflectiveCurveToRelative(-0.27f, -1.12f, -0.74f, -1.46f)
                lineToRelative(-0.01f, -0.01f)
                lineTo(5.22f, 4.31f)
                curveToRelative(-0.25f, -0.19f, -0.54f, -0.29f, -0.84f, -0.29f)
                close()
            }
        }.also { _PlayPause = it}
