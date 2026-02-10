package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BellSchoolSlash: ImageVector? = null

val Icons.Ss.BellSchoolSlash: ImageVector
    get() = _BellSchoolSlash ?: UXIcon(name = "BellSchoolSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 10f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                curveToRelative(0.21f, 0f, 0.42f, -0.02f, 0.62f, -0.07f)
                curveToRelative(-0.45f, 1.8f, -1.32f, 3.43f, -2.48f, 4.8f)
                lineToRelative(-1.42f, -1.42f)
                curveToRelative(0.46f, -0.55f, 0.85f, -1.14f, 1.18f, -1.78f)
                curveToRelative(-1.71f, -0.79f, -2.9f, -2.52f, -2.9f, -4.53f)
                reflectiveCurveToRelative(1.19f, -3.73f, 2.9f, -4.53f)
                curveTo(17.25f, 2.23f, 13.88f, 0f, 10f, 0f)
                curveToRelative(-2.4f, 0f, -4.59f, 0.85f, -6.32f, 2.27f)
                lineTo(1.46f, 0.04f)
                lineTo(0.04f, 1.46f)
                lineToRelative(22.5f, 22.5f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-3.4f, -3.4f)
                curveToRelative(2.13f, -2.46f, 3.44f, -5.64f, 3.44f, -9.14f)
                close()
                moveTo(10f, 7f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                curveToRelative(0f, 0.46f, -0.11f, 0.9f, -0.3f, 1.29f)
                lineToRelative(-3.99f, -3.99f)
                curveToRelative(0.39f, -0.19f, 0.83f, -0.3f, 1.29f, -0.3f)
                close()
                moveTo(16.08f, 20.33f)
                lineToRelative(1.45f, 1.45f)
                curveToRelative(-2.18f, 1.4f, -4.76f, 2.22f, -7.53f, 2.22f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-4.05f)
                curveTo(3.95f, 19.45f, 0f, 15.18f, 0f, 10f)
                curveToRelative(0f, -1.67f, 0.41f, -3.23f, 1.14f, -4.62f)
                lineToRelative(13.47f, 13.47f)
                curveToRelative(-1.1f, 0.57f, -2.32f, 0.94f, -3.61f, 1.07f)
                verticalLineToRelative(2.03f)
                curveToRelative(1.85f, -0.15f, 3.57f, -0.73f, 5.08f, -1.63f)
                close()
            }
        }.also { _BellSchoolSlash = it}
