package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PeoplePulling: ImageVector? = null

val Icons.Ss.PeoplePulling: ImageVector
    get() = _PeoplePulling ?: UXIcon(name = "PeoplePulling") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(2.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveTo(3.88f, 0f, 2.5f, 0f)
                reflectiveCurveTo(0f, 1.12f, 0f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(17.4f, 15.37f)
                lineToRelative(0.95f, -3.75f)
                lineToRelative(4.72f, 2.55f)
                lineToRelative(0.95f, -1.76f)
                lineToRelative(-5.16f, -2.8f)
                curveToRelative(0.22f, -0.87f, 0.03f, -1.78f, -0.52f, -2.5f)
                curveToRelative(-0.55f, -0.71f, -1.4f, -1.13f, -2.3f, -1.14f)
                curveToRelative(-0.68f, 0f, -1.52f, 0.4f, -2.46f, 0.99f)
                curveToRelative(-0.16f, 0.1f, -3.85f, 2.25f, -3.85f, 2.25f)
                lineTo(3.82f, 6.38f)
                curveToRelative(-0.39f, -0.24f, -0.83f, -0.38f, -1.31f, -0.38f)
                curveToRelative(-0.77f, 0f, -1.48f, 0.34f, -1.96f, 0.94f)
                reflectiveCurveTo(-0.11f, 8.32f, 0.06f, 9.07f)
                lineToRelative(2.07f, 8.76f)
                lineToRelative(1.83f, -0.45f)
                lineToRelative(1.6f, 6.61f)
                horizontalLineToRelative(2.06f)
                lineToRelative(-1.72f, -7.09f)
                lineToRelative(1.24f, -0.31f)
                lineToRelative(-1.87f, -7.36f)
                lineToRelative(4.61f, 2.25f)
                lineToRelative(4.04f, -2.27f)
                lineToRelative(-0.86f, 3.53f)
                curveToRelative(-0.3f, 1.29f, 0.29f, 2.64f, 1.44f, 3.29f)
                lineToRelative(4.74f, 2.69f)
                lineToRelative(2.86f, 5.25f)
                lineToRelative(1.76f, -0.96f)
                lineToRelative(-3.14f, -5.75f)
                lineToRelative(-3.34f, -1.9f)
                close()
                moveTo(13.02f, 17.13f)
                lineToRelative(-2.14f, 6.87f)
                horizontalLineToRelative(2.2f)
                lineToRelative(1.72f, -5.77f)
                lineToRelative(-1.03f, -0.58f)
                curveToRelative(-0.26f, -0.15f, -0.51f, -0.32f, -0.75f, -0.51f)
                close()
            }
        }.also { _PeoplePulling = it}
