package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lungs: ImageVector? = null

val Icons.Sc.Lungs: ImageVector
    get() = _Lungs ?: UXIcon(name = "Lungs") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 13.98f)
                verticalLineToRelative(3.02f)
                curveToRelative(0f, 0.13f, -0.01f, 3.26f, -1.11f, 5.43f)
                curveToRelative(-0.17f, 0.34f, -0.53f, 0.56f, -0.92f, 0.55f)
                curveToRelative(-5.41f, -0.12f, -7.98f, -1.29f, -7.98f, -7.63f)
                curveToRelative(0.0f, -6.41f, 2.35f, -10.9f, 6.62f, -12.63f)
                curveToRelative(0.63f, -0.27f, 1.39f, -0.51f, 2.15f, -0.69f)
                curveToRelative(0.6f, -0.17f, 1.25f, 0.34f, 1.24f, 0.97f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 3.03f, -0.97f, 4f, -4f, 4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                curveToRelative(1.73f, 0f, 3.04f, -0.34f, 4f, -1.02f)
                close()
                moveTo(16.38f, 2.73f)
                curveToRelative(-0.63f, -0.27f, -1.39f, -0.51f, -2.15f, -0.69f)
                curveToRelative(-0.6f, -0.17f, -1.25f, 0.34f, -1.24f, 0.97f)
                verticalLineToRelative(6.0f)
                curveToRelative(0f, 3.03f, 0.97f, 4f, 4f, 4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                curveToRelative(-1.73f, 0f, -3.04f, -0.34f, -4f, -1.02f)
                verticalLineToRelative(3.02f)
                curveToRelative(0f, 0.13f, 0.01f, 3.26f, 1.11f, 5.43f)
                curveToRelative(0.17f, 0.34f, 0.53f, 0.56f, 0.92f, 0.55f)
                curveToRelative(5.41f, -0.12f, 7.98f, -1.29f, 7.98f, -7.63f)
                curveToRelative(0f, -6.41f, -2.35f, -10.9f, -6.62f, -12.63f)
                close()
            }
        }.also { _Lungs = it}
