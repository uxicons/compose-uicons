package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ParachuteBox: ImageVector? = null

val Icons.Ss.ParachuteBox: ImageVector
    get() = _ParachuteBox ?: UXIcon(name = "ParachuteBox") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 10.74f)
                curveTo(24f, 5.52f, 20.05f, 1.29f, 14.62f, 0.25f)
                curveToRelative(1.46f, 2.26f, 3.12f, 3.88f, 3.38f, 9.44f)
                curveToRelative(0.6f, -0.37f, 1.32f, -0.69f, 2.0f, -0.69f)
                curveToRelative(1.06f, 0f, 1.7f, 0.91f, 1.95f, 1.36f)
                lineToRelative(-6.28f, 6.15f)
                curveToRelative(-0.3f, -0.2f, -0.64f, -0.35f, -1.01f, -0.43f)
                lineToRelative(1.52f, -5.61f)
                curveTo(16.18f, 6.61f, 13.41f, 1.95f, 12.05f, 0f)
                curveToRelative(-0.02f, 0f, -0.03f, 0f, -0.05f, 0f)
                reflectiveCurveToRelative(-0.03f, 0f, -0.05f, 0f)
                curveToRelative(-1.37f, 1.95f, -4.1f, 6.71f, -4.1f, 10.56f)
                lineToRelative(1.5f, 5.51f)
                curveToRelative(-0.37f, 0.08f, -0.71f, 0.23f, -1.02f, 0.44f)
                lineToRelative(-6.28f, -6.15f)
                curveToRelative(0.25f, -0.45f, 0.89f, -1.36f, 1.95f, -1.36f)
                curveToRelative(0.69f, 0f, 1.41f, 0.32f, 2.0f, 0.69f)
                curveToRelative(0.1f, -3.52f, 1.91f, -7.1f, 3.38f, -9.44f)
                curveTo(3.95f, 1.29f, 0f, 5.52f, 0f, 10.74f)
                verticalLineToRelative(0.42f)
                lineToRelative(7.13f, 6.97f)
                curveToRelative(-0.08f, 0.28f, -0.13f, 0.57f, -0.13f, 0.87f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(4f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.3f, -0.04f, -0.59f, -0.13f, -0.87f)
                lineToRelative(7.13f, -6.97f)
                verticalLineToRelative(-0.42f)
                close()
                moveTo(12f, 9f)
                curveToRelative(0.79f, 0f, 1.62f, 0.42f, 2.27f, 0.86f)
                lineToRelative(-1.68f, 6.14f)
                horizontalLineToRelative(-1.16f)
                lineToRelative(-1.52f, -6.26f)
                curveToRelative(0.61f, -0.39f, 1.36f, -0.74f, 2.08f, -0.74f)
                close()
            }
        }.also { _ParachuteBox = it}
