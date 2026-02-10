package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiplomaAlt: ImageVector? = null

val Icons.Sr.DiplomaAlt: ImageVector
    get() = _DiplomaAlt ?: UXIcon(name = "DiplomaAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.33f, 9f)
                horizontalLineToRelative(-0.33f)
                verticalLineToRelative(13.52f)
                curveToRelative(0f, 0.34f, -0.4f, 0.51f, -0.65f, 0.28f)
                lineToRelative(-1.35f, -1.3f)
                lineToRelative(-1.35f, 1.3f)
                curveToRelative(-0.24f, 0.23f, -0.65f, 0.06f, -0.65f, -0.28f)
                verticalLineToRelative(-13.52f)
                horizontalLineToRelative(-0.33f)
                curveToRelative(-2.92f, 0f, -4.67f, -1.17f, -4.67f, -3.62f)
                curveToRelative(0.0f, -1.94f, 1.66f, -3.45f, 3.56f, -3.38f)
                reflectiveCurveToRelative(3.21f, 1.56f, 3.44f, 3.54f)
                curveToRelative(0.23f, -1.98f, 1.54f, -3.47f, 3.44f, -3.54f)
                curveToRelative(1.9f, -0.07f, 3.56f, 1.45f, 3.56f, 3.38f)
                curveToRelative(0.0f, 2.45f, -1.75f, 3.62f, -4.67f, 3.62f)
                close()
                moveTo(3.44f, 8.09f)
                curveToRelative(-1.69f, -0.47f, -3.49f, 0.94f, -3.45f, 2.7f)
                verticalLineToRelative(4.44f)
                curveToRelative(-0.05f, 1.75f, 1.76f, 3.17f, 3.45f, 2.7f)
                curveToRelative(1.34f, -0.34f, 2.9f, -0.73f, 4.55f, -0.99f)
                lineToRelative(-0.07f, -8.07f)
                curveToRelative(-1.73f, -0.29f, -3.35f, -0.48f, -4.49f, -0.76f)
                close()
                moveTo(22.93f, 8.59f)
                curveToRelative(-0.68f, -0.53f, -1.54f, -0.71f, -2.38f, -0.5f)
                curveToRelative(-1.14f, 0.28f, -2.89f, 0.47f, -4.62f, 0.76f)
                lineToRelative(0.07f, 8.07f)
                curveToRelative(1.95f, 0.26f, 3.54f, 0.87f, 5.23f, 1.08f)
                curveToRelative(1.48f, 0.03f, 2.8f, -1.29f, 2.77f, -2.78f)
                verticalLineToRelative(-4.44f)
                curveToRelative(0f, -0.86f, -0.39f, -1.66f, -1.07f, -2.19f)
                close()
            }
        }.also { _DiplomaAlt = it}
