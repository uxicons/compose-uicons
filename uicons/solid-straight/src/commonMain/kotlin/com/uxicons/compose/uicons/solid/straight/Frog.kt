package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Frog: ImageVector? = null

val Icons.Ss.Frog: ImageVector
    get() = _Frog ?: UXIcon(name = "Frog") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.27f, 4.88f)
                curveToRelative(-1.11f, -1.0f, -2.68f, -1.82f, -4.39f, -2.3f)
                curveToRelative(-0.41f, -1.48f, -1.77f, -2.57f, -3.38f, -2.57f)
                curveToRelative(-1.49f, 0f, -2.77f, 0.94f, -3.27f, 2.26f)
                curveTo(2.51f, 6.92f, 0.23f, 13.83f, 0.03f, 18.83f)
                curveToRelative(-0.05f, 1.35f, 0.44f, 2.64f, 1.38f, 3.62f)
                curveToRelative(0.94f, 0.98f, 2.26f, 1.54f, 3.62f, 1.54f)
                horizontalLineToRelative(9.96f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                horizontalLineToRelative(-2.08f)
                curveToRelative(0.23f, -0.69f, 0.53f, -1.36f, 0.89f, -2f)
                horizontalLineToRelative(1.45f)
                curveToRelative(2.17f, 0f, 4.08f, 1.1f, 5.21f, 2.77f)
                curveToRelative(0f, 0f, 0.35f, -1.77f, 0.43f, -2.28f)
                lineToRelative(6.05f, 9.51f)
                horizontalLineToRelative(3.55f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2.45f)
                lineToRelative(-6.39f, -10.04f)
                curveToRelative(3.06f, -0.23f, 6.95f, -1.36f, 9.28f, -3.99f)
                curveToRelative(0.8f, -0.9f, 0.72f, -2.29f, -0.16f, -3.09f)
                close()
                moveTo(15.5f, 5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _Frog = it}
