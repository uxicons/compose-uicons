package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SearchLocation: ImageVector? = null

val Icons.Sc.SearchLocation: ImageVector
    get() = _SearchLocation ?: UXIcon(name = "SearchLocation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.56f, 20.44f)
                lineToRelative(-4.1f, -4.1f)
                curveToRelative(0.97f, -1.5f, 1.49f, -3.46f, 1.54f, -5.86f)
                curveToRelative(-0.1f, -6.08f, -3.48f, -9.44f, -9.51f, -9.48f)
                curveToRelative(-6.1f, 0.04f, -9.38f, 3.32f, -9.49f, 9.48f)
                verticalLineToRelative(0.04f)
                curveToRelative(0.11f, 6.17f, 3.4f, 9.45f, 9.51f, 9.48f)
                curveToRelative(2.39f, -0.01f, 4.34f, -0.53f, 5.85f, -1.53f)
                lineToRelative(4.09f, 4.09f)
                curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
                reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
                curveToRelative(0.59f, -0.59f, 0.59f, -1.53f, 0f, -2.12f)
                close()
                moveTo(11.15f, 15.76f)
                curveToRelative(-0.19f, 0.16f, -0.42f, 0.24f, -0.65f, 0.24f)
                reflectiveCurveToRelative(-0.46f, -0.08f, -0.65f, -0.24f)
                curveToRelative(-0.39f, -0.34f, -3.85f, -3.38f, -3.85f, -6.26f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                curveToRelative(0f, 2.88f, -3.46f, 5.92f, -3.85f, 6.26f)
                close()
                moveTo(10.5f, 7.0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                curveToRelative(0f, 1.24f, 1.35f, 2.98f, 2.5f, 4.13f)
                curveToRelative(1.15f, -1.15f, 2.5f, -2.9f, 2.5f, -4.13f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(10.5f, 10.5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _SearchLocation = it}
