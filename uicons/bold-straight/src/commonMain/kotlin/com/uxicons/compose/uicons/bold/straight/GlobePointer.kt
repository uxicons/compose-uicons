package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlobePointer: ImageVector? = null

val Icons.Bs.GlobePointer: ImageVector
    get() = _GlobePointer ?: UXIcon(name = "GlobePointer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                curveToRelative(0f, 0.44f, 0.03f, 0.88f, 0.07f, 1.31f)
                lineToRelative(2.94f, -1.01f)
                curveToRelative(-0.0f, -0.1f, -0.01f, -0.2f, -0.01f, -0.3f)
                curveToRelative(0f, -3.85f, 2.43f, -7.13f, 5.83f, -8.41f)
                curveToRelative(-1.03f, 1.9f, -2.11f, 4.53f, -2.3f, 7.51f)
                lineToRelative(3.13f, -1.07f)
                curveToRelative(0.41f, -2.45f, 1.48f, -4.56f, 2.33f, -5.93f)
                curveToRelative(1.07f, 1.72f, 2.5f, 4.63f, 2.5f, 7.9f)
                lineToRelative(-0.06f, 0.98f)
                curveToRelative(-0.23f, 2.71f, -1.34f, 5.11f, -2.28f, 6.66f)
                lineToRelative(-1.47f, 4.28f)
                curveToRelative(0.43f, 0.05f, 0.86f, 0.07f, 1.31f, 0.07f)
                curveToRelative(6.62f, 0f, 12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(20.86f, 10.5f)
                horizontalLineToRelative(-3.44f)
                curveToRelative(-0.28f, -2.73f, -1.28f, -5.14f, -2.25f, -6.91f)
                curveToRelative(2.95f, 1.12f, 5.15f, 3.73f, 5.69f, 6.91f)
                close()
                moveTo(15.17f, 20.41f)
                curveToRelative(0.96f, -1.77f, 1.96f, -4.18f, 2.24f, -6.91f)
                horizontalLineToRelative(3.45f)
                curveToRelative(-0.54f, 3.18f, -2.75f, 5.8f, -5.69f, 6.91f)
                close()
                moveTo(8.55f, 24f)
                lineToRelative(-2.06f, -4.37f)
                lineToRelative(-4.29f, 4.29f)
                lineTo(0.09f, 21.79f)
                lineToRelative(4.29f, -4.29f)
                lineTo(0f, 15.45f)
                lineToRelative(13f, -4.45f)
                lineToRelative(-4.45f, 13f)
                close()
            }
        }.also { _GlobePointer = it}
