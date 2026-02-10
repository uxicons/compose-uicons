package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UsaMap: ImageVector? = null

val Icons.Ss.UsaMap: ImageVector
    get() = _UsaMap ?: UXIcon(name = "UsaMap") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3f)
                curveToRelative(1.5f, 0f, 6.5f, 0.5f, 9f, 1f)
                curveToRelative(1.47f, 0.29f, 4f, 1f, 4f, 1f)
                verticalLineToRelative(2.73f)
                curveToRelative(0f, 0.5f, 0.84f, 0.2f, 1.12f, -0.1f)
                curveToRelative(0.53f, -0.56f, 1.88f, -2.64f, 1.88f, -2.64f)
                curveToRelative(0.62f, -0.04f, 0.96f, -0.37f, 1f, -1f)
                curveToRelative(0.02f, -0.34f, -0.04f, -1.66f, 0f, -2f)
                curveToRelative(0.06f, -0.02f, 0.94f, 0.02f, 1f, 0f)
                curveToRelative(0.33f, 0.44f, 1f, 2.12f, 1f, 2.12f)
                verticalLineToRelative(0.88f)
                reflectiveCurveToRelative(-2.01f, 4.04f, -2f, 4.5f)
                curveToRelative(0.01f, 0.57f, 0f, 1.5f, 0f, 2.5f)
                reflectiveCurveToRelative(-0.34f, 0.81f, -0.55f, 1.17f)
                curveToRelative(-0.38f, 0.66f, -1.0f, 1.39f, -1.35f, 2.06f)
                curveToRelative(-0.04f, 0.08f, -0.07f, 0.17f, -0.1f, 0.27f)
                curveToRelative(-0.06f, 0.26f, -0.04f, 0.55f, 0.04f, 0.77f)
                curveToRelative(0.26f, 0.66f, 0.58f, 1.26f, 0.92f, 1.89f)
                curveToRelative(0.29f, 0.55f, 0.46f, 1.13f, 0.28f, 1.85f)
                lineToRelative(-1.23f, -0.0f)
                curveToRelative(-0.39f, -0.41f, -1f, -1.34f, -1f, -2f)
                reflectiveCurveToRelative(-1.38f, -1f, -2f, -1f)
                curveToRelative(-1f, 0f, -1f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.6f, 0.43f, -2f, 4f, -2f, 4f)
                curveToRelative(0f, 0f, -1.5f, -1.46f, -2f, -2.46f)
                curveToRelative(-0.32f, -0.63f, -2f, -0.54f, -2f, -0.54f)
                curveToRelative(0f, 0f, -0.25f, -0.55f, -0.5f, -1f)
                curveToRelative(-0.51f, -0.9f, -2.42f, -1.82f, -4f, -2f)
                curveToRelative(-0.57f, -0.07f, -1.1f, 0.23f, -1.5f, 0.5f)
                curveTo(1f, 15f, 0f, 12.56f, 0f, 10.52f)
                verticalLineToRelative(-1.26f)
                curveToRelative(0f, -1.92f, 1f, -5.26f, 1f, -5.26f)
                close()
            }
        }.also { _UsaMap = it}
