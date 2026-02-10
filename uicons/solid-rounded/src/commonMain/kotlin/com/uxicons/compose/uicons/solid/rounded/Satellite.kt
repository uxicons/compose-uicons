package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Satellite: ImageVector? = null

val Icons.Sr.Satellite: ImageVector
    get() = _Satellite ?: UXIcon(name = "Satellite") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.8f, 14.2f)
                curveToRelative(2.44f, 2.44f, 2.85f, 6.14f, 1.24f, 9.0f)
                curveToRelative(-0.52f, 0.92f, -1.8f, 1.06f, -2.54f, 0.32f)
                lineToRelative(-3.3f, -3.3f)
                lineToRelative(-0.98f, 0.98f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(0.98f, -0.98f)
                lineTo(0.48f, 15.51f)
                curveToRelative(-0.75f, -0.75f, -0.6f, -2.02f, 0.32f, -2.54f)
                curveToRelative(2.87f, -1.61f, 6.56f, -1.2f, 9.0f, 1.24f)
                close()
                moveTo(22.91f, 1.09f)
                curveToRelative(-1.45f, -1.45f, -3.81f, -1.45f, -5.26f, 0f)
                lineToRelative(-9.52f, 9.5f)
                curveToRelative(1.21f, 0.42f, 2.31f, 1.11f, 3.25f, 2.04f)
                curveToRelative(0.92f, 0.92f, 1.6f, 2.02f, 2.03f, 3.21f)
                lineToRelative(9.51f, -9.49f)
                curveToRelative(1.45f, -1.45f, 1.45f, -3.81f, 0f, -5.26f)
                close()
                moveTo(5.66f, 10.24f)
                lineToRelative(6.63f, -6.61f)
                lineToRelative(-1.74f, -1.74f)
                curveToRelative(-1.13f, -1.14f, -3.11f, -1.13f, -4.24f, 0f)
                lineToRelative(-2.38f, 2.38f)
                curveToRelative(-1.17f, 1.17f, -1.17f, 3.07f, 0f, 4.24f)
                lineToRelative(1.74f, 1.74f)
                close()
                moveTo(20.35f, 11.74f)
                lineToRelative(-6.63f, 6.61f)
                lineToRelative(1.8f, 1.8f)
                curveToRelative(0.57f, 0.57f, 1.32f, 0.88f, 2.12f, 0.88f)
                reflectiveCurveToRelative(1.55f, -0.31f, 2.12f, -0.88f)
                lineToRelative(2.38f, -2.38f)
                curveToRelative(0.57f, -0.57f, 0.88f, -1.32f, 0.88f, -2.12f)
                reflectiveCurveToRelative(-0.31f, -1.55f, -0.88f, -2.12f)
                lineToRelative(-1.79f, -1.79f)
                close()
            }
        }.also { _Satellite = it}
