package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LandLocation: ImageVector? = null

val Icons.Sr.LandLocation: ImageVector
    get() = _LandLocation ?: UXIcon(name = "LandLocation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.95f, 2.05f)
                curveToRelative(-1.32f, -1.32f, -3.08f, -2.05f, -4.95f, -2.05f)
                reflectiveCurveToRelative(-3.63f, 0.73f, -4.95f, 2.05f)
                curveToRelative(-2.73f, 2.73f, -2.73f, 7.17f, 0.01f, 9.91f)
                lineToRelative(2.5f, 2.44f)
                curveToRelative(0.68f, 0.66f, 1.56f, 0.99f, 2.45f, 0.99f)
                reflectiveCurveToRelative(1.77f, -0.33f, 2.45f, -0.99f)
                lineToRelative(2.5f, -2.45f)
                curveToRelative(1.32f, -1.32f, 2.05f, -3.08f, 2.05f, -4.95f)
                reflectiveCurveToRelative(-0.73f, -3.63f, -2.05f, -4.95f)
                close()
                moveTo(12f, 9.99f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                reflectiveCurveToRelative(-1.34f, 3f, -3f, 3f)
                close()
                moveTo(7.43f, 15.12f)
                lineToRelative(-0.12f, 0.88f)
                lineTo(0.63f, 16f)
                lineToRelative(0.46f, -2.68f)
                curveToRelative(0.25f, -1.44f, 1.23f, -2.58f, 2.52f, -3.07f)
                curveToRelative(0.45f, 1.16f, 1.14f, 2.22f, 2.05f, 3.13f)
                lineToRelative(1.77f, 1.73f)
                close()
                moveTo(0.28f, 18f)
                horizontalLineToRelative(6.75f)
                lineToRelative(-0.83f, 6f)
                horizontalLineToRelative(-2.2f)
                curveToRelative(-1.18f, 0f, -2.29f, -0.52f, -3.05f, -1.42f)
                curveToRelative(-0.76f, -0.9f, -1.09f, -2.08f, -0.89f, -3.24f)
                lineToRelative(0.23f, -1.34f)
                close()
                moveTo(15.15f, 18f)
                lineToRelative(0.83f, 6f)
                horizontalLineToRelative(-7.76f)
                lineToRelative(0.83f, -6f)
                horizontalLineToRelative(6.1f)
                close()
                moveTo(23.37f, 16f)
                horizontalLineToRelative(-6.49f)
                lineToRelative(-0.15f, -1.05f)
                lineToRelative(1.62f, -1.59f)
                curveToRelative(0.9f, -0.9f, 1.58f, -1.95f, 2.03f, -3.1f)
                curveToRelative(1.29f, 0.49f, 2.27f, 1.63f, 2.52f, 3.06f)
                lineToRelative(0.46f, 2.68f)
                close()
                moveTo(23.05f, 22.59f)
                curveToRelative(-0.76f, 0.9f, -1.87f, 1.41f, -3.05f, 1.41f)
                horizontalLineToRelative(-2f)
                lineToRelative(-0.83f, -6f)
                horizontalLineToRelative(6.55f)
                lineToRelative(0.23f, 1.34f)
                curveToRelative(0.19f, 1.17f, -0.13f, 2.35f, -0.89f, 3.25f)
                close()
            }
        }.also { _LandLocation = it}
