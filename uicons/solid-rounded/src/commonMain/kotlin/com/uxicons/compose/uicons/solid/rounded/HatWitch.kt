package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HatWitch: ImageVector? = null

val Icons.Sr.HatWitch: ImageVector
    get() = _HatWitch ?: UXIcon(name = "HatWitch") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 22f)
                horizontalLineToRelative(-0.68f)
                lineToRelative(-5.25f, -14.19f)
                curveToRelative(-0.14f, -0.41f, -0.08f, -0.87f, 0.17f, -1.22f)
                curveToRelative(0.26f, -0.37f, 0.67f, -0.59f, 1.12f, -0.59f)
                horizontalLineToRelative(3.98f)
                curveToRelative(0.69f, 0f, 1.3f, -0.42f, 1.55f, -1.07f)
                curveToRelative(0.25f, -0.65f, 0.07f, -1.36f, -0.45f, -1.83f)
                curveToRelative(-0.03f, -0.02f, -0.06f, -0.05f, -0.09f, -0.07f)
                lineToRelative(-2.11f, -1.5f)
                curveToRelative(-0.03f, -0.02f, -0.06f, -0.04f, -0.09f, -0.06f)
                curveToRelative(-1.85f, -1.04f, -3.44f, -1.49f, -5.32f, -1.49f)
                horizontalLineToRelative(-0.93f)
                curveToRelative(-3.42f, 0f, -6.46f, 2.18f, -7.57f, 5.42f)
                lineTo(1.68f, 22f)
                horizontalLineToRelative(-0.68f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(22f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(16f, 19.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(3f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(1f)
                close()
                moveTo(14f, 18.5f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
            }
        }.also { _HatWitch = it}
