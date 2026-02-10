package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseSignal: ImageVector? = null

val Icons.Tr.HouseSignal: ImageVector
    get() = _HouseSignal ?: UXIcon(name = "HouseSignal") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2f, 23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(0.54f, 17.02f)
                curveToRelative(-0.25f, -0.02f, -0.52f, 0.18f, -0.54f, 0.46f)
                curveToRelative(-0.02f, 0.28f, 0.19f, 0.52f, 0.46f, 0.54f)
                curveToRelative(2.92f, 0.22f, 5.3f, 2.6f, 5.52f, 5.52f)
                curveToRelative(0.02f, 0.26f, 0.24f, 0.46f, 0.5f, 0.46f)
                curveToRelative(0.01f, 0f, 0.03f, 0f, 0.04f, 0f)
                curveToRelative(0.28f, -0.02f, 0.48f, -0.26f, 0.46f, -0.54f)
                curveToRelative(-0.26f, -3.41f, -3.03f, -6.18f, -6.44f, -6.44f)
                close()
                moveTo(0.52f, 12.01f)
                curveToRelative(-0.32f, -0.0f, -0.51f, 0.2f, -0.52f, 0.48f)
                curveToRelative(-0.01f, 0.28f, 0.2f, 0.51f, 0.48f, 0.52f)
                curveToRelative(5.65f, 0.24f, 10.27f, 4.86f, 10.51f, 10.51f)
                curveToRelative(0.01f, 0.27f, 0.23f, 0.48f, 0.5f, 0.48f)
                horizontalLineToRelative(0.02f)
                curveToRelative(0.28f, -0.01f, 0.49f, -0.24f, 0.48f, -0.52f)
                curveToRelative(-0.27f, -6.17f, -5.3f, -11.2f, -11.47f, -11.47f)
                close()
                moveTo(22.17f, 3.99f)
                lineToRelative(-4.86f, -3.28f)
                curveToRelative(-1.41f, -0.95f, -3.23f, -0.95f, -4.63f, 0f)
                lineToRelative(-4.86f, 3.28f)
                curveToRelative(-1.14f, 0.77f, -1.83f, 2.06f, -1.83f, 3.43f)
                verticalLineToRelative(3.08f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-3.08f)
                curveToRelative(0f, -1.05f, 0.52f, -2.02f, 1.39f, -2.6f)
                lineToRelative(4.86f, -3.28f)
                curveToRelative(1.07f, -0.72f, 2.45f, -0.72f, 3.52f, 0f)
                lineToRelative(4.86f, 3.28f)
                curveToRelative(0.87f, 0.59f, 1.39f, 1.56f, 1.39f, 2.6f)
                verticalLineToRelative(6.84f)
                curveToRelative(0f, 1.51f, -1.23f, 2.74f, -2.74f, 2.74f)
                horizontalLineToRelative(-6.76f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(6.76f)
                curveToRelative(2.06f, 0f, 3.74f, -1.68f, 3.74f, -3.74f)
                verticalLineToRelative(-6.84f)
                curveToRelative(0f, -1.38f, -0.68f, -2.66f, -1.83f, -3.43f)
                close()
                moveTo(14f, 13f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(2f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(14f, 12f)
                horizontalLineToRelative(2f)
                curveToRelative(0.28f, 0f, 0.5f, -0.23f, 0.5f, -0.5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.28f, 0.23f, 0.5f, 0.5f, 0.5f)
                close()
            }
        }.also { _HouseSignal = it}
