package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InboxOut: ImageVector? = null

val Icons.Sc.InboxOut: ImageVector
    get() = _InboxOut ?: UXIcon(name = "InboxOut") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 10.62f)
                horizontalLineToRelative(-4.78f)
                curveToRelative(-0.52f, 0f, -0.95f, 0.4f, -1.0f, 0.91f)
                curveToRelative(-0.09f, 0.99f, -0.25f, 1.81f, -0.36f, 2.31f)
                curveToRelative(-0.77f, 0.17f, -2.24f, 0.44f, -3.86f, 0.44f)
                reflectiveCurveToRelative(-3.1f, -0.27f, -3.86f, -0.44f)
                curveToRelative(-0.11f, -0.5f, -0.27f, -1.31f, -0.36f, -2.31f)
                curveToRelative(-0.05f, -0.52f, -0.48f, -0.91f, -1.0f, -0.91f)
                horizontalLineTo(2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                curveToRelative(0f, 5.17f, 1.15f, 8.98f, 1.19f, 9.14f)
                curveToRelative(0.1f, 0.33f, 0.36f, 0.58f, 0.69f, 0.67f)
                curveToRelative(0.17f, 0.05f, 4.27f, 1.19f, 9.12f, 1.19f)
                reflectiveCurveToRelative(8.95f, -1.14f, 9.12f, -1.19f)
                curveToRelative(0.33f, -0.09f, 0.59f, -0.35f, 0.69f, -0.67f)
                curveToRelative(0.05f, -0.16f, 1.19f, -4.01f, 1.19f, -9.14f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.53f, 1.48f)
                curveToRelative(-0.48f, -0.18f, -0.88f, -0.06f, -1.05f, 0f)
                curveToRelative(-0.25f, 0.09f, -2.5f, 1.01f, -4.17f, 4.23f)
                curveToRelative(-0.38f, 0.74f, -0.09f, 1.64f, 0.64f, 2.02f)
                curveToRelative(0.73f, 0.38f, 1.64f, 0.09f, 2.02f, -0.64f)
                curveToRelative(0.17f, -0.33f, 0.35f, -0.63f, 0.53f, -0.89f)
                verticalLineToRelative(3.72f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-3.72f)
                curveToRelative(0.18f, 0.26f, 0.35f, 0.56f, 0.53f, 0.89f)
                curveToRelative(0.38f, 0.74f, 1.28f, 1.02f, 2.02f, 0.64f)
                curveToRelative(0.74f, -0.38f, 1.02f, -1.29f, 0.64f, -2.02f)
                curveToRelative(-1.67f, -3.22f, -3.92f, -4.14f, -4.17f, -4.23f)
                close()
            }
        }.also { _InboxOut = it}
