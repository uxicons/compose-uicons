package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandHorns: ImageVector? = null

val Icons.Sr.HandHorns: ImageVector
    get() = _HandHorns ?: UXIcon(name = "HandHorns") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.5f, 15f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(0f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(13f, 13.5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(20.25f, 1.02f)
                curveToRelative(-0.74f, 0.12f, -1.25f, 0.81f, -1.25f, 1.56f)
                lineTo(19f, 13.32f)
                curveToRelative(0f, 1.9f, -1.44f, 3.59f, -3.34f, 3.67f)
                curveToRelative(-0.8f, 0.04f, -1.55f, -0.2f, -2.16f, -0.63f)
                curveToRelative(-0.57f, 0.4f, -1.26f, 0.63f, -2f, 0.63f)
                curveToRelative(-0.83f, 0f, -1.58f, -0.29f, -2.18f, -0.77f)
                curveToRelative(-0.02f, 0.02f, -1.82f, 1.83f, -2.44f, 2.44f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(2.33f, -2.33f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                curveToRelative(0.86f, -0.86f, 0.77f, -2.3f, -0.26f, -3.05f)
                curveToRelative(-0.81f, -0.58f, -1.94f, -0.41f, -2.65f, 0.29f)
                lineToRelative(-2.69f, 2.69f)
                curveToRelative(-1.6f, 1.6f, -1.6f, 4.19f, 0f, 5.79f)
                lineToRelative(1.59f, 1.59f)
                curveToRelative(1.13f, 1.13f, 2.65f, 1.76f, 4.24f, 1.76f)
                horizontalLineToRelative(8.97f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(22f, 2.5f)
                curveToRelative(0f, -0.91f, -0.81f, -1.63f, -1.75f, -1.48f)
                close()
                moveTo(8f, 9.86f)
                lineTo(8f, 1.58f)
                curveTo(8f, 0.83f, 7.49f, 0.14f, 6.75f, 0.02f)
                curveToRelative(-0.94f, -0.15f, -1.75f, 0.57f, -1.75f, 1.48f)
                lineTo(5f, 9.76f)
                curveToRelative(0.97f, -0.36f, 2.05f, -0.32f, 3f, 0.09f)
                close()
            }
        }.also { _HandHorns = it}
