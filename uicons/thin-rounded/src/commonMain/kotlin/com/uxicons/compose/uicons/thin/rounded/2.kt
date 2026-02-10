package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tr2: ImageVector? = null

val Icons.Tr.Tr2: ImageVector
    get() = _Tr2 ?: UXIcon(name = "Tr2") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.11f, 24.01f)
                curveToRelative(-0.79f, 0f, -1.48f, -0.41f, -1.85f, -1.1f)
                curveToRelative(-0.37f, -0.69f, -0.33f, -1.52f, 0.1f, -2.18f)
                curveToRelative(1.26f, -1.91f, 3.77f, -3.07f, 6.44f, -4.3f)
                curveToRelative(4.3f, -1.98f, 8.75f, -4.04f, 8.15f, -9.43f)
                curveToRelative(-0.38f, -3.42f, -3.36f, -5.99f, -6.94f, -5.99f)
                curveToRelative(-3.86f, 0f, -7f, 3.14f, -7f, 7f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-0.5f)
                curveTo(4f, 3.59f, 7.59f, 0f, 12f, 0f)
                curveToRelative(4.09f, 0f, 7.5f, 2.96f, 7.94f, 6.88f)
                curveToRelative(0.68f, 6.11f, -4.32f, 8.42f, -8.73f, 10.45f)
                curveToRelative(-2.53f, 1.17f, -4.92f, 2.27f, -6.02f, 3.94f)
                curveToRelative(-0.23f, 0.35f, -0.25f, 0.79f, -0.05f, 1.15f)
                curveToRelative(0.2f, 0.36f, 0.56f, 0.58f, 0.97f, 0.58f)
                lineToRelative(13.39f, -0.01f)
                horizontalLineToRelative(0f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                lineToRelative(-13.39f, 0.01f)
                close()
            }
        }.also { _Tr2 = it}
