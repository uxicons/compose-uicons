package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BloodTestTube: ImageVector? = null

val Icons.Sc.BloodTestTube: ImageVector
    get() = _BloodTestTube ?: UXIcon(name = "BloodTestTube") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 21f)
                curveToRelative(-3.41f, 0f, -5f, -1.59f, -5f, -5f)
                curveToRelative(0f, -3.25f, 3.93f, -6.43f, 4.38f, -6.79f)
                curveToRelative(0.36f, -0.28f, 0.87f, -0.28f, 1.24f, 0f)
                curveToRelative(0.45f, 0.35f, 4.38f, 3.54f, 4.38f, 6.79f)
                curveToRelative(0f, 3.41f, -1.59f, 5f, -5f, 5f)
                close()
                moveTo(2.78f, 2.98f)
                curveToRelative(0.01f, 0.0f, 0.11f, 0.02f, 0.24f, 0.05f)
                lineToRelative(-0.02f, 3.98f)
                horizontalLineToRelative(10.01f)
                lineToRelative(-0.02f, -3.98f)
                curveToRelative(0.12f, -0.03f, 0.22f, -0.04f, 0.23f, -0.05f)
                curveToRelative(0.54f, -0.12f, 0.88f, -0.66f, 0.75f, -1.2f)
                reflectiveCurveToRelative(-0.65f, -0.87f, -1.2f, -0.76f)
                curveToRelative(-0.02f, 0.0f, -1.94f, 0.43f, -4.78f, 0.43f)
                reflectiveCurveToRelative(-4.76f, -0.43f, -4.78f, -0.43f)
                curveToRelative(-0.54f, -0.12f, -1.07f, 0.22f, -1.2f, 0.76f)
                curveToRelative(-0.12f, 0.54f, 0.21f, 1.07f, 0.75f, 1.2f)
                close()
                moveTo(10f, 16f)
                curveToRelative(0f, -2.48f, 1.56f, -4.76f, 2.98f, -6.33f)
                curveToRelative(0.0f, -0.22f, 0.01f, -0.44f, 0.01f, -0.67f)
                horizontalLineToRelative(-9.98f)
                curveToRelative(0.07f, 5.92f, 0.44f, 9.45f, 0.57f, 10.46f)
                curveToRelative(0.26f, 2.14f, 1.95f, 3.5f, 4.41f, 3.54f)
                horizontalLineToRelative(0.02f)
                horizontalLineToRelative(0.04f)
                curveToRelative(1.7f, -0.04f, 3.01f, -0.71f, 3.75f, -1.82f)
                curveToRelative(-1.18f, -1.19f, -1.79f, -2.93f, -1.79f, -5.17f)
                close()
            }
        }.also { _BloodTestTube = it}
