package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MirrorUser: ImageVector? = null

val Icons.Sr.MirrorUser: ImageVector
    get() = _MirrorUser ?: UXIcon(name = "MirrorUser") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 24f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                lineTo(0f, 1f)
                curveTo(0f, 0.66f, 0.17f, 0.35f, 0.45f, 0.16f)
                curveTo(0.74f, -0.02f, 1.09f, -0.05f, 1.4f, 0.09f)
                curveToRelative(1.73f, 0.76f, 3.25f, 1.97f, 4.4f, 3.5f)
                curveToRelative(1.36f, 1.68f, 4.2f, 8.04f, 4.2f, 9.42f)
                curveToRelative(0f, 0.97f, -0.7f, 2f, -2f, 2f)
                horizontalLineToRelative(-0.33f)
                lineToRelative(-0.22f, 1.66f)
                curveToRelative(-0.33f, 2.48f, -2.46f, 4.34f, -4.96f, 4.34f)
                horizontalLineToRelative(-0.49f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
                moveTo(18f, 0f)
                curveToRelative(-3.42f, 0f, -6f, 5.16f, -6f, 12f)
                reflectiveCurveToRelative(2.58f, 12f, 6f, 12f)
                reflectiveCurveToRelative(6f, -5.16f, 6f, -12f)
                reflectiveCurveTo(21.42f, 0f, 18f, 0f)
                close()
                moveTo(20.36f, 19.88f)
                curveToRelative(-0.99f, -0.8f, -1.64f, -1.94f, -1.81f, -3.22f)
                lineToRelative(-0.22f, -1.66f)
                horizontalLineToRelative(-0.33f)
                curveToRelative(-1.3f, 0f, -2f, -1.03f, -2f, -2f)
                curveToRelative(0f, -1.35f, 2.7f, -7.43f, 4.12f, -9.3f)
                curveToRelative(0.36f, 0.59f, 0.69f, 1.33f, 0.97f, 2.18f)
                curveToRelative(-1.32f, 2.29f, -3.03f, 6.45f, -3.09f, 7.15f)
                lineToRelative(1.21f, -0.02f)
                curveToRelative(0.5f, 0f, 0.93f, 0.37f, 0.99f, 0.87f)
                lineToRelative(0.33f, 2.52f)
                curveToRelative(0.07f, 0.55f, 0.31f, 1.05f, 0.64f, 1.47f)
                curveToRelative(-0.24f, 0.76f, -0.51f, 1.44f, -0.82f, 2.02f)
                close()
            }
        }.also { _MirrorUser = it}
