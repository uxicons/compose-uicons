package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlobePointer: ImageVector? = null

val Icons.Ss.GlobePointer: ImageVector
    get() = _GlobePointer ?: UXIcon(name = "GlobePointer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                curveToRelative(0f, 0.31f, 0.02f, 0.61f, 0.05f, 0.92f)
                lineToRelative(1.97f, -0.67f)
                curveToRelative(-0.0f, -0.08f, -0.01f, -0.16f, -0.01f, -0.25f)
                curveToRelative(0f, -1.42f, 0.3f, -2.77f, 0.84f, -4f)
                horizontalLineToRelative(3.36f)
                curveToRelative(-0.32f, 0.96f, -0.56f, 1.97f, -0.65f, 3.04f)
                lineToRelative(2.1f, -0.72f)
                curveToRelative(0.14f, -0.81f, 0.39f, -1.58f, 0.68f, -2.32f)
                horizontalLineToRelative(7.33f)
                curveToRelative(0.49f, 1.24f, 0.83f, 2.59f, 0.83f, 4f)
                reflectiveCurveToRelative(-0.33f, 2.77f, -0.82f, 4f)
                horizontalLineToRelative(-1.87f)
                lineToRelative(-0.68f, 2f)
                horizontalLineToRelative(1.57f)
                curveToRelative(-0.94f, 1.61f, -2.01f, 2.87f, -2.69f, 3.59f)
                curveToRelative(-0.05f, 0.05f, -0.1f, 0.07f, -0.15f, 0.12f)
                lineToRelative(-0.77f, 2.26f)
                curveToRelative(0.3f, 0.02f, 0.61f, 0.04f, 0.92f, 0.04f)
                curveToRelative(6.62f, 0f, 12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(19.98f, 6f)
                horizontalLineToRelative(-3.02f)
                curveToRelative(-0.72f, -1.44f, -1.58f, -2.69f, -2.35f, -3.64f)
                curveToRelative(2.17f, 0.59f, 4.05f, 1.89f, 5.37f, 3.64f)
                close()
                moveTo(4.02f, 6f)
                curveToRelative(1.32f, -1.75f, 3.2f, -3.06f, 5.38f, -3.64f)
                curveToRelative(-0.77f, 0.96f, -1.64f, 2.19f, -2.36f, 3.64f)
                horizontalLineToRelative(-3.02f)
                close()
                moveTo(9.32f, 6f)
                curveToRelative(0.93f, -1.6f, 2.0f, -2.87f, 2.68f, -3.59f)
                curveToRelative(0.68f, 0.72f, 1.76f, 1.98f, 2.69f, 3.59f)
                horizontalLineToRelative(-5.37f)
                close()
                moveTo(14.59f, 21.65f)
                curveToRelative(0.77f, -0.96f, 1.64f, -2.19f, 2.37f, -3.65f)
                horizontalLineToRelative(3.02f)
                curveToRelative(-1.32f, 1.76f, -3.21f, 3.06f, -5.39f, 3.65f)
                close()
                moveTo(21.16f, 16f)
                horizontalLineToRelative(-3.36f)
                curveToRelative(0.42f, -1.25f, 0.7f, -2.59f, 0.7f, -4f)
                reflectiveCurveToRelative(-0.28f, -2.75f, -0.7f, -4f)
                horizontalLineToRelative(3.36f)
                curveToRelative(0.54f, 1.23f, 0.84f, 2.58f, 0.84f, 4f)
                reflectiveCurveToRelative(-0.3f, 2.77f, -0.84f, 4f)
                close()
                moveTo(13.61f, 10.39f)
                lineTo(-0.04f, 15.06f)
                lineToRelative(5.14f, 2.42f)
                lineTo(0.03f, 22.55f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(5.07f, -5.07f)
                lineToRelative(2.42f, 5.14f)
                lineToRelative(4.67f, -13.65f)
                close()
            }
        }.also { _GlobePointer = it}
