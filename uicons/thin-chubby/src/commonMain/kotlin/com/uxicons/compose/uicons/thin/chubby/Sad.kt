package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sad: ImageVector? = null

val Icons.Tc.Sad: ImageVector
    get() = _Sad ?: UXIcon(name = "Sad") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.45f, 12.37f)
                curveToRelative(1.3f, -0.01f, 2.06f, -0.73f, 2.08f, -2.0f)
                curveToRelative(-0.03f, -1.23f, -0.81f, -1.96f, -2.1f, -1.97f)
                curveToRelative(-1.28f, 0.01f, -2.06f, 0.75f, -2.09f, 2.0f)
                curveToRelative(0.02f, 1.23f, 0.8f, 1.96f, 2.08f, 1.97f)
                horizontalLineToRelative(0.02f)
                close()
                moveTo(7.35f, 10.4f)
                curveToRelative(0.01f, -0.69f, 0.35f, -0.99f, 1.09f, -1.0f)
                curveToRelative(0.74f, 0.0f, 1.08f, 0.31f, 1.09f, 0.97f)
                curveToRelative(-0.01f, 0.69f, -0.34f, 0.99f, -1.09f, 1.0f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-0.75f, -0.01f, -1.07f, -0.3f, -1.09f, -0.97f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.55f, 8.4f)
                curveToRelative(-1.28f, 0.01f, -2.06f, 0.75f, -2.09f, 2.0f)
                curveToRelative(0.03f, 1.22f, 0.8f, 1.96f, 2.08f, 1.97f)
                horizontalLineToRelative(0.02f)
                curveToRelative(1.3f, -0.01f, 2.06f, -0.73f, 2.08f, -2.0f)
                curveToRelative(-0.02f, -1.23f, -0.81f, -1.96f, -2.09f, -1.97f)
                close()
                moveTo(15.56f, 11.37f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-0.75f, -0.01f, -1.07f, -0.3f, -1.09f, -0.97f)
                curveToRelative(0.01f, -0.69f, 0.35f, -0.99f, 1.09f, -1.0f)
                curveToRelative(0.96f, 0.01f, 1.09f, 0.57f, 1.09f, 0.97f)
                curveToRelative(-0.01f, 0.69f, -0.34f, 0.99f, -1.09f, 1.0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.02f, 16.62f)
                curveToRelative(-0.2f, 0.19f, -0.2f, 0.51f, -0.01f, 0.71f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.36f, 0.15f)
                curveToRelative(0.12f, 0f, 0.25f, -0.05f, 0.35f, -0.14f)
                curveToRelative(2.23f, -2.16f, 4.38f, -2.16f, 6.56f, -0.0f)
                curveToRelative(0.2f, 0.19f, 0.51f, 0.19f, 0.71f, -0.0f)
                curveToRelative(0.19f, -0.2f, 0.19f, -0.51f, -0.0f, -0.71f)
                curveToRelative(-2.57f, -2.55f, -5.33f, -2.55f, -7.96f, -0.0f)
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
        }.also { _Sad = it}
