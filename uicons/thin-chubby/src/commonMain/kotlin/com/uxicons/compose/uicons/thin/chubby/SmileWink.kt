package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmileWink: ImageVector? = null

val Icons.Tc.SmileWink: ImageVector
    get() = _SmileWink ?: UXIcon(name = "SmileWink") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.86f, 15.13f)
                curveToRelative(-1.94f, 1.88f, -3.81f, 1.88f, -5.71f, 0.0f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.19f, -0.71f, 0.0f)
                curveToRelative(-0.19f, 0.2f, -0.19f, 0.51f, 0.0f, 0.71f)
                curveToRelative(1.15f, 1.14f, 2.34f, 1.71f, 3.54f, 1.71f)
                reflectiveCurveToRelative(2.4f, -0.57f, 3.57f, -1.71f)
                curveToRelative(0.2f, -0.19f, 0.2f, -0.51f, 0.01f, -0.71f)
                curveToRelative(-0.19f, -0.2f, -0.51f, -0.2f, -0.71f, -0.01f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.55f, 7.94f)
                curveToRelative(-1.28f, 0.01f, -2.06f, 0.75f, -2.09f, 2.0f)
                curveToRelative(0.02f, 1.23f, 0.8f, 1.96f, 2.08f, 1.97f)
                horizontalLineToRelative(0.01f)
                curveToRelative(1.3f, -0.01f, 2.06f, -0.73f, 2.08f, -2.0f)
                curveToRelative(-0.03f, -1.23f, -0.81f, -1.96f, -2.1f, -1.97f)
                close()
                moveTo(15.55f, 10.9f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.75f, -0.01f, -1.08f, -0.3f, -1.09f, -0.97f)
                curveToRelative(0.01f, -0.69f, 0.35f, -0.99f, 1.09f, -1.0f)
                curveToRelative(0.74f, 0.01f, 1.08f, 0.31f, 1.09f, 0.97f)
                curveToRelative(-0.01f, 0.69f, -0.34f, 0.99f, -1.09f, 1.0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.01f, 9.92f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-2.13f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(2.13f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.0f, 1f)
                curveTo(4.89f, 1f, 1f, 5.16f, 1f, 12.01f)
                curveToRelative(0f, 7.0f, 3.77f, 10.99f, 11.0f, 10.99f)
                curveToRelative(7.16f, 0f, 10.86f, -3.74f, 11.0f, -11.01f)
                curveToRelative(-0.12f, -7.04f, -4.03f, -10.99f, -11.0f, -10.99f)
                close()
                moveTo(12.0f, 22f)
                curveToRelative(-6.61f, -0.04f, -9.88f, -3.31f, -10.0f, -10f)
                curveToRelative(0.12f, -6.59f, 3.49f, -9.96f, 10.0f, -10f)
                curveToRelative(4.49f, 0.03f, 9.86f, 1.79f, 10.0f, 9.99f)
                curveToRelative(-0.12f, 6.7f, -3.4f, 9.97f, -10.0f, 10.01f)
                close()
            }
        }.also { _SmileWink = it}
