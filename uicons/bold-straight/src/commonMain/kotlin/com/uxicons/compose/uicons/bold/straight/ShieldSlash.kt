package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldSlash: ImageVector? = null

val Icons.Bs.ShieldSlash: ImageVector
    get() = _ShieldSlash ?: UXIcon(name = "ShieldSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.14f, 18.02f)
                curveToRelative(1.23f, -1.82f, 1.86f, -3.86f, 1.86f, -6.06f)
                verticalLineToRelative(-6.16f)
                curveToRelative(0f, -1.46f, -0.93f, -2.75f, -2.32f, -3.21f)
                lineTo(12f, 0.04f)
                lineToRelative(-7.39f, 2.45f)
                lineTo(2.16f, 0.04f)
                lineTo(0.04f, 2.16f)
                lineToRelative(21.8f, 21.8f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-3.82f, -3.82f)
                close()
                moveTo(12f, 3.21f)
                lineToRelative(6.73f, 2.23f)
                curveToRelative(0.16f, 0.05f, 0.27f, 0.2f, 0.27f, 0.36f)
                verticalLineToRelative(6.16f)
                curveToRelative(0f, 1.39f, -0.35f, 2.69f, -1.03f, 3.88f)
                lineTo(6.99f, 4.87f)
                lineToRelative(5.01f, -1.66f)
                close()
                moveTo(14.45f, 19.39f)
                lineToRelative(2.15f, 2.15f)
                curveToRelative(-1.49f, 1.05f, -2.91f, 1.7f, -3.64f, 2.0f)
                lineToRelative(-1.02f, 0.41f)
                lineToRelative(-0.98f, -0.49f)
                curveToRelative(-2.1f, -1.05f, -8.95f, -4.98f, -8.95f, -11.5f)
                verticalLineToRelative(-5.01f)
                lineToRelative(3f, 3f)
                verticalLineToRelative(2.02f)
                curveToRelative(0f, 4.6f, 5.14f, 7.7f, 7.07f, 8.7f)
                curveToRelative(0.57f, -0.24f, 1.44f, -0.66f, 2.38f, -1.27f)
                close()
            }
        }.also { _ShieldSlash = it}
