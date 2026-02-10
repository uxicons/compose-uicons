package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BottleDroplet: ImageVector? = null

val Icons.Tr.BottleDroplet: ImageVector
    get() = _BottleDroplet ?: UXIcon(name = "BottleDroplet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.31f, 8.91f)
                lineToRelative(-3.31f, -2.65f)
                lineTo(15f, 1f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-7f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(5.26f)
                lineToRelative(-3.31f, 2.65f)
                curveToRelative(-1.07f, 0.86f, -1.69f, 2.14f, -1.69f, 3.52f)
                verticalLineToRelative(7.08f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(7f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-7.08f)
                curveToRelative(0f, -1.37f, -0.61f, -2.65f, -1.69f, -3.52f)
                close()
                moveTo(19f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-7f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-7.08f)
                curveToRelative(0f, -1.07f, 0.48f, -2.06f, 1.31f, -2.73f)
                lineToRelative(3.5f, -2.8f)
                curveToRelative(0.12f, -0.1f, 0.19f, -0.24f, 0.19f, -0.39f)
                lineTo(10f, 1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 0.15f, 0.07f, 0.3f, 0.19f, 0.39f)
                lineToRelative(3.5f, 2.8f)
                curveToRelative(0.83f, 0.67f, 1.31f, 1.67f, 1.31f, 2.73f)
                verticalLineToRelative(7.08f)
                close()
                moveTo(11.0f, 12.44f)
                curveToRelative(-0.81f, 0.89f, -2.0f, 2.79f, -2.0f, 4.06f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                curveToRelative(0f, -1.27f, -1.19f, -3.17f, -2.0f, -4.06f)
                curveToRelative(-0.51f, -0.56f, -1.49f, -0.56f, -2.0f, 0f)
                close()
                moveTo(12f, 18.5f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                curveToRelative(0f, -0.92f, 1.01f, -2.59f, 1.74f, -3.39f)
                curveToRelative(0.09f, -0.1f, 0.2f, -0.11f, 0.26f, -0.11f)
                reflectiveCurveToRelative(0.17f, 0.01f, 0.26f, 0.11f)
                curveToRelative(0.73f, 0.8f, 1.74f, 2.47f, 1.74f, 3.39f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                close()
            }
        }.also { _BottleDroplet = it}
