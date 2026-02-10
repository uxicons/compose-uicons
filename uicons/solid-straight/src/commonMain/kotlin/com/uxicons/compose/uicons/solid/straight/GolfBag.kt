package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GolfBag: ImageVector? = null

val Icons.Ss.GolfBag: ImageVector
    get() = _GolfBag ?: UXIcon(name = "GolfBag") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 7f)
                horizontalLineToRelative(-6.35f)
                lineToRelative(0.39f, -3f)
                horizontalLineToRelative(2.38f)
                curveToRelative(1.71f, 0f, 2.91f, -0.92f, 2.91f, -0.92f)
                lineToRelative(-0.15f, -0.59f)
                curveToRelative(-0.36f, -1.46f, -1.68f, -2.48f, -3.18f, -2.48f)
                horizontalLineToRelative(-0.61f)
                curveToRelative(-1.32f, 0f, -2.48f, 0.78f, -3f, 1.96f)
                curveToRelative(-0.12f, 0.28f, -0.19f, 0.57f, -0.23f, 0.88f)
                lineToRelative(-0.49f, 4.17f)
                horizontalLineToRelative(-2.64f)
                lineToRelative(-0.37f, -3.17f)
                curveToRelative(-0.04f, -0.3f, -0.11f, -0.6f, -0.23f, -0.88f)
                curveToRelative(-0.52f, -1.17f, -1.68f, -1.96f, -3f, -1.96f)
                horizontalLineToRelative(-0.61f)
                curveToRelative(-1.5f, 0f, -2.81f, 1.02f, -3.18f, 2.48f)
                lineToRelative(-0.15f, 0.59f)
                reflectiveCurveToRelative(1.2f, 0.92f, 2.91f, 0.92f)
                horizontalLineToRelative(2.38f)
                lineToRelative(0.26f, 2f)
                horizontalLineToRelative(-4.05f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(9f)
                curveToRelative(1.48f, 0f, 2.71f, -1.08f, 2.95f, -2.5f)
                curveToRelative(2.56f, -2.25f, 5.05f, -6.79f, 5.05f, -11.5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(18f, 18.51f)
                verticalLineToRelative(-9.51f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                curveToRelative(0f, 3.2f, -1.36f, 6.38f, -3f, 8.51f)
                close()
                moveTo(8f, 18f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(5f)
                close()
            }
        }.also { _GolfBag = it}
