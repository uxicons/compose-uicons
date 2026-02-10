package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserSlash: ImageVector? = null

val Icons.Br.UserSlash: ImageVector
    get() = _UserSlash ?: UXIcon(name = "UserSlash") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.88f, 15.42f)
            curveToRelative(0.32f, 0.77f, -0.04f, 1.64f, -0.81f, 1.96f)
            curveToRelative(-1.87f, 0.78f, -3.08f, 2.59f, -3.08f, 4.62f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -3.24f, 1.93f, -6.14f, 4.92f, -7.39f)
            curveToRelative(0.77f, -0.32f, 1.64f, 0.04f, 1.96f, 0.81f)
            close()
            moveTo(23.56f, 23.56f)
            curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
            reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
            lineTo(0.44f, 2.56f)
            curveTo(-0.15f, 1.98f, -0.15f, 1.02f, 0.44f, 0.44f)
            curveTo(1.02f, -0.15f, 1.98f, -0.15f, 2.56f, 0.44f)
            lineToRelative(3.73f, 3.73f)
            curveTo(7.07f, 1.75f, 9.33f, 0f, 12f, 0f)
            curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
            curveToRelative(0f, 2.67f, -1.75f, 4.93f, -4.17f, 5.71f)
            lineToRelative(9.73f, 9.73f)
            curveToRelative(0.59f, 0.58f, 0.59f, 1.54f, 0f, 2.12f)
            close()
            moveTo(9.08f, 6.96f)
            lineToRelative(1.95f, 1.95f)
            curveToRelative(0.12f, -0.01f, 0.76f, 0.08f, 0.96f, 0.08f)
            curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
            reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
            reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
            curveToRelative(0f, 0.2f, 0.09f, 0.84f, 0.08f, 0.96f)
            close()
        }
    }.also { _UserSlash = it }
