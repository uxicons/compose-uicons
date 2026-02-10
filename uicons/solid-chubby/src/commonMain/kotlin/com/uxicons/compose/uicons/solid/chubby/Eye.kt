package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Eye: ImageVector? = null

val Icons.Sc.Eye: ImageVector
    get() = _Eye ?: UXIcon(name = "Eye") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.99f, 9.11f)
                curveToRelative(-1.97f, 0.01f, -2.84f, 0.88f, -2.88f, 2.89f)
                curveToRelative(0.04f, 2.04f, 0.88f, 2.88f, 2.89f, 2.89f)
                curveToRelative(2.01f, -0.01f, 2.85f, -0.85f, 2.88f, -2.91f)
                curveToRelative(-0.03f, -1.96f, -0.93f, -2.86f, -2.89f, -2.87f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.96f, 11.8f)
                curveToRelative(-1.63f, -5.58f, -5.41f, -8.55f, -10.94f, -8.6f)
                curveToRelative(-0.01f, 0f, -0.01f, 0f, -0.02f, 0f)
                curveToRelative(-5.58f, 0.05f, -9.36f, 3.0f, -10.96f, 8.55f)
                curveToRelative(-0.05f, 0.18f, -0.05f, 0.37f, 0f, 0.55f)
                curveToRelative(1.6f, 5.59f, 5.28f, 8.45f, 10.97f, 8.49f)
                curveToRelative(5.67f, -0.04f, 9.35f, -2.88f, 10.95f, -8.43f)
                curveToRelative(0.05f, -0.18f, 0.05f, -0.38f, 0f, -0.56f)
                close()
                moveTo(12.01f, 16.89f)
                curveToRelative(-3.1f, -0.02f, -4.89f, -1.78f, -4.89f, -4.91f)
                curveToRelative(0f, -2.99f, 1.79f, -4.85f, 4.88f, -4.87f)
                curveToRelative(3.06f, 0.02f, 4.84f, 1.79f, 4.89f, 4.87f)
                curveToRelative(-0.06f, 3.16f, -1.79f, 4.89f, -4.88f, 4.91f)
                close()
            }
        }.also { _Eye = it}
