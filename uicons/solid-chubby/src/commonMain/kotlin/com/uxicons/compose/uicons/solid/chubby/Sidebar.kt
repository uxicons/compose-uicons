package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sidebar: ImageVector? = null

val Icons.Sc.Sidebar: ImageVector
    get() = _Sidebar ?: UXIcon(name = "Sidebar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.99f, 2.22f)
                curveToRelative(-2.9f, 0.3f, -4.96f, 0.82f, -5.08f, 0.85f)
                curveToRelative(-0.33f, 0.08f, -0.59f, 0.33f, -0.7f, 0.65f)
                curveToRelative(-0.05f, 0.15f, -1.2f, 3.63f, -1.2f, 8.28f)
                curveToRelative(0f, 4.69f, 1.15f, 8.14f, 1.2f, 8.29f)
                curveToRelative(0.11f, 0.32f, 0.37f, 0.56f, 0.7f, 0.65f)
                curveToRelative(0.12f, 0.03f, 2.19f, 0.55f, 5.09f, 0.85f)
                lineToRelative(-0.01f, -19.57f)
                close()
                moveTo(4f, 6f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(5f, 16.02f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(5f, 12.01f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.8f, 3.71f)
                curveToRelative(-0.11f, -0.32f, -0.37f, -0.56f, -0.7f, -0.65f)
                curveToRelative(-0.17f, -0.04f, -4.26f, -1.07f, -9.1f, -1.07f)
                curveToRelative(-0.69f, 0f, -1.36f, 0.02f, -2.01f, 0.06f)
                lineToRelative(0.01f, 19.89f)
                curveToRelative(0.65f, 0.04f, 1.32f, 0.06f, 2.0f, 0.06f)
                curveToRelative(4.82f, 0f, 8.92f, -1.02f, 9.1f, -1.07f)
                curveToRelative(0.33f, -0.08f, 0.59f, -0.33f, 0.7f, -0.65f)
                curveToRelative(0.05f, -0.15f, 1.2f, -3.63f, 1.2f, -8.28f)
                curveToRelative(0f, -4.69f, -1.15f, -8.14f, -1.2f, -8.29f)
                close()
            }
        }.also { _Sidebar = it}
