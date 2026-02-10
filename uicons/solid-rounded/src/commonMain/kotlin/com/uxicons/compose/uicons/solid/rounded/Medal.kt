package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Medal: ImageVector? = null

val Icons.Sr.Medal: ImageVector
    get() = _Medal ?: UXIcon(name = "Medal") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.3f, 2.87f)
                lineToRelative(-2.28f, 4.62f)
                curveToRelative(-1.64f, -1.75f, -3.84f, -2.96f, -6.32f, -3.35f)
                lineToRelative(0.94f, -1.92f)
                curveToRelative(0.68f, -1.38f, 2.05f, -2.23f, 3.59f, -2.23f)
                horizontalLineToRelative(2.28f)
                curveToRelative(0.69f, 0f, 1.32f, 0.35f, 1.69f, 0.94f)
                curveToRelative(0.37f, 0.59f, 0.4f, 1.31f, 0.1f, 1.93f)
                close()
                moveTo(10.29f, 4.14f)
                lineToRelative(-0.94f, -1.92f)
                curveToRelative(-0.68f, -1.38f, -2.05f, -2.23f, -3.59f, -2.23f)
                horizontalLineToRelative(-2.26f)
                curveToRelative(-0.69f, 0f, -1.32f, 0.35f, -1.69f, 0.94f)
                curveToRelative(-0.37f, 0.59f, -0.4f, 1.31f, -0.1f, 1.93f)
                lineToRelative(2.27f, 4.61f)
                curveToRelative(1.64f, -1.74f, 3.83f, -2.94f, 6.3f, -3.33f)
                close()
                moveTo(21.0f, 15f)
                curveToRelative(0f, 4.96f, -4.04f, 9f, -9f, 9f)
                reflectiveCurveTo(3f, 19.96f, 3f, 15f)
                reflectiveCurveTo(7.04f, 6f, 12f, 6f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                close()
                moveTo(16.16f, 14.41f)
                curveToRelative(0f, -0.31f, -0.27f, -0.64f, -0.7f, -0.64f)
                horizontalLineToRelative(-2.14f)
                lineToRelative(-0.57f, -2.17f)
                curveToRelative(-0.09f, -0.34f, -0.4f, -0.58f, -0.76f, -0.59f)
                curveToRelative(-0.35f, 0.01f, -0.67f, 0.25f, -0.76f, 0.59f)
                lineToRelative(-0.57f, 2.17f)
                horizontalLineToRelative(-2.14f)
                curveToRelative(-0.43f, 0f, -0.7f, 0.34f, -0.7f, 0.64f)
                curveToRelative(0f, 0.36f, 0.25f, 0.67f, 0.54f, 0.82f)
                lineToRelative(1.49f, 0.83f)
                lineToRelative(-0.66f, 1.8f)
                curveToRelative(-0.13f, 0.35f, -0.01f, 0.74f, 0.28f, 0.96f)
                horizontalLineToRelative(0f)
                curveToRelative(0.3f, 0.23f, 0.72f, 0.23f, 1.02f, -0.01f)
                lineToRelative(1.48f, -1.15f)
                lineToRelative(1.48f, 1.15f)
                curveToRelative(0.3f, 0.23f, 0.72f, 0.23f, 1.02f, 0.01f)
                horizontalLineToRelative(0f)
                curveToRelative(0.3f, -0.22f, 0.41f, -0.61f, 0.28f, -0.96f)
                lineToRelative(-0.66f, -1.8f)
                lineToRelative(1.49f, -0.83f)
                curveToRelative(0.29f, -0.16f, 0.54f, -0.46f, 0.54f, -0.82f)
                close()
            }
        }.also { _Medal = it}
