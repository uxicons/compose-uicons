package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TextSlash: ImageVector? = null

val Icons.Rc.TextSlash: ImageVector
    get() = _TextSlash ?: UXIcon(name = "TextSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.71f, 21.29f)
                lineToRelative(-9.71f, -9.71f)
                verticalLineToRelative(-7.57f)
                curveToRelative(3.52f, 0.07f, 5.86f, 0.49f, 6.96f, 0.74f)
                curveToRelative(-0.08f, 0.88f, -0.29f, 2.38f, -0.89f, 3.87f)
                curveToRelative(-0.2f, 0.51f, 0.04f, 1.09f, 0.56f, 1.3f)
                curveToRelative(0.5f, 0.2f, 1.09f, -0.04f, 1.3f, -0.56f)
                curveToRelative(1.06f, -2.65f, 1.07f, -5.26f, 1.07f, -5.37f)
                curveToRelative(0f, -0.43f, -0.28f, -0.81f, -0.68f, -0.95f)
                curveToRelative(-0.13f, -0.04f, -3.22f, -1.05f, -9.32f, -1.05f)
                curveToRelative(-3.85f, 0f, -6.5f, 0.41f, -7.89f, 0.7f)
                lineToRelative(-1.4f, -1.4f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(20.0f, 20.0f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                close()
                moveTo(11f, 4.01f)
                verticalLineToRelative(5.57f)
                lineToRelative(-5.16f, -5.16f)
                curveToRelative(1.24f, -0.19f, 2.97f, -0.36f, 5.16f, -0.41f)
                close()
                moveTo(13f, 17f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(4.93f, 8.63f)
                curveToRelative(0.21f, 0.51f, -0.04f, 1.09f, -0.56f, 1.3f)
                curveToRelative(-0.5f, 0.2f, -1.09f, -0.04f, -1.3f, -0.56f)
                curveToRelative(-0.15f, -0.36f, -0.27f, -0.72f, -0.38f, -1.08f)
                curveToRelative(-0.16f, -0.53f, 0.14f, -1.09f, 0.67f, -1.25f)
                curveToRelative(0.53f, -0.16f, 1.09f, 0.14f, 1.25f, 0.67f)
                curveToRelative(0.09f, 0.3f, 0.2f, 0.61f, 0.32f, 0.92f)
                close()
            }
        }.also { _TextSlash = it}
